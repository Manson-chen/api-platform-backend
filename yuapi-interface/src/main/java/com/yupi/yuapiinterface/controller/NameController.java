package com.yupi.yuapiinterface.controller;

import com.yupi.yuapiclientsdk.model.Body;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 名称 API
 *
 */
@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping("/get")
    public String getNameByGet(String name, HttpServletRequest request) {
        System.out.println(request.getHeader("yupi"));
        return "Get 你的名字是" + name;
    }

    @PostMapping("/post")
    public String getNameByPost(@RequestParam String name) {
        return "Post 你的名字是" + name;
    }

    @PostMapping("/user")
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
