/*
Navicat MySQL Data Transfer

Source Server         : jin
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : project2

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2017-06-21 16:50:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for chengji2
-- ----------------------------
DROP TABLE IF EXISTS `chengji2`;
CREATE TABLE `chengji2` (
  `sid` varchar(10) DEFAULT NULL,
  `cid` int(10) unsigned DEFAULT NULL,
  `c_fen` int(10) unsigned NOT NULL DEFAULT '0',
  `ch_ji` int(10) unsigned NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of chengji2
-- ----------------------------
INSERT INTO `chengji2` VALUES ('123', '101', '2', '99');
INSERT INTO `chengji2` VALUES ('124', '101', '2', '97');
INSERT INTO `chengji2` VALUES ('125', '101', '2', '95');
INSERT INTO `chengji2` VALUES ('126', '101', '2', '94');

-- ----------------------------
-- Table structure for class
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class` (
  `cid` int(10) unsigned NOT NULL,
  `cname` varchar(40) NOT NULL,
  `cnum` int(10) unsigned DEFAULT '30',
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of class
-- ----------------------------
INSERT INTO `class` VALUES ('101', 'java', '30');
INSERT INTO `class` VALUES ('102', 'C++', '30');
INSERT INTO `class` VALUES ('103', 'C', '30');

-- ----------------------------
-- Table structure for classes
-- ----------------------------
DROP TABLE IF EXISTS `classes`;
CREATE TABLE `classes` (
  `cid` int(10) unsigned NOT NULL,
  `cname` varchar(40) NOT NULL,
  `cnum` int(10) unsigned DEFAULT '30',
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of classes
-- ----------------------------
INSERT INTO `classes` VALUES ('101', 'javaEE', '28');
INSERT INTO `classes` VALUES ('102', 'javaSE', '30');

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `c_id` int(10) unsigned NOT NULL,
  `c_name` varchar(40) NOT NULL DEFAULT '匿名',
  `c_fen` int(10) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `sid` varchar(10) NOT NULL,
  `sname` varchar(18) NOT NULL,
  `cid` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`sid`),
  KEY `fk_cla_stu` (`cid`),
  CONSTRAINT `fk_cla_stu` FOREIGN KEY (`cid`) REFERENCES `class` (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('123', '金玉宝', '101');
INSERT INTO `student` VALUES ('124', '金玉', '101');
INSERT INTO `student` VALUES ('125', '玉红', '102');
INSERT INTO `student` VALUES ('126', '玉强', '102');
INSERT INTO `student` VALUES ('127', '张三', '102');
INSERT INTO `student` VALUES ('128', '李四', '101');

-- ----------------------------
-- Table structure for tbl_user
-- ----------------------------
DROP TABLE IF EXISTS `tbl_user`;
CREATE TABLE `tbl_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(16) DEFAULT NULL,
  `password` varchar(16) DEFAULT NULL,
  `age` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=66 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_user
-- ----------------------------
INSERT INTO `tbl_user` VALUES ('47', '1', '1', '1');
INSERT INTO `tbl_user` VALUES ('48', '2', '2', '2');
INSERT INTO `tbl_user` VALUES ('49', '3', '3', '3');
INSERT INTO `tbl_user` VALUES ('50', '4', '4', '4');
INSERT INTO `tbl_user` VALUES ('51', '5', '5', '5');
INSERT INTO `tbl_user` VALUES ('53', '7', '7', '7');
INSERT INTO `tbl_user` VALUES ('54', '8', '8', '8');
INSERT INTO `tbl_user` VALUES ('55', '9', '9', '9');
INSERT INTO `tbl_user` VALUES ('56', '10', '10', '10');
INSERT INTO `tbl_user` VALUES ('58', '11', '11', '11');
INSERT INTO `tbl_user` VALUES ('60', '55', '55', '55');
INSERT INTO `tbl_user` VALUES ('62', '66', '66', '66');
INSERT INTO `tbl_user` VALUES ('63', '88', '88', '88');
INSERT INTO `tbl_user` VALUES ('64', '33', '33', '33');
INSERT INTO `tbl_user` VALUES ('65', '222', '222', '222');

-- ----------------------------
-- Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `rolenumber` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES ('1', '100');
INSERT INTO `t_role` VALUES ('2', '101');
INSERT INTO `t_role` VALUES ('3', '102');

-- ----------------------------
-- Table structure for t_role1
-- ----------------------------
DROP TABLE IF EXISTS `t_role1`;
CREATE TABLE `t_role1` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `rolenumber` varchar(20) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_role1
-- ----------------------------
INSERT INTO `t_role1` VALUES ('1', '100', 'teacher');
INSERT INTO `t_role1` VALUES ('2', '101', 'student');
INSERT INTO `t_role1` VALUES ('3', '100', 'java');

-- ----------------------------
-- Table structure for t_role2
-- ----------------------------
DROP TABLE IF EXISTS `t_role2`;
CREATE TABLE `t_role2` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `rolenumber` int(11) DEFAULT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_role2
-- ----------------------------

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `account` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------

-- ----------------------------
-- Table structure for t_user1
-- ----------------------------
DROP TABLE IF EXISTS `t_user1`;
CREATE TABLE `t_user1` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `account1` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user1
-- ----------------------------
INSERT INTO `t_user1` VALUES ('1', '金玉宝', '123', '12');
INSERT INTO `t_user1` VALUES ('2', '金玉', '123', '12');
INSERT INTO `t_user1` VALUES ('5', '宇', '12345', '5');
INSERT INTO `t_user1` VALUES ('6', '金宇澄', '1234', '12');
INSERT INTO `t_user1` VALUES ('7', '金宇澄', '1234', '12');
INSERT INTO `t_user1` VALUES ('8', '金宇澄', '1234', '12');
INSERT INTO `t_user1` VALUES ('9', '金宇澄', '1234', '12');

-- ----------------------------
-- Table structure for t_user2
-- ----------------------------
DROP TABLE IF EXISTS `t_user2`;
CREATE TABLE `t_user2` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `rolenumber` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user2
-- ----------------------------
INSERT INTO `t_user2` VALUES ('1', 'jim', null, '100');

-- ----------------------------
-- Table structure for t_user4
-- ----------------------------
DROP TABLE IF EXISTS `t_user4`;
CREATE TABLE `t_user4` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `rolenumber` int(11) DEFAULT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `rolenumber` (`rolenumber`),
  CONSTRAINT `t_user4_ibfk_1` FOREIGN KEY (`rolenumber`) REFERENCES `t_role1` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user4
-- ----------------------------
INSERT INTO `t_user4` VALUES ('2', '1', '1', '2');
INSERT INTO `t_user4` VALUES ('3', '2', '1', '2');

-- ----------------------------
-- Table structure for w_huspand
-- ----------------------------
DROP TABLE IF EXISTS `w_huspand`;
CREATE TABLE `w_huspand` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `h_name` varchar(20) DEFAULT NULL,
  `w_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `w_id` (`w_id`),
  CONSTRAINT `w_huspand_ibfk_1` FOREIGN KEY (`w_id`) REFERENCES `w_wife` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of w_huspand
-- ----------------------------
INSERT INTO `w_huspand` VALUES ('1', 'jin', '1');
INSERT INTO `w_huspand` VALUES ('2', 'yu', '2');

-- ----------------------------
-- Table structure for w_wife
-- ----------------------------
DROP TABLE IF EXISTS `w_wife`;
CREATE TABLE `w_wife` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `w_name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of w_wife
-- ----------------------------
INSERT INTO `w_wife` VALUES ('1', 'gao');
INSERT INTO `w_wife` VALUES ('2', 'bei');
