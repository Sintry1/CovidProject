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
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `address` (
  `addressId` int(11) NOT NULL AUTO_INCREMENT,
  `streetName` varchar(50) NOT NULL,
  `streetNumber` int(11) NOT NULL,
  `postCode` int(11) NOT NULL,
  `city` varchar(50) NOT NULL,
  PRIMARY KEY (`addressId`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES (1,'Vognporten',14,2620,'Albertslund'),(2,'Eslevej',91,2300,'Ørestad'),(3,'Osterbrogade',42,2300,'Copenhagen'),(4,'Vestervej',2,3400,'Hillerod'),(6,'Bispebjerg Bakke',23,2400,'København'),(7,'Italiensvej',1,2300,'København'),(8,'Nordmarks Allé',1,2620,'Albertslund'),(9,'Nordre Fasanvej',57,2000,'Frederiksberg'),(10,'Frederiksberg Allé',104,1820,'Frederiksberg'),(11,'Halmtorvet',11,1700,'København'),(12,'Ragnhildgade',1,2100,'København'),(13,'Århusgade',88,2100,'København'),(14,'Lindorffs Alle',5,2900,'Hellerup'),(15,'Skadestuevej',1,2000,'Frederiksberg'),(16,'Nyelandsvej',13,2000,'Frederiksberg'),(17,'Julius Thomsens Pla',1,1925,'Frederiksberg'),(18,'Roskildevej',36,2000,'Frederiksberg'),(19,'Tietgensgade',67,1704,'København V'),(20,'Frue Plads',2,1168,'København K'),(21,'Frederik Vs Vej',12,2100,'København O'),(22,'Birkedommervej',43,2400,'København NV'),(23,'Vingelodden',6,2200,'København N'),(24,'Sundholmsvej',22,2300,'København S'),(25,'Gammel Kirkevej',98,2770,'Kastrup'),(26,'Ørestads Boulevard',75,2300,'København S'),(27,'Lufthavnsboulevarde',6,2770,'Kastrup'),(28,'Ellehammersvej',26,2770,'Kastrup'),(29,'Ugandavej',93,2770,'Kastrup'),(30,'Halvejen',3,2791,'Dragør'),(31,'Wiedergården',2,2791,'Dragør'),(32,'Hvidovrevej',432,2650,'Hvidovre'),(33,'Hovedstien',14,2650,'Hvidovre'),(34,'Brøndy Strand Centr',60,2660,'Brøndby Stran'),(35,'Vallensbæk stations',100,2665,'Vallensbæk St'),(36,'Ishøj Østergade',20,2635,'Ishøj'),(37,'Ishøj Store Torv',20,2635,'Ishøj'),(38,'Højrupgårdsvej',3,2625,'Vallensbæk'),(39,'Bytorvet',4,2620,'Albertslund'),(40,'Hedemarksvej',14,2620,'Albertslund'),(41,'Stadionvej',80,2600,'Glostrup'),(42,'Egeskoven',25,2600,'Glostrup'),(43,'Bystævneparken',1,2700,'Brønshøj'),(44,'Nørrevangen',8,2610,'Rødovre'),(45,'Tvedvangen',194,2730,'Herlev'),(46,'Herlev Bygade',92,2730,'Herlev'),(47,'Bybjergvej',10,2740,'Skovlunde');
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-08-08 23:08:16
