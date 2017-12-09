/*
Navicat MySQL Data Transfer

Source Server         : jin
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : project5

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2017-06-21 16:50:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for account_tbl
-- ----------------------------
DROP TABLE IF EXISTS `account_tbl`;
CREATE TABLE `account_tbl` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(21) NOT NULL,
  `money` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account_tbl
-- ----------------------------
INSERT INTO `account_tbl` VALUES ('1', 'aaa', '1000');
INSERT INTO `account_tbl` VALUES ('2', 'bbb', '1000');
INSERT INTO `account_tbl` VALUES ('3', 'ccc', '1000');

-- ----------------------------
-- Table structure for cla_tbl
-- ----------------------------
DROP TABLE IF EXISTS `cla_tbl`;
CREATE TABLE `cla_tbl` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `classNumber` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cla_tbl
-- ----------------------------
INSERT INTO `cla_tbl` VALUES ('1', '110');
INSERT INTO `cla_tbl` VALUES ('2', '111');

-- ----------------------------
-- Table structure for idcard_tbl
-- ----------------------------
DROP TABLE IF EXISTS `idcard_tbl`;
CREATE TABLE `idcard_tbl` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idNumber` varchar(18) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of idcard_tbl
-- ----------------------------
INSERT INTO `idcard_tbl` VALUES ('1', '420982199402061934');
INSERT INTO `idcard_tbl` VALUES ('2', '420982199402061935');
INSERT INTO `idcard_tbl` VALUES ('3', '420982199402061936');

-- ----------------------------
-- Table structure for ji
-- ----------------------------
DROP TABLE IF EXISTS `ji`;
CREATE TABLE `ji` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `money` int(10) unsigned DEFAULT NULL,
  `explain1` varchar(300) DEFAULT NULL,
  `time` varchar(26) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ji
-- ----------------------------

-- ----------------------------
-- Table structure for person_tbl
-- ----------------------------
DROP TABLE IF EXISTS `person_tbl`;
CREATE TABLE `person_tbl` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(16) DEFAULT '张三',
  `sex` varchar(2) DEFAULT '男',
  `person_idcard` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `person_idcard` (`person_idcard`),
  CONSTRAINT `person_tbl_ibfk_1` FOREIGN KEY (`person_idcard`) REFERENCES `idcard_tbl` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of person_tbl
-- ----------------------------
INSERT INTO `person_tbl` VALUES ('1', 'jin', '', '1');
INSERT INTO `person_tbl` VALUES ('3', 'yu', '', '2');
INSERT INTO `person_tbl` VALUES ('4', 'bao', '', '3');

-- ----------------------------
-- Table structure for stu_tbl
-- ----------------------------
DROP TABLE IF EXISTS `stu_tbl`;
CREATE TABLE `stu_tbl` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT 'jin',
  `stu_number` varchar(12) DEFAULT NULL,
  `cid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cid` (`cid`),
  CONSTRAINT `stu_tbl_ibfk_1` FOREIGN KEY (`cid`) REFERENCES `cla_tbl` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of stu_tbl
-- ----------------------------
INSERT INTO `stu_tbl` VALUES ('2', 'jin', '140214', '1');
INSERT INTO `stu_tbl` VALUES ('3', 'yu', '140215', '1');
INSERT INTO `stu_tbl` VALUES ('4', 'bao', '140216', '2');
INSERT INTO `stu_tbl` VALUES ('5', 'yubao', '140217', '2');

-- ----------------------------
-- Table structure for tbl_user
-- ----------------------------
DROP TABLE IF EXISTS `tbl_user`;
CREATE TABLE `tbl_user` (
  `id` int(11) NOT NULL,
  `username` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_user
-- ----------------------------
INSERT INTO `tbl_user` VALUES ('1', 'jin');
INSERT INTO `tbl_user` VALUES ('2', 'yu');
INSERT INTO `tbl_user` VALUES ('3', 'bao');

-- ----------------------------
-- Table structure for tbl_user1
-- ----------------------------
DROP TABLE IF EXISTS `tbl_user1`;
CREATE TABLE `tbl_user1` (
  `id` int(10) unsigned NOT NULL,
  `username` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_user1
-- ----------------------------
INSERT INTO `tbl_user1` VALUES ('1', 'jinyubaov');
INSERT INTO `tbl_user1` VALUES ('2', 'jinyubaov');
INSERT INTO `tbl_user1` VALUES ('3', 'jinyubaov');
INSERT INTO `tbl_user1` VALUES ('5', 'jinyu');
INSERT INTO `tbl_user1` VALUES ('10', 'jjj');
INSERT INTO `tbl_user1` VALUES ('11', 'jj');
INSERT INTO `tbl_user1` VALUES ('12', 'j');
INSERT INTO `tbl_user1` VALUES ('15', 'jj');
INSERT INTO `tbl_user1` VALUES ('16', 'jj');
INSERT INTO `tbl_user1` VALUES ('17', 'jj');

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `password` varchar(20) DEFAULT NULL,
  `age` int(10) unsigned DEFAULT NULL,
  `insertdate` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES ('1', '123', '100', '2017-02-27');
INSERT INTO `userinfo` VALUES ('2', '123', '100', '2017-02-27');
INSERT INTO `userinfo` VALUES ('3', '123', '100', '2017-03-01');
INSERT INTO `userinfo` VALUES ('4', '123', '100', '2017-03-01');
INSERT INTO `userinfo` VALUES ('5', '123', '100', '2017-03-01');
INSERT INTO `userinfo` VALUES ('6', '123', '100', '2017-03-01');
INSERT INTO `userinfo` VALUES ('7', '123', '100', '2017-03-01');
INSERT INTO `userinfo` VALUES ('8', '123', '100', '2017-03-01');
INSERT INTO `userinfo` VALUES ('9', '123', '100', '2017-03-01');
INSERT INTO `userinfo` VALUES ('10', '123', '100', '2017-03-03');
INSERT INTO `userinfo` VALUES ('11', '123', '100', '2017-03-03');
