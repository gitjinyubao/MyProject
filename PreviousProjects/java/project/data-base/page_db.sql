/*
Navicat MySQL Data Transfer

Source Server         : jin
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : page_db

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2017-06-21 16:52:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(16) DEFAULT NULL,
  `sex` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '1', '男');
INSERT INTO `student` VALUES ('2', '2', '女');
INSERT INTO `student` VALUES ('3', '3', '男');
INSERT INTO `student` VALUES ('4', '4', '女');
INSERT INTO `student` VALUES ('5', '5', '男');
INSERT INTO `student` VALUES ('6', '6', '女');
INSERT INTO `student` VALUES ('7', '7', '男');
INSERT INTO `student` VALUES ('8', '8', '女');
INSERT INTO `student` VALUES ('9', '9', '男');
INSERT INTO `student` VALUES ('10', '10', '女');
