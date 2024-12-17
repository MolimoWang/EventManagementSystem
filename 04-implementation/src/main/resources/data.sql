-- data.sql

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (1, 'ainiy3141105@163.com', b'1', '$2a$10$aQHmP9ksDy4gxRCYmSTeQuM11m/wxhBMKjdbLGpf0vOJ07ER.LW5i', '25');
INSERT INTO `admin` VALUES (5, '23@163.com', b'1', '$2a$10$DMBwaAbZ76vPgzjFrwM7Ju.0htQ8dDHglz.AoKYthkJIvwyghCJPa', 'ruixin');
INSERT INTO `admin` VALUES (17, 'ainiy314@163.com', b'1', '$2a$10$qMczUhOgDbUkhq21.ZsUp.Z81aM4.PplXTe45S.iz/dTpMwXfWp4C', 'ruixin1');
INSERT INTO `admin` VALUES (18, 'ruixin.gu@ucdconnect.ie', b'0', '$2a$10$E0.CccoQU11K2TgbUfKTxuRYlVcVh43gPAyHDWfDD/ZHEna85liMW', 'rongyuze');
INSERT INTO `admin` VALUES (19, 'ruixin2@163.com', b'1', '$2a$10$yqSS.46ZKznjR48Ei5MPPew5TJgldvQQt1QDobqjYn.2hJCO0HNq6', 'ruixin2');
INSERT INTO `admin` VALUES (20, 'ainiy3141105@163.com', b'1', '$2a$10$wSXFVi.oOVpgHKJTF689e.hiGRZMu9jgTBvMp/tlwPhDuWV7qwst.', '222');

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES (3, 'ainiy3141105@163.com', b'0', '$2a$10$lgStIB6gPnljHkK7Q4qNd.D22DQFESCGf/o10YQQEoKkx0aJTo5mC', '888');
INSERT INTO `customer` VALUES (6, 'ainiy3141105@163.com22', b'0', '$2a$10$m5htiGPjqXE5AWmfM309t.2hSJoYQyF.ty1MLBVHO2Be3JVoxI6V6', '8888');
INSERT INTO `customer` VALUES (7, 'ainiy3141105@163.com', b'0', '$2a$10$7iOhm8xNjXmv7.UWvxP7SeKMO0QDppaR08lRl8RucvkUZMmFFlbGq', 'zitong');
INSERT INTO `customer` VALUES (10, '23@163.com', b'0', '$2a$10$gYzQHm897HHJLGrJLnNU8O9IGVE.zEJgdKrCNTDL1oDgkGFPz3y9a', 'chenle');
INSERT INTO `customer` VALUES (16, '23@163.com', b'0', '$2a$10$5msNz.ae6J3cEagvJ0Mbke5Fn19xjUesqzQrD6s7ZYt9Mt/KEyZJy', 'wanzitong');
INSERT INTO `customer` VALUES (17, 'ruixin.gu@ucdconnect.ie', b'0', '$2a$10$77Nn5f3BkML2fL0BAmVNjOQrcaQjwFfKnYAa5d6/XrBjj.oavZo4O', 'chenle1');

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
-- Records of dinner_tables_seq
-- ----------------------------
INSERT INTO `dinner_tables_seq` VALUES (13);

-- ----------------------------
-- Records of events
-- ----------------------------
INSERT INTO `events` VALUES (20, '50', '200', '2024-12-07', 'Time start.', 'The World', 'ANRAN', '14', 'images/event/3.webp', '67', '61', 47, 200, 1, 1, 'vip', 'NOR', '13:31', 'BJUT', '13');
INSERT INTO `events` VALUES (23, '50', '100', '2024-12-07', 'a concert 1', 'Concert 01', 'yuze', '19', 'images/event/1.webp', '45', '30', 49, 100, 1, 1, 'vip', 'NOR', '20:55', 'New land', '16');
INSERT INTO `events` VALUES (24, '100', '200', '2024-12-18', 'play with butterfly', 'Play with butterfly', 'yuze', '19', 'images/event/1.webp', '45', '67', 0, 0, 1, 1, 'vip', 'NOR', '17:25', 'US', '10');
INSERT INTO `events` VALUES (27, '100', '200', '2024-12-08', 'a concert', 'Concert new1', 'shuhan1', '21', 'images/event/4.webp', '32', '23', 100, 200, 1, 1, 'vip', 'NOR', '18:23', 'US', '10');
INSERT INTO `events` VALUES (28, '100', '200', '2024-12-17', 'play with music', 'Play with music', 'yuze', '19', 'images/event/3.webp', NULL, NULL, 0, 0, 1, 1, 'vip', 'NOR', '18:30', 'US', '10');

-- ----------------------------
-- Records of my_entity_seq
-- ----------------------------
INSERT INTO `my_entity_seq` VALUES (1);

-- ----------------------------
-- Records of organizer
-- ----------------------------
INSERT INTO `organizer` VALUES (7, '13910762161', '13910762161', '23@163.com', b'0', '$2a$10$Glv3csrga48bA7rYzp44kerZInLD.GFzA5VEqdwtx8caVrLiMgQ5O', '13910762161', '2333');
INSERT INTO `organizer` VALUES (9, '123', '123', 'ainiy3141105@163.com', b'1', '$2a$10$37urKSgFtWT7eCO/Sni3X.IIz1bykQ2e3LOOJFn7duTUOMjfd5mEO', '123', '6666');
INSERT INTO `organizer` VALUES (10, 'some where', '123232', '23333@163.com', b'1', '$2a$10$FUCNMi/PItUrpX27QKJ7c.JxP.GkDnuPHxMMy5/fx1cLKEHOMdeMK', '343532532', 'shuhan');
INSERT INTO `organizer` VALUES (12, '13910762161', '13910762161', '23@163.com', b'0', '$2a$10$H1zMSpJBmdf9Gvs4B2fYh.Bq4abaSI130xvKiNdUg5oWnRCRq.Uty', '13910762161', 'Sing2');
INSERT INTO `organizer` VALUES (13, '1321323', '123131', 'Sing23@163.com', b'1', '$2a$10$1kFZtDUW0d2798YmoJs/w.ZP6GjIiORP6kWzDQSU2HzoELg43tWZm', '231312', 'Sing3');
INSERT INTO `organizer` VALUES (14, '', '', 'ruixin.gu@ucdconnect.ie', b'1', '$2a$10$gP2.BQj8.NL0kgb7AHR2ke6Abm2YKWSIzPXKopedUrnbc.lD9rxdW', '', 'ANRAN');
INSERT INTO `organizer` VALUES (19, '', '', 'yuze@163.com', b'1', '$2a$10$RhWIiMpDxhhS0ieg9DiZTuhcutNuZN0064yij6O8uaNf.KpQPZb6e', '', 'yuze');
INSERT INTO `organizer` VALUES (20, 'SOME UNIVERSITY', '2332', 'ruixin.gu@ucdconnect.ie', b'0', '$2a$10$owYcLtpjXGitbdFjTmvcnOcKLqHcgSc08EGycATZDM14ZdRES2H.y', '23241242', 'lisiying');
INSERT INTO `organizer` VALUES (21, 'some where', '123232', 'shuhan@163.com', b'1', '$2a$10$3emvkNAiEHv3vTZK.SlrC.60OvVTVJHV5MZa446q2KA8mRQDY.CHC', '123434', 'shuhan1');

-- ----------------------------
-- Records of ticket
-- ----------------------------
INSERT INTO `ticket` VALUES (22, '50', '200', '10', 'chenle', '2024-12-07', 'Time start.', '20', 'The World', 'ANRAN', '14', 'images/event/3.webp', '67', 'vip', 'vip', 'NOR', '13:31', 'BJUT', '13');
INSERT INTO `ticket` VALUES (28, '50', '200', '7', 'zitong', '2024-12-07', 'Time start.', '20', 'The World', 'ANRAN', '14', 'images/event/3.webp', '67', 'vip', 'vip', 'NOR', '13:31', 'BJUT', '13');
INSERT INTO `ticket` VALUES (30, '100', '200', '7', 'zitong', '2024-12-07', 'another concert', '24', 'Concert 02', 'yuze', '19', 'images/event/3.webp', '67', 'NOR', 'vip', 'NOR', '11:56', 'UCD', '12');
INSERT INTO `ticket` VALUES (31, '50', '100', '10', 'chenle', '2024-12-07', 'a concert 1', '23', 'Concert 01', 'yuze', '19', 'images/event/1.webp', '45', 'vip', 'vip', 'NOR', '20:55', 'New land', '16');
INSERT INTO `ticket` VALUES (34, '50', '200', '17', 'chenle1', '2024-12-07', 'Time start.', '20', 'The World', 'ANRAN', '14', 'images/event/3.webp', '67', 'vip', 'vip', 'NOR', '13:31', 'BJUT', '13');
-- ----------------------------
-- Records of venues
-- ----------------------------
INSERT INTO `venues` VALUES (10, 'US somewhere', '100', '200', 'ANRAN@163.COM', 'SW', '23243432423', NULL, 'US', 'vip', 'NOR', NULL, 10);
INSERT INTO `venues` VALUES (11, 'Paradise', '100', '200', 'ANRAN@163.COM', 'SW', '23243432423', NULL, 'Paradise', 'vip', 'NOR', NULL, 10);
INSERT INTO `venues` VALUES (12, 'UCD', '100', '200', 'ANRAN@163.COM', 'SW', '23243432423', NULL, 'UCD', 'vip', 'NOR', NULL, 10);
INSERT INTO `venues` VALUES (13, 'BJUT some where', '50', '200', 'ANRAN1@163.COM', 'HWW', '2324343', NULL, 'BJUT', 'vip', 'NOR', NULL, 21);
INSERT INTO `venues` VALUES (16, 'magic land', '50', '100', 'YUze@163.COM', '233', '12324214324', NULL, 'New land', 'vip', 'NOR', NULL, 19);
