# API 接口开放平台

## **项目简介**

- 一个提供 API 接口供开发者调用的平台。
- 用户可以注册登录，开通接口调用权限。用户可以浏览接口并调用，且每次调用会进行统计。
- 管理员可以发布接口、下线接口、接入接口，以及可视化接口的调用情况、数据。

> 此项目是前后端分离项目，在线访问地址：http://api.valechat.site/
> （旧：http://62.234.8.36/）
>
> （用户名：admin、密码：abc123456）
>
> 前端项目地址：https://github.com/Manson-chen/api-platform-frontend

## 快速开始

### 本项目启动

1. 修改 yml 中的配置
2. 启动 Nacos 注册中心
3. 启动 api-backend 模块 -> api-gateway模块 -> api-interface 模块



### 客户端 SDK 调用

#### 1、引入 SDK

```xml
<dependency>
    <groupId>io.github.manson-chen</groupId>
    <artifactId>api-client-sdk</artifactId>
    <version>0.0.3</version>
</dependency>
```



#### 2、复制开发者密钥对

<img src="README.assets/image-20230810225124905.png" alt="image-20230810225124905" style="zoom: 25%;" />

#### 3、初始化 ApiClient 对象

**方法1：自主 new 对象**

```java
String accessKey = "你的 accessKey";
String secretKey = "你的 secretKey";
ApiClient client = new ApiClient(accessKey, secretKey);
```



**方法2：通过配置注入对象**

修改 yml 配置文件：

```yml
api:
  client:
    access-key: 你的 access-key
    secret-key: 你的 secret-key
```

使用客户端对象：

```java
@Resource
private ApiClient client;
```

#### 4、调用接口并获取响应

```java
String goodText = client.getGoodText();
String image = client.getImage();
String ipStatus = client.getIpStatus("域名");
String qqStatus = client.getQqStatus("qq 账号");
String history = client.getTodayInHistory();
```



## 技术选型

### 后端技术栈

- Spring Boot ：基于之前的模版
- MyBatis-Plus：配合 MyBatis X 使用，提高开发效率
- MySQL：关系数据库
- Redis：数据缓存、提供查询效率
- Nacos：注册中心
- Dubbo：基于 RPC 实现（像调用本地方法一样调用远程方法）
- Spring Cloud Gateway：微服务网关



## 架构设计与模块划分

### 系统架构

![image-20230811001313519](README.assets/image-20230811001313519.png)

### 模块划分

总共包含了 web模块、API 网关模块、模拟接口模块、公共模块、客户端 SDK 模块

- Web（api-backend）：主要用于接收前端的请求，并处理与数据库相关的操作
- API 网关（api-gateway）：用于路由转发、统一鉴权、访问控制、流量染色、跨域处理、统一日志、**统一业务处理**
- 模拟接口（api-interface）：提供可供调用的接口
- 公共模块（api-common）：封装公共使用的类，减少重复代码
- 客户端 SDK（api-client-sdk）：提供给开发者调用，简洁开发



## 项目成果

### 首页

- 查看所有接口

<img src="README.assets/image-20230810224446152.png" alt="image-20230810224446152" style="zoom: 50%;" />

### 接口详情与在线调用

- 根据请求参数去调用

  - 示例 1：

  ​	<img src="README.assets/image-20230810224959444.png" alt="image-20230810224959444" style="zoom: 50%;" />

  - 示例 2：当请求参数为null，在线测试处可以为空

  ​	<img src="README.assets/image-20230810224807435.png" alt="image-20230810224807435" style="zoom: 50%;" />

<img src="README.assets/image-20230810224825631.png" alt="image-20230810224825631" style="zoom:50%;" />

### 接口管理

<img src="README.assets/image-20230810225039721.png" alt="image-20230810225039721" style="zoom: 50%;" />

### 接口分析

<img src="README.assets/image-20230810225103683.png" alt="image-20230810225103683" style="zoom: 50%;" />











