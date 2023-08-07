package com.yupi.yuapicommon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.yuapicommon.model.entity.InterfaceInfo;

/**
* @author jiandongchen
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-03-11 00:15:11
*/
public interface InnerInterfaceInfoService{

    /**
     * 从数据中查询模拟接口是否存在（请求路径、请求方法，接口信息，为空标识不存在）
     * @param path
     * @param method
     * @return
     */
    InterfaceInfo getInterfaceInfo(String path, String method);
}
