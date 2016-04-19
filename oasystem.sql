/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50627
Source Host           : 127.0.0.1:3306
Source Database       : oasystem

Target Server Type    : MYSQL
Target Server Version : 50627
File Encoding         : 65001

Date: 2016-04-19 10:07:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bbscolumninfo
-- ----------------------------
DROP TABLE IF EXISTS `bbscolumninfo`;
CREATE TABLE `bbscolumninfo` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `title` varchar(64) DEFAULT NULL,
  `detail` varchar(128) DEFAULT NULL,
  `pid` int(10) DEFAULT '0',
  `create` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bbscolumninfo
-- ----------------------------

-- ----------------------------
-- Table structure for bbscommentinfo
-- ----------------------------
DROP TABLE IF EXISTS `bbscommentinfo`;
CREATE TABLE `bbscommentinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `forum` int(11) DEFAULT NULL,
  `name` varchar(50) NOT NULL DEFAULT '',
  `content` text NOT NULL,
  `user` int(10) DEFAULT NULL,
  `isDel` tinyint(3) NOT NULL DEFAULT '0',
  `create` int(11) NOT NULL,
  `update` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `user` (`user`),
  KEY `forum` (`forum`),
  CONSTRAINT `forum` FOREIGN KEY (`forum`) REFERENCES `bbsforuminfo` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `user` FOREIGN KEY (`user`) REFERENCES `userinfo` (`userId`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bbscommentinfo
-- ----------------------------

-- ----------------------------
-- Table structure for bbsforuminfo
-- ----------------------------
DROP TABLE IF EXISTS `bbsforuminfo`;
CREATE TABLE `bbsforuminfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user` int(10) DEFAULT NULL,
  `name` varchar(50) NOT NULL DEFAULT '',
  `content` text NOT NULL,
  `views` int(11) NOT NULL,
  `reply` int(11) NOT NULL,
  `order` int(11) NOT NULL,
  `attachment` varchar(200) NOT NULL,
  `create` int(11) NOT NULL,
  `update` int(11) NOT NULL,
  `isDel` tinyint(3) NOT NULL DEFAULT '0',
  `isTop` tinyint(3) DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `forumuser` (`user`),
  CONSTRAINT `forumuser` FOREIGN KEY (`user`) REFERENCES `userinfo` (`userId`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bbsforuminfo
-- ----------------------------

-- ----------------------------
-- Table structure for departmentinfo
-- ----------------------------
DROP TABLE IF EXISTS `departmentinfo`;
CREATE TABLE `departmentinfo` (
  `departmentId` int(10) NOT NULL,
  `name` varchar(40) NOT NULL,
  `totalNum` int(10) DEFAULT '0',
  `introduction` varchar(255) DEFAULT NULL,
  `leader` int(10) DEFAULT NULL,
  `isDel` int(1) DEFAULT '0' COMMENT '是否存在',
  `pid` int(10) DEFAULT '0' COMMENT '上级部门',
  `sort` int(10) DEFAULT NULL,
  KEY `leader` (`leader`),
  CONSTRAINT `leader` FOREIGN KEY (`leader`) REFERENCES `userinfo` (`userId`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of departmentinfo
-- ----------------------------

-- ----------------------------
-- Table structure for docinfo
-- ----------------------------
DROP TABLE IF EXISTS `docinfo`;
CREATE TABLE `docinfo` (
  `id` smallint(4) unsigned NOT NULL AUTO_INCREMENT,
  `doc_no` varchar(20) NOT NULL DEFAULT '' COMMENT '文档编号',
  `name` varchar(50) NOT NULL DEFAULT '' COMMENT '名称',
  `content` text NOT NULL COMMENT '内容',
  `folder` int(11) NOT NULL DEFAULT '0' COMMENT '文件夹',
  `add_file` varchar(200) NOT NULL DEFAULT '' COMMENT '附件',
  `user` int(10) DEFAULT '0' COMMENT '用户ID',
  `create_time` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '创建时间',
  `update_time` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '更新时间',
  `is_del` tinyint(3) NOT NULL DEFAULT '0' COMMENT '删除标记',
  PRIMARY KEY (`id`),
  KEY `docuser` (`user`),
  CONSTRAINT `docuser` FOREIGN KEY (`user`) REFERENCES `userinfo` (`userId`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of docinfo
-- ----------------------------

-- ----------------------------
-- Table structure for fileinfo
-- ----------------------------
DROP TABLE IF EXISTS `fileinfo`;
CREATE TABLE `fileinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `filetype` varchar(32) DEFAULT NULL COMMENT '0 文件，1文件夹',
  `pid` int(10) DEFAULT NULL,
  `name` varchar(50) NOT NULL DEFAULT '' COMMENT '名称',
  `savename` varchar(100) NOT NULL DEFAULT '' COMMENT '保存路径',
  `size` varchar(20) NOT NULL DEFAULT '' COMMENT '文件大小',
  `extension` varchar(20) NOT NULL DEFAULT '' COMMENT '扩展名',
  `module` varchar(20) NOT NULL DEFAULT '0' COMMENT '应用模块',
  `user` int(10) DEFAULT '0' COMMENT '用户ID',
  `create` int(11) NOT NULL DEFAULT '0' COMMENT '创建时间',
  `isDel` tinyint(3) NOT NULL DEFAULT '0' COMMENT '删除标记',
  PRIMARY KEY (`id`),
  KEY `sid` (`filetype`,`module`),
  KEY `fileuser` (`user`),
  CONSTRAINT `fileuser` FOREIGN KEY (`user`) REFERENCES `userinfo` (`userId`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1732 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fileinfo
-- ----------------------------

-- ----------------------------
-- Table structure for mailinfo
-- ----------------------------
DROP TABLE IF EXISTS `mailinfo`;
CREATE TABLE `mailinfo` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL DEFAULT '',
  `content` text NOT NULL,
  `attachment` varchar(200) DEFAULT NULL,
  `from` int(10) DEFAULT NULL,
  `to` int(10) DEFAULT NULL,
  `replyTo` varchar(2000) DEFAULT NULL,
  `read` tinyint(1) NOT NULL DEFAULT '0' COMMENT '0草稿，1发送未读，2已读',
  `create` int(11) unsigned NOT NULL,
  `modify` int(11) unsigned NOT NULL,
  `isDel` tinyint(3) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `from` (`from`),
  KEY `to` (`to`),
  CONSTRAINT `from` FOREIGN KEY (`from`) REFERENCES `userinfo` (`userId`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `to` FOREIGN KEY (`to`) REFERENCES `userinfo` (`userId`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2027 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of mailinfo
-- ----------------------------

-- ----------------------------
-- Table structure for nodeinfo
-- ----------------------------
DROP TABLE IF EXISTS `nodeinfo`;
CREATE TABLE `nodeinfo` (
  `id` smallint(6) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `url` varchar(200) NOT NULL,
  `icon` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `sort` varchar(20) DEFAULT NULL,
  `pid` smallint(6) unsigned NOT NULL,
  `isDel` tinyint(3) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `pid` (`pid`),
  KEY `status` (`isDel`)
) ENGINE=InnoDB AUTO_INCREMENT=217 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of nodeinfo
-- ----------------------------

-- ----------------------------
-- Table structure for noticeinfo
-- ----------------------------
DROP TABLE IF EXISTS `noticeinfo`;
CREATE TABLE `noticeinfo` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `title` varchar(40) DEFAULT NULL,
  `subtitle` varchar(40) DEFAULT NULL,
  `content` text,
  `author` int(10) DEFAULT NULL COMMENT '作者',
  `created` varchar(64) NOT NULL,
  `attachment` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `author` (`author`),
  CONSTRAINT `author` FOREIGN KEY (`author`) REFERENCES `userinfo` (`userId`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of noticeinfo
-- ----------------------------

-- ----------------------------
-- Table structure for systeminfo
-- ----------------------------
DROP TABLE IF EXISTS `systeminfo`;
CREATE TABLE `systeminfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(20) NOT NULL,
  `name` varchar(50) NOT NULL DEFAULT '',
  `val` varchar(255) DEFAULT NULL,
  `isDel` tinyint(3) NOT NULL DEFAULT '0',
  `sort` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of systeminfo
-- ----------------------------

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `userId` int(10) NOT NULL AUTO_INCREMENT,
  `imageUrl` varchar(128) DEFAULT NULL,
  `name` varchar(40) DEFAULT NULL,
  `password` varchar(64) NOT NULL,
  `departmentId` int(10) DEFAULT NULL,
  `sex` varchar(64) DEFAULT NULL,
  `idNum` varchar(64) DEFAULT NULL COMMENT '身份证',
  `phoneNum` int(20) DEFAULT NULL,
  `permissions` varchar(10) NOT NULL COMMENT '权限',
  `lastLoginIp` varchar(40) DEFAULT NULL,
  `email` varchar(40) NOT NULL,
  `integral` int(20) DEFAULT NULL COMMENT '积分',
  `money` double(10,0) DEFAULT '0' COMMENT '工资',
  PRIMARY KEY (`userId`),
  KEY `userId` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
