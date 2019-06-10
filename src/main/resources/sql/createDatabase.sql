DROP TABLE IF EXISTS `tb_cms_user`;
CREATE TABLE `tb_cms_user` (
  `id` bigint(20) unsigned NOT NULL,
  `create_time` bigint(20) DEFAULT NULL,
  `create_user` bigint(20) DEFAULT NULL,
  `modify_description` varchar(500) DEFAULT NULL,
  `modify_time` bigint(20) DEFAULT NULL,
  `modify_user` bigint(20) DEFAULT NULL,
  `status` int(11) NOT NULL DEFAULT '1',
  `version` int(11) DEFAULT NULL,
  `description` varchar(250) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `last_login_time` bigint(20) DEFAULT NULL,
  `mobile` varchar(20) DEFAULT NULL,
  `nick_name` varchar(50) DEFAULT NULL,
  `password` varchar(100) NOT NULL,
  `registration_time` bigint(20) DEFAULT NULL,
  `role_name` varchar(50) DEFAULT NULL,
  `session_key` varchar(50) DEFAULT NULL,
  `user_id` varchar(20) DEFAULT NULL,
  `user_name` varchar(50) NOT NULL,
  `website` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `t_c_user_status` (`status`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


DROP TABLE IF EXISTS `tb_cms_user_role`;
CREATE TABLE `tb_cms_user_role` (
  `id` bigint(20) unsigned NOT NULL,
  `create_time` bigint(20) DEFAULT NULL,
  `create_user` bigint(20) DEFAULT NULL,
  `modify_description` varchar(500) DEFAULT NULL,
  `modify_time` bigint(20) DEFAULT NULL,
  `modify_user` bigint(20) DEFAULT NULL,
  `status` int(11) NOT NULL DEFAULT '1',
  `version` int(11) DEFAULT NULL,
  `role_id` bigint(20) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `t_c_user_role_status` (`status`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS `tb_cms_role_resource`;
CREATE TABLE `tb_cms_role_resource` (
  `id` bigint(20) unsigned NOT NULL,
  `create_time` bigint(20) DEFAULT NULL,
  `create_user` bigint(20) DEFAULT NULL,
  `modify_description` varchar(500) DEFAULT NULL,
  `modify_time` bigint(20) DEFAULT NULL,
  `modify_user` bigint(20) DEFAULT NULL,
  `status` int(11) NOT NULL DEFAULT '1',
  `version` int(11) DEFAULT NULL,
  `resource_id` bigint(20) DEFAULT NULL,
  `role_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `t_c_role_resource_status` (`status`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS `tb_cms_role`;
CREATE TABLE `tb_cms_role` (
  `id` bigint(20) unsigned NOT NULL,
  `create_time` bigint(20) DEFAULT NULL,
  `create_user` bigint(20) DEFAULT NULL,
  `modify_description` varchar(500) DEFAULT NULL,
  `modify_time` bigint(20) DEFAULT NULL,
  `modify_user` bigint(20) DEFAULT NULL,
  `status` int(11) NOT NULL DEFAULT '1',
  `version` int(11) DEFAULT NULL,
  `resources_ids` varchar(250) DEFAULT NULL,
  `role_desc` varchar(250) DEFAULT NULL,
  `role_name` varchar(50) NOT NULL,
  `resource_ids` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `t_c_role_status` (`status`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


DROP TABLE IF EXISTS `tb_cms_resource`;
CREATE TABLE `tb_cms_resource` (
  `id` bigint(20) unsigned NOT NULL,
  `create_time` bigint(20) DEFAULT NULL,
  `create_user` bigint(20) DEFAULT NULL,
  `modify_description` varchar(500) DEFAULT NULL,
  `modify_time` bigint(20) DEFAULT NULL,
  `modify_user` bigint(20) DEFAULT NULL,
  `status` int(11) NOT NULL DEFAULT '1',
  `version` int(11) DEFAULT NULL,
  `order_num` int(11) DEFAULT NULL,
  `parent_id` bigint(20) DEFAULT NULL,
  `resource_name` varchar(50) NOT NULL,
  `resource_url` varchar(100) NOT NULL,
  `show_type` int(11) DEFAULT NULL,
  `parent_resource_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `t_c_resource_status` (`status`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
