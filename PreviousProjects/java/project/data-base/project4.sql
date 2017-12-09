/*
Navicat MySQL Data Transfer

Source Server         : jin
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : project4

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2017-06-21 16:50:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for cla_tbl
-- ----------------------------
DROP TABLE IF EXISTS `cla_tbl`;
CREATE TABLE `cla_tbl` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `class_number` int(11) NOT NULL,
  `class_name` varchar(16) DEFAULT '阳光',
  PRIMARY KEY (`id`),
  UNIQUE KEY `class_number` (`class_number`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cla_tbl
-- ----------------------------
INSERT INTO `cla_tbl` VALUES ('1', '1', '闪电');
INSERT INTO `cla_tbl` VALUES ('2', '2', '狂风');
INSERT INTO `cla_tbl` VALUES ('3', '3', '');

-- ----------------------------
-- Table structure for coo_tbl
-- ----------------------------
DROP TABLE IF EXISTS `coo_tbl`;
CREATE TABLE `coo_tbl` (
  `m_id` int(11) NOT NULL,
  `g_id` int(11) NOT NULL,
  PRIMARY KEY (`m_id`,`g_id`),
  KEY `g_id` (`g_id`),
  CONSTRAINT `coo_tbl_ibfk_1` FOREIGN KEY (`m_id`) REFERENCES `mat_tbl` (`id`),
  CONSTRAINT `coo_tbl_ibfk_2` FOREIGN KEY (`g_id`) REFERENCES `gre_tbl` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of coo_tbl
-- ----------------------------
INSERT INTO `coo_tbl` VALUES ('1', '1');
INSERT INTO `coo_tbl` VALUES ('2', '1');
INSERT INTO `coo_tbl` VALUES ('3', '1');
INSERT INTO `coo_tbl` VALUES ('2', '2');
INSERT INTO `coo_tbl` VALUES ('3', '2');
INSERT INTO `coo_tbl` VALUES ('4', '2');
INSERT INTO `coo_tbl` VALUES ('2', '3');
INSERT INTO `coo_tbl` VALUES ('3', '3');
INSERT INTO `coo_tbl` VALUES ('5', '3');

-- ----------------------------
-- Table structure for emp_tbl
-- ----------------------------
DROP TABLE IF EXISTS `emp_tbl`;
CREATE TABLE `emp_tbl` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(16) DEFAULT '金玉宝',
  `sex` varchar(2) DEFAULT '男',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of emp_tbl
-- ----------------------------
INSERT INTO `emp_tbl` VALUES ('2', 'chengjiang', '女');
INSERT INTO `emp_tbl` VALUES ('3', 'yu', '男');
INSERT INTO `emp_tbl` VALUES ('4', 'bao', '男');
INSERT INTO `emp_tbl` VALUES ('5', 'zhang', '女');
INSERT INTO `emp_tbl` VALUES ('6', 'ling', '女');
INSERT INTO `emp_tbl` VALUES ('7', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('8', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('9', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('10', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('11', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('12', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('13', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('14', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('15', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('16', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('17', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('18', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('19', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('20', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('21', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('22', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('23', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('24', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('25', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('26', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('27', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('28', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('29', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('30', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('31', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('32', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('33', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('34', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('35', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('36', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('37', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('38', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('39', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('40', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('41', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('42', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('43', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('44', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('45', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('46', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('47', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('48', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('49', 'cheng', '女');
INSERT INTO `emp_tbl` VALUES ('50', 'cheng', '女');

-- ----------------------------
-- Table structure for gre_tbl
-- ----------------------------
DROP TABLE IF EXISTS `gre_tbl`;
CREATE TABLE `gre_tbl` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(16) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of gre_tbl
-- ----------------------------
INSERT INTO `gre_tbl` VALUES ('1', '炒白菜');
INSERT INTO `gre_tbl` VALUES ('2', '炸鱼');
INSERT INTO `gre_tbl` VALUES ('3', '炒肉');

-- ----------------------------
-- Table structure for mat_tbl
-- ----------------------------
DROP TABLE IF EXISTS `mat_tbl`;
CREATE TABLE `mat_tbl` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(16) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of mat_tbl
-- ----------------------------
INSERT INTO `mat_tbl` VALUES ('1', '白菜');
INSERT INTO `mat_tbl` VALUES ('2', '生姜');
INSERT INTO `mat_tbl` VALUES ('3', '大蒜');
INSERT INTO `mat_tbl` VALUES ('4', '鱼');
INSERT INTO `mat_tbl` VALUES ('5', '辣椒');

-- ----------------------------
-- Table structure for pla_tbl
-- ----------------------------
DROP TABLE IF EXISTS `pla_tbl`;
CREATE TABLE `pla_tbl` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `color` varchar(16) DEFAULT 'red',
  `g_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `g_id` (`g_id`),
  CONSTRAINT `pla_tbl_ibfk_1` FOREIGN KEY (`g_id`) REFERENCES `gre_tbl` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pla_tbl
-- ----------------------------
INSERT INTO `pla_tbl` VALUES ('1', 'white', '1');
INSERT INTO `pla_tbl` VALUES ('2', 'red', '1');
INSERT INTO `pla_tbl` VALUES ('3', 'blue', '1');
INSERT INTO `pla_tbl` VALUES ('4', 'white', '2');
INSERT INTO `pla_tbl` VALUES ('5', 'red', '3');

-- ----------------------------
-- Table structure for stu_tbl
-- ----------------------------
DROP TABLE IF EXISTS `stu_tbl`;
CREATE TABLE `stu_tbl` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(16) DEFAULT '张三',
  `cid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cid` (`cid`),
  CONSTRAINT `stu_tbl_ibfk_1` FOREIGN KEY (`cid`) REFERENCES `cla_tbl` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of stu_tbl
-- ----------------------------
INSERT INTO `stu_tbl` VALUES ('1', 'jin', '1');
INSERT INTO `stu_tbl` VALUES ('2', 'yu', '1');
INSERT INTO `stu_tbl` VALUES ('3', 'bao', '1');
INSERT INTO `stu_tbl` VALUES ('4', 'zhang', '2');
INSERT INTO `stu_tbl` VALUES ('5', 'kuan', '2');
INSERT INTO `stu_tbl` VALUES ('6', 'cheng', '3');
INSERT INTO `stu_tbl` VALUES ('7', 'fang', '3');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'j');
INSERT INTO `t_user` VALUES ('2', 'f');
INSERT INTO `t_user` VALUES ('3', 'jj');

-- ----------------------------
-- Table structure for t_user1
-- ----------------------------
DROP TABLE IF EXISTS `t_user1`;
CREATE TABLE `t_user1` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user1
-- ----------------------------
INSERT INTO `t_user1` VALUES ('1', 'j');
INSERT INTO `t_user1` VALUES ('2', 'jinyubao');
INSERT INTO `t_user1` VALUES ('3', 'l');
INSERT INTO `t_user1` VALUES ('4', 'jim');
INSERT INTO `t_user1` VALUES ('5', 'jin');
INSERT INTO `t_user1` VALUES ('6', 'jing');
