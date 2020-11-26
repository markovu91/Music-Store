CREATE DATABASE  IF NOT EXISTS `music_store` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `music_store`;
-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: music_store
-- ------------------------------------------------------
-- Server version	8.0.18

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
-- Table structure for table `album`
--

DROP TABLE IF EXISTS `album`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `album` (
  `id_album` int(11) NOT NULL AUTO_INCREMENT,
  `album_title` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `album_release_year` int(11) DEFAULT NULL,
  `album_cover_art` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `album_price` decimal(5,2) DEFAULT NULL,
  `album_catalog_number` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `album_edition` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `Artist_id_artist` int(11) NOT NULL,
  `Genre_id_genre` int(11) NOT NULL,
  PRIMARY KEY (`id_album`),
  KEY `fk_Album_Artist1_idx` (`Artist_id_artist`),
  KEY `fk_Album_Genre1_idx` (`Genre_id_genre`),
  CONSTRAINT `fk_Album_Artist1` FOREIGN KEY (`Artist_id_artist`) REFERENCES `artist` (`id_artist`),
  CONSTRAINT `fk_Album_Genre1` FOREIGN KEY (`Genre_id_genre`) REFERENCES `genre` (`id_genre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `artist`
--

DROP TABLE IF EXISTS `artist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `artist` (
  `id_artist` int(11) NOT NULL AUTO_INCREMENT,
  `artist_name` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `artist_description` varchar(250) COLLATE utf8_bin DEFAULT NULL,
  `artist_formation_year` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_artist`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `cart`
--

DROP TABLE IF EXISTS `cart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cart` (
  `id_cart` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id_cart`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `cart_album`
--

DROP TABLE IF EXISTS `cart_album`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cart_album` (
  `Album_id_album` int(11) NOT NULL,
  `Cart_id_cart` int(11) NOT NULL,
  KEY `fk_cart_album_Album1_idx` (`Album_id_album`),
  KEY `fk_cart_album_Cart1_idx` (`Cart_id_cart`),
  CONSTRAINT `fk_cart_album_Album1` FOREIGN KEY (`Album_id_album`) REFERENCES `album` (`id_album`),
  CONSTRAINT `fk_cart_album_Cart1` FOREIGN KEY (`Cart_id_cart`) REFERENCES `cart` (`id_cart`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `cart_track`
--

DROP TABLE IF EXISTS `cart_track`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cart_track` (
  `Track_id_track` int(11) NOT NULL,
  `Cart_id_cart` int(11) NOT NULL,
  KEY `fk_cart_track_Track1_idx` (`Track_id_track`),
  KEY `fk_cart_track_Cart1_idx` (`Cart_id_cart`),
  CONSTRAINT `fk_cart_track_Cart1` FOREIGN KEY (`Cart_id_cart`) REFERENCES `cart` (`id_cart`),
  CONSTRAINT `fk_cart_track_Track1` FOREIGN KEY (`Track_id_track`) REFERENCES `track` (`id_track`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `genre`
--

DROP TABLE IF EXISTS `genre`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `genre` (
  `id_genre` int(11) NOT NULL AUTO_INCREMENT,
  `genre_name` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id_genre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `order`
--

DROP TABLE IF EXISTS `order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order` (
  `id_order` int(11) NOT NULL AUTO_INCREMENT,
  `date` datetime NOT NULL,
  `total` decimal(10,2) DEFAULT NULL,
  `Cart_id_cart` int(11) NOT NULL,
  PRIMARY KEY (`id_order`),
  KEY `fk_Order_Cart1_idx` (`Cart_id_cart`),
  CONSTRAINT `fk_Order_Cart1` FOREIGN KEY (`Cart_id_cart`) REFERENCES `cart` (`id_cart`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role` (
  `id_role` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id_role`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `track`
--

DROP TABLE IF EXISTS `track`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `track` (
  `id_track` int(11) NOT NULL AUTO_INCREMENT,
  `track_title` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `track_number` int(11) DEFAULT NULL,
  `track_price` decimal(5,2) DEFAULT NULL,
  `Album_id_album` int(11) NOT NULL,
  PRIMARY KEY (`id_track`),
  KEY `fk_Track_Album1_idx` (`Album_id_album`),
  CONSTRAINT `fk_Track_Album1` FOREIGN KEY (`Album_id_album`) REFERENCES `album` (`id_album`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id_user` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `password` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `Role_id_role` int(11) NOT NULL,
  `Cart_id_cart` int(11) NOT NULL,
  PRIMARY KEY (`id_user`),
  KEY `fk_User_Role_idx` (`Role_id_role`),
  KEY `fk_User_Cart1_idx` (`Cart_id_cart`),
  CONSTRAINT `fk_User_Cart1` FOREIGN KEY (`Cart_id_cart`) REFERENCES `cart` (`id_cart`),
  CONSTRAINT `fk_User_Role` FOREIGN KEY (`Role_id_role`) REFERENCES `role` (`id_role`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-11-26 18:49:05
