package com.yupi.yuapiclientsdk.client;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.yupi.yuapiclientsdk.model.Body;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import static com.yupi.yuapiclientsdk.utils.SignUtils.genSign;

/**
 * 调用第三方接口的客户端
 *
 * @author Jiandong
 */
public class YuApiClient {

    private static final String GATEWAY_HOST = "http://localhost:8090";

    private String accessKey;

    private String secretKey;

    public YuApiClient(String accessKey, String secretKey) {
        this.accessKey = accessKey;
        this.secretKey = secretKey;
    }

    public String getNameByGet(String name) {
        //可以单独传入http参数，这样参数会自动做URL编码，拼接在URL中
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("name", name);
        String result = HttpUtil.get(GATEWAY_HOST + "/api/name/", paramMap);
        System.out.println(result);
        return result;
    }

    public String getNameByPost(String name) {
        //可以单独传入http参数，这样参数会自动做URL编码，拼接在URL中
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("name", name);

        String result = HttpUtil.post(GATEWAY_HOST + "/api/name/", paramMap);
        System.out.println(result);
        return result;
    }

    private Map<String, String> getHeaderMap(String body){
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("accessKey", accessKey);
        // 一定不能直接发送
//        hashMap.put("secretKey", secretKey);
        hashMap.put("nonce", RandomUtil.randomNumbers(4));
        hashMap.put("body", body);
        hashMap.put("timestamp", String.valueOf(System.currentTimeMillis() / 1000));
        hashMap.put("sign", genSign(body, secretKey));
        return hashMap;
    }

    public String getUserNameByPost(Body user) {
        String json = JSONUtil.toJsonStr(user);
        HttpResponse httpResponse = HttpRequest.post(GATEWAY_HOST + "/api/name/user")
                .charset(StandardCharsets.UTF_8)
                .addHeaders(getHeaderMap(json))
                .body(json)
                .execute();
        System.out.println(httpResponse.getStatus());
        String result = httpResponse.body();
        System.out.println(result);
        return result;

    }

    public String getTodayInHistory() {
        HttpResponse httpResponse = HttpRequest.get(GATEWAY_HOST + "/api/other/today/history")
                .charset(StandardCharsets.UTF_8)
                .addHeaders(getHeaderMap(""))
                .execute();
        System.out.println(httpResponse.getStatus());
        String result = httpResponse.body();
        System.out.println(result);
        return result;

    }

    public String getQqStatus(String number) {
        HttpResponse httpResponse = HttpRequest.post(GATEWAY_HOST + "/api/other/qq/status")
                .charset(StandardCharsets.UTF_8)
                .addHeaders(getHeaderMap(number))
                .form("qq", number)
                .execute();
        System.out.println(httpResponse.getStatus());
        String result = httpResponse.body();
        System.out.println(result);
        return result;

    }

    public String getGoodText() {
        HttpResponse httpResponse = HttpRequest.get(GATEWAY_HOST + "/api/other/text/good")
                .charset(StandardCharsets.UTF_8)
                .addHeaders(getHeaderMap(""))
                .execute();
        System.out.println(httpResponse.getStatus());
        String result = httpResponse.body();
        System.out.println(result);
        return result;

    }

    public String getImage() {
        HttpResponse httpResponse = HttpRequest.get(GATEWAY_HOST + "/api/other/image")
                .charset(StandardCharsets.UTF_8)
                .addHeaders(getHeaderMap(""))
                .execute();
        System.out.println(httpResponse.getStatus());
        String result = httpResponse.body();
        System.out.println(result);
        return result;

    }

    public String getIpStatus(String ip) {
        HttpResponse httpResponse = HttpRequest.post(GATEWAY_HOST + "/api/other/ip/status")
                .charset(StandardCharsets.UTF_8)
                .addHeaders(getHeaderMap(ip))
                .form("ip", ip)
                .execute();
        System.out.println(httpResponse.getStatus());
        String result = httpResponse.body();
        System.out.println(result);
        return result;

    }

}
