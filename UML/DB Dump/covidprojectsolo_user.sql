-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: den1.mysql1.gear.host    Database: covidprojectsolo
-- ------------------------------------------------------
-- Server version	5.7.26

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
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `cpr` int(11) NOT NULL,
  `firstName` varchar(40) NOT NULL,
  `surname` varchar(40) NOT NULL,
  `addressid` int(11) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(50) NOT NULL,
  `dateOfBirth` date NOT NULL,
  `status` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`cpr`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (101010,'SECRETARY','ROLE',2,'email@gmail.com','123','1990-01-01',1),(111222,'Adrian','Enachi',1,'myemail@gmail.com','123','2021-04-20',1),(120290,'Evan','Shred',3,'asdf@gmail.com','123','1990-02-12',1),(202020,'John','text',6,'email@gmail.com','123','1992-12-15',1),(250898,'ADMIN','Name',1,'aaa52xaw@gmail.com','123','1998-08-25',1),(300800,'Fred','Greed',3,'fredy@mail.com','123','2000-08-30',1),(303030,'Mary','text',7,'email@gmail.com','111','1995-09-08',1),(404040,'Gary','Musk',9,'asd2@gmail.com','123','1996-03-29',1),(444555,'Adrian','ttryrt',1,'adrian.nk52x@gmail.com','123','2021-03-16',1),(699000,'fed','rik',10,'adrian.nk52x@gmail.com','123','2021-05-24',1),(778998,'Alan','jak',3,'adrian.nk52x@gmail.com','123','2021-02-08',1),(1111111111,'Alan','Partridge',1,'alanParty@gmail.com','1234','1964-07-07',1),(1212121212,'Noel','Fielding',15,'noelyboy@gmail.com','12345678','1974-08-05',1);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-08-08 23:08:28
