
SET FOREIGN_KEY_CHECKS=0;
DROP DATABASE IF EXISTS `demo`;

CREATE DATABASE  `demo` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

USE `demo`;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `no` varchar(10) NOT NULL COMMENT '学生编号',
  `name` varchar(20) NOT NULL COMMENT '姓名',
  `age` int(11) NOT NULL COMMENT '年龄',
  `sex` int(1) NULL DEFAULT 0 COMMENT '性别',
  `address` varchar(50) NULL DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB COMMENT = '学生表';

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, '1002', '李四', 20, 0, '湖南省衡阳市');
INSERT INTO `student` VALUES (3, '1004', '张三', 18, 1, '湖南省郴州市');

SET FOREIGN_KEY_CHECKS = 1;
