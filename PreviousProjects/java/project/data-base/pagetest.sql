/*
Navicat MySQL Data Transfer

Source Server         : jin
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : pagetest

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2017-06-21 16:53:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for student_tbl
-- ----------------------------
DROP TABLE IF EXISTS `student_tbl`;
CREATE TABLE `student_tbl` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(16) DEFAULT NULL,
  `sex` varchar(12) DEFAULT NULL,
  `addres` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student_tbl
-- ----------------------------
INSERT INTO `student_tbl` VALUES ('1', '1', '男', '北京');
INSERT INTO `student_tbl` VALUES ('2', '2', '男', '南京');
INSERT INTO `student_tbl` VALUES ('3', '3', '男', '武汉');
INSERT INTO `student_tbl` VALUES ('4', '4', '男', '广州');
INSERT INTO `student_tbl` VALUES ('5', '5', '男', '深圳');
INSERT INTO `student_tbl` VALUES ('6', '6', '男', '昆明');
INSERT INTO `student_tbl` VALUES ('7', '7', '男', '天津');
INSERT INTO `student_tbl` VALUES ('8', '8', '男', '北京');
INSERT INTO `student_tbl` VALUES ('9', '9', '男', '上海');
INSERT INTO `student_tbl` VALUES ('10', '10', '男', '深圳');
INSERT INTO `student_tbl` VALUES ('11', '11', '男', '昆明');
INSERT INTO `student_tbl` VALUES ('12', '12', '男', '天津');
INSERT INTO `student_tbl` VALUES ('13', '15', '男', '北京');
INSERT INTO `student_tbl` VALUES ('14', '14', '男', '上海');
INSERT INTO `student_tbl` VALUES ('15', '15', '男', '上海');
INSERT INTO `student_tbl` VALUES ('16', '16', '男', '深圳');
INSERT INTO `student_tbl` VALUES ('17', '17', '男', '昆明');
INSERT INTO `student_tbl` VALUES ('18', '18', '男', '天津');
INSERT INTO `student_tbl` VALUES ('19', '1', '男', '北京');

-- ----------------------------
-- Table structure for t_student
-- ----------------------------
DROP TABLE IF EXISTS `t_student`;
CREATE TABLE `t_student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stu_name` varchar(16) NOT NULL,
  `gender` int(11) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `address` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_student
-- ----------------------------
INSERT INTO `t_student` VALUES ('1', '王小军', '1', '17', '北京市东城区');
INSERT INTO `t_student` VALUES ('2', '李雷雷', '1', '16', '北京市朝阳区');
INSERT INTO `t_student` VALUES ('3', '张静', '2', '16', '北京市昌平区');
INSERT INTO `t_student` VALUES ('4', '王晓萌', '2', '17', '北京市顺义区');
INSERT INTO `t_student` VALUES ('5', '韩梅梅', '2', '16', '北京市朝阳区');
INSERT INTO `t_student` VALUES ('6', '李小军', '1', '17', '北京市海淀区');
INSERT INTO `t_student` VALUES ('7', '成龙', '1', '16', '北京市石景山区');
INSERT INTO `t_student` VALUES ('8', '李海飞', '2', '16', '北京市海淀区');
INSERT INTO `t_student` VALUES ('9', '罗红', '2', '16', '北京市朝阳区');
INSERT INTO `t_student` VALUES ('10', '孙海杰', '1', '16', '北京市石景山区');
INSERT INTO `t_student` VALUES ('11', '王海龙', '1', '16', '北京市东城区');
