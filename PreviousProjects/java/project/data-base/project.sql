/*
Navicat MySQL Data Transfer

Source Server         : jin
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : project

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2017-06-21 16:51:09
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `Username` varchar(3) NOT NULL,
  `password` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`Username`),
  UNIQUE KEY `Password` (`password`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('111', '110');

-- ----------------------------
-- Table structure for chengji
-- ----------------------------
DROP TABLE IF EXISTS `chengji`;
CREATE TABLE `chengji` (
  `number` varchar(12) NOT NULL,
  `Course_number` varchar(3) NOT NULL,
  `chengji` varchar(3) DEFAULT NULL,
  `Course_fen` varchar(7) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of chengji
-- ----------------------------
INSERT INTO `chengji` VALUES ('1401140097', '100', '100', '5个学分');
INSERT INTO `chengji` VALUES ('1401140097', '101', '100', '4个学分');
INSERT INTO `chengji` VALUES ('1401140097', '102', '100', '4个学分');
INSERT INTO `chengji` VALUES ('1402140097', '100', '100', '5个学分');
INSERT INTO `chengji` VALUES ('1402140096', '100', '100', '5个学分');
INSERT INTO `chengji` VALUES ('1402140097', '101', '100', '4个学分');
INSERT INTO `chengji` VALUES ('1402140096', '101', '100', '4个学分');
INSERT INTO `chengji` VALUES ('1402140097', '102', '100', '4个学分');
INSERT INTO `chengji` VALUES ('1402140096', '102', '100', '4个学分');
INSERT INTO `chengji` VALUES ('1403140097', '100', '100', '5个学分');
INSERT INTO `chengji` VALUES ('1403140096', '100', '100', '5个学分');
INSERT INTO `chengji` VALUES ('1403140097', '101', '100', '4个学分');
INSERT INTO `chengji` VALUES ('1403140096', '101', '100', '4个学分');
INSERT INTO `chengji` VALUES ('1403140097', '102', '100', '4个学分');
INSERT INTO `chengji` VALUES ('1403140096', '102', '100', '4个学分');
INSERT INTO `chengji` VALUES ('1404140097', '114', '99', '2个学分');
INSERT INTO `chengji` VALUES ('1407140097', '112', '100', '2个学分');

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `Course_number` varchar(3) NOT NULL,
  `Course_name` varchar(16) NOT NULL,
  `Course_time` varchar(8) DEFAULT NULL,
  `Course_hour` varchar(3) DEFAULT NULL,
  `Course_fen` varchar(7) DEFAULT NULL,
  PRIMARY KEY (`Course_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('100', '数据库', '第一学期', '64', '5个学分');
INSERT INTO `course` VALUES ('101', '计算机算法', '第一学期', '60', '4个学分');
INSERT INTO `course` VALUES ('102', '计算机组成原理', '第一学期', '60', '4个学分');
INSERT INTO `course` VALUES ('103', 'c++', '第一学期', '60', '3个学分');
INSERT INTO `course` VALUES ('104', 'java', '第一学期', '64', '4个学分');
INSERT INTO `course` VALUES ('105', '数字逻辑', '第一学期', '60', '4个学分');
INSERT INTO `course` VALUES ('106', '离散数学', '第一学期', '60', '3个学分');
INSERT INTO `course` VALUES ('107', '大学英语1', '第一学期', '60', '2个学分');
INSERT INTO `course` VALUES ('108', '大学英语2', '第一学期', '60', '2个学分');
INSERT INTO `course` VALUES ('109', '大学英语3', '第二学期', '60', '2个学分');
INSERT INTO `course` VALUES ('110', '大学英语4', '第二学期', '60', '2个学分');
INSERT INTO `course` VALUES ('111', '英语口语1', '第一学期', '60', '2个学分');
INSERT INTO `course` VALUES ('112', '英语口语2', '第一学期', '60', '2个学分');
INSERT INTO `course` VALUES ('113', ' 	英语口语3', '第二学期', '60', '2个学分');
INSERT INTO `course` VALUES ('114', '英语口语4', '第二学期', '60', '2个学分');
INSERT INTO `course` VALUES ('115', '高数', '第二学期', '64', '5个学分');
INSERT INTO `course` VALUES ('120', 'c语言', '第一学期', '60', '3个学分');
INSERT INTO `course` VALUES ('121', '绘画', '第三学期', '64', '1个学分');

-- ----------------------------
-- Table structure for deng
-- ----------------------------
DROP TABLE IF EXISTS `deng`;
CREATE TABLE `deng` (
  `number` varchar(10) NOT NULL,
  `password` varchar(8) NOT NULL,
  PRIMARY KEY (`number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of deng
-- ----------------------------

-- ----------------------------
-- Table structure for guan
-- ----------------------------
DROP TABLE IF EXISTS `guan`;
CREATE TABLE `guan` (
  `username` varchar(10) DEFAULT NULL,
  `number` varchar(10) NOT NULL,
  `Password` varchar(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of guan
-- ----------------------------
INSERT INTO `guan` VALUES ('金玉平', '1401140097', '1934jY26');
INSERT INTO `guan` VALUES ('金玉鹏', '1403140097', '1934jy26');
INSERT INTO `guan` VALUES ('金玉成', '1404140097', '1934jy26');
INSERT INTO `guan` VALUES ('金玉畅', '1406140097', '1934jy26');
INSERT INTO `guan` VALUES ('金子成', '1402140096', '1934jy26');
INSERT INTO `guan` VALUES ('金振宇', '1403140096', '1934jy26');
INSERT INTO `guan` VALUES ('金玉宝', '1405140097', '1934jy26');
INSERT INTO `guan` VALUES ('金玉涛', '1402140097', '1934jy26');
INSERT INTO `guan` VALUES ('金玉露', '1407140097', '1934jy26');
INSERT INTO `guan` VALUES ('金元宝', '2402140089', '1934jy26');

-- ----------------------------
-- Table structure for items
-- ----------------------------
DROP TABLE IF EXISTS `items`;
CREATE TABLE `items` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `number` int(11) DEFAULT NULL,
  `picture` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of items
-- ----------------------------
INSERT INTO `items` VALUES ('1', '沃特篮球鞋', '佛山', '180', '500', '001.jpg');
INSERT INTO `items` VALUES ('2', '安踏运动鞋', '福州', '120', '800', '002.jpg');
INSERT INTO `items` VALUES ('3', '耐克运动鞋', '广州', '500', '1000', '003.jpg');
INSERT INTO `items` VALUES ('4', '阿迪达斯T血衫', '上海', '388', '600', '004.jpg');
INSERT INTO `items` VALUES ('5', '李宁文化衫', '广州', '180', '900', '005.jpg');
INSERT INTO `items` VALUES ('6', '小米3', '北京', '1999', '3000', '006.jpg');
INSERT INTO `items` VALUES ('7', '小米2S', '北京', '1299', '1000', '007.jpg');
INSERT INTO `items` VALUES ('8', 'thinkpad笔记本', '北京', '6999', '500', '008.jpg');
INSERT INTO `items` VALUES ('9', 'dell笔记本', '北京', '3999', '500', '009.jpg');
INSERT INTO `items` VALUES ('10', 'ipad5', '北京', '5999', '500', '010.jpg');

-- ----------------------------
-- Table structure for num
-- ----------------------------
DROP TABLE IF EXISTS `num`;
CREATE TABLE `num` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(28) NOT NULL,
  `password` varchar(8) NOT NULL,
  `number` varchar(10) NOT NULL,
  `password1` varchar(8) NOT NULL,
  `system` varchar(30) NOT NULL,
  `course` varchar(28) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of num
-- ----------------------------
INSERT INTO `num` VALUES ('1', '1', '1', '1', '1', '计算机科学', '数据结构');
INSERT INTO `num` VALUES ('2', '2', '2', '2', '2', '软件工程', '计算机导论');
INSERT INTO `num` VALUES ('3', '2', '2', '2', '2', '计算机科学', '数据结构');
INSERT INTO `num` VALUES ('4', '33', '3', '3', '3', '计算机科学', 'c语言');
INSERT INTO `num` VALUES ('5', '1', '1', '1', '1', '软件工程', '数据结构');
INSERT INTO `num` VALUES ('6', '12', '11', '11', '11', '计算机科学', '计算机导论');
INSERT INTO `num` VALUES ('7', '1', '1', '1', '1', '计算机科学', '计算机导论');
INSERT INTO `num` VALUES ('8', '2222', '2', '2', '2', '数字媒体', '计算机导论');
INSERT INTO `num` VALUES ('9', '33', '33', '33', '33', '计算机科学', '数据结构');
INSERT INTO `num` VALUES ('10', '1', '1', '1', '1', '计算机科学', '计算机导论');
INSERT INTO `num` VALUES ('11', '1', '1', '1', '1', '计算机科学', '数据结构');
INSERT INTO `num` VALUES ('12', 'cheng', 'admin', 'admin', 'wwww', '软件工程', '计算机导论');

-- ----------------------------
-- Table structure for num1
-- ----------------------------
DROP TABLE IF EXISTS `num1`;
CREATE TABLE `num1` (
  `Username` varchar(10) NOT NULL,
  `Password` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`Username`),
  UNIQUE KEY `Password` (`Password`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of num1
-- ----------------------------

-- ----------------------------
-- Table structure for stu
-- ----------------------------
DROP TABLE IF EXISTS `stu`;
CREATE TABLE `stu` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(28) NOT NULL,
  `sex` varchar(8) NOT NULL DEFAULT 'man',
  `birthday` varchar(12) NOT NULL,
  `number` varchar(10) NOT NULL,
  `remarks` varchar(2000) NOT NULL,
  `system` varchar(30) NOT NULL,
  `sum` varchar(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=76 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of stu
-- ----------------------------
INSERT INTO `stu` VALUES ('65', '金玉平', '男', '1994-02-06', '1401140097', '团员......', '软件工程', '0');
INSERT INTO `stu` VALUES ('66', '金玉鹏', '男', '1994-02-06', '1403140097', '团员......', '软件工程', '0');
INSERT INTO `stu` VALUES ('67', '金玉成', '男', '1994-02-06', '1404140097', '团员......', '软件工程', '0');
INSERT INTO `stu` VALUES ('68', '金玉宝', '男', '1994-02-06', '1405140097', '团员......', '软件工程', '0');
INSERT INTO `stu` VALUES ('69', '金玉畅', '男', '1994-02-06', '1406140097', '团员......', '软件工程', '0');
INSERT INTO `stu` VALUES ('70', '金玉露', '女', '1994-02-06', '1407140097', '团员......', '软件工程', '0');
INSERT INTO `stu` VALUES ('72', '金涛', '男', '1994-02-06', '1402140097', '团员......', '软件工程', '0');
INSERT INTO `stu` VALUES ('73', '金子成', '男', '1994-02-06', '1402140096', '团员......', '软件工程', '0');
INSERT INTO `stu` VALUES ('74', '金振宇', '男', '1994-03-06', '1403140096', '群众', '软件工程', '0');
INSERT INTO `stu` VALUES ('75', '金元宝', '男', '1994-02-06', '2402140089', '我爱你', '软件工程', '0');

-- ----------------------------
-- Table structure for tea
-- ----------------------------
DROP TABLE IF EXISTS `tea`;
CREATE TABLE `tea` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(28) NOT NULL,
  `sex` varchar(8) NOT NULL DEFAULT 'man',
  `birthday` varchar(12) NOT NULL,
  `number` varchar(10) NOT NULL,
  `remarks` varchar(2000) NOT NULL,
  `system` varchar(30) NOT NULL,
  `password` varchar(8) DEFAULT NULL,
  `xueli` varchar(6) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tea
-- ----------------------------
INSERT INTO `tea` VALUES ('16', '金必文', '男', '1972-01-06', '2401140094', '群众', '软件工程', '1934jy26', '博士');
INSERT INTO `tea` VALUES ('17', '金必章', '男', '1976-01-06', '2401140093', '预备党员', '软件工程', '1934jy26', '博士后');
INSERT INTO `tea` VALUES ('18', '金必秀', '男', '1970-02-06', '2402140095', '群众', '软件工程', '1934jy26', '硕士');
INSERT INTO `tea` VALUES ('19', '金必顺', '男', '1963-02-06', '2402140096', '党员......', '软件工程', '1934jy26', '硕士');
INSERT INTO `tea` VALUES ('20', '高贝', '女', '1996-02-06', '2402140091', '党员', '软件工程', '12345678', '博士后');
DROP TRIGGER IF EXISTS `afterinsert_on_stu`;
DELIMITER ;;
CREATE TRIGGER `afterinsert_on_stu` AFTER INSERT ON `stu` FOR EACH ROW BEGIN
insert  into guan(username,number) values(new.username,new.number); 
END
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `afterdelete_on_stu`;
DELIMITER ;;
CREATE TRIGGER `afterdelete_on_stu` AFTER DELETE ON `stu` FOR EACH ROW BEGIN
delete from  guan  where number=old.number; 
END
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `afterdelete_on_stu1`;
DELIMITER ;;
CREATE TRIGGER `afterdelete_on_stu1` AFTER DELETE ON `stu` FOR EACH ROW BEGIN
delete from chengji  where number=old.number; 
END
;;
DELIMITER ;
