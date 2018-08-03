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
-- Table structure for table `campaign_info`
--

DROP TABLE IF EXISTS `campaign_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `campaign_info` (
  `campaign no` int(11) NOT NULL,
  `makkah_hotel_name` varchar(100) DEFAULT NULL,
  `makkah_hotel_location` varchar(100) DEFAULT NULL,
  `arafa_tent_no` varchar(6) DEFAULT NULL,
  `arafa_tent_location` varchar(100) DEFAULT NULL,
  `mina_tent_no` varchar(6) DEFAULT NULL,
  `mina_tent_location` varchar(100) DEFAULT NULL,
  `mozdalefa_tent_no` varchar(6) DEFAULT NULL,
  `mozdalefa_tent_location` varchar(100) DEFAULT NULL,
  `makkah_hotel_phon` int(10) DEFAULT NULL,
  `madina_hotel_name` varchar(45) DEFAULT NULL,
  `madina_hotel_location` varchar(100) DEFAULT NULL,
  `madina_hotel_phone` int(10) DEFAULT NULL,
  `campaign_name` varchar(45) DEFAULT NULL,
  `supervisor_name` varchar(45) DEFAULT NULL,
  `supervisor_phone` int(10) DEFAULT NULL,
  `supervisor nationality` varchar(20) DEFAULT NULL,
  `hajj_id` int(6) DEFAULT NULL,
  PRIMARY KEY (`campaign no`),
  UNIQUE KEY `ID_UNIQUE` (`campaign no`),
  KEY `hajj id_idx` (`hajj_id`),
  CONSTRAINT `hajj id` FOREIGN KEY (`hajj_id`) REFERENCES `hajj_info` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `campaign_info`
--

LOCK TABLES `campaign_info` WRITE;
/*!40000 ALTER TABLE `campaign_info` DISABLE KEYS */;
INSERT INTO `campaign_info` VALUES (117397,'Hotel Pullman Zamzam Makkah','C:\\\\Users\\Hala\\\\Desktop\\\\New folder\\\\FingerPrint\\\\maps\\\\mohamed_map.html','A747','G768','G938',NULL,'A993',NULL,125715555,'Le Meridien Medina',NULL,148460777,'Bader Establishment ','Giuseppe Stefano',552895490,'Italian   ',1),(221987,'Hotel Fairmont Makkah','C:\\\\Users\\Hala\\\\Desktop\\\\New folder\\\\FingerPrint\\\\maps\\\\ahmed_map.html','A847','B958','F309',NULL,'A340',NULL,125717777,'Anwar Al Madinah Movenpick Hotel',NULL,148181000,'Abdullatef  Establishment ','Gypsy Lavinia',537862976,'Romani     ',2),(339473,'Al-Safwah Towers Hotel – Dar Al Ghufran','file:///C://Users/Hala//Desktop//New%20folder//FingerPrint//maps//abdelrahman_map.html','B958','C949','E330',NULL,'A773',NULL,125777773,'The Oberoi Hotel',NULL,148282222,'Yousef Estabnlishment ','Abelard Adalwolf',542878299,'German     ',3),(442677,'ibis Styles Hotel Makkah','file:///C://Users/Hala//Desktop//New%20folder//FingerPrint//maps//dina_map.html','C948','A758','A940',NULL,'D303',NULL,125518800,'Dallah Taibah Hotel',NULL,148290055,'Hassan Omar Establishment ','Jacob Mason',528368490,'Amercan    ',4),(559008,'Al Marwa Rayhaan By Rotana','file:///C://Users/Hala//Desktop//New%20folder//FingerPrint//maps//hager_map.html','J485','G039','C303',NULL,'F308',NULL,125714444,'Le Meridien Medina',NULL,148460777,'Qafelat Ghaith Establishment ','Alejandro Sebastián',529782683,'Spanish',5);
/*!40000 ALTER TABLE `campaign_info` ENABLE KEYS */;
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
