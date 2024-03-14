CREATE DATABASE  IF NOT EXISTS `milhoverde` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `milhoverde`;
-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: milhoverde
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `IdCliente` int NOT NULL AUTO_INCREMENT,
  `Nome` varchar(70) NOT NULL,
  `CPF` varchar(15) NOT NULL,
  `Telefone` varchar(20) NOT NULL,
  `Email` varchar(70) NOT NULL,
  PRIMARY KEY (`IdCliente`),
  UNIQUE KEY `cpf` (`CPF`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (30,'Rafael','111.111.111-11','(11) 11111-1111',''),(31,'Xana','999.999.999-99','(99) 99999-9999',''),(33,'Fernanda','111.111.115-55','(77) 77777-7777','fernadan@'),(34,'ola','555.555.555-55','(55) 55555-5555','ola@gmail.com'),(45,'tentativa','373.456.423-24','(43) 43242-3432','342'),(46,'efwadaw','321.321.323-23','(23) 13123-2131','12wda'),(47,'efdawes','213.123.131-23','(45) 32421-3213','3123213465');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `endereco`
--

DROP TABLE IF EXISTS `endereco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `endereco` (
  `Id_endereco` int NOT NULL AUTO_INCREMENT,
  `Rua` varchar(255) NOT NULL,
  `Numero` int NOT NULL,
  `Bairro` varchar(175) NOT NULL,
  `Cidade` varchar(100) NOT NULL,
  `fk_idFuncionario` int DEFAULT NULL,
  PRIMARY KEY (`Id_endereco`),
  KEY `FK_IdFuncionario` (`fk_idFuncionario`),
  CONSTRAINT `FK_IdFuncionario` FOREIGN KEY (`fk_idFuncionario`) REFERENCES `funcionario` (`IdFuncionario`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `endereco`
--

LOCK TABLES `endereco` WRITE;
/*!40000 ALTER TABLE `endereco` DISABLE KEYS */;
INSERT INTO `endereco` VALUES (1,'DTNA',205,'DTNA','DTNA',NULL),(3,'23',231,'23','23',14),(9,'Palmeiras',788,'Diamantina','DTNA',23),(11,'Aguas Altas',62,'Sf','Cachoeira',25),(13,'Getulio Vargas',62,'dawdad','Cachoeira',29),(14,'dwadd',1,'dawdwadw','dawd',31),(15,'daçwdkçawmd',62,'dawdad','dadawd',32),(16,'daçwdkçawmd',62,'dawdad','Cachoeira',33);
/*!40000 ALTER TABLE `endereco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `financeiro`
--

DROP TABLE IF EXISTS `financeiro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `financeiro` (
  `id_financeiro` int NOT NULL AUTO_INCREMENT,
  `forma_pagamento` varchar(15) NOT NULL,
  `parcelas` char(1) NOT NULL,
  `fk_id_reserva` int NOT NULL,
  `valor_total` int NOT NULL,
  PRIMARY KEY (`id_financeiro`),
  KEY `fk_id_reserva` (`fk_id_reserva`),
  CONSTRAINT `fk_id_reserva` FOREIGN KEY (`fk_id_reserva`) REFERENCES `reserva` (`IdReserva`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `financeiro`
--

LOCK TABLES `financeiro` WRITE;
/*!40000 ALTER TABLE `financeiro` DISABLE KEYS */;
INSERT INTO `financeiro` VALUES (2,'PIX','1',7,100),(9,'Dinheiro','1',31,321),(10,'Dinheiro','1',32,231),(11,'Dinheiro','1',33,100);
/*!40000 ALTER TABLE `financeiro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcionario`
--

DROP TABLE IF EXISTS `funcionario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `funcionario` (
  `IdFuncionario` int NOT NULL AUTO_INCREMENT,
  `Senha` varchar(8) NOT NULL,
  `Nome` varchar(70) NOT NULL,
  `Email` varchar(60) NOT NULL,
  `Telefone` varchar(30) NOT NULL,
  `Usuario` varchar(8) NOT NULL,
  `CPF` varchar(15) NOT NULL,
  PRIMARY KEY (`IdFuncionario`),
  UNIQUE KEY `email` (`Email`),
  UNIQUE KEY `Usuario` (`Usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionario`
--

LOCK TABLES `funcionario` WRITE;
/*!40000 ALTER TABLE `funcionario` DISABLE KEYS */;
INSERT INTO `funcionario` VALUES (12,'54321','DTNA','rafa@gmail.com','(12)33333-3333','Func1234','(11) 11111-1111'),(13,'awdawd','dadawd','dwadawd','(23)21323-1232','Func2314','(11) 11111-1111'),(14,'213123','23','21321','(12)32132-1312','Func    ','(11) 11111-1111'),(16,'555','Lo','lo@gmail.com','(88) 88888-8888','Func5555','(11) 11111-1111'),(18,'8794','fernanda','fernanda@gmail.com','(78) 88888-8888','Func9999','(11) 11111-1111'),(23,'6456161','Ola Mundo','mndkaldklandknmw','(44) 96415-1841','Func9954','115.555.555-55'),(25,'dwad','Tuti','tuti@gmail.com','(33) 33333-3333','Func5612','154.444.444-44'),(29,'1132','Lena Soares','dadawd','(77) 77777-7777','Func2153','666.666.666-66'),(31,'888','Lorrane','dawdad','(44) 44444-4444','Func4698','888.888.888-88'),(32,'41984','Teo Lorenzo','awdawd','(41) 72727-2727','Func4651','615.416.516-51'),(33,'1132','Marcos','mdçadaçwl','(88) 88888-8888','Func2154','321.641.616-13');
/*!40000 ALTER TABLE `funcionario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reserva`
--

DROP TABLE IF EXISTS `reserva`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reserva` (
  `IdReserva` int NOT NULL AUTO_INCREMENT,
  `Checkin` date NOT NULL,
  `Checkout` date NOT NULL,
  `TipoQuarto` varchar(15) NOT NULL,
  `quarto` varchar(15) NOT NULL,
  `FK_IdCliente` int NOT NULL,
  `fk_id_funcionario` int DEFAULT NULL,
  PRIMARY KEY (`IdReserva`),
  KEY `FK_IdClienteReserva_idx` (`FK_IdCliente`),
  KEY `FK_funcionario` (`fk_id_funcionario`),
  CONSTRAINT `FK_funcionario` FOREIGN KEY (`fk_id_funcionario`) REFERENCES `funcionario` (`IdFuncionario`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_IdClienteReserva` FOREIGN KEY (`FK_IdCliente`) REFERENCES `cliente` (`IdCliente`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reserva`
--

LOCK TABLES `reserva` WRITE;
/*!40000 ALTER TABLE `reserva` DISABLE KEYS */;
INSERT INTO `reserva` VALUES (7,'2023-12-31','2023-12-31','Quarto Luxo','3',30,NULL),(8,'2024-02-11','2024-02-11','Quarto Comum','3',30,NULL),(9,'2024-02-27','2024-02-27','Quarto Comum','2',31,NULL),(11,'2024-02-21','2024-02-22','Quarto Comum','1',33,NULL),(12,'2024-02-09','2024-02-22','Quarto Comum','1',34,NULL),(31,'2024-03-09','2024-03-16','Quarto Comum','1',45,12),(32,'2024-03-23','2024-03-24','Quarto Comum','1',46,12),(33,'2024-03-08','2024-03-09','Quarto Comum','1',47,12);
/*!40000 ALTER TABLE `reserva` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `visao_cliente`
--

DROP TABLE IF EXISTS `visao_cliente`;
/*!50001 DROP VIEW IF EXISTS `visao_cliente`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `visao_cliente` AS SELECT 
 1 AS `Nome`,
 1 AS `CPF`,
 1 AS `Telefone`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `visao_funcionario`
--

DROP TABLE IF EXISTS `visao_funcionario`;
/*!50001 DROP VIEW IF EXISTS `visao_funcionario`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `visao_funcionario` AS SELECT 
 1 AS `Nome`,
 1 AS `Usuario`,
 1 AS `CPF`,
 1 AS `Telefone`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `visao_reserva`
--

DROP TABLE IF EXISTS `visao_reserva`;
/*!50001 DROP VIEW IF EXISTS `visao_reserva`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `visao_reserva` AS SELECT 
 1 AS `Checkin`,
 1 AS `checkout`,
 1 AS `TipoQuarto`,
 1 AS `quarto`*/;
SET character_set_client = @saved_cs_client;

--
-- Dumping routines for database 'milhoverde'
--

--
-- Final view structure for view `visao_cliente`
--

/*!50001 DROP VIEW IF EXISTS `visao_cliente`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `visao_cliente` AS select `cliente`.`Nome` AS `Nome`,`cliente`.`CPF` AS `CPF`,`cliente`.`Telefone` AS `Telefone` from `cliente` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `visao_funcionario`
--

/*!50001 DROP VIEW IF EXISTS `visao_funcionario`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `visao_funcionario` AS select `funcionario`.`Nome` AS `Nome`,`funcionario`.`Usuario` AS `Usuario`,`funcionario`.`CPF` AS `CPF`,`funcionario`.`Telefone` AS `Telefone` from `funcionario` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `visao_reserva`
--

/*!50001 DROP VIEW IF EXISTS `visao_reserva`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `visao_reserva` AS select `reserva`.`Checkin` AS `Checkin`,`reserva`.`Checkout` AS `checkout`,`reserva`.`TipoQuarto` AS `TipoQuarto`,`reserva`.`quarto` AS `quarto` from `reserva` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-03-14 11:34:25
