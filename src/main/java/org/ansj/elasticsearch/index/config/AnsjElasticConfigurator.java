package org.ansj.elasticsearch.index.config;

import org.ansj.dic.PathToStream;
import org.ansj.library.*;
import org.ansj.splitWord.analysis.ToAnalysis;
import org.ansj.util.MyStaticValue;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.elasticsearch.SpecialPermission;
import org.elasticsearch.common.collect.MapBuilder;
import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.env.Environment;
import org.nlpcn.commons.lang.util.IOUtil;
import org.nlpcn.commons.lang.util.StringUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Map;
import java.util.stream.Collectors;

public class AnsjElasticConfigurator {

    private static final Logger LOG = LogManager.getLogger("ansj-initializer");

    private static final String CONFIG_FILE_NAME = "ansj.cfg.yml";

    private String path;

    private Settings ansjSettings;

    private File configDir;

    private Environment env;

    @Inject
    public AnsjElasticConfigurator(Environment env) {
        this.env = env;

        //
        init();

        LOG.info("init ansj plugin ok , goodluck youyou");
    }

    private void init() {
        Path configFilePath = env.configFile().resolve("elasticsearch-analysis-ansj").resolve(CONFIG_FILE_NAME);
        LOG.info("try to load ansj config file: {}", configFilePath);
        if (!Files.exists(configFilePath)) {
            configFilePath = Paths.get(new File(AnsjElasticConfigurator.class.getProtectionDomain().getCodeSource().getLocation().getPath()).getParent(), "config").resolve(CONFIG_FILE_NAME);
            LOG.info("try to load ansj config file: {}", configFilePath);
        }
        Settings.Builder builder = Settings.builder();
        if (Files.exists(configFilePath)) {
            try {
                builder.loadFromPath(configFilePath);
                LOG.info("load ansj config: {}", configFilePath);
            } catch (IOException e) {
                LOG.error("load ansj config[{}] error: {}", configFilePath, e);
            }
        } else {
            LOG.warn("can't find ansj config file");
        }

        Settings settings = builder.build();
        path = settings.get("ansj_config");
        ansjSettings = settings.getAsSettings("ansj");
        configDir = env.configFile().toFile();

        flushConfig();

        // 进行一次测试分词
        preheat();
    }

    private void flushConfig() {
        MyStaticValue.ENV.clear();

        // 插入到变量中
        if (ansjSettings != null && !ansjSettings.isEmpty()) {
            MyStaticValue.ENV.putAll(ansjSettings.keySet().stream().collect(Collectors.toMap(k -> k, ansjSettings::get)));
        }

        // 设置全局变量
        setGlobalVar(MyStaticValue.ENV);

        if (path != null) {
            initConfig(path, true);
        } else {
            initConfig(new File(configDir, "ansj_library.properties").getAbsolutePath(), false);
        }

        // 加载词典
        initDic();
    }

    private void initConfig(String path, boolean printErr) {
        SpecialPermission.check();
        AccessController.doPrivileged((PrivilegedAction<Void>) () -> {
            try (BufferedReader br = IOUtil.getReader(PathToStream.stream(path), "utf-8")) {
                String temp;
                int index;
                while ((temp = br.readLine()) != null) {
                    if (StringUtil.isBlank(temp) || temp.trim().charAt(0) == '#' || !temp.contains("=")) {
                        continue;
                    }

                    index = temp.indexOf('=');

                    MyStaticValue.ENV.put(temp.substring(0, index).trim(), temp.substring(index + 1).trim());
                }
            } catch (Exception e) {
                if (printErr) {
                    LOG.error("{} load err: {}", path, e);
                } else {
                    LOG.warn("{} load err", path);
                }
            }
            return null;
        });
    }

    private void initDic() {
        SpecialPermission.check();
        for (String k : MyStaticValue.ENV.keySet().toArray(new String[0])) {
            if (k.startsWith(DicLibrary.DEFAULT)) {
                DicLibrary.keys().removeIf(k::equals);
                AccessController.doPrivileged((PrivilegedAction<Void>) () -> {
                    DicLibrary.get(k);
                    return null;
                });
            } else if (k.startsWith(StopLibrary.DEFAULT)) {
                StopLibrary.keys().removeIf(k::equals);
                AccessController.doPrivileged((PrivilegedAction<Void>) () -> {
                    StopLibrary.get(k);
                    return null;
                });
            } else if (k.startsWith(SynonymsLibrary.DEFAULT)) {
                SynonymsLibrary.keys().removeIf(k::equals);
                AccessController.doPrivileged((PrivilegedAction<Void>) () -> {
                    SynonymsLibrary.get(k);
                    return null;
                });
            } else if (k.startsWith(AmbiguityLibrary.DEFAULT)) {
                AmbiguityLibrary.keys().removeIf(k::equals);
                AccessController.doPrivileged((PrivilegedAction<Void>) () -> {
                    AmbiguityLibrary.get(k);
                    return null;
                });
            } else if (k.startsWith(CrfLibrary.DEFAULT)) {
                CrfLibrary.keys().removeIf(k::equals);
                AccessController.doPrivileged((PrivilegedAction<Void>) () -> {
                    CrfLibrary.get(k);
                    return null;
                });
            }
        }
    }

    private void preheat() {
        ToAnalysis.parse("这是一个基于ansj的分词插件");
    }

    /**
     * 设置一些全局变量
     *
     * @param map
     */
    private void setGlobalVar(Map<String, String> map) {
        // 是否开启人名识别
        if (map.containsKey("isNameRecognition")) {
            MyStaticValue.isNameRecognition = Boolean.valueOf(map.get("isNameRecognition"));
        }

        // 是否开启数字识别
        if (map.containsKey("isNumRecognition")) {
            MyStaticValue.isNumRecognition = Boolean.valueOf(map.get("isNumRecognition"));
        }

        // 是否数字和量词合并
        if (map.containsKey("isQuantifierRecognition")) {
            MyStaticValue.isQuantifierRecognition = Boolean.valueOf(map.get("isQuantifierRecognition"));
        }

        // 是否显示真实词语
        if (map.containsKey("isRealName")) {
            MyStaticValue.isRealName = Boolean.valueOf(map.get("isRealName"));
        }

        // 是否用户辞典不加载相同的词
        if (map.containsKey("isSkipUserDefine")) {
            MyStaticValue.isSkipUserDefine = Boolean.valueOf(map.get("isSkipUserDefine"));
        }
    }

    public void reloadConfig() {
        init();
        LOG.info("reload ansj plugin config successfully");

        LOG.info("to remove DicLibrary keys not in MyStaticValue.ENV");
        DicLibrary.keys().removeIf(key -> !MyStaticValue.ENV.containsKey(key));

        LOG.info("to remove StopLibrary keys not in MyStaticValue.ENV");
        StopLibrary.keys().removeIf(key -> !MyStaticValue.ENV.containsKey(key));

        LOG.info("to remove SynonymsLibrary keys not in MyStaticValue.ENV");
        SynonymsLibrary.keys().removeIf(key -> !MyStaticValue.ENV.containsKey(key));

        LOG.info("to remove AmbiguityLibrary keys not in MyStaticValue.ENV");
        AmbiguityLibrary.keys().removeIf(key -> !MyStaticValue.ENV.containsKey(key));
    }

    /**
     * 默认配置
     */
    public static Map<String, String> getDefaults() {
        return MapBuilder.<String, String>newMapBuilder()
                // 是否开启人名识别
                .put("isNameRecognition", MyStaticValue.isNameRecognition.toString())
                // 是否开启数字识别
                .put("isNumRecognition", MyStaticValue.isNumRecognition.toString())
                // 是否数字和量词合并
                .put("isQuantifierRecognition", MyStaticValue.isQuantifierRecognition.toString())
                // 是否显示真实词语
                .put("isRealName", MyStaticValue.isRealName.toString())
                // 是否用户辞典不加载相同的词
                .put("isSkipUserDefine", String.valueOf(MyStaticValue.isSkipUserDefine))
                .put(CrfLibrary.DEFAULT, CrfLibrary.DEFAULT)
                .put(DicLibrary.DEFAULT, DicLibrary.DEFAULT)
                .put(StopLibrary.DEFAULT, StopLibrary.DEFAULT)
                .put(SynonymsLibrary.DEFAULT, SynonymsLibrary.DEFAULT)
                .put(AmbiguityLibrary.DEFAULT, AmbiguityLibrary.DEFAULT)
                .immutableMap();
    }
}
