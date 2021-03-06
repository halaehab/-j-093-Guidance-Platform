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
-- Table structure for table `notification`
--

DROP TABLE IF EXISTS `notification`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `notification` (
  `table seq no` int(11) NOT NULL AUTO_INCREMENT,
  `hajj_id` int(6) DEFAULT NULL,
  `type` varchar(1) DEFAULT NULL,
  `location` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`table seq no`),
  UNIQUE KEY `table seq no_UNIQUE` (`table seq no`),
  KEY `hajj id_idx` (`hajj_id`),
  CONSTRAINT `id` FOREIGN KEY (`hajj_id`) REFERENCES `hajj_info` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notification`
--

LOCK TABLES `notification` WRITE;
/*!40000 ALTER TABLE `notification` DISABLE KEYS */;
INSERT INTO `notification` VALUES (1,2,'m','file:///C:/Users/Hala/Desktop/New%20folder/FingerPrint/maps/defult.html'),(2,2,'m','file:///C:/Users/Hala/Desktop/New%20folder/FingerPrint/maps/defult.html'),(3,2,'m','file:///C:/Users/Hala/Desktop/New%20folder/FingerPrint/maps/defult.html'),(4,2,'v','file:///C:/Users/Hala/Desktop/New%20folder/FingerPrint/maps/defult.html'),(5,4,'m','file:///C:/Users/Hala/Desktop/New%20folder/FingerPrint/maps/defult.html'),(6,4,'m','file:///C:/Users/Hala/Desktop/New%20folder/FingerPrint/maps/defult.html'),(7,4,'v','file:///C:/Users/Hala/Desktop/New%20folder/FingerPrint/maps/defult.html'),(8,4,'v','file:///C:/Users/Hala/Desktop/New%20folder/FingerPrint/maps/defult.html');
/*!40000 ALTER TABLE `notification` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-08-03  6:15:51
