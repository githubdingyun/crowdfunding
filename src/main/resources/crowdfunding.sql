/*
Navicat MySQL Data Transfer

Source Server         : ssss
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : crowdfunding

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2018-09-19 19:59:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `admin_id` int(10) NOT NULL AUTO_INCREMENT,
  `admin_name` varchar(255) DEFAULT NULL,
  `admin_password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------

-- ----------------------------
-- Table structure for comments
-- ----------------------------
DROP TABLE IF EXISTS `comments`;
CREATE TABLE `comments` (
  `cm_id` int(10) NOT NULL AUTO_INCREMENT,
  `cm_us_id` int(10) DEFAULT NULL,
  `cm_ps_id` int(10) DEFAULT NULL,
  `cm_content` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`cm_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comments
-- ----------------------------

-- ----------------------------
-- Table structure for funding
-- ----------------------------
DROP TABLE IF EXISTS `funding`;
CREATE TABLE `funding` (
  `fd_id` int(10) NOT NULL AUTO_INCREMENT,
  `fd_us_id` int(11) DEFAULT NULL,
  `fd_ps_id` int(11) DEFAULT NULL,
  `fd_money` double DEFAULT NULL,
  `fd_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`fd_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of funding
-- ----------------------------

-- ----------------------------
-- Table structure for letter
-- ----------------------------
DROP TABLE IF EXISTS `letter`;
CREATE TABLE `letter` (
  `le_id` int(10) NOT NULL AUTO_INCREMENT,
  `le_us_addresserid` int(10) DEFAULT NULL,
  `le_us_recipientsid` int(10) DEFAULT NULL,
  `le_content` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`le_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of letter
-- ----------------------------

-- ----------------------------
-- Table structure for logs
-- ----------------------------
DROP TABLE IF EXISTS `logs`;
CREATE TABLE `logs` (
  `log_id` int(10) NOT NULL AUTO_INCREMENT,
  `log_us_id` int(10) DEFAULT NULL,
  `log_content` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`log_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of logs
-- ----------------------------

-- ----------------------------
-- Table structure for projects
-- ----------------------------
DROP TABLE IF EXISTS `projects`;
CREATE TABLE `projects` (
  `ps_id` int(11) NOT NULL AUTO_INCREMENT,
  `ps_us_id` int(11) DEFAULT NULL,
  `ps_cust_name` varchar(255) DEFAULT NULL,
  `ps_cust_phone` varchar(255) DEFAULT NULL,
  `ps_cust_address` varchar(255) DEFAULT NULL,
  `ps_pst_id` int(11) DEFAULT NULL,
  `ps_file` varchar(255) DEFAULT NULL,
  `ps_name` varchar(255) DEFAULT NULL,
  `ps_goal` varchar(255) DEFAULT NULL,
  `ps_address` varchar(255) DEFAULT NULL,
  `ps_money` double DEFAULT NULL,
  `ps_days` int(11) DEFAULT NULL,
  `ps_video` varchar(255) DEFAULT NULL,
  `ps_story` varchar(255) DEFAULT NULL,
  `ps_support` varchar(255) DEFAULT NULL,
  `ps_repay` varchar(255) DEFAULT NULL,
  `ps_aboutme` varchar(255) DEFAULT NULL,
  `ps_type` int(11) DEFAULT NULL,
  `ps_starttime` date DEFAULT NULL,
  `ps_endtime` date DEFAULT NULL,
  `ps_getmoney` double DEFAULT NULL,
  `ps_getpeople` int(11) DEFAULT NULL,
  PRIMARY KEY (`ps_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of projects
-- ----------------------------
INSERT INTO `projects` VALUES ('1', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '', null, null, null, null, '22.222', null);

-- ----------------------------
-- Table structure for projectstype
-- ----------------------------
DROP TABLE IF EXISTS `projectstype`;
CREATE TABLE `projectstype` (
  `pst_id` int(10) NOT NULL AUTO_INCREMENT,
  `pst_name` varchar(255) DEFAULT NULL,
  `pst_desc` varchar(255) DEFAULT NULL,
  `pst_stardate` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `pst_type` int(1) DEFAULT NULL,
  PRIMARY KEY (`pst_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of projectstype
-- ----------------------------

-- ----------------------------
-- Table structure for pro_a
-- ----------------------------
DROP TABLE IF EXISTS `pro_a`;
CREATE TABLE `pro_a` (
  `pro_a_id` int(10) NOT NULL AUTO_INCREMENT,
  `pr_a_us_id` int(10) DEFAULT NULL,
  `pro_a_cust_name` varchar(255) DEFAULT NULL,
  `pro_a_cust_phone` varchar(255) DEFAULT NULL,
  `pro_a_pst_id` int(10) DEFAULT NULL,
  `pro_a_cust_address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`pro_a_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pro_a
-- ----------------------------

-- ----------------------------
-- Table structure for pro_b
-- ----------------------------
DROP TABLE IF EXISTS `pro_b`;
CREATE TABLE `pro_b` (
  `pro_b_id` int(10) NOT NULL AUTO_INCREMENT,
  `pro_b_us_id` int(10) DEFAULT NULL,
  `pro_b_file` varchar(255) DEFAULT NULL,
  `pro_b_name` varchar(255) DEFAULT NULL,
  `pro_b_goal` varchar(255) DEFAULT NULL,
  `pro_b_address` varchar(255) DEFAULT NULL,
  `pro_b_money` varchar(255) DEFAULT NULL,
  `pro_b_datenum` int(10) DEFAULT NULL,
  PRIMARY KEY (`pro_b_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pro_b
-- ----------------------------

-- ----------------------------
-- Table structure for pro_c
-- ----------------------------
DROP TABLE IF EXISTS `pro_c`;
CREATE TABLE `pro_c` (
  `pro_c_id` int(10) NOT NULL AUTO_INCREMENT,
  `pro_c_us_id` int(10) DEFAULT NULL,
  `pro_c_vedio` varchar(255) DEFAULT NULL,
  `pro_c_story` varchar(255) DEFAULT NULL,
  `pro_c_support` varchar(255) DEFAULT NULL,
  `pro_c_repay` varchar(255) DEFAULT NULL,
  `pro_c_aboutme` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`pro_c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pro_c
-- ----------------------------

-- ----------------------------
-- Table structure for questionall
-- ----------------------------
DROP TABLE IF EXISTS `questionall`;
CREATE TABLE `questionall` (
  `questionid` int(10) NOT NULL AUTO_INCREMENT,
  `questionname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`questionid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of questionall
-- ----------------------------

-- ----------------------------
-- Table structure for questionother
-- ----------------------------
DROP TABLE IF EXISTS `questionother`;
CREATE TABLE `questionother` (
  `questionotherid` int(10) NOT NULL AUTO_INCREMENT,
  `questionid` int(10) DEFAULT NULL,
  `questionothername` varchar(255) DEFAULT NULL,
  `questionanswer` varchar(255) DEFAULT NULL,
  `questiondate` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`questionotherid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of questionother
-- ----------------------------

-- ----------------------------
-- Table structure for repay
-- ----------------------------
DROP TABLE IF EXISTS `repay`;
CREATE TABLE `repay` (
  `ry_id` int(10) NOT NULL AUTO_INCREMENT,
  `ry_us_id` int(11) DEFAULT NULL,
  `ry_type` int(1) DEFAULT NULL,
  `ry_paymoney` double DEFAULT NULL,
  `ry_rule` varchar(255) DEFAULT NULL,
  `ry_content` varchar(255) DEFAULT NULL,
  `ry_number` int(10) DEFAULT NULL,
  `ry_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `ry_ps_id` int(11) DEFAULT NULL,
  `ry_code` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ry_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of repay
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `us_id` int(11) DEFAULT NULL,
  `us_email` varchar(255) DEFAULT NULL,
  `us_name` varchar(255) DEFAULT NULL,
  `us_password` varchar(255) DEFAULT NULL,
  `us_money` double DEFAULT NULL,
  `us_idcard` varchar(255) DEFAULT NULL,
  `us_phone` varchar(255) DEFAULT NULL,
  `us_address` varchar(255) DEFAULT NULL,
  `us_role` int(11) DEFAULT NULL,
  `us_sex` varchar(255) DEFAULT NULL,
  `us_code` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
