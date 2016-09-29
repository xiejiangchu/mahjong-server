CREATE DATABASE IF NOT EXISTS `mahjong`;

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id`                INT(12) UNSIGNED        NOT NULL AUTO_INCREMENT
  COMMENT 'id',
  `username`          VARCHAR(20)
                      COLLATE utf8_unicode_ci NOT NULL
  COMMENT '用户登录名',
  `password`          VARCHAR(60)
                      COLLATE utf8_unicode_ci NOT NULL
  COMMENT '用户密码',
  `nickname`          VARCHAR(20)
                      COLLATE utf8_unicode_ci NOT NULL
  COMMENT '用户屏显昵称，可以不同用户登录名',
  `email`             VARCHAR(120)
                      COLLATE utf8_unicode_ci          DEFAULT NULL
  COMMENT '用户邮箱',
  `realname`          VARCHAR(20)
                      COLLATE utf8_unicode_ci          DEFAULT NULL
  COMMENT '用户真实姓名',
  `pid`               VARCHAR(20)
                      COLLATE utf8_unicode_ci          DEFAULT NULL
  COMMENT '用户身份证号',
  `pid_card_thumb1`   VARCHAR(200)
                      COLLATE utf8_unicode_ci          DEFAULT NULL
  COMMENT '身份证证件正面（印有国徽图案、签发机关和有效期限）照片',
  `pid_card_thumb2`   VARCHAR(200)
                      COLLATE utf8_unicode_ci          DEFAULT NULL
  COMMENT '身份证证件反面（印有个人基本信息和照片）照片',
  `avatar`            VARCHAR(80)
                      COLLATE utf8_unicode_ci          DEFAULT NULL
  COMMENT '用户个人图像',
  `phone`             VARCHAR(20)
                      COLLATE utf8_unicode_ci          DEFAULT NULL
  COMMENT '固定/移动电话',
  `address`           VARCHAR(150)
                      COLLATE utf8_unicode_ci          DEFAULT NULL
  COMMENT '联系地址',
  `emergency_contact` VARCHAR(300)
                      COLLATE utf8_unicode_ci          DEFAULT NULL
  COMMENT '紧急联系人信息',
  `servicer_id`       INT(12)                          DEFAULT '0'
  COMMENT '专属客服id，（为0表示其为无专属客服的管理用户）',
  `deleted_at`        DATETIME                         DEFAULT NULL
  COMMENT '被软删除时间',
  `created_at`        DATETIME                NOT NULL DEFAULT '2016-01-01 00:00:00'
  COMMENT '创建时间',
  `updated_at`        DATETIME                NOT NULL DEFAULT '2016-01-01 00:00:00'
  COMMENT '修改更新时间',
  `is_lock`           TINYINT(3)              NOT NULL DEFAULT '0'
  COMMENT '是否锁定限制用户登录，1锁定,0正常',
  `user_type`         ENUM('visitor', 'customer', 'manager')
                      COLLATE utf8_unicode_ci NOT NULL DEFAULT 'visitor'
  COMMENT '用户类型：visitor 游客, customer 投资客户, manager 管理型用户',
  `confirmation_code` VARCHAR(255)
                      COLLATE utf8_unicode_ci NOT NULL
  COMMENT '确认码',
  `confirmed`         TINYINT(1)                       DEFAULT '0'
  COMMENT '是否已通过验证 0：未通过 1：通过',
  `remember_token`    VARCHAR(60)
                      COLLATE utf8_unicode_ci          DEFAULT NULL
  COMMENT 'Laravel 追加的记住令牌',
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_username_unique` (`username`),
  UNIQUE KEY `user_email_unique` (`email`),
  UNIQUE KEY `user_pid_unique` (`pid`),
  KEY `user_nickname_index` (`nickname`),
  KEY `user_realname_index` (`realname`),
  KEY `user_phone_index` (`phone`)
)
  ENGINE = MyISAM
  AUTO_INCREMENT = 2
  DEFAULT CHARSET = utf8
  COLLATE = utf8_unicode_ci
  COMMENT = '用户表';