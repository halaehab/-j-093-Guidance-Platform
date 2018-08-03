CREATE DATABASE  IF NOT EXISTS `hajj` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `hajj`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: hajj
-- ------------------------------------------------------
-- Server version	5.7.19-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `midical`
--

DROP TABLE IF EXISTS `midical`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `midical` (
  `table seq no` int(11) NOT NULL AUTO_INCREMENT,
  `hajj _id` int(6) DEFAULT NULL,
  `midical_stat` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`table seq no`),
  UNIQUE KEY `table seq no_UNIQUE` (`table seq no`),
  KEY `hajj id_idx` (`hajj _id`),
  CONSTRAINT `id relation` FOREIGN KEY (`hajj _id`) REFERENCES `hajj_info` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `midical`
--

LOCK TABLES `midical` WRITE;
/*!40000 ALTER TABLE `midical` DISABLE KEYS */;
INSERT INTO `midical` VALUES (1,1,'Diabetes'),(2,2,'Diabetes'),(3,3,'Diabetes'),(4,1,'Hypertension '),(5,2,'Hypertension '),(6,4,'Epilepsy'),(7,5,'Anemia'),(8,5,'Hypertension ');
/*!40000 ALTER TABLE `midical` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-08-03  6:15:50
