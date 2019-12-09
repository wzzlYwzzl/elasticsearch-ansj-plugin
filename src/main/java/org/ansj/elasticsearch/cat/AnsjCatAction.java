package org.ansj.elasticsearch.cat;

import org.ansj.elasticsearch.action.AnsjAction;
import org.ansj.elasticsearch.action.AnsjRequest;
import org.ansj.elasticsearch.action.AnsjResponse;
import org.ansj.library.AmbiguityLibrary;
import org.ansj.library.CrfLibrary;
import org.ansj.library.DicLibrary;
import org.ansj.library.StopLibrary;
import org.ansj.library.SynonymsLibrary;
import org.elasticsearch.client.node.NodeClient;
import org.elasticsearch.common.Table;
import org.elasticsearch.rest.RestController;
import org.elasticsearch.rest.RestRequest;
import org.elasticsearch.rest.RestResponse;
import org.elasticsearch.rest.action.RestResponseListener;
import org.elasticsearch.rest.action.cat.AbstractCatAction;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by zhangqinghua on 16/2/2.
 */
public class AnsjCatAction extends AbstractCatAction {

    public AnsjCatAction(RestController controller) {
        controller.registerHandler(RestRequest.Method.GET, "/_cat/ansj", this);
        controller.registerHandler(RestRequest.Method.GET, "/_cat/ansj/config", this);
        controller.registerHandler(RestRequest.Method.GET, "/_ansj/flush/config", this);
        controller.registerHandler(RestRequest.Method.GET, "/_ansj/flush/config/single", this);
        controller.registerHandler(RestRequest.Method.GET, "/_ansj/flush/dic", this);
        controller.registerHandler(RestRequest.Method.GET, "/_ansj/flush/dic/single", this);
    }

    @Override
    public String getName() {
        return "ansj_cat_action";
    }

    @Override
    protected RestChannelConsumer doCatRequest(RestRequest request, NodeClient client) {
        AnsjRequest ansjRequest = new AnsjRequest(request.path());

        ansjRequest.asMap().putAll(request.params());

        return channel -> client.execute(AnsjAction.INSTANCE, ansjRequest, new RestResponseListener<AnsjResponse>(channel) {
            @Override
            public RestResponse buildResponse(final AnsjResponse ansjResponse) throws Exception {
                return ChineseRestTable.response(channel, ansjResponse.asMap());
            }
        });
    }

    @Override
    protected Set<String> responseParams() {
        Set<String> responseParams = new HashSet<>(super.responseParams());
        responseParams.addAll(Arrays.asList("text", "index", "field", "analyzer", "tokenizer", "filters", "token_filters", "char_filters", "type", "key",
                "isNameRecognition", "isNumRecognition", "isQuantifierRecognition", "isRealName", "isSkipUserDefine",
                CrfLibrary.DEFAULT, DicLibrary.DEFAULT, AmbiguityLibrary.DEFAULT, StopLibrary.DEFAULT, SynonymsLibrary.DEFAULT));
        return Collections.unmodifiableSet(responseParams);
    }

    @Override
    protected void documentation(StringBuilder stringBuilder) {

    }

    @Override
    protected Table getTableWithHeader(RestRequest restRequest) {
        return null;
    }
}
