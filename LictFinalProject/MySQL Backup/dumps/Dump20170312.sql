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
-- Table structure for table `cse`
--

DROP TABLE IF EXISTS `cse`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cse` (
  `course_code` varchar(45) NOT NULL,
  `course_name` varchar(45) NOT NULL,
  `course_type` varchar(45) NOT NULL,
  `course_credit` varchar(45) NOT NULL,
  PRIMARY KEY (`course_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cse`
--

LOCK TABLES `cse` WRITE;
/*!40000 ALTER TABLE `cse` DISABLE KEYS */;
INSERT INTO `cse` VALUES ('CSE231','DLD','T','3'),('CSE337','DSP','T','3'),('CSE343','jkafas','asdkjf','3'),('CSE419','VLSI','Theory','3'),('CSE431','Compiller Design','Theory','3');
/*!40000 ALTER TABLE `cse` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `eee`
--

DROP TABLE IF EXISTS `eee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `eee` (
  `course_code` varchar(45) NOT NULL,
  `course_name` varchar(45) NOT NULL,
  `course_type` varchar(45) DEFAULT NULL,
  `course_credit` float DEFAULT NULL,
  PRIMARY KEY (`course_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `eee`
--

LOCK TABLES `eee` WRITE;
/*!40000 ALTER TABLE `eee` DISABLE KEYS */;
INSERT INTO `eee` VALUES ('EEE111','Electrical Circuit','T',3),('EEE221','Electronics','T',3),('EEE361','Power System Analysis','Theory',3),('EEE362','Power System Analysis Sessional','Sessional',1.5),('EEE421','Power Electronics','T',3);
/*!40000 ALTER TABLE `eee` ENABLE KEYS */;
UNLOCK TABLES;

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

--
-- Table structure for table `student_registration`
--

DROP TABLE IF EXISTS `student_registration`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student_registration` (
  `student_id` int(11) NOT NULL,
  `student_name` varchar(45) NOT NULL,
  `course1` varchar(45) DEFAULT NULL,
  `course2` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_registration`
--

LOCK TABLES `student_registration` WRITE;
/*!40000 ALTER TABLE `student_registration` DISABLE KEYS */;
INSERT INTO `student_registration` VALUES (1102003,'Subrata','EEE111','EEE221'),(1102009,'Proma','EEE111','EEE221'),(1104032,'Sumaia Akter','CSE231','CSE337');
/*!40000 ALTER TABLE `student_registration` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-03-12  4:09:16
