CREATE DATABASE leage;
USE leage;

-- leage.balls definition

CREATE TABLE `balls` (
  `ball_id` int(11) NOT NULL,
  `ball_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ball_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


-- leage.referee definition

CREATE TABLE `referee` (
  `referee_id` int(11) NOT NULL,
  `referee_name` varchar(100) NOT NULL,
  PRIMARY KEY (`referee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


-- leage.stadiums definition

CREATE TABLE `stadiums` (
  `stadium_id` int(11) NOT NULL,
  `stadium_name` varchar(255) DEFAULT NULL,
  `stadium_city_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`stadium_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


-- leage.teams definition

CREATE TABLE `teams` (
  `team_id` int(11) NOT NULL,
  `team_name` varchar(255) NOT NULL,
  `team_city_name` varchar(255) NOT NULL,
  PRIMARY KEY (`team_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


-- leage.coachs definition

CREATE TABLE `coachs` (
  `coach_id` int(11) NOT NULL,
  `coach_name` varchar(255) NOT NULL,
  `team_id` int(11) DEFAULT NULL,
  `salary` double DEFAULT NULL,
  `price` double NOT NULL,
  `hire_date` date DEFAULT NULL,
  `hire_expiry_date` date DEFAULT NULL,
  PRIMARY KEY (`coach_id`),
  KEY `coachs_FK` (`team_id`),
  CONSTRAINT `coachs_FK` FOREIGN KEY (`team_id`) REFERENCES `teams` (`team_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


-- leage.matchs definition

CREATE TABLE `matchs` (
  `match_id` int(11) NOT NULL,
  `match_date` datetime DEFAULT NULL,
  `stadium_id` int(11) DEFAULT NULL,
  `team_home_id` int(11) DEFAULT NULL,
  `team_away_id` int(11) DEFAULT NULL,
  `ball_id` int(11) DEFAULT NULL,
  `team_home_goals` int(11) DEFAULT NULL,
  `team_away_goals` int(11) DEFAULT NULL,
  `referee_id` int(11) NOT NULL,
  `team_home_point` int(11) NOT NULL,
  `team_away_point` int(11) NOT NULL,
  PRIMARY KEY (`match_id`),
  KEY `stadium_id` (`stadium_id`),
  KEY `ball_id` (`ball_id`),
  KEY `matchs_FK` (`team_home_id`),
  KEY `matchs_FK_1` (`team_away_id`),
  KEY `matchs_FK_2` (`referee_id`),
  CONSTRAINT `matchs_FK` FOREIGN KEY (`team_home_id`) REFERENCES `teams` (`team_id`),
  CONSTRAINT `matchs_FK_1` FOREIGN KEY (`team_away_id`) REFERENCES `teams` (`team_id`),
  CONSTRAINT `matchs_FK_2` FOREIGN KEY (`referee_id`) REFERENCES `referee` (`referee_id`),
  CONSTRAINT `matchs_ibfk_1` FOREIGN KEY (`stadium_id`) REFERENCES `stadiums` (`stadium_id`),
  CONSTRAINT `matchs_ibfk_2` FOREIGN KEY (`ball_id`) REFERENCES `balls` (`ball_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


-- leage.players definition

CREATE TABLE `players` (
  `player_id` int(11) NOT NULL,
  `player_name` varchar(255) NOT NULL,
  `team_id` int(11) DEFAULT NULL,
  `salary` double NOT NULL,
  `price` double DEFAULT NULL,
  `hire_date` date DEFAULT NULL,
  `hire_expiry_date` date DEFAULT NULL,
  PRIMARY KEY (`player_id`),
  KEY `team_id` (`team_id`),
  CONSTRAINT `players_ibfk_1` FOREIGN KEY (`team_id`) REFERENCES `teams` (`team_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


-- leage.results definition

CREATE TABLE `results` (
  `result_id` int(11) NOT NULL,
  `team_id` int(11) NOT NULL,
  `match_id` int(11) NOT NULL,
  `point` int(11) NOT NULL,
  `goals_for` int(11) NOT NULL,
  `goals_against` int(11) NOT NULL,
  PRIMARY KEY (`result_id`),
  KEY `results_FK` (`team_id`),
  KEY `results_FK_1` (`match_id`),
  CONSTRAINT `results_FK` FOREIGN KEY (`team_id`) REFERENCES `teams` (`team_id`),
  CONSTRAINT `results_FK_1` FOREIGN KEY (`match_id`) REFERENCES `matchs` (`match_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO leage.balls
(ball_id, ball_name)
VALUES(1, "nike"),
	  (2,"adidas");
	 
INSERT INTO leage.teams
(team_id, team_name, team_city_name)
VALUES(201, 'padide', 'mashhad'),
      (202, 'payam', 'mashhad'),
      (203, 'naft', 'tehran'),
      (204, 'esteghlal', 'tehran'),
      (205, 'perspolis', 'tehran'),
      (206, 'zobahan', 'isfahan'),
      (207, 'sepahan', 'isfahan');

INSERT INTO leage.stadiums
(stadium_id, stadium_name, stadium_city_name)
VALUES(1001, "azadi", "tehran"),
	  (1002, "takhti", "tehran"),
	  (1003, "naghshjahan", "isfahan"),
	  (1004, "samen", "mashhad");
	 
INSERT INTO leage.referee
(referee_id, referee_name)
VALUES(51, "faghani"),
		(52, "davari"),
		(53, "mahdavi");
	
INSERT INTO leage.coachs
(coach_id, coach_name, team_id, salary, price, hire_date, hire_expiry_date)
VALUES(1101, 'golmohamadi', 205, 50 ,1000, '2019-01-01', '2022-01-01'),
(1102, 'majidi', 204, 40 ,800, '2020-01-01', '2021-01-01'),
(1103, 'rahmati', 201, 20 ,500, '2020-01-01', '2023-01-01'),
(1104, 'ghanei', 207, 10 ,600, '2018-01-01', '2020-01-01'),
(1105, 'salmani', 202, 30 ,400, '2019-01-01', '2020-01-01'),
(1106, 'zamani', 203, 40 ,900, '2018-01-01', '2021-01-01'),
(1107, 'akbari', 206, 60 ,700, '2017-01-01', '2022-01-01')
;

INSERT INTO leage.players
(player_id, player_name, team_id, salary, price, hire_date, hire_expiry_date)
VALUES(1501, 'ali', 201, 45, 800,'2015-01-01', '2021-01-01'),
(1535, 'hassan', 202, 40, 700,'2016-01-01', '2021-01-01'),
(1502, 'hossein', 203, 20, 500,'2018-01-01', '2021-01-01'),
(1503, 'amir', 207, 70, 1000,'2019-01-01', '2025-01-01'),
(1504, 'reza', 205, 40, 600,'2013-01-01', '2021-01-01'),
(1505, 'vahid', 204, 60, 1000,'2018-01-01', '2023-01-01'),
(1506, 'mahdi', 203, 20, 600,'2019-01-01', '2021-01-01'),
(1507, 'mohsen', 205, 40, 900,'2017-01-01', '2021-01-01'),
(1508, 'saeed', 205, 30, 700,'2016-01-01', '2023-01-01'),
(1509, 'shahab', 206, 20, 500,'2017-01-01', '2021-01-01'),
(1510, 'arash', 207, 15, 400,'2015-01-01', '2022-01-01'),
(1511, 'mohammad', 202, 10, 300,'2013-01-01', '2021-01-01'),
(1512, 'vali', 203, 10, 200,'2014-01-01', '2021-01-01'),
(1513, 'asghar', 204, 20, 800,'2017-01-01', '2025-01-01'),
(1514, 'akbar', 206, 50, 1100,'2019-01-01', '2022-01-01'),
(1515, 'jaber', 207, 40, 950,'2020-01-01', '2021-01-01'),
(1516, 'ghassem', 201, 50, 1150,'2021-01-01', '2024-01-01'),
(1517, 'rostam', 202, 10, 300,'2019-01-01', '2021-01-01'),
(1518, 'ahmad', 203, 20, 700,'2018-01-01', '2021-01-01'),
(1519, 'farhad', 202, 40, 900,'2019-01-01', '2022-01-01'),
(1520, 'farzad', 205, 30, 800,'2014-01-01', '2021-01-01'),
(1521, 'ahmadreza', 207, 20, 500,'2016-01-01', '2020-01-01'),
(1522, 'ehsan', 201, 15, 400,'2019-01-01', '2021-01-01'),
(1523, 'ebrahim', 202, 8, 100,'2018-01-01', '2021-01-01'),
(1524, 'afshin', 203, 20, 600,'2017-01-01', '2021-01-01'),
(1525, 'ashkan', 205, 3, 50,'2019-01-01', '2022-01-01'),
(1526, 'omid', 205, 60, 1100,'2016-01-01', '2020-01-01'),
(1527, 'amirali', 206, 80, 1800,'2020-01-01', '2025-01-01'),
(1528, 'amin', 207, 50, 1200,'2020-01-01', '2023-01-01'),
(1529, 'iman', 203, 70, 1700,'2020-01-01', '2021-01-01'),
(1530, 'atabak', 202, 50, 1100,'2019-01-01', '2023-01-01'),
(1531, 'arman', 201, 10, 500,'2018-01-01', '2022-01-01'),
(1532, 'aria', 206, 5, 300,'2017-01-01', '2025-01-01'),
(1533, 'bardia', 207, 10, 600,'2016-01-01', '2022-01-01'),
(1534, 'behdad', 206, 10, 700,'2014-01-01', '2020-01-01');

INSERT INTO leage.matchs
(match_id, match_date, stadium_id, team_home_id, team_away_id, ball_id, team_home_goals, team_away_goals, referee_id, team_home_point, team_away_point)
VALUES(2001, '2020-01-15', 1004, 201, 202, 1, 3, 1, 52, 3, 0),
(2002, '2020-01-21', 1001, 204, 201, 1, 2, 0, 51, 3, 0),
(2003, '2020-01-25', 1001, 204, 203, 1, 1, 0, 53, 3, 0),
(2004, '2020-01-29', 1001, 204, 207, 1, 1, 1, 52, 1, 1),
(2005, '2020-01-22', 1001, 205, 202, 1, 4, 2, 51, 3, 0),
(2006, '2020-01-27', 1001, 205, 206, 1, 3, 2, 53, 3, 0);







