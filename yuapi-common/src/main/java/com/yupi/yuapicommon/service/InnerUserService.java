package com.yupi.yuapicommon.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.yuapicommon.model.entity.User;



/**
 * 用户服务
 *
 * @author yupi
 */
public interface InnerUserService{

    /**
     * 数据库中是否已分配给用户密钥（accesskey、secretKey，用户信息，为空表示不存在）
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);

}
