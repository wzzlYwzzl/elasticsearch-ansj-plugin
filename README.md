# Ansj Elasticsearch 插件

复制于[elasticsearch-analysis-ansj](https://github.com/NLPchina/elasticsearch-analysis-ansj)。

只是把其中的elasticsearch版本修改为了7.5.0，从新编译了。

## 前言

[![FOSSA Status](https://app.fossa.io/api/projects/git%2Bgithub.com%2FNLPchina%2Felasticsearch-analysis-ansj.svg?type=shield)](https://app.fossa.io/projects/git%2Bgithub.com%2FNLPchina%2Felasticsearch-analysis-ansj?ref=badge_shield)

这是一个elasticsearch的中文分词插件，基于ansj,感谢群内热心的朋友。
并宣传一下我们的群QQ211682609

## 版本对应

| plugin        |     elasticsearch|
| --------      |       -----:  |
| 1.0.0         |     0.90.2    |
| 1.x           |     1.x       |
| 2.1.1         |     2.1.1     |
| 2.3.1         |     2.3.1     |
| 2.3.2         |     2.3.2     |
| 2.3.3         |     2.3.3     |
| 2.3.4         |     2.3.4     |
| 2.3.5         |     2.3.5     |
| 2.4.0         |     2.4.0     |
| 2.4.1         |     2.4.1     |
| 2.4.2         |     2.4.2     |
| 2.4.3         |     2.4.3     |
| 2.4.4         |     2.4.4     |
| 2.4.5         |     2.4.5     |
| 2.4.6         |     2.4.6     |
| 5.0.0         |     5.0.0     |
| 5.0.1         |     5.0.1     |
| 5.0.2         |     5.0.2     |
| 5.1.1         |     5.1.1     |
| 5.1.2         |     5.1.2     |
| 5.2.0         |     5.2.0     |
| 5.2.1         |     5.2.1     |
| 5.2.2         |     5.2.2     |
| 5.3.0         |     5.3.0     |
| 5.3.1         |     5.3.1     |
| 5.3.2         |     5.3.2     |
| 5.3.3         |     5.3.3     |
| 5.4.0         |     5.4.0     |
| 5.4.1         |     5.4.1     |
| 5.4.2         |     5.4.2     |
| 5.4.3         |     5.4.3     |
| 5.5.0         |     5.5.0     |
| 5.5.1         |     5.5.1     |
| 5.5.2         |     5.5.2     |
| 5.5.3         |     5.5.3     |
| 5.6.0         |     5.6.0     |
| 5.6.1         |     5.6.1     |
| 5.6.2         |     5.6.2     |
| 5.6.3         |     5.6.3     |
| 5.6.4         |     5.6.4     |
| 5.6.5         |     5.6.5     |
| 5.6.6         |     5.6.6     |
| 5.6.7         |     5.6.7     |
| 5.6.8         |     5.6.8     |
| 5.6.9         |     5.6.9     |
| 5.6.10        |     5.6.10    |
| 5.6.11        |     5.6.11    |
| 5.6.12        |     5.6.12    |
| 5.6.13        |     5.6.13    |
| 5.6.14        |     5.6.14    |
| 5.6.15        |     5.6.15    |
| 5.6.16        |     5.6.16    |
| 6.0.0         |     6.0.0     |
| 6.0.1         |     6.0.1     |
| 6.1.0         |     6.1.0     |
| 6.1.1         |     6.1.1     |
| 6.1.2         |     6.1.2     |
| 6.1.3         |     6.1.3     |
| 6.1.4         |     6.1.4     |
| 6.2.0         |     6.2.0     |
| 6.2.1         |     6.2.1     |
| 6.2.2         |     6.2.2     |
| 6.2.3         |     6.2.3     |
| 6.2.4         |     6.2.4     |
| 6.3.0         |     6.3.0     |
| 6.3.1         |     6.3.1     |
| 6.3.2         |     6.3.2     |
| 6.4.0         |     6.4.0     |
| 6.4.1         |     6.4.1     |
| 6.4.2         |     6.4.2     |
| 6.4.3         |     6.4.3     |
| 6.5.0         |     6.5.0     |
| 6.5.1         |     6.5.1     |
| 6.5.2         |     6.5.2     |
| 6.5.3         |     6.5.3     |
| 6.5.4         |     6.5.4     |
| 6.6.0         |     6.6.0     |
| 6.6.1         |     6.6.1     |
| 6.6.2         |     6.6.2     |
| 6.7.0         |     6.7.0     |
| 6.7.1         |     6.7.1     |
| 6.7.2         |     6.7.2     |
| 6.8.0         |     6.8.0     |
| 6.8.1         |     6.8.1     |
| 6.8.2         |     6.8.2     |
| 6.8.3         |     6.8.3     |
| 6.8.4         |     6.8.4     |
| 7.0.0         |     7.0.0     |
| 7.0.1         |     7.0.1     |
| 7.1.0         |     7.1.0     |
| 7.1.1         |     7.1.1     |
| 7.2.0         |     7.2.0     |
| 7.2.1         |     7.2.1     |
| 7.3.0         |     7.3.0     |
| 7.3.1         |     7.3.1     |
| 7.3.2         |     7.3.2     |
| 7.4.0         |     7.4.0     |
| 7.4.1         |     7.4.1     |
| master        |     7.4.2     |

## 7.4.2 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v7.4.2/elasticsearch-analysis-ansj-7.4.2.0-release.zip
````

## 7.4.1 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v7.4.1/elasticsearch-analysis-ansj-7.4.1.0-release.zip
````

## 7.4.0 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v7.4.0/elasticsearch-analysis-ansj-7.4.0.0-release.zip
````

## 7.3.2 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v7.3.2/elasticsearch-analysis-ansj-7.3.2.0-release.zip
````

## 7.3.1 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v7.3.1/elasticsearch-analysis-ansj-7.3.1.0-release.zip
````

## 7.3.0 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v7.3.0/elasticsearch-analysis-ansj-7.3.0.0-release.zip
````

## 7.2.1 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v7.2.1/elasticsearch-analysis-ansj-7.2.1.0-release.zip
````

## 7.2.0 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v7.2.0/elasticsearch-analysis-ansj-7.2.0.0-release.zip
````

## 7.1.1 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v7.1.1/elasticsearch-analysis-ansj-7.1.1.0-release.zip
````

## 7.1.0 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v7.1.0/elasticsearch-analysis-ansj-7.1.0.0-release.zip
````

## 7.0.1 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v7.0.1/elasticsearch-analysis-ansj-7.0.1.0-release.zip
````

## 7.0.0 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v7.0.0/elasticsearch-analysis-ansj-7.0.0.0-release.zip
````

## 6.8.4 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v6.8.4/elasticsearch-analysis-ansj-6.8.4.0-release.zip
````

## 6.8.3 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v6.8.3/elasticsearch-analysis-ansj-6.8.3.0-release.zip
````

## 6.8.2 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v6.8.2/elasticsearch-analysis-ansj-6.8.2.0-release.zip
````

## 6.8.1 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v6.8.1/elasticsearch-analysis-ansj-6.8.1.0-release.zip
````

## 6.8.0 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v6.8.0/elasticsearch-analysis-ansj-6.8.0.0-release.zip
````

## 6.7.2 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v6.7.2/elasticsearch-analysis-ansj-6.7.2.0-release.zip
````

## 6.7.1 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v6.7.1/elasticsearch-analysis-ansj-6.7.1.0-release.zip
````

## 6.7.0 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v6.7.0/elasticsearch-analysis-ansj-6.7.0.0-release.zip
````

## 6.6.2 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v6.6.2/elasticsearch-analysis-ansj-6.6.2.0-release.zip
````

## 6.6.1 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v6.6.1/elasticsearch-analysis-ansj-6.6.1.0-release.zip
````

## 6.6.0 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v6.6.0/elasticsearch-analysis-ansj-6.6.0.0-release.zip
````

## 6.5.4 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v6.5.4/elasticsearch-analysis-ansj-6.5.4.0-release.zip
````

## 6.5.3 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v6.5.3/elasticsearch-analysis-ansj-6.5.3.0-release.zip
````

## 6.5.2 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v6.5.2/elasticsearch-analysis-ansj-6.5.2.0-release.zip
````

## 6.5.1 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v6.5.1/elasticsearch-analysis-ansj-6.5.1.0-release.zip
````

## 6.5.0 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v6.5.0/elasticsearch-analysis-ansj-6.5.0.0-release.zip
````

## 6.4.3 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v6.4.3/elasticsearch-analysis-ansj-6.4.3.0-release.zip
````

## 6.4.2 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v6.4.2/elasticsearch-analysis-ansj-6.4.2.0-release.zip
````

## 6.4.1 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v6.4.1/elasticsearch-analysis-ansj-6.4.1.0-release.zip
````

## 6.4.0 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v6.4.0/elasticsearch-analysis-ansj-6.4.0.0-release.zip
````

## 6.3.2 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v6.3.2/elasticsearch-analysis-ansj-6.3.2.0-release.zip
````

## 6.3.1 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v6.3.1/elasticsearch-analysis-ansj-6.3.1.0-release.zip
````

## 6.3.0 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v6.3.0/elasticsearch-analysis-ansj-6.3.0.0-release.zip
````

## 6.2.4 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v6.2.4/elasticsearch-analysis-ansj-6.2.4.0-release.zip
````

## 6.2.3 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v6.2.3/elasticsearch-analysis-ansj-6.2.3.0-release.zip
````

## 6.2.2 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v6.2.2/elasticsearch-analysis-ansj-6.2.2.0-release.zip
````

## 6.2.1 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v6.2.1/elasticsearch-analysis-ansj-6.2.1.0-release.zip
````

## 6.2.0 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v6.2.0/elasticsearch-analysis-ansj-6.2.0.0-release.zip
````

## 6.1.4 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v6.1.4/elasticsearch-analysis-ansj-6.1.4.0-release.zip
````

## 6.1.3 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v6.1.3/elasticsearch-analysis-ansj-6.1.3.0-release.zip
````

## 6.1.2 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v6.1.2/elasticsearch-analysis-ansj-6.1.2.0-release.zip
````

## 6.1.1 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v6.1.1/elasticsearch-analysis-ansj-6.1.1.0-release.zip
````

## 6.1.0 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v6.1.0/elasticsearch-analysis-ansj-6.1.0.0-release.zip
````

## 6.0.1 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v6.0.1/elasticsearch-analysis-ansj-6.0.1.0-release.zip
````

## 6.0.0 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v6.0.0/elasticsearch-analysis-ansj-6.0.0.0-release.zip
````

## 5.6.16 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v5.6.16/elasticsearch-analysis-ansj-5.6.16.0-release.zip
````

## 5.6.15 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v5.6.15/elasticsearch-analysis-ansj-5.6.15.0-release.zip
````

## 5.6.14 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v5.6.14/elasticsearch-analysis-ansj-5.6.14.0-release.zip
````

## 5.6.13 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v5.6.13/elasticsearch-analysis-ansj-5.6.13.0-release.zip
````

## 5.6.12 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v5.6.12/elasticsearch-analysis-ansj-5.6.12.0-release.zip
````

## 5.6.11 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v5.6.11/elasticsearch-analysis-ansj-5.6.11.0-release.zip
````

## 5.6.10 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v5.6.10/elasticsearch-analysis-ansj-5.6.10.0-release.zip
````

## 5.6.9 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v5.6.9/elasticsearch-analysis-ansj-5.6.9.0-release.zip
````

## 5.6.8 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v5.6.8/elasticsearch-analysis-ansj-5.6.8.0-release.zip
````

## 5.6.7 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v5.6.7/elasticsearch-analysis-ansj-5.6.7.0-release.zip
````

## 5.6.6 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v5.6.6/elasticsearch-analysis-ansj-5.6.6.0-release.zip
````

## 5.6.5 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v5.6.5/elasticsearch-analysis-ansj-5.6.5.0-release.zip
````

## 5.6.4 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v5.6.4/elasticsearch-analysis-ansj-5.6.4.0-release.zip
````

## 5.6.3 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v5.6.3/elasticsearch-analysis-ansj-5.6.3.0-release.zip
````

## 5.6.2 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v5.6.2/elasticsearch-analysis-ansj-5.6.2.0-release.zip
````

## 5.6.1 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v5.6.1/elasticsearch-analysis-ansj-5.6.1.0-release.zip
````

## 5.6.0 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v5.6.0/elasticsearch-analysis-ansj-5.6.0.0-release.zip
````

## 5.5.3 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v5.5.3/elasticsearch-analysis-ansj-5.5.3.0-release.zip
````

## 5.5.2 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v5.5.2/elasticsearch-analysis-ansj-5.5.2.0-release.zip
````

## 5.5.1 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v5.5.1/elasticsearch-analysis-ansj-5.5.1.0-release.zip
````

## 5.5.0 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v5.5.0/elasticsearch-analysis-ansj-5.5.0.0-release.zip
````

## 5.4.3 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v5.4.3/elasticsearch-analysis-ansj-5.4.3.0-release.zip
````

## 5.4.2 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v5.4.2/elasticsearch-analysis-ansj-5.4.2.0-release.zip
````

## 5.4.1 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v5.4.1/elasticsearch-analysis-ansj-5.4.1.0-release.zip
````

## 5.4.0 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v5.4.0/elasticsearch-analysis-ansj-5.4.0.0-release.zip
````

## 5.3.3 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v5.3.3/elasticsearch-analysis-ansj-5.3.3.0-release.zip
````

## 5.3.2 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v5.3.2/elasticsearch-analysis-ansj-5.3.2.0-release.zip
````

## 5.3.1 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v5.3.1/elasticsearch-analysis-ansj-5.3.1.0-release.zip
````

## 5.3.0 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v5.3.0/elasticsearch-analysis-ansj-5.3.0.0-release.zip
````

## 5.2.2 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v5.2.2/elasticsearch-analysis-ansj-5.2.2.0-release.zip
````

## 5.2.1 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v5.2.1/elasticsearch-analysis-ansj-5.2.1.0-release.zip
````

## 5.2.0 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v5.2.0/elasticsearch-analysis-ansj-5.2.0.0-release.zip
````

## 5.1.2 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v5.1.2/elasticsearch-analysis-ansj-5.1.2.0-release.zip
````

## 5.1.1 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v5.1.1/elasticsearch-analysis-ansj-5.1.1.0-release.zip
````

## 5.0.2 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v5.0.2/elasticsearch-analysis-ansj-5.0.2.0-release.zip
````

## 5.0.1 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v5.0.1/elasticsearch-analysis-ansj-5.0.1.1-release.zip
````

## 5.0.0 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/elasticsearch-plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v5.0.0/elasticsearch-analysis-ansj-5.0.0.0-release.zip
````

## 2.4.6 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v2.4.6/elasticsearch-analysis-ansj-2.4.6.0-release.zip
````

## 2.4.5 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v2.4.5/elasticsearch-analysis-ansj-2.4.5.0-release.zip
````

## 2.4.4 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v2.4.4/elasticsearch-analysis-ansj-2.4.4.0-release.zip
````

## 2.4.3 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v2.4.3/elasticsearch-analysis-ansj-2.4.3.0-release.zip
````

## 2.4.2 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v2.4.2/elasticsearch-analysis-ansj-2.4.2.0-release.zip
````

## 2.4.1 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/plugin install https://github.com/NLPchina/elasticsearch-analysis-ansj/releases/download/v2.4.1/elasticsearch-analysis-ansj-2.4.1.0-release.zip
````

## 2.4.0 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/plugin install http://maven.nlpcn.org/org/ansj/elasticsearch-analysis-ansj/2.4.0.3/elasticsearch-analysis-ansj-2.4.0.3-release.zip
````

## 2.3.5 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/plugin install http://maven.nlpcn.org/org/ansj/elasticsearch-analysis-ansj/2.3.5.3/elasticsearch-analysis-ansj-2.3.5.3-release.zip
````

## 2.3.4 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/plugin install http://maven.nlpcn.org/org/ansj/elasticsearch-analysis-ansj/2.3.4/elasticsearch-analysis-ansj-2.3.4-release.zip
````

## 2.3.3 插件安装

进入Elasticsearch目录运行如下命令

````
进入es目录执行如下命令

./bin/plugin install http://maven.nlpcn.org/org/ansj/elasticsearch-analysis-ansj/2.3.3.3/elasticsearch-analysis-ansj-2.3.3.3-release.zip
````

## 2.3.2 插件安装

进入Elasticsearch目录运行如下命令 

````
进入es目录执行如下命令

./bin/plugin install http://maven.nlpcn.org/org/ansj/elasticsearch-analysis-ansj/2.3.2.1/elasticsearch-analysis-ansj-2.3.2.1-release.zip
````

## 2.3.1 插件安装

进入Elasticsearch目录运行如下命令 

````
进入es目录执行如下命令

./bin/plugin install http://maven.nlpcn.org/org/ansj/elasticsearch-analysis-ansj/2.3.1/elasticsearch-analysis-ansj-2.3.1-release.zip
````


## 2.1.1 插件安装

进入Elasticsearch目录运行如下命令 

````
进入es目录执行如下命令

./bin/plugin install http://maven.nlpcn.org/org/ansj/elasticsearch-analysis-ansj/2.1.1/elasticsearch-analysis-ansj-2.1.1-release.zip
````

## 1.x 插件安装

进入Elasticsearch目录运行如下命令 

````
./bin/plugin -u http://maven.nlpcn.org/org/ansj/elasticsearch-analysis-ansj/1.x.1/elasticsearch-analysis-ansj-1.x.1-release.zip -i ansj
````


==========

## 2019年1月20日
+ ansj_seg升级至5.1.6


## 2017年4月9日
+ ansj_seg升级至5.1.1
+ 支持配置同义词词典
+ 支持自定义分词器
+ 支持从http，文件，数据库，jar，class加载词典
+ 热词更新，用http接口取代redis


## 2016年11月11日
+ elasticsearch更新至5.0.0
+ ansj_seg升级至5.0.4
+ 新增配置文件config/ansj.cfg.yml


## 2016年04月16日
+ elasticsearch更新2.3.1
+ ansj_seg升级至3.7.3


## 1770年01月01日
+ elasticsearch更新2.1.1
+ ansj_seg升级至3.5
+ 新增http的_ansj接口，用于查看ansj分词词性
+ 新增http的_cat/ansj接口,作用同上，显示为cat方式
+ 新增http的_cat/[index]/analyze接口，和_analyze作用一样，显示为cat方式
+ 更方便的配置

先来点配置好的示例 ^ ^ 别吐槽我的格式化 (顺便求一个判断字符串中含有几个中文的方法)


## 测试


* 创建测试索引

```linux
curl -X PUT "127.0.0.1:9200/test" -H 'Content-Type: application/json' -d '{
    "settings" : {
        "number_of_shards" : 1,
        "number_of_replicas" : 0

    },
    "mappings" : {
        "test" : {
            "_all" : { "enabled" : false },
            "properties" : {
                "name" : { "type" : "string", "analyzer" : "index_ansj", "search_analyzer" : "query_ansj" }
            }
        }
    }
}'
````

* 添加索引内容

````
curl -X PUT "127.0.0.1:9200/test/test/1" -H 'Content-Type: application/json' -d '{
    "name" : "中国人民万岁",
    "post_date" : "2009-11-15T14:12:12",
    "message" : "trying out Elasticsearch"
}'
````

* 查询索引

````
浏览器访问:
http://127.0.0.1:9200/test/test/_search?q=name:%E4%B8%AD%E5%9B%BD
````


* 如果你想把ansj作为你的默认分词需要在elasticsearch.yml加入如下配置:

```yaml

#默认分词器,索引
index.analysis.analyzer.default.type: index_ansj

#默认分词器,查询

index.analysis.analyzer.default_search.type: query_ansj
```



## 关于分词器不得不说的那点小事
````
目前默认内置三个分词器

当然如果你有心仔细观察日志看到了实例化了n多分词器如下

 regedit analyzer named : index_ansj
 regedit analyzer named : query_ansj
 regedit analyzer named : to_ansj
 regedit analyzer named : dic_ansj
 regedit analyzer named : user_ansj
 regedit analyzer named : search_ansj

why????
额 只有三个其他都是别名

````


### 索引分词

```shell

index_ansj 是索引分词,尽可能分词处所有结果 example

http://127.0.0.1:9200/_cat/test/analyze?text=%E5%85%AD%E5%91%B3%E5%9C%B0%E9%BB%84%E4%B8%B8%E8%BD%AF%E8%83%B6%E5%9B%8A&analyzer=index_ansj

六味  		0		2		0		word		
地   		2		3		1		word		
黄丸软 		3		6		2		word		
胶囊  		6		8		3		word		
六味地黄		0		4		4		word		
地黄  		2		4		5		word		
地黄丸 		2		5		6		word		
软胶  		5		7		7		word		
软胶囊 		5		8		8		word			


````


### 搜索分词 (search_ansj=to_ansj=query_ansj)

```shell

query_ansj 是搜索分词,是索引分词的子集,保证了准确率 example

http://127.0.0.1:9200/_cat/test/analyze?text=%E5%85%AD%E5%91%B3%E5%9C%B0%E9%BB%84%E4%B8%B8%E8%BD%AF%E8%83%B6%E5%9B%8A&analyzer=query_ansj

六味 		0		2		0		word		
地  			2		3		1		word		
黄丸软		3		6		2		word		
胶囊 		6		8		3		word		

````

### 用户自定义词典优先的分词方式 (user_ansj=dic_ansj)

```shell

dic_ansj 是用户自定义词典优先策略

http://127.0.0.1:9200/_cat/test/analyze?text=%E5%85%AD%E5%91%B3%E5%9C%B0%E9%BB%84%E4%B8%B8%E8%BD%AF%E8%83%B6%E5%9B%8A&analyzer=dic_ansj

六味地黄		0		4		0		word		
丸   		4		5		1		word		
软胶囊 		5		8		2		word		

````



## 编译安装

* 第一步，你要有一个`elasticsearch`的服务器(废话) 版本2.1.1

* 第二步，把代码clone到本地

* 第三步，mvn clean install

* 第四步，进入$Project_Home/target/releases 目录，

* 第五步，拷贝$Project_Home/target/releases/目录下的zip包到解压到$ES_HOME/plugins目录下



 
现在,你的es集群已经有下面三个名字的analyzer

+ index_ansj (建议索引使用)
+ query_ansj (建议搜索使用)
+ dic_ansj

三个名字的tokenizer

+ index_ansj (建议索引使用)
+ query_ansj (建议搜索使用)
+ dic_ansj


## 分词文件配置:
### 2.4.2或5.2.0以上:
- 5.2.0以上配置文件config/ansj.cfg.yml，需要放入$ES_HOME/config/elasticsearch-analysis-ansj/ansj.cfg.yml或者$ES_HOME/plugins/elasticsearch-analysis-ansj-*/config/ansj.cfg.yml
```yaml
# 全局变量配置方式一
ansj:
  #默认参数配置
  isNameRecognition: true #开启姓名识别
  isNumRecognition: true #开启数字识别
  isQuantifierRecognition: true #是否数字和量词合并
  isRealName: false; #是否保留真实词语,建议保留false

  #用户自定词典配置
  dic: default.dic #也可以写成 file//default.dic , 如果未配置dic,则此词典默认加载
  # http方式加载
  #dic_d1: http://xxx/xx.dic
  # jar中文件加载
  #dic_d2: jar://org.ansj.dic.DicReader|/dic2.dic
  # 从数据库中加载
  #dic_d3: jdbc://jdbc:mysql://xxxx:3306/ttt?useUnicode=true&characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull|username|password|select name as name,nature,freq from dic where type=1
  # 从自定义类中加载,YourClas  extends PathToStream
  #dic_d3: class://xxx.xxx.YourClas|ohterparam

  #过滤词典配置
  #stop: http,file,jar,class,jdbc 都支持
  #stop_key1: ...

  #歧义词典配置
  #ambiguity: http,file,jar,class,jdbc 都支持
  #ambiguity_key1: ...

  #同义词词典配置
  #synonyms: http,file,jar,class,jdbc 都支持
  #synonyms_key1: ...

# 全局变量配置方式二 通过配置文件的方式配置,优先级高于es本身的配置
ansj_config: ansj_library.properties # http,file,jar,class,jdbc 都支持,格式参见ansj_library.properties
```

- 配置自定义分词器

**注意**：这里的配置时不会生效的，需要按照这里的配置格式创建自定义analyzer时创建。

```yaml
# 配置自定义分词器
index:
  analysis:
    tokenizer :
      my_dic :
        # 类型支持base_ansj, index_ansj, query_ansj, dic_ansj, nlp_ansj
        type : dic_ansj
        dic: dic
        stop: stop
        ambiguity: ambiguity
        synonyms: synonyms
        isNameRecognition: true
        isNumRecognition: true
        isQuantifierRecognition: true
        isRealName: false

    analyzer:
      my_dic:
        type: custom
        tokenizer: my_dic
```

- http接口

  + /_cat/ansj: 执行分词
  格式如下：/_cat/ansj?text=中国&type=index_ansj&dic=dic&stop=stop&ambiguity=ambiguity&synonyms=synonyms
  
  + /_cat/ansj/config: 显示全部配置
  + /_ansj/flush/config: 刷新全部配置
  + /_ansj/flush/dic: 更新全部词典。包括用户自定义词典,停用词典,同义词典,歧义词典,crf
  格式：/_ansj/flush/dic?key=dic_name

### 2.4.2或5.2.0以下

在这里我说一下，在插件里我写了一些默认配置，如果你也可以接受我的默认配置，关于ansj就完全不用配置了，或者只修改你需要的配置。下面的代码目录都是相对es的config目录，有几点需要注意一下:

+ ansj的核心词典是和插件一起安装的在插件目录下面
+ 由于使用redis的pubsub功能，需要相关权限控制，安装的时候必须获得允许，而2.3.3.2以前的版本需要加./elasticsearch -Des.security.manager.enabled=false参数才能解决
+ 请慎重使用redis的pubsub功能
+ 5.0.0版本新增配置文件config/ansj.cfg.yml，需要放入$ES_HOME/config/elasticsearch-analysis-ansj/ansj.cfg.yml或者$ES_HOME/plugins/elasticsearch-analysis-ansj-*/config/ansj.cfg.yml

```yaml
## ansj配置
ansj:
 dic_path: "ansj/dic/user/" ##用户词典位置
 ambiguity_path: "ansj/dic/ambiguity.dic" ##歧义词典
 enable_name_recognition: true ##人名识别
 enable_num_recognition: true ##数字识别
 enable_quantifier_recognition: false ##量词识别
 enabled_stop_filter: true ##是否基于词典过滤
 enable_skip_user_define: false ## 是否用户词典不加载相同的词
 stop_path: "ansj/dic/stopLibrary.dic" ##停止过滤词典
## redis 不是必需的
 redis:
  pool:
   maxactive: 20
   maxidle: 10
   maxwait: 100
   testonborrow: true
  ip: 10.0.85.51:6379
  timeout: 2000
  #password: "******" ## 不要添加这个配置，除非redis需要权限认证
  channel: ansj_term ## publish时的channel名称
  write:
    dic: "ext.dic" ## 如果有使用redis的pubsub方式更新词典。如果没有配置，默认使用的是$ES_HOME/config/ansj/dic/user/ext.dic
```

- 查询分词

可以使用开头我提供的http接口来查看分词效果

然后通过redis发布一个新词看看
追加新词
```
redis-cli
publish ansj_term u:c:视康

```

是不是分词发生了变化
删除词条
```
redis-cli
publish ansj_term u:d:视康
```

又回来了

然后通过redis发布一个歧义词
追加歧义词
```
redis-cli
publish ansj_term a:c:减肥瘦身-减肥,nr,瘦身,v
```

是不是分词发生了变化
删除歧义词
```
redis-cli
publish ansj_term a:d:减肥瘦身
```

又回来了


## 结束
就写这么多吧，有啥问题，QQ找我


## License
[![FOSSA Status](https://app.fossa.io/api/projects/git%2Bgithub.com%2FNLPchina%2Felasticsearch-analysis-ansj.svg?type=large)](https://app.fossa.io/projects/git%2Bgithub.com%2FNLPchina%2Felasticsearch-analysis-ansj?ref=badge_large)