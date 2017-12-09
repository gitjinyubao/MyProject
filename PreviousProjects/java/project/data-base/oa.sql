/*
Navicat MySQL Data Transfer

Source Server         : jin
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : oa

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2017-06-21 16:52:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tbl_department
-- ----------------------------
DROP TABLE IF EXISTS `tbl_department`;
CREATE TABLE `tbl_department` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_department
-- ----------------------------
INSERT INTO `tbl_department` VALUES ('1', '开发部');
INSERT INTO `tbl_department` VALUES ('2', '市场部');
INSERT INTO `tbl_department` VALUES ('3', '财务部');
INSERT INTO `tbl_department` VALUES ('4', '总经理办公室');

-- ----------------------------
-- Table structure for tbl_detail
-- ----------------------------
DROP TABLE IF EXISTS `tbl_detail`;
CREATE TABLE `tbl_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `main_id` int(11) DEFAULT NULL,
  `item` varchar(30) DEFAULT NULL,
  `account` int(11) DEFAULT NULL,
  `comm` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_tbl_detail` (`main_id`),
  CONSTRAINT `FK_tbl_detail` FOREIGN KEY (`main_id`) REFERENCES `tbl_voucher` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_detail
-- ----------------------------
INSERT INTO `tbl_detail` VALUES ('1', '1', '往返机票', '3000', '机票');
INSERT INTO `tbl_detail` VALUES ('2', '1', '住宿', '2000', '住宿费');
INSERT INTO `tbl_detail` VALUES ('3', '1', '出行', '1000', '市内交通');
INSERT INTO `tbl_detail` VALUES ('4', '2', '高铁票', '2000', '高铁');
INSERT INTO `tbl_detail` VALUES ('5', '2', '投标', '1000', '工作费用');
INSERT INTO `tbl_detail` VALUES ('6', '2', '住宿', '1000', '住宿费');

-- ----------------------------
-- Table structure for tbl_emp
-- ----------------------------
DROP TABLE IF EXISTS `tbl_emp`;
CREATE TABLE `tbl_emp` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `position_id` int(11) DEFAULT NULL,
  `department_id` int(11) DEFAULT NULL,
  `name` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_tbl_emp` (`department_id`),
  KEY `FK_tbl_emp_position` (`position_id`),
  CONSTRAINT `FK_tbl_emp` FOREIGN KEY (`department_id`) REFERENCES `tbl_department` (`id`),
  CONSTRAINT `FK_tbl_emp_position` FOREIGN KEY (`position_id`) REFERENCES `tbl_position` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_emp
-- ----------------------------
INSERT INTO `tbl_emp` VALUES ('1', '2', '1', 'tom', '123');
INSERT INTO `tbl_emp` VALUES ('2', '1', '1', 'manager', '123');
INSERT INTO `tbl_emp` VALUES ('3', '3', '3', 'boss', '123');
INSERT INTO `tbl_emp` VALUES ('4', '4', '4', 'bigboss', '123');
INSERT INTO `tbl_emp` VALUES ('5', null, null, null, null);

-- ----------------------------
-- Table structure for tbl_position
-- ----------------------------
DROP TABLE IF EXISTS `tbl_position`;
CREATE TABLE `tbl_position` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name_cn` varchar(30) DEFAULT NULL,
  `name_en` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_position
-- ----------------------------
INSERT INTO `tbl_position` VALUES ('1', '经理', '经理');
INSERT INTO `tbl_position` VALUES ('2', '员工', '员工');
INSERT INTO `tbl_position` VALUES ('3', '财务', '财务');
INSERT INTO `tbl_position` VALUES ('4', '总经理', '总经理');

-- ----------------------------
-- Table structure for tbl_result
-- ----------------------------
DROP TABLE IF EXISTS `tbl_result`;
CREATE TABLE `tbl_result` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `main_id` int(11) DEFAULT NULL,
  `check_time` date DEFAULT NULL,
  `check_sn` int(11) DEFAULT NULL,
  `result` varchar(100) DEFAULT NULL,
  `comm` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_tbl_result` (`check_sn`),
  KEY `FK_tbl_result_main` (`main_id`),
  CONSTRAINT `FK_tbl_result` FOREIGN KEY (`check_sn`) REFERENCES `tbl_emp` (`id`),
  CONSTRAINT `FK_tbl_result_main` FOREIGN KEY (`main_id`) REFERENCES `tbl_voucher` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_result
-- ----------------------------

-- ----------------------------
-- Table structure for tbl_voucher
-- ----------------------------
DROP TABLE IF EXISTS `tbl_voucher`;
CREATE TABLE `tbl_voucher` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `next_sn` int(11) DEFAULT NULL,
  `create_sn` int(11) DEFAULT NULL,
  `create_time` date DEFAULT NULL,
  `event` varchar(300) DEFAULT NULL,
  `total` int(11) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_tbl_voucher` (`create_sn`),
  KEY `FK_tbl_voucher_next` (`next_sn`),
  CONSTRAINT `FK_tbl_voucher` FOREIGN KEY (`create_sn`) REFERENCES `tbl_emp` (`id`),
  CONSTRAINT `FK_tbl_voucher_next` FOREIGN KEY (`next_sn`) REFERENCES `tbl_emp` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_voucher
-- ----------------------------
INSERT INTO `tbl_voucher` VALUES ('1', null, '1', '2017-01-01', '北京出差10天', '6000', '已提交');
INSERT INTO `tbl_voucher` VALUES ('2', '2', '1', '2016-12-01', '深圳出差', '4000', '已提交');
