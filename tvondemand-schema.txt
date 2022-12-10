-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: tvondemand
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `actor`
--

DROP TABLE IF EXISTS `actor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `actor` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `actor`
--

LOCK TABLES `actor` WRITE;
/*!40000 ALTER TABLE `actor` DISABLE KEYS */;
INSERT INTO `actor` VALUES (1,'Test','Actor 1'),(2,'Test','Actor 2'),(3,'Test','Actor 3'),(4,'Test','Actor 4'),(5,'Test','Actor 5'),(6,'Test','Actor 6'),(7,'Test','Actor 7');
/*!40000 ALTER TABLE `actor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `address` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `address` varchar(50) NOT NULL,
  `district` varchar(20) DEFAULT NULL,
  `city_id` int unsigned NOT NULL,
  `postal_code` varchar(10) DEFAULT NULL,
  `phone` varchar(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_address_city` (`city_id`),
  CONSTRAINT `fk_address_city` FOREIGN KEY (`city_id`) REFERENCES `city` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES (1,'Agiou Dionusiou 19','Agiou Dionusiou',1,'26789','6900000000');
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `category` (
  `id` int unsigned NOT NULL,
  `name` varchar(25) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1,'Action'),(2,'Animation'),(3,'Children'),(4,'Classics'),(5,'Comedy'),(6,'Documentary'),(7,'Drama'),(8,'Family'),(9,'Foreign'),(10,'Games'),(11,'Horror'),(12,'Music'),(13,'New'),(14,'Sci-Fi'),(15,'Sports'),(16,'Travel');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `city`
--

DROP TABLE IF EXISTS `city`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `city` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `city` varchar(50) NOT NULL,
  `country_id` int unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_city_country` (`country_id`),
  CONSTRAINT `fk_city_country` FOREIGN KEY (`country_id`) REFERENCES `country` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `city`
--

LOCK TABLES `city` WRITE;
/*!40000 ALTER TABLE `city` DISABLE KEYS */;
INSERT INTO `city` VALUES (1,'Patras',1);
/*!40000 ALTER TABLE `city` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `country`
--

DROP TABLE IF EXISTS `country`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `country` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `country` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `country`
--

LOCK TABLES `country` WRITE;
/*!40000 ALTER TABLE `country` DISABLE KEYS */;
INSERT INTO `country` VALUES (1,'Greece');
/*!40000 ALTER TABLE `country` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cycle`
--

DROP TABLE IF EXISTS `cycle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cycle` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(128) NOT NULL,
  `episodes_amount` int DEFAULT NULL,
  `release_year` year DEFAULT NULL,
  `series_id` int unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_cycle_series1_idx` (`series_id`),
  CONSTRAINT `fk_cycle_series1` FOREIGN KEY (`series_id`) REFERENCES `series` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cycle`
--

LOCK TABLES `cycle` WRITE;
/*!40000 ALTER TABLE `cycle` DISABLE KEYS */;
INSERT INTO `cycle` VALUES (1,'Test Cycle 1 for 1',NULL,2014,1),(2,'Test Cycle 2 for 1',NULL,2015,1),(3,'Test Cycle 1 for 2',NULL,2014,2),(4,'Test Cycle 2 for 2',NULL,2015,2),(5,'Test Cycle 1 for 3',NULL,2016,3),(6,'Test Cycle 2 for 3',NULL,2017,3);
/*!40000 ALTER TABLE `cycle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `episode`
--

DROP TABLE IF EXISTS `episode`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `episode` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(45) NOT NULL,
  `duration` varchar(45) DEFAULT NULL,
  `release_year` varchar(45) DEFAULT NULL,
  `description` text,
  `cycle_id` int unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_episode_cycle1_idx` (`cycle_id`),
  CONSTRAINT `fk_episode_cycle1` FOREIGN KEY (`cycle_id`) REFERENCES `cycle` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `episode`
--

LOCK TABLES `episode` WRITE;
/*!40000 ALTER TABLE `episode` DISABLE KEYS */;
INSERT INTO `episode` VALUES (1,'Test Episode 1 for 1','2','2014','Test',1),(2,'Test Episode 2 for 1','3','2015','Test',1),(3,'Test Episode 1 for 2','2','2014','Test',2),(4,'Test Episode 2 for 2','2','2015','Test',2),(5,'Test Episode 1 for 3','2','2014','Test',3),(6,'Test Episode 2 for 3','3','2015','Test',3),(7,'Test Episode 1 for 4','2','2014','Test',4),(8,'Test Episode 2 for 4','2','2015','Test',4),(9,'Test Episode 1 for 5','2','2014','Test',5),(10,'Test Episode 2 for 5','3','2015','Test',5),(11,'Test Episode 1 for 6','2','2014','Test',6),(12,'Test Episode 2 for 6','2','2015','Test',6);
/*!40000 ALTER TABLE `episode` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `film`
--

DROP TABLE IF EXISTS `film`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `film` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(128) NOT NULL,
  `description` text,
  `release_year` year NOT NULL,
  `language_id` int unsigned NOT NULL,
  `original_language_id` int unsigned DEFAULT NULL,
  `length` int unsigned DEFAULT NULL,
  `rating` enum('G','PG','PG-13','R','NC-17') DEFAULT 'G',
  `special_features` set('Trailers','Commentaries','Deleted Scenes','Behind the Scenes') DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_film_language` (`language_id`),
  KEY `fk_film_language_original` (`original_language_id`),
  CONSTRAINT `fk_film_language` FOREIGN KEY (`language_id`) REFERENCES `language` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `fk_film_language_original` FOREIGN KEY (`original_language_id`) REFERENCES `language` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `film`
--

LOCK TABLES `film` WRITE;
/*!40000 ALTER TABLE `film` DISABLE KEYS */;
INSERT INTO `film` VALUES (1,'TestFilm1','Test Description 1',2012,1,NULL,2,'G','Trailers'),(2,'TestFilm2','Test Description 2',2017,2,NULL,3,'G','Behind the Scenes'),(3,'TestFilm3','Test Description 3',2014,3,NULL,1,'G','Trailers'),(4,'TestFilm4','Test Description 4',2008,4,NULL,2,'G','Trailers'),(5,'TestFilm5','Test Description 5',2011,2,NULL,2,'G','Trailers');
/*!40000 ALTER TABLE `film` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `film_actor`
--

DROP TABLE IF EXISTS `film_actor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `film_actor` (
  `actor_id` int unsigned NOT NULL,
  `film_id` int unsigned NOT NULL,
  PRIMARY KEY (`actor_id`,`film_id`),
  KEY `fk_film_actor_film` (`film_id`),
  CONSTRAINT `fk_film_actor_actor` FOREIGN KEY (`actor_id`) REFERENCES `actor` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `fk_film_actor_film` FOREIGN KEY (`film_id`) REFERENCES `film` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `film_actor`
--

LOCK TABLES `film_actor` WRITE;
/*!40000 ALTER TABLE `film_actor` DISABLE KEYS */;
INSERT INTO `film_actor` VALUES (1,1),(2,1),(2,2),(4,2),(3,3),(6,4),(3,5);
/*!40000 ALTER TABLE `film_actor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `film_category`
--

DROP TABLE IF EXISTS `film_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `film_category` (
  `film_id` int unsigned NOT NULL,
  `category_id` int unsigned NOT NULL,
  PRIMARY KEY (`film_id`,`category_id`),
  KEY `fk_film_category_category` (`category_id`),
  CONSTRAINT `fk_film_category_category` FOREIGN KEY (`category_id`) REFERENCES `category` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `fk_film_category_film` FOREIGN KEY (`film_id`) REFERENCES `film` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `film_category`
--

LOCK TABLES `film_category` WRITE;
/*!40000 ALTER TABLE `film_category` DISABLE KEYS */;
INSERT INTO `film_category` VALUES (1,1),(3,1),(5,1),(2,2),(4,3);
/*!40000 ALTER TABLE `film_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `film_inventory`
--

DROP TABLE IF EXISTS `film_inventory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `film_inventory` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `film_id` int unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_inventory_film1_idx` (`film_id`),
  CONSTRAINT `fk_inventory_film1` FOREIGN KEY (`film_id`) REFERENCES `film` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=130 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `film_inventory`
--

LOCK TABLES `film_inventory` WRITE;
/*!40000 ALTER TABLE `film_inventory` DISABLE KEYS */;
/*!40000 ALTER TABLE `film_inventory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `film_payment`
--

DROP TABLE IF EXISTS `film_payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `film_payment` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `plan_id` int unsigned NOT NULL,
  `total_amount` double NOT NULL DEFAULT '0',
  `payment_date` datetime NOT NULL,
  `user_id` int unsigned NOT NULL,
  `film_rental_id` int unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_payment_plan1_idx` (`plan_id`),
  KEY `fk_payment_user1_idx` (`user_id`),
  KEY `fk_payment_film_rental1_idx` (`film_rental_id`),
  CONSTRAINT `fk_payment_film_rental1` FOREIGN KEY (`film_rental_id`) REFERENCES `film_rental` (`id`),
  CONSTRAINT `fk_payment_plan1` FOREIGN KEY (`plan_id`) REFERENCES `plan` (`id`),
  CONSTRAINT `fk_payment_user1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `film_payment`
--

LOCK TABLES `film_payment` WRITE;
/*!40000 ALTER TABLE `film_payment` DISABLE KEYS */;
/*!40000 ALTER TABLE `film_payment` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `film_pay` AFTER INSERT ON `film_payment` FOR EACH ROW BEGIN
  INSERT INTO log (action, action_time, id, plan_id, total_amount, payment_date, user_id,film_rental_id, table_name, rental_date, film_inventory_id, series_inventory_id, series_rental_id, plan_type_id,successful, action_performed_by)
  VALUES('INSERT', NOW(), NEW.id, NEW.plan_id, NEW.total_amount, NEW.payment_date, NEW.user_id, NEW.film_rental_id, 'film_payment', NULL, NULL, NULL, NULL, NULL,NULL,NULL);
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `discount` AFTER INSERT ON `film_payment` FOR EACH ROW BEGIN
    DECLARE plan INT;
    DECLARE Films_Rented INT;
    DECLARE Series_Rented INT;
    
    SET @plan=(SELECT plan_type.id FROM plan_type, plan, film_payment WHERE NEW.user_id=plan.user_id AND plan.plan_type_id=plan_type.id LIMIT 1);
    IF @plan=1 THEN
	SET @Films_Rented =(SELECT COUNT(film_payment.id) FROM film_payment WHERE NEW.user_id=film_payment.user_id AND DATE(NEW.payment_date)=DATE(film_payment.payment_date));
    ELSEIF @plan=3 THEN 
    SET @Films_Rented =(SELECT COUNT(film_payment.id) FROM film_payment WHERE NEW.user_id=film_payment.user_id AND DATE(NEW.payment_date)=DATE(film_payment.payment_date));
	SET @Series_Rented=(SELECT COUNT(series_payment.id) FROM series_payment WHERE NEW.user_id=series_payment.user_id AND DATE(NEW.payment_date)=DATE(series_payment.payment_date));
    END IF;
    
    
    IF (1+@Films_Rented)%3=0 AND @plan=1 THEN
    UPDATE user
    SET discount=0.5
    WHERE new.user_id=id;
    ELSEIF (1+@Films_Rented+@Series_Rented)%3=0 AND @plan=3 THEN
    UPDATE user
    SET discount=0.5
    WHERE new.user_id=id;
    ELSE 
    UPDATE user
    SET discount=1
    WHERE new.user_id=id;
    END IF;
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `film_pay_up` AFTER UPDATE ON `film_payment` FOR EACH ROW BEGIN
  INSERT INTO log (action, action_time, id, plan_id, total_amount, payment_date, user_id,film_rental_id, table_name, rental_date, film_inventory_id, series_inventory_id, series_rental_id, plan_type_id,successful, action_performed_by)
  VALUES('UPDATE', NOW(), NEW.id, NEW.plan_id, NEW.total_amount, NEW.payment_date, NEW.user_id, NEW.film_rental_id, 'film_payment', NULL, NULL, NULL, NULL, NULL,NULL,NULL);
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `film_pay_del` AFTER DELETE ON `film_payment` FOR EACH ROW BEGIN
  INSERT INTO log (action, action_time, id, plan_id, total_amount, payment_date, user_id,film_rental_id, table_name, rental_date, film_inventory_id, series_inventory_id, series_rental_id, plan_type_id,successful, action_performed_by)
  VALUES('DELETE', NOW(), OLD.id, OLD.plan_id, OLD.total_amount, OLD.payment_date, OLD.user_id, OLD.film_rental_id, 'film_payment', NULL, NULL, NULL, NULL, NULL,NULL,NULL);
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `film_rental`
--

DROP TABLE IF EXISTS `film_rental`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `film_rental` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int unsigned NOT NULL,
  `rental_date` datetime NOT NULL,
  `film_inventory_id` int unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_rental_customer1_idx` (`user_id`),
  KEY `fk_rental_film_inventory1_idx` (`film_inventory_id`),
  CONSTRAINT `fk_rental_customer1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  CONSTRAINT `fk_rental_film_inventory1` FOREIGN KEY (`film_inventory_id`) REFERENCES `film_inventory` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=127 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `film_rental`
--

LOCK TABLES `film_rental` WRITE;
/*!40000 ALTER TABLE `film_rental` DISABLE KEYS */;
/*!40000 ALTER TABLE `film_rental` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `film_rent` AFTER INSERT ON `film_rental` FOR EACH ROW BEGIN
  INSERT INTO log (action, action_time, id, plan_id, total_amount, payment_date, user_id,film_rental_id, table_name, rental_date, film_inventory_id, series_inventory_id, series_rental_id, plan_type_id,successful, action_performed_by)
  VALUES('INSERT', NOW(), NEW.id, NULL, NULL, NULL, NEW.user_id, NULL, 'film_rental', NEW.rental_date, NEW.film_inventory_id, NULL, NULL, NULL,NULL,NULL);
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `film_rent_up` AFTER UPDATE ON `film_rental` FOR EACH ROW BEGIN
  INSERT INTO log (action, action_time, id, plan_id, total_amount, payment_date, user_id,film_rental_id, table_name, rental_date, film_inventory_id, series_inventory_id, series_rental_id, plan_type_id,successful, action_performed_by)
  VALUES('UPDATE', NOW(), NEW.id, NULL, NULL, NULL, NEW.user_id, NULL, 'film_rental', NEW.rental_date, NEW.film_inventory_id, NULL, NULL, NULL,NULL,NULL);
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `film_rent_del` AFTER DELETE ON `film_rental` FOR EACH ROW BEGIN
  INSERT INTO log (action, action_time, id, plan_id, total_amount, payment_date, user_id,film_rental_id, table_name, rental_date, film_inventory_id, series_inventory_id, series_rental_id, plan_type_id,successful, action_performed_by)
  VALUES('DELETE', NOW(), OLD.id, NULL, NULL, NULL, OLD.user_id, NULL, 'film_rental', OLD.rental_date, OLD.film_inventory_id, NULL, NULL, NULL,NULL,NULL);
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `language`
--

DROP TABLE IF EXISTS `language`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `language` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `name` char(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `language`
--

LOCK TABLES `language` WRITE;
/*!40000 ALTER TABLE `language` DISABLE KEYS */;
INSERT INTO `language` VALUES (1,'English'),(2,'Italian'),(3,'French'),(4,'German');
/*!40000 ALTER TABLE `language` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `log`
--

DROP TABLE IF EXISTS `log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `log` (
  `action` varchar(48) DEFAULT NULL,
  `action_time` timestamp NULL DEFAULT NULL,
  `id` int DEFAULT NULL,
  `plan_id` int DEFAULT NULL,
  `total_amount` double DEFAULT NULL,
  `payment_date` datetime DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  `film_rental_id` int DEFAULT NULL,
  `table_name` varchar(45) DEFAULT NULL,
  `rental_date` datetime DEFAULT NULL,
  `film_inventory_id` int DEFAULT NULL,
  `series_inventory_id` int DEFAULT NULL,
  `series_rental_id` int DEFAULT NULL,
  `plan_type_id` int DEFAULT NULL,
  `successful` enum('Yes','No') DEFAULT NULL,
  `action_performed_by` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `log`
--

LOCK TABLES `log` WRITE;
/*!40000 ALTER TABLE `log` DISABLE KEYS */;
/*!40000 ALTER TABLE `log` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login_status`
--

DROP TABLE IF EXISTS `login_status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `login_status` (
  `Login_Status_id` int NOT NULL,
  `user_id` int unsigned NOT NULL,
  `plan_type` int NOT NULL,
  PRIMARY KEY (`Login_Status_id`),
  KEY `fk_LOGIN_STATUS_user1_idx` (`user_id`),
  CONSTRAINT `fk_LOGIN_STATUS_user1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login_status`
--

LOCK TABLES `login_status` WRITE;
/*!40000 ALTER TABLE `login_status` DISABLE KEYS */;
/*!40000 ALTER TABLE `login_status` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `plan`
--

DROP TABLE IF EXISTS `plan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `plan` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int unsigned NOT NULL,
  `plan_type_id` int unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_plan_customer1_idx` (`user_id`),
  KEY `fk_plan_plan_type1_idx` (`plan_type_id`),
  CONSTRAINT `fk_plan_customer1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  CONSTRAINT `fk_plan_plan_type1` FOREIGN KEY (`plan_type_id`) REFERENCES `plan_type` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `plan`
--

LOCK TABLES `plan` WRITE;
/*!40000 ALTER TABLE `plan` DISABLE KEYS */;
/*!40000 ALTER TABLE `plan` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `plan` AFTER INSERT ON `plan` FOR EACH ROW BEGIN
  INSERT INTO log (action, action_time, id, plan_id, total_amount, payment_date, user_id,film_rental_id, table_name, rental_date, film_inventory_id, series_inventory_id, series_rental_id, plan_type_id,successful, action_performed_by)
  VALUES('INSERT', NOW(), NEW.id, NULL, NULL, NULL, NEW.user_id, NULL, 'plan', NULL, NULL, NULL, NULL, NEW.plan_type_id,NULL,NULL);
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `plan_up` AFTER UPDATE ON `plan` FOR EACH ROW BEGIN
  INSERT INTO log (action, action_time, id, plan_id, total_amount, payment_date, user_id,film_rental_id, table_name, rental_date, film_inventory_id, series_inventory_id, series_rental_id, plan_type_id,successful, action_performed_by)
  VALUES('UPDATE', NOW(), NEW.id, NULL, NULL, NULL, NEW.user_id, NULL, 'plan', NULL, NULL, NULL, NULL, NEW.plan_type_id,NULL,NULL);
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `plan_del` AFTER DELETE ON `plan` FOR EACH ROW BEGIN
  INSERT INTO log (action, action_time, id, plan_id, total_amount, payment_date, user_id,film_rental_id, table_name, rental_date, film_inventory_id, series_inventory_id, series_rental_id, plan_type_id,successful, action_performed_by)
  VALUES('DELETE', NOW(), OLD.id, NULL, NULL, NULL, OLD.user_id, NULL, 'plan', NULL, NULL, NULL, NULL, OLD.plan_type_id,NULL,NULL);
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `plan_type`
--

DROP TABLE IF EXISTS `plan_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `plan_type` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `plan_type` varchar(45) NOT NULL,
  `movies_price` double DEFAULT NULL,
  `series_price` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `plan_type`
--

LOCK TABLES `plan_type` WRITE;
/*!40000 ALTER TABLE `plan_type` DISABLE KEYS */;
INSERT INTO `plan_type` VALUES (1,'Movies only',0.4,NULL),(2,'Series only',NULL,0.2),(3,'Series and Movies',0.3,0.1);
/*!40000 ALTER TABLE `plan_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `series`
--

DROP TABLE IF EXISTS `series`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `series` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(128) NOT NULL,
  `description` text,
  `release_year` year NOT NULL,
  `end_year` year DEFAULT NULL,
  `rating` enum('G','PG','PG-13','R','NC-17') DEFAULT 'G',
  `original_language_id` int unsigned DEFAULT NULL,
  `language_id` int unsigned NOT NULL,
  `cycles_amount` int DEFAULT NULL,
  `episodes_amount` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_series_language1_idx` (`original_language_id`),
  KEY `fk_series_language2_idx` (`language_id`),
  CONSTRAINT `fk_series_language1` FOREIGN KEY (`original_language_id`) REFERENCES `language` (`id`),
  CONSTRAINT `fk_series_language2` FOREIGN KEY (`language_id`) REFERENCES `language` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `series`
--

LOCK TABLES `series` WRITE;
/*!40000 ALTER TABLE `series` DISABLE KEYS */;
INSERT INTO `series` VALUES (1,'Test Series 1','Test Description 1',2012,NULL,'G',NULL,1,NULL,NULL),(2,'Test Series 2','Test Description 2',2013,NULL,'G',NULL,2,NULL,NULL),(3,'Test Series 3','Test Description 3',2011,NULL,'G',NULL,3,NULL,NULL);
/*!40000 ALTER TABLE `series` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `series_actor`
--

DROP TABLE IF EXISTS `series_actor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `series_actor` (
  `series_id` int unsigned NOT NULL,
  `actor_id` int unsigned NOT NULL,
  PRIMARY KEY (`series_id`,`actor_id`),
  KEY `fk_series_actor_series1_idx` (`series_id`),
  KEY `fk_series_actor_actor1_idx` (`actor_id`),
  CONSTRAINT `fk_series_actor_actor1` FOREIGN KEY (`actor_id`) REFERENCES `actor` (`id`),
  CONSTRAINT `fk_series_actor_series1` FOREIGN KEY (`series_id`) REFERENCES `series` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `series_actor`
--

LOCK TABLES `series_actor` WRITE;
/*!40000 ALTER TABLE `series_actor` DISABLE KEYS */;
INSERT INTO `series_actor` VALUES (1,1),(1,4),(2,1),(2,3);
/*!40000 ALTER TABLE `series_actor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `series_category`
--

DROP TABLE IF EXISTS `series_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `series_category` (
  `series_id` int unsigned NOT NULL,
  `category_id` int unsigned NOT NULL,
  PRIMARY KEY (`series_id`,`category_id`),
  KEY `fk_series_category_series1_idx` (`series_id`),
  KEY `fk_series_category_category1_idx` (`category_id`),
  CONSTRAINT `fk_series_category_category1` FOREIGN KEY (`category_id`) REFERENCES `category` (`id`),
  CONSTRAINT `fk_series_category_series1` FOREIGN KEY (`series_id`) REFERENCES `series` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `series_category`
--

LOCK TABLES `series_category` WRITE;
/*!40000 ALTER TABLE `series_category` DISABLE KEYS */;
INSERT INTO `series_category` VALUES (1,2),(2,3);
/*!40000 ALTER TABLE `series_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `series_inventory`
--

DROP TABLE IF EXISTS `series_inventory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `series_inventory` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `episode_id` int unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_series_inventory_episode1_idx` (`episode_id`),
  CONSTRAINT `fk_series_inventory_episode1` FOREIGN KEY (`episode_id`) REFERENCES `episode` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=128 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `series_inventory`
--

LOCK TABLES `series_inventory` WRITE;
/*!40000 ALTER TABLE `series_inventory` DISABLE KEYS */;
/*!40000 ALTER TABLE `series_inventory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `series_payment`
--

DROP TABLE IF EXISTS `series_payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `series_payment` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `total_amount` double NOT NULL,
  `payment_date` datetime NOT NULL,
  `user_id` int unsigned NOT NULL,
  `series_rental_id` int unsigned NOT NULL,
  `plan_id` int unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_series_payment_user1_idx` (`user_id`),
  KEY `fk_series_payment_series_rental1_idx` (`series_rental_id`),
  KEY `fk_series_payment_plan1_idx` (`plan_id`),
  CONSTRAINT `fk_series_payment_plan1` FOREIGN KEY (`plan_id`) REFERENCES `plan` (`id`),
  CONSTRAINT `fk_series_payment_series_rental1` FOREIGN KEY (`series_rental_id`) REFERENCES `series_rental` (`id`),
  CONSTRAINT `fk_series_payment_user1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=106 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `series_payment`
--

LOCK TABLES `series_payment` WRITE;
/*!40000 ALTER TABLE `series_payment` DISABLE KEYS */;
/*!40000 ALTER TABLE `series_payment` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `discount1` AFTER INSERT ON `series_payment` FOR EACH ROW BEGIN
    DECLARE plan INT;
    DECLARE Films_Rented INT;
    DECLARE Series_Rented INT;
    
    SET @plan=(SELECT plan_type.id FROM plan_type, plan, series_payment WHERE NEW.user_id=plan.user_id AND plan.plan_type_id=plan_type.id LIMIT 1);
    IF @plan=2 THEN
	SET @Series_Rented =(SELECT COUNT(series_payment.id) FROM series_payment WHERE NEW.user_id=series_payment.user_id AND DATE(NEW.payment_date)=DATE(series_payment.payment_date));
    ELSEIF @plan=3 THEN 
	SET @Series_Rented=(SELECT COUNT(series_payment.id) FROM series_payment WHERE NEW.user_id=series_payment.user_id AND DATE(NEW.payment_date)=DATE(series_payment.payment_date));
    	SET @Films_Rented =(SELECT COUNT(film_payment.id) FROM film_payment WHERE NEW.user_id=film_payment.user_id AND DATE(NEW.payment_date)=DATE(film_payment.payment_date));
    END IF;
    
    
    IF (1+@Series_Rented)%3=0 AND @plan=2 THEN
    UPDATE user
    SET discount=0.5
    WHERE new.user_id=id;
    ELSEIF (1+@Series_Rented+@Films_Rented)%3=0 AND @plan=3 THEN
    UPDATE user
    SET discount=0.5
    WHERE new.user_id=id;
    ELSE 
    UPDATE user
    SET discount=1
    WHERE new.user_id=id;
    END IF;
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `series_pay` AFTER INSERT ON `series_payment` FOR EACH ROW BEGIN
  INSERT INTO log (action, action_time, id, plan_id, total_amount, payment_date, user_id,film_rental_id, table_name, rental_date, film_inventory_id, series_inventory_id, series_rental_id, plan_type_id,successful, action_performed_by)
  VALUES('INSERT', NOW(), NEW.id, NEW.plan_id, NEW.total_amount, NEW.payment_date, NEW.user_id, NULL, 'series_payment', NULL, NULL, NULL, NEW.series_rental_id, NULL,NULL,NULL);
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `series_pay_up` AFTER UPDATE ON `series_payment` FOR EACH ROW BEGIN
  INSERT INTO log (action, action_time, id, plan_id, total_amount, payment_date, user_id,film_rental_id, table_name, rental_date, film_inventory_id, series_inventory_id, series_rental_id, plan_type_id,successful, action_performed_by)
  VALUES('UPDATE', NOW(), NEW.id, NEW.plan_id, NEW.total_amount, NEW.payment_date, NEW.user_id, NULL, 'series_payment', NULL, NULL, NULL, NEW.series_rental_id, NULL,NULL,NULL);
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `series_pay_del` AFTER DELETE ON `series_payment` FOR EACH ROW BEGIN
  INSERT INTO log (action, action_time, id, plan_id, total_amount, payment_date, user_id,film_rental_id, table_name, rental_date, film_inventory_id, series_inventory_id, series_rental_id, plan_type_id,successful, action_performed_by)
  VALUES('DELETE', NOW(), OLD.id, OLD.plan_id, OLD.total_amount, OLD.payment_date, OLD.user_id, NULL, 'series_payment', NULL, NULL, NULL, OLD.series_rental_id, NULL,NULL,NULL);
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `series_rental`
--

DROP TABLE IF EXISTS `series_rental`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `series_rental` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `rental_date` datetime NOT NULL,
  `series_inventory_id` int unsigned NOT NULL,
  `user_id` int unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_series_rental_series_inventory1_idx` (`series_inventory_id`),
  KEY `fk_series_rental_user1_idx` (`user_id`),
  CONSTRAINT `fk_series_rental_series_inventory1` FOREIGN KEY (`series_inventory_id`) REFERENCES `series_inventory` (`id`),
  CONSTRAINT `fk_series_rental_user1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=126 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `series_rental`
--

LOCK TABLES `series_rental` WRITE;
/*!40000 ALTER TABLE `series_rental` DISABLE KEYS */;
/*!40000 ALTER TABLE `series_rental` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `series_rent` AFTER INSERT ON `series_rental` FOR EACH ROW BEGIN
  INSERT INTO log (action, action_time, id, plan_id, total_amount, payment_date, user_id,film_rental_id, table_name, rental_date, film_inventory_id, series_inventory_id, series_rental_id, plan_type_id,successful, action_performed_by)
  VALUES('INSERT', NOW(), NEW.id, NULL, NULL, NULL, NEW.user_id, NULL, 'series_rental', NEW.rental_date, NULL, NEW.series_inventory_id, NULL, NULL,NULL,NULL);
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `series_rent_up` AFTER UPDATE ON `series_rental` FOR EACH ROW BEGIN
  INSERT INTO log (action, action_time, id, plan_id, total_amount, payment_date, user_id,film_rental_id, table_name, rental_date, film_inventory_id, series_inventory_id, series_rental_id, plan_type_id,successful, action_performed_by)
  VALUES('UPDATE', NOW(), NEW.id, NULL, NULL, NULL, NEW.user_id, NULL, 'series_rental', NEW.rental_date, NULL, NEW.series_inventory_id, NULL, NULL,NULL,NULL);
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `series_rent_del` AFTER DELETE ON `series_rental` FOR EACH ROW BEGIN
  INSERT INTO log (action, action_time, id, plan_id, total_amount, payment_date, user_id,film_rental_id, table_name, rental_date, film_inventory_id, series_inventory_id, series_rental_id, plan_type_id,successful, action_performed_by)
  VALUES('DELETE', NOW(), OLD.id, NULL, NULL, NULL, OLD.user_id, NULL, 'series_rental', OLD.rental_date, NULL, OLD.series_inventory_id, NULL, NULL,NULL,NULL);
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `email` varchar(50) NOT NULL,
  `address_id` int unsigned NOT NULL,
  `active` enum('active','not active') NOT NULL DEFAULT 'not active',
  `create_date` datetime NOT NULL,
  `user_type` enum('Customer','Employee','Admin') NOT NULL DEFAULT 'Customer',
  `discount` double NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `fk_customer_address` (`address_id`),
  CONSTRAINT `fk_customer_address` FOREIGN KEY (`address_id`) REFERENCES `address` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'Theodosios','Chronopoulos','a',1,'active','2022-08-09 20:41:45','Admin',1);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'tvondemand'
--
/*!50003 DROP PROCEDURE IF EXISTS `MonthlyPayments` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `MonthlyPayments`()
BEGIN
	DECLARE Year DATETIME;
    DECLARE Month DATETIME;
    DECLARE Films_Total_Payments DOUBLE;
    DECLARE Series_Total_Payments DOUBLE;
     
	 select year(film_payment.payment_date) AS `Year` ,month(film_payment.payment_date) AS `Month`,sum(total_amount) AS `Films_Total_Payments`
     from film_payment
     group by year(film_payment.payment_date),month(film_payment.payment_date)
     order by year(film_payment.payment_date),month(film_payment.payment_date);
     
     select year(series_payment.payment_date) AS `Year` ,month(series_payment.payment_date) AS `Month`,sum(total_amount) AS `Series_Total_Payments`
     from series_payment
     group by year(series_payment.payment_date),month(series_payment.payment_date)
     order by year(series_payment.payment_date),month(series_payment.payment_date);
	 
     
     
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `most_rented` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `most_rented`(IN mostrents varchar(1), IN results INT, IN startdate DATETIME, IN enddate DATE)
BEGIN
	DECLARE
	Times_Rented INT;
    IF mostrents LIKE 'm' THEN
    
    SELECT film_id, title, COUNT(film_id) AS `Times_Rented` 
	FROM film_inventory, film, film_rental
    WHERE film.id = film_inventory.film_id AND film_rental.film_inventory_id=film_inventory.id AND DATE(film_rental.rental_date)>=startdate AND DATE(film_rental.rental_date)<=enddate
	GROUP BY film_id
	ORDER BY COUNT(film_id) DESC
    
	LIMIT results;
    
    ELSEIF mostrents LIKE 's' THEN
    
    SELECT episode_id, title, COUNT(episode_id) AS `Times_Rented` 
	FROM series_inventory, episode, series_rental
    WHERE episode.id = series_inventory.episode_id AND series_rental.series_inventory_id=series_inventory.id AND DATE(series_rental.rental_date)>=startdate AND DATE(series_rental.rental_date)<=enddate 
	GROUP BY episode_id
	ORDER BY COUNT(episode_id) DESC
	LIMIT results;
    
    
	
	END IF;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `userrentals` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `userrentals`(IN email CHAR(48), IN rentaldate DATE)
BEGIN
	DECLARE Series_Rented INT;
    DECLARE Films_Rented INT;
    DECLARE UserID INT;
    DECLARE PlanType INT;
    
	SET @PlanType =(SELECT plan_type.id AS `PlanType`
    FROM plan_type, plan, user
    WHERE email=user.email AND user.id=plan.user_id AND plan.plan_type_id=plan_type.id);
    IF @PlanType=2 THEN
    SELECT user.id AS UserID, COUNT(series_rental.id) AS `Series_Rented`
	FROM user, series_rental
    WHERE email=user.email AND user.id=series_rental.user_id AND rentaldate=DATE(series_rental.rental_date);
	ELSEIF @PlanType=1 THEN
    SELECT user.id AS UserID, COUNT(film_rental.id) AS `Films_Rented`
    FROM user, film_rental
    WHERE email=user.email AND user.id=film_rental.user_id AND rentaldate=DATE(film_rental.rental_date);
    ELSEIF @PlanType=3 THEN
    SET @Series_Rented = (SELECT COUNT(series_rental.id) FROM user, series_rental WHERE email=user.email AND user.id=series_rental.user_id AND rentaldate=DATE(series_rental.rental_date));
    SET @Films_Rented =(SELECT COUNT(film_rental.id) FROM user, film_rental WHERE email=user.email AND user.id=film_rental.user_id AND rentaldate=DATE(film_rental.rental_date));
    SELECT user.id AS UserID, @Films_Rented AS `Films_Rented`, @Series_Rented AS `Series_Rented`
    FROM user
    WHERE email=user.email;
    ELSE 
    SELECT 'User not found';
	END IF;
    
   
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-08-09 20:43:44
