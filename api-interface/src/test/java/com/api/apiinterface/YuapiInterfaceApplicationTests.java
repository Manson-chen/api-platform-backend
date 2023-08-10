package com.api.apiinterface;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import com.yupi.yuapiclientsdk.client.YuApiClient;
import com.yupi.yuapiclientsdk.model.Body;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.nio.charset.StandardCharsets;

@SpringBootTest
class YuapiInterfaceApplicationTests {

    @Resource
    private YuApiClient yuApiClient;

    @Test
    void contextLoads() {
        String result = yuApiClient.getNameByGet("yupi");
        Body user = new Body();
        user.setUsername("liyupi");
        String usernameByPost = yuApiClient.getUserNameByPost(user);
        System.out.println(result);
        System.out.println(usernameByPost);
    }

    @Test
    void textTranslate(){
//        Text text = new Text();
//        text.setText("你好");
//        System.out.println(text);
//        String params = JSONUtil.toJsonStr(text);
//        Map<String, String> hashMap = new HashMap<>();
//        hashMap.put("text", "你好");
//        String params = JSONUtil.toJsonStr(hashMap);

        // translation
//        String requestUrl = "https://api.btstu.cn/tst/api.php";
////        HttpResponse httpResponse = HttpRequest.get(requestUrl + "?text=" + text)
//        HttpResponse httpResponse = HttpRequest.post(requestUrl)
//                .charset(StandardCharsets.UTF_8)
//                .form("text", "你好")
//                .execute();
//        String result = httpResponse.body();
//        System.out.println(result);

        // goodtext
//        String requestUrl = "https://api.btstu.cn/yan/api.php";
//        HttpResponse httpResponse = HttpRequest.get(requestUrl)
//                .charset(StandardCharsets.UTF_8)
//                .execute();
//        String result = httpResponse.body();
//        System.out.println(result);

        //随机壁纸
//        String requestUrl = "https://api.btstu.cn/sjbj/api.php";
//        HttpResponse httpResponse = HttpRequest.get(requestUrl)
//                .charset(StandardCharsets.UTF_8)
//                .form("format", "json")
//                .execute();
//        String result = httpResponse.body();
//        System.out.println(result);

        //qq 在线状态
//        String requestUrl = "https://api.btstu.cn/qqol/api.php";
////        HttpResponse httpResponse = HttpRequest.get(requestUrl + "?text=" + text)
//        HttpResponse httpResponse = HttpRequest.get(requestUrl)
//                .charset(StandardCharsets.UTF_8)
//                .form("qq", "948936249")
//                .execute();
//        String result = httpResponse.body();
//        JsonObject jsonObject = JsonParser.parseString(result).getAsJsonObject();
//        int code = jsonObject.get("code").getAsInt();
//        String tst = jsonObject.get("msg").getAsString();
//        if (code != 20) {
//            System.out.println("获取 QQ 在线状态出错");
//        }
//        System.out.println(result);


        // 域名注册查询
//        String requestUrl = "https://api.btstu.cn/dmreg/api.php";
//        HttpResponse httpResponse = HttpRequest.post(requestUrl)
//                .charset(StandardCharsets.UTF_8)
//                .form("domain", "qq.com")
//                .execute();
//        String result = httpResponse.body();
//        JsonObject jsonObject = JsonParser.parseString(result).getAsJsonObject();
//        String status = jsonObject.get("msg").getAsString();
//        System.out.println(status);
//        System.out.println(result);

        String requestUrl = "https://api.btstu.cn/qqol/api.php";
//        HttpResponse httpResponse = HttpRequest.get(requestUrl + "?text=" + text)
        HttpResponse httpResponse = HttpRequest.post(requestUrl)
                .charset(StandardCharsets.UTF_8)
                .form("domain", "qq.com")
                .execute();
        String result = httpResponse.body();
    }

}
