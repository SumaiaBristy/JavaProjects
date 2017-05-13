-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: uni_db
-- ------------------------------------------------------
-- Server version	5.5.53

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
-- Table structure for table `student_info`
--

DROP TABLE IF EXISTS `student_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student_info` (
  `student_id` int(11) NOT NULL,
  `student_name` varchar(45) NOT NULL,
  `father_name` varchar(45) NOT NULL,
  `mother_name` varchar(45) NOT NULL,
  `sex` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `hsc_year` varchar(45) NOT NULL,
  `Pass` varchar(45) NOT NULL,
  `dept` varchar(45) NOT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_info`
--

LOCK TABLES `student_info` WRITE;
/*!40000 ALTER TABLE `student_info` DISABLE KEYS */;
INSERT INTO `student_info` VALUES (110632,'sumaia','abbu','ammu','F','raojan','2011','111','Unknown'),(1102003,'Subrata','Piso','Pisi','M','Noakhali','2011','1234','EEE'),(1102005,'Emu','Uncle','Aunty','M','Potia','2011','1234','EEE'),(1102006,'Shovon','Abbu','Ammu','M','Barisal','2011','1234','EEE'),(1102009,'Proma','Masi','Meso','F','Hathazari','2011','1234','EEE'),(1102032,'Mohaimin Shovon','Uncle','Aunty','M','Chandpur','2011','1234','EEE'),(1102074,'Mili','Uncle er beyai','Auntyr beyain','F','Dhaka','2011','1234','EEE'),(1102076,'Saad','Uncle','Aunty','M','Mohammadpur','2011','1234','EEE'),(1102079,'Troyee','Uncle','Aunty','F','Dhaka','2011','1234','EEE'),(1102080,'Tonoy','Uncle','Aunty','M','Sylhet','2011','1234','EEE'),(1102081,'Podder','Uncle','Aunty','M','Sylhet','2011','1234','EEE'),(1102083,'Zarif','Uncle','Aunty','M','Mugda','2011','1234','EEE'),(1104023,'Tousif','Uncle','Aunty','M','Chittagong','2011','1234','CSE'),(1104032,'Sumaia Akter','Uncle','Aunty','F','Chandpur','2011','1234','CSE'),(1104045,'Mr. Student','Father','Mother','Male','Chittagong','2011','1234','CSE');
/*!40000 ALTER TABLE `student_info` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-03-12  4:10:08
