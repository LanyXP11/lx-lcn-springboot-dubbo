/*
Navicat MySQL Data Transfer

Source Server         : Linux(Mysql)
Source Server Version : 50624
Source Host           : 192.168.37.130:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2020-02-16 17:05:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for e_goods
-- ----------------------------
DROP TABLE IF EXISTS `e_goods`;
CREATE TABLE `e_goods` (
  `gid` char(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`gid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of e_goods
-- ----------------------------
