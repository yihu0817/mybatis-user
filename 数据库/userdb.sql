/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : userdb

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2018-06-13 17:22:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `department`
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', '技术部');

-- ----------------------------
-- Table structure for `employee`
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `d_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKranol98e1sc4ivux191hogiw5` (`d_id`),
  CONSTRAINT `FKranol98e1sc4ivux191hogiw5` FOREIGN KEY (`d_id`) REFERENCES `department` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('1', '张三', '1');
INSERT INTO `employee` VALUES ('2', '小明', '1');

-- ----------------------------
-- Table structure for `orders`
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `orderId` varchar(36) NOT NULL,
  `orderNumber` varchar(20) DEFAULT NULL,
  `orderPrice` int(11) DEFAULT NULL,
  `pid` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`orderId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES ('O_00001', '00001', '100', '001');
INSERT INTO `orders` VALUES ('O_00002', '00002', '200', '001');

-- ----------------------------
-- Table structure for `person`
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `personId` varchar(36) NOT NULL,
  `personName` varchar(64) DEFAULT NULL,
  `personAddress` varchar(128) DEFAULT NULL,
  `personTel` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`personId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('001', 'Jack', '成都', '1365456788');

-- ----------------------------
-- Table structure for `t_courses`
-- ----------------------------
DROP TABLE IF EXISTS `t_courses`;
CREATE TABLE `t_courses` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `courses_name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_courses
-- ----------------------------
INSERT INTO `t_courses` VALUES ('1', '语文');
INSERT INTO `t_courses` VALUES ('2', '数学');
INSERT INTO `t_courses` VALUES ('3', '计算机');
INSERT INTO `t_courses` VALUES ('4', 'java编程');
INSERT INTO `t_courses` VALUES ('5', 'html');

-- ----------------------------
-- Table structure for `t_student`
-- ----------------------------
DROP TABLE IF EXISTS `t_student`;
CREATE TABLE `t_student` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `student_name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_student
-- ----------------------------
INSERT INTO `t_student` VALUES ('1', '米兰');
INSERT INTO `t_student` VALUES ('2', '凌雪');
INSERT INTO `t_student` VALUES ('3', '成成');
INSERT INTO `t_student` VALUES ('4', '睿懿');
INSERT INTO `t_student` VALUES ('5', '瑞瑞');

-- ----------------------------
-- Table structure for `t_stu_cou`
-- ----------------------------
DROP TABLE IF EXISTS `t_stu_cou`;
CREATE TABLE `t_stu_cou` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fk_stu_id` int(11) DEFAULT NULL,
  `fk_cou_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_stu_cou
-- ----------------------------
INSERT INTO `t_stu_cou` VALUES ('1', '1', '1');
INSERT INTO `t_stu_cou` VALUES ('2', '1', '2');
INSERT INTO `t_stu_cou` VALUES ('3', '2', '3');
INSERT INTO `t_stu_cou` VALUES ('4', '2', '4');
INSERT INTO `t_stu_cou` VALUES ('5', '3', '1');
INSERT INTO `t_stu_cou` VALUES ('6', '3', '5');
INSERT INTO `t_stu_cou` VALUES ('7', '4', '4');
INSERT INTO `t_stu_cou` VALUES ('8', '4', '2');

-- ----------------------------
-- Table structure for `t_transaction`
-- ----------------------------
DROP TABLE IF EXISTS `t_transaction`;
CREATE TABLE `t_transaction` (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `money` float NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_transaction
-- ----------------------------
INSERT INTO `t_transaction` VALUES ('1', '张三', '800');
INSERT INTO `t_transaction` VALUES ('2', '李四', '1000');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `header_uri` varchar(255) DEFAULT NULL,
  `logindate` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('2', '小明', '123', '/', '2018-06-05 16:41:22');
INSERT INTO `user` VALUES ('3', 'admin', '123', '/', '2018-06-11 09:00:37');
