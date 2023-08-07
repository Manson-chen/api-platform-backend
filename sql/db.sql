-- 创建库
create database if not exists yuapi;

-- 切换库
use yuapi;

-- 接口信息
create table if not exists yuapi.`interface_info`
(
    `id` bigint not null comment '用户id' primary key,
    `name` varchar(256) not null comment '人名',
    `description` varchar(256) null comment '描述',
    `url` varchar(512) not null comment '接口地址',
    `requestParams` text not null comment '请求参数',
    `requestHeader` text null comment '请求头',
    `responseHeader` text null comment '响应头',
    `status` int default 0 not null comment '接口状态（0-关闭；1-开启）',
    `method` varchar(256) not null comment '请求类型',
    `userId` bigint not null comment '用户名',
    `createTime` datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    `updateTime` datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    `isDelete` tinyint default 0 not null comment '是否删除（0-未删，1-已删）'
    ) comment '接口信息';

insert into yuapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `createTime`, `updateTime`, `isDelete`) values (6643943, '黎伟宸', '萧熠彤', 'www.chang-oconnell.org', '孟懿轩', '洪绍辉', 0, '潘懿轩', 62, '2022-03-02 10:57:28', '2022-10-05 13:10:06', 0);
insert into yuapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `createTime`, `updateTime`, `isDelete`) values (4950, '金致远', '江昊焱', 'www.markus-abbott.io', '贺鸿煊', '邹思淼', 0, '姚志强', 7, '2022-01-06 15:18:53', '2022-11-24 15:05:25', 0);
insert into yuapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `createTime`, `updateTime`, `isDelete`) values (621, '余炫明', '曹航', 'www.sherilyn-huel.org', '戴风华', '贾展鹏', 0, '龙浩', 76730, '2022-08-14 11:59:23', '2022-02-13 23:53:53', 0);
insert into yuapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `createTime`, `updateTime`, `isDelete`) values (83636110, '张瑞霖', '白越彬', 'www.chet-labadie.co', '萧懿轩', '洪旭尧', 0, '廖峻熙', 52, '2022-01-06 12:21:07', '2022-07-04 00:53:55', 0);
insert into yuapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `createTime`, `updateTime`, `isDelete`) values (4, '武弘文', '张晋鹏', 'www.joana-renner.com', '梁思远', '毛琪', 0, '丁立诚', 424, '2022-10-08 02:49:02', '2022-03-21 17:15:31', 0);
insert into yuapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `createTime`, `updateTime`, `isDelete`) values (12, '吴远航', '陶博超', 'www.ira-king.name', '谭越泽', '熊嘉熙', 0, '陈天宇', 123166, '2022-01-06 07:09:24', '2022-09-26 22:16:06', 0);
insert into yuapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `createTime`, `updateTime`, `isDelete`) values (728988, '杨锦程', '胡潇然', 'www.inez-bernier.com', '黄晓啸', '汪梓晨', 0, '熊果', 851696065, '2022-08-28 06:56:45', '2022-07-11 17:32:18', 0);
insert into yuapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `createTime`, `updateTime`, `isDelete`) values (3, '金君浩', '夏瑾瑜', 'www.naomi-tillman.biz', '苏雪松', '龙擎宇', 0, '尹鹏', 6850, '2022-07-03 13:39:31', '2022-04-04 14:49:40', 0);
insert into yuapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `createTime`, `updateTime`, `isDelete`) values (5, '田耀杰', '蒋睿渊', 'www.ulysses-jacobson.net', '江振家', '贾潇然', 0, '谭胤祥', 277826251, '2022-05-12 00:43:43', '2022-11-30 00:20:44', 0);
insert into yuapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `createTime`, `updateTime`, `isDelete`) values (204759, '许子默', '程博文', 'www.tyisha-breitenberg.name', '廖天宇', '邱风华', 0, '龚博超', 736298, '2022-10-10 07:13:21', '2022-04-30 02:30:07', 0);
insert into yuapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `createTime`, `updateTime`, `isDelete`) values (13797, '严潇然', '冯聪健', 'www.hye-rutherford.io', '张博涛', '姜鸿涛', 0, '赵明轩', 8, '2022-04-05 02:25:38', '2022-04-20 00:09:46', 0);
insert into yuapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `createTime`, `updateTime`, `isDelete`) values (609694853, '方天翊', '廖胤祥', 'www.helga-macgyver.name', '苏建辉', '廖黎昕', 0, '韦弘文', 48, '2022-05-22 23:48:25', '2022-06-08 02:51:41', 0);
insert into yuapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `createTime`, `updateTime`, `isDelete`) values (5627180, '金鸿涛', '王致远', 'www.shad-haley.com', '顾文轩', '钟鹏飞', 0, '彭明轩', 2621, '2022-12-22 01:40:52', '2022-06-20 21:57:44', 0);
insert into yuapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `createTime`, `updateTime`, `isDelete`) values (441, '任锦程', '任正豪', 'www.reginald-kub.io', '罗乐驹', '许炫明', 0, '黄煜城', 3072745739, '2022-04-30 18:54:54', '2022-10-14 02:37:55', 0);
insert into yuapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `createTime`, `updateTime`, `isDelete`) values (96917407, '郝哲瀚', '江智渊', 'www.rudolph-quitzon.name', '萧天宇', '袁泽洋', 0, '夏炎彬', 80, '2022-07-16 10:51:24', '2022-12-14 04:39:12', 0);
insert into yuapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `createTime`, `updateTime`, `isDelete`) values (322, '顾鸿煊', '胡明轩', 'www.dorthea-abshire.net', '傅晓啸', '魏彬', 0, '贾鑫磊', 4735399, '2022-12-10 01:26:59', '2022-05-11 02:41:00', 0);
insert into yuapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `createTime`, `updateTime`, `isDelete`) values (89, '侯展鹏', '尹振家', 'www.van-sauer.co', '曹峻熙', '蒋泽洋', 0, '胡嘉懿', 107911031, '2022-08-16 09:36:18', '2022-09-03 07:18:19', 0);
insert into yuapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `createTime`, `updateTime`, `isDelete`) values (6465, '洪浩轩', '蔡梓晨', 'www.nila-yundt.net', '黎鸿涛', '曾旭尧', 0, '于浩宇', 7272233345, '2022-10-14 09:41:08', '2022-08-15 21:38:06', 0);
insert into yuapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `createTime`, `updateTime`, `isDelete`) values (78377, '覃弘文', '龚雨泽', 'www.augustine-kiehn.com', '黎炎彬', '吴振家', 0, '曹鹏煊', 9978, '2022-06-05 13:40:29', '2022-01-08 05:10:10', 0);
insert into yuapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`, `createTime`, `updateTime`, `isDelete`) values (1417, '贾烨伟', '刘风华', 'www.jeanna-huel.com', '何琪', '郑胤祥', 0, '张子涵', 99, '2022-09-05 12:40:10', '2022-08-24 09:45:43', 0);

-- 用户表
create table if not exists user
(
    id           bigint auto_increment comment 'id' primary key,
    userName     varchar(256)                           null comment '用户昵称',
    userAccount  varchar(256)                           not null comment '账号',
    userAvatar   varchar(1024)                          null comment '用户头像',
    gender       tinyint                                null comment '性别',
    userRole     varchar(256) default 'user'            not null comment '用户角色：user / admin',
    userPassword varchar(512)                           not null comment '密码',
    `accessKey` varchar(512) not null comment 'accessKey',
    `secretKey` varchar(512) not null comment 'secretKey',
    createTime   datetime     default CURRENT_TIMESTAMP not null comment '创建时间',
    updateTime   datetime     default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    isDelete     tinyint      default 0                 not null comment '是否删除',
    constraint uni_userAccount
        unique (userAccount)
) comment '用户';

-- -- 帖子表
-- create table if not exists post
-- (
--     id            bigint auto_increment comment 'id' primary key,
--     age           int comment '年龄',
--     gender        tinyint  default 0                 not null comment '性别（0-男, 1-女）',
--     education     varchar(512)                       null comment '学历',
--     place         varchar(512)                       null comment '地点',
--     job           varchar(512)                       null comment '职业',
--     contact       varchar(512)                       null comment '联系方式',
--     loveExp       varchar(512)                       null comment '感情经历',
--     content       text                               null comment '内容（个人介绍）',
--     photo         varchar(1024)                      null comment '照片地址',
--     reviewStatus  int      default 0                 not null comment '状态（0-待审核, 1-通过, 2-拒绝）',
--     reviewMessage varchar(512)                       null comment '审核信息',
--     viewNum       int                                not null default 0 comment '浏览数',
--     thumbNum      int                                not null default 0 comment '点赞数',
--     userId        bigint                             not null comment '创建用户 id',
--     createTime    datetime default CURRENT_TIMESTAMP not null comment '创建时间',
--     updateTime    datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
--     isDelete      tinyint  default 0                 not null comment '是否删除'
-- ) comment '帖子';

-- 用户调用接口关系表：
-- auto-generated definition
create table user_interface_info
(
    id              bigint auto_increment comment '用户id'
        primary key,
    userId          bigint                             not null comment '调用用户 id',
    interfaceInfoId bigint                             not null comment '接口 id',
    totalNum        int      default 0                 not null comment '总调用次数',
    leftNum         int      default 0                 not null comment '剩余调用次数',
    status          int      default 0                 not null comment '0-正常；1-禁用）',
    createTime      datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    updateTime      datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    isDelete        tinyint  default 0                 not null comment '是否删除（0-未删，1-已删）'
)
    comment '用户调用接口关系';