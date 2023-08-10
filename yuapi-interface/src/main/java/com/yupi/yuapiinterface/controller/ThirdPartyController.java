package com.yupi.yuapiinterface.controller;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.yupi.yuapiclientsdk.model.Body;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.nio.charset.StandardCharsets;

/**
 * 名称 API
 *
 */
@RestController
@RequestMapping("/other")
public class ThirdPartyController {

    @GetMapping("/today/history")
    public String getTodayInHistory() {
        String requestUrl = "https://api.oick.cn/lishi/api.php";
//        HttpResponse httpResponse = HttpRequest.get(requestUrl + "?text=" + text)
        HttpResponse httpResponse = HttpRequest.get(requestUrl)
                .charset(StandardCharsets.UTF_8)
                .execute();
        String result = httpResponse.body();
        JsonObject jsonObject = JsonParser.parseString(result).getAsJsonObject();
        System.out.println(result);
        int code = jsonObject.get("code").getAsInt();
        if (code != 200) {
            return "获取失败";
        }
        JsonArray jsonArray = jsonObject.get("result").getAsJsonArray();
        System.out.println(jsonArray);
        return jsonArray.toString();
    }

    @PostMapping("/qq/status")
    public String getQqStatus(@RequestParam String qq) {
        System.out.println("@PostMapping(\"/qq/status\")");
        String requestUrl = "https://api.btstu.cn/qqol/api.php";
//        HttpResponse httpResponse = HttpRequest.get(requestUrl + "?text=" + text)
        HttpResponse httpResponse = HttpRequest.get(requestUrl)
                .charset(StandardCharsets.UTF_8)
                .form("qq", qq)
                .execute();
        String result = httpResponse.body();
        JsonObject jsonObject = JsonParser.parseString(result).getAsJsonObject();
        int code = jsonObject.get("code").getAsInt();
        String tst = jsonObject.get("msg").getAsString();
        if (code != 20) {
            return "获取 QQ 在线状态出错";
        }
        System.out.println(result);
        return tst;
    }

    @GetMapping("/text/good")
    public String getGoodText() {
        System.out.println("@GetMapping(\"/text/good\")");
        String requestUrl = "https://api.btstu.cn/yan/api.php";
        HttpResponse httpResponse = HttpRequest.get(requestUrl)
                .charset(StandardCharsets.UTF_8)
                .execute();
        String result = httpResponse.body();
        System.out.println(result);
        return result;
    }

    @GetMapping("/image")
    public String getImage() {
        System.out.println("@GetMapping(\"/image\")");
        String requestUrl = "https://api.btstu.cn/sjbz/api.php";
        HttpResponse httpResponse = HttpRequest.get(requestUrl)
                .charset(StandardCharsets.UTF_8)
                .form("format", "json")
                .execute();
        String result = httpResponse.body();
        JsonObject jsonObject = JsonParser.parseString(result).getAsJsonObject();
        String msg = jsonObject.get("imgurl").getAsString();
        return msg;
    }

    @PostMapping("/ip/status")
    public String getIpStatus(@RequestParam String ip) {
        System.out.println("@PostMapping(\"/ip/status\")");
        String requestUrl = "https://api.btstu.cn/dmreg/api.php";
//        HttpResponse httpResponse = HttpRequest.get(requestUrl + "?text=" + text)
        HttpResponse httpResponse = HttpRequest.post(requestUrl)
                .charset(StandardCharsets.UTF_8)
                .form("domain", ip)
                .execute();
        String result = httpResponse.body();
        System.out.println("结果:" + result);
        JsonObject jsonObject = JsonParser.parseString(result).getAsJsonObject();
        String msg = jsonObject.get("msg").getAsString();
        return msg;
    }


    @PostMapping("/name/user/test")
    public String getUserNameByPost(@RequestBody Body user, HttpServletRequest request) {
//        String accessKey = request.getHeader("accessKey");
//        String nonce = request.getHeader("nonce");
//        String timestamp = request.getHeader("timestamp");
//        String sign = request.getHeader("sign");
//        String body = request.getHeader("body");
//        // todo 实际情况应该是去数据库中查是否已分配给用户
//        if (!accessKey.equals("yupi")) {
//            throw new RuntimeException("无权限");
//        }
//        // 实际可以用redis存储
//        if (Long.parseLong(nonce) > 10000) {
//
//        }
//        // 时间和当前时间不能超过 5 分钟
////        if (timestamp) {
////
////        }
//        // todo 实际情况中是从数据库中根据accesskey查出 secretKey
//        String serverSign = SignUtils.genSign(body, "abcdefgh");
//        if (!sign.equals(serverSign)) {
//            throw new RuntimeException("无权限");
//        }

        String result =  "Post 用户名是" + user.getUsername();
        //todo 调用成功后，次数+1 invokeCount

        return result;
    }

}
