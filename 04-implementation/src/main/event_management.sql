/*
 Navicat Premium Dump SQL

 Source Server         : BookLendingsys
 Source Server Type    : MySQL
 Source Server Version : 80036 (8.0.36)
 Source Host           : localhost:3306
 Source Schema         : event_management

 Target Server Type    : MySQL
 Target Server Version : 80036 (8.0.36)
 File Encoding         : 65001

 Date: 11/12/2024 16:36:41
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `is_active` bit(1) NOT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 19 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (1, 'ainiy3141105@163.com', b'1', '$2a$10$/rhJgou0RdyN1PcpqOJQGuuCCLSt0WfJy04Z4e3NoIPJbjIGKjku2', '25');
INSERT INTO `admin` VALUES (5, '23@163.com', b'1', '$2a$10$TZM1F4UIZIx63003.HGfDu6UVOr5JDmhRoYZ2isiSIjztjggxp8fi', 'ruixin');
INSERT INTO `admin` VALUES (17, 'ainiy314@163.com', b'1', '$2a$10$rxABGulaygNH0/qjVF0xXO0id18v/0JwN7g1AQbt6hOynJAy91F.2', 'ruixin1');
INSERT INTO `admin` VALUES (18, 'ruixin.gu@ucdconnect.ie', b'0', '$2a$10$/fpvhn0LZ/2FVslXTvCj6.QM/hp/mkHkZGsXPSHanSoUxc1rncQyK', 'rongyuze');

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `is_active` bit(1) NOT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 18 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES (3, 'ainiy3141105@163.com', b'0', '$2a$10$orHy7IljaqdckoNCRjRJOunUyxaSyyhcjEJ00uKkatE47DQ4rR35C', '888');
INSERT INTO `customer` VALUES (6, 'ainiy3141105@163.com22', b'0', '$2a$10$zPlzzXShBPYI73OwtPN6quUOX7iFXJRLpgUo9gqpjCkkcRiQqmRb2', '8888');
INSERT INTO `customer` VALUES (7, 'ainiy3141105@163.com', b'0', '$2a$10$hY7vLG2Xb9Xgq3GXyA1wOuU7TD/h02c54BzvxqDuL8j7nJ2/H7Xme', 'zitong');
INSERT INTO `customer` VALUES (10, '23@163.com', b'0', '$2a$10$bZcvL9rC5JvVSVqwAhWtEO/ab/0NqX5RTXTediuB/2Fyg/WoBVuu.', 'chenle');
INSERT INTO `customer` VALUES (16, '23@163.com', b'0', '$2a$10$anJ5O5CWtsp/rKQyUGF01Ou9/0yRx.RxjJ6MWJrTVg.eRjOI7cfNW', 'wanzitong');
INSERT INTO `customer` VALUES (17, 'ruixin.gu@ucdconnect.ie', b'0', '$2a$10$xfbfrInQ8qjMP1YOyNysKejRXA/2/8Uq7M6q/1y3AZSjmFZOBflVm', 'chenle1');

-- ----------------------------
-- Table structure for dinner_tables
-- ----------------------------
DROP TABLE IF EXISTS `dinner_tables`;
CREATE TABLE `dinner_tables`  (
  `id` bigint NOT NULL,
  `number` int NOT NULL,
  `places` int NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of dinner_tables
-- ----------------------------
INSERT INTO `dinner_tables` VALUES (1, 1, 4);
INSERT INTO `dinner_tables` VALUES (2, 2, 4);
INSERT INTO `dinner_tables` VALUES (3, 3, 4);
INSERT INTO `dinner_tables` VALUES (4, 4, 2);
INSERT INTO `dinner_tables` VALUES (5, 5, 2);
INSERT INTO `dinner_tables` VALUES (6, 6, 10);
INSERT INTO `dinner_tables` VALUES (7, 7, 10);
INSERT INTO `dinner_tables` VALUES (8, 8, 10);
INSERT INTO `dinner_tables` VALUES (9, 9, 6);
INSERT INTO `dinner_tables` VALUES (10, 10, 6);
INSERT INTO `dinner_tables` VALUES (11, 11, 6);
INSERT INTO `dinner_tables` VALUES (12, 12, 6);

-- ----------------------------
-- Table structure for dinner_tables_seq
-- ----------------------------
DROP TABLE IF EXISTS `dinner_tables_seq`;
CREATE TABLE `dinner_tables_seq`  (
  `next_val` bigint NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of dinner_tables_seq
-- ----------------------------
INSERT INTO `dinner_tables_seq` VALUES (13);

-- ----------------------------
-- Table structure for events
-- ----------------------------
DROP TABLE IF EXISTS `events`;
CREATE TABLE `events`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `available_number1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `available_number2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `date` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `organiser` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `organizer_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `picture` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `price1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `price2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `remain_num1` int NULL DEFAULT NULL,
  `remain_num2` int NULL DEFAULT NULL,
  `t1_exist` int NULL DEFAULT NULL,
  `t2_exist` int NULL DEFAULT NULL,
  `ticket_type_name1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `ticket_type_name2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `time` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `venue` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `venue_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 28 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of events
-- ----------------------------
INSERT INTO `events` VALUES (20, '50', '200', '2024-12-07', 'Time start.', 'The World', 'ANRAN', '14', 'images/event/3.webp', '67', '61', 47, 200, 1, 1, 'vip', 'NOR', '13:31', 'BJUT', '13');
INSERT INTO `events` VALUES (23, '50', '100', '2024-12-07', 'a concert 1', 'Concert 01', 'yuze', '19', 'images/event/1.webp', '45', '30', 49, 100, 1, 1, 'vip', 'NOR', '20:55', 'New land', '16');
INSERT INTO `events` VALUES (24, '100', '200', '2024-12-07', 'another concert', 'Concert 02', 'yuze', '19', 'images/event/3.webp', '45', '67', 100, 200, 1, 1, 'vip', 'NOR', '11:56', 'UCD', '12');
INSERT INTO `events` VALUES (27, '100', '200', '2024-12-08', 'a concert', 'Concert new1', 'shuhan1', '21', 'images/event/4.webp', '32', '23', 100, 200, 1, 1, 'vip', 'NOR', '18:23', 'US', '10');

-- ----------------------------
-- Table structure for my_entity_seq
-- ----------------------------
DROP TABLE IF EXISTS `my_entity_seq`;
CREATE TABLE `my_entity_seq`  (
  `next_val` bigint NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of my_entity_seq
-- ----------------------------
INSERT INTO `my_entity_seq` VALUES (1);

-- ----------------------------
-- Table structure for organizer
-- ----------------------------
DROP TABLE IF EXISTS `organizer`;
CREATE TABLE `organizer`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `company_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `is_active` bit(1) NOT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `phone_number` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 22 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of organizer
-- ----------------------------
INSERT INTO `organizer` VALUES (7, '13910762161', '13910762161', '23@163.com', b'0', '$2a$10$jeYvAolsjQZYilk5YMp.b.tkQs4KTVMEmgGWFUky5uyr1yLsK3su6', '13910762161', '2333');
INSERT INTO `organizer` VALUES (9, '123', '123', 'ainiy3141105@163.com', b'1', '$2a$10$jxmA6vBfnMzWWZF/KzFk5OPwsutH949YP1PD7AhDkTiLsG9KQAkhq', '123', '6666');
INSERT INTO `organizer` VALUES (10, 'some where', '123232', '23333@163.com', b'1', '$2a$10$ClghQtwvW8kfKx0hmmqbmeLCIqMNWgYj3NgLiK/0xFNISrx55dNpG', '343532532', 'shuhan');
INSERT INTO `organizer` VALUES (12, '13910762161', '13910762161', '23@163.com', b'0', '$2a$10$El8/V/NFFFZdx/FcSVkiLep2zZB1ex9CkW.H0skGYD75IBbnFo6nG', '13910762161', 'Sing2');
INSERT INTO `organizer` VALUES (13, '1321323', '123131', 'Sing23@163.com', b'1', '$2a$10$zABmP0gxUaQ4C2BuZDtmaOfutbDa3JzUbeKCGSe.XqzLnJUYwtIBy', '231312', 'Sing3');
INSERT INTO `organizer` VALUES (14, NULL, NULL, 'ruixin.gu@ucdconnect.ie', b'1', '$2a$10$1UXZ5Ofehvd87AYXihMnu.P/x39fZE3rGVxJNH/h1SanrqogN8vSO', NULL, 'ANRAN');
INSERT INTO `organizer` VALUES (19, NULL, NULL, 'yuze@163.com', b'1', '$2a$10$/zuRxOora6cSyRUMZQEWRevnXQGeE.gbows45UOpGafbOPPTa6iPm', NULL, 'yuze');
INSERT INTO `organizer` VALUES (20, 'SOME UNIVERSITY', '2332', 'ruixin.gu@ucdconnect.ie', b'0', '$2a$10$8/DAugQO1vpxis0ffTNnl.xIE5NicEbn0iJoD50Ekqh3gkCs/wdhW', '23241242', 'lisiying');
INSERT INTO `organizer` VALUES (21, 'some where', '123232', 'shuhan@163.com', b'1', '$2a$10$BY0I0mgpNQ22DeIWB55WqeNLq75tfb9qtUv1YF/.Jy3hYcR49TYty', '123434', 'shuhan1');

-- ----------------------------
-- Table structure for reservation
-- ----------------------------
DROP TABLE IF EXISTS `reservation`;
CREATE TABLE `reservation`  (
  `id` bigint NOT NULL,
  `covers` int NOT NULL,
  `date` date NULL DEFAULT NULL,
  `is_overfill` bit(1) NOT NULL,
  `time` time(6) NULL DEFAULT NULL,
  `table_id` bigint NULL DEFAULT NULL,
  `customer_id` bigint NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `FK7yjkh15oektx6rtxokliu076`(`table_id` ASC) USING BTREE,
  INDEX `FK41v6ueo0hiran65w8y1cta2c2`(`customer_id` ASC) USING BTREE,
  CONSTRAINT `FK41v6ueo0hiran65w8y1cta2c2` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK7yjkh15oektx6rtxokliu076` FOREIGN KEY (`table_id`) REFERENCES `dinner_tables` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of reservation
-- ----------------------------

-- ----------------------------
-- Table structure for ticket
-- ----------------------------
DROP TABLE IF EXISTS `ticket`;
CREATE TABLE `ticket`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `available_number1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `available_number2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `customer_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `customer_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `date` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `event_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `event_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `organiser` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `organizer_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `picture` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `price` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `ticket_type_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `ticket_type_name1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `ticket_type_name2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `time` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `venue` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `venue_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 36 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ticket
-- ----------------------------
INSERT INTO `ticket` VALUES (22, '50', '200', '10', 'chenle', '2024-12-07', 'Time start.', '20', 'The World', 'ANRAN', '14', 'images/event/3.webp', '67', 'vip', 'vip', 'NOR', '13:31', 'BJUT', '13');
INSERT INTO `ticket` VALUES (28, '50', '200', '7', 'zitong', '2024-12-07', 'Time start.', '20', 'The World', 'ANRAN', '14', 'images/event/3.webp', '67', 'vip', 'vip', 'NOR', '13:31', 'BJUT', '13');
INSERT INTO `ticket` VALUES (30, '100', '200', '7', 'zitong', '2024-12-07', 'another concert', '24', 'Concert 02', 'yuze', '19', 'images/event/3.webp', '67', 'NOR', 'vip', 'NOR', '11:56', 'UCD', '12');
INSERT INTO `ticket` VALUES (31, '50', '100', '10', 'chenle', '2024-12-07', 'a concert 1', '23', 'Concert 01', 'yuze', '19', 'images/event/1.webp', '45', 'vip', 'vip', 'NOR', '20:55', 'New land', '16');
INSERT INTO `ticket` VALUES (34, '50', '200', '17', 'chenle1', '2024-12-07', 'Time start.', '20', 'The World', 'ANRAN', '14', 'images/event/3.webp', '67', 'vip', 'vip', 'NOR', '13:31', 'BJUT', '13');

-- ----------------------------
-- Table structure for venues
-- ----------------------------
DROP TABLE IF EXISTS `venues`;
CREATE TABLE `venues`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `available_number1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `available_number2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `contact_email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `contact_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `contact_phone_number` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `date` datetime(6) NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `ticket_type_name1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `ticket_type_name2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `time` time(6) NULL DEFAULT NULL,
  `organiser_id` bigint NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `FKa2r6hvt55xkyrit7oboxf5rs5`(`organiser_id` ASC) USING BTREE,
  CONSTRAINT `FKa2r6hvt55xkyrit7oboxf5rs5` FOREIGN KEY (`organiser_id`) REFERENCES `organizer` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 18 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of venues
-- ----------------------------
INSERT INTO `venues` VALUES (10, 'US somewhere', '100', '200', 'ANRAN@163.COM', 'SW', '23243432423', NULL, 'US', 'vip', 'NOR', NULL, 10);
INSERT INTO `venues` VALUES (11, 'Paradise', '100', '200', 'ANRAN@163.COM', 'SW', '23243432423', NULL, 'Paradise', 'vip', 'NOR', NULL, 10);
INSERT INTO `venues` VALUES (12, 'UCD', '100', '200', 'ANRAN@163.COM', 'SW', '23243432423', NULL, 'UCD', 'vip', 'NOR', NULL, 10);
INSERT INTO `venues` VALUES (13, 'BJUT some where', '50', '200', 'ANRAN1@163.COM', 'HWW', '2324343', NULL, 'BJUT', 'vip', 'NOR', NULL, 21);
INSERT INTO `venues` VALUES (16, 'magic land', '50', '100', 'YUze@163.COM', '233', '12324214324', NULL, 'New land', 'vip', 'NOR', NULL, 19);

-- ----------------------------
-- Table structure for walk_in
-- ----------------------------
DROP TABLE IF EXISTS `walk_in`;
CREATE TABLE `walk_in`  (
  `id` bigint NOT NULL,
  `covers` int NOT NULL,
  `date` date NULL DEFAULT NULL,
  `is_overfill` bit(1) NOT NULL,
  `time` time(6) NULL DEFAULT NULL,
  `table_id` bigint NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `FKllvq0tsg050su15x5uw08sfcj`(`table_id` ASC) USING BTREE,
  CONSTRAINT `FKllvq0tsg050su15x5uw08sfcj` FOREIGN KEY (`table_id`) REFERENCES `dinner_tables` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of walk_in
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
