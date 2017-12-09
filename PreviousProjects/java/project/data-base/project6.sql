/*
Navicat MySQL Data Transfer

Source Server         : jin
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : project6

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2017-06-21 16:50:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `stID` varchar(25) DEFAULT NULL,
  `STNAME` varchar(10) DEFAULT NULL,
  `STSEX` varchar(10) DEFAULT NULL,
  `STAGE` varchar(10) DEFAULT NULL,
  `STTEL` varchar(20) DEFAULT NULL,
  `STDEPT` varchar(20) DEFAULT NULL,
  `stcourse` varchar(20) DEFAULT NULL,
  `STADDRESS` varchar(50) DEFAULT NULL,
  `STPASSWORD` varchar(20) DEFAULT NULL,
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('24', '大明', '男', '23', '15866742101', '医学系', '医学导论', '山东潍坊市', '24', '1');
INSERT INTO `teacher` VALUES ('15', '邵玉先', '男', '19', '13653548652', '化学系', '化学导论', '山东济南市', '15', '2');
INSERT INTO `teacher` VALUES ('17', '李四', '女', '20', '16535476665', '农学系', '农学导论', '山东潍坊市', '17', '3');
INSERT INTO `teacher` VALUES ('18', '小龙', '女', '21', '15695845635', '美术系', '美术导论', '山东临沂市', '18', '4');
INSERT INTO `teacher` VALUES ('19', '王芳', '女', '24', '12355668542', '音乐系', '音乐导论', '山东威海市', '19', '5');
INSERT INTO `teacher` VALUES ('20', '红红', '女', '18', '16546542363', '历史系', '历史导论', '山东青岛市', '20', '6');
INSERT INTO `teacher` VALUES ('21', '李逸', '男', '18', '14365976365', '物理系', '物理导论', '山东菏泽市', '21', '7');

-- ----------------------------
-- Table structure for t_manager
-- ----------------------------
DROP TABLE IF EXISTS `t_manager`;
CREATE TABLE `t_manager` (
  `ID` int(11) NOT NULL,
  `USERNAME` varchar(20) NOT NULL,
  `PASSWORD` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_manager
-- ----------------------------
INSERT INTO `t_manager` VALUES ('1', '123', '123');
INSERT INTO `t_manager` VALUES ('2', '李四1', '123');
