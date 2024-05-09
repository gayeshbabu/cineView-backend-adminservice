-- MySQL dump 10.13  Distrib 8.0.29, for macos12 (x86_64)
--
-- Host: localhost    Database: crudusers
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
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS admin;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  id int NOT NULL AUTO_INCREMENT,
  `password` varchar(255) DEFAULT NULL,
  roles varchar(255) DEFAULT NULL,
  username varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES admin WRITE;
/*!40000 ALTER TABLE admin DISABLE KEYS */;
INSERT INTO admin VALUES (6,'shaik','ADMIN','shaik'),(11,'businessman','ADMIN','businessman'),(12,'hussain','ADMIN','hussain');
/*!40000 ALTER TABLE admin ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Employee`
--

DROP TABLE IF EXISTS Employee;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE Employee (
  id int DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  Address varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Employee`
--

LOCK TABLES Employee WRITE;
/*!40000 ALTER TABLE Employee DISABLE KEYS */;
/*!40000 ALTER TABLE Employee ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movie`
--

DROP TABLE IF EXISTS movie;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE movie (
  id int NOT NULL AUTO_INCREMENT,
  genre varchar(255) DEFAULT NULL,
  `language` varchar(255) DEFAULT NULL,
  releasing_year int NOT NULL,
  title varchar(255) DEFAULT NULL,
  img_url varchar(255) DEFAULT NULL,
  director varchar(255) DEFAULT NULL,
  lead_role varchar(255) DEFAULT NULL,
  trailer varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie`
--

LOCK TABLES movie WRITE;
/*!40000 ALTER TABLE movie DISABLE KEYS */;
INSERT INTO movie VALUES (21,'Action Comedy','Telugu',2004,'Athadu','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQkZoSan7oI5dw3j64L17AUkQNvAJJditQwBA&usqp=CAU','Trivikram','Mahesh Babu','https://www.youtube.com/watch?v=V7E3qMye67c'),(23,'Comedy Dama','Telugu',2005,'Shankar Dada MBBS','https://m.media-amazon.com/images/M/MV5BOWQ3MDMyMjAtMWY2NC00ZGQ2LTlmMTktMDU1NTQ5OTBmNzQ1XkEyXkFqcGdeQXVyMjIxNzk0MjE@._V1_.jpg','Jayanth C. Paranjee','Chiranjeevi','https://www.youtube.com/watch?v=g_hCGQBV4Xc'),(24,'Action Comedy','Teluigu',2006,'Vikramarkudu','https://s1.dmcdn.net/v/4Mbi81LROpbGwEidR/x1080','SS Rajamouli','Ravi Teja','https://www.youtube.com/watch?v=CbP8fVT8xIE'),(25,'Action Comedy','Telugu',2006,'Pokiri','https://i.pinimg.com/736x/0e/ef/92/0eef925e3db67433594748e32e29d7d9.jpg','Puri Jagannadh','Mahesh Babu','https://www.youtube.com/watch?v=Eizdl6D0O9M'),(26,'Action Comedy','Teluigu',2008,'Jalsa','https://imageory.clapnumber.com/albums/large/1586853477.banner1.jpg','Trivikram','Pawan Kalyan','https://www.youtube.com/watch?v=7yWl_vN7wdM'),(27,'Mythological Drama','Telugu',2007,'Yamadonga','https://upload.wikimedia.org/wikipedia/en/3/39/Yamadonga.jpg','SS Rajamouli','Jr. NTR','https://www.youtube.com/watch?v=KRcibCmRPts'),(30,'Action Drama','Telugu',2022,'RRR','https://www.telugubulletin.com/wp-content/uploads/2022/02/images-48-497x616.jpeg','SS Rajamouli','Jr.NTR & Ram Charan','https://www.youtube.com/watch?v=NgBoMJy386M'),(31,'Comedy','Telugu',2002,'Manmadhudu','https://rukminim1.flixcart.com/image/416/416/av-media/music/v/y/k/manmadhudu-original-imadvgqxxfbmzjpe.jpeg?q=70','Trivikram','Nagarjuna','https://www.youtube.com/watch?v=iK-jTzpoCME'),(33,'Action Drama','Hindi',2017,'Raees','https://m.media-amazon.com/images/I/71AKmcz-8JL._SY445_.jpg','Rahul Dholakia','Shah Rukh Khan','https://www.youtube.com/watch?v=J7_1MU3gDk0'),(34,'Science-Fiction','Tamil',2010,'Robo','https://upload.wikimedia.org/wikipedia/en/a/aa/Tamil-endhiran.jpg','S.Shankar','Rajini Kanth','https://www.youtube.com/watch?v=1jgNECZtv5Q'),(36,'Drama','Telugu',2018,'Rangasthalam','https://telugupremiere.com/wp-content/uploads/2018/04/Rangasthalam.jpg','Sukumar','Ram Charan','https://www.youtube.com/watch?v=sueMmTm-M4Y'),(38,'Thriller','Telugu',2022,'HIT2','https://i.ytimg.com/vi/CqZ0kfKlE5E/maxresdefault.jpg','Kolanu Sailesh','Adivi Sesh','https://www.youtube.com/watch?v=-OMTthapaWE'),(40,'Action Drama','Teluigu',2023,'Jailer','https://imageory.clapnumber.com/albums/large/1586853477.banner1.jpg','Nelson','Rajni kanth',NULL),(41,'Action Drama','Teluigu',2012,'Businessman','https://img1.hotstarext.com/image/upload/f_auto,t_web_m_1x/sources/r1/cms/prod/5051/1365051-h-c76391536a01','Puri Jagannadh','Mahesh Babu','https://www.youtube.com/watch?v=xo_ZUn99wQ4');
/*!40000 ALTER TABLE movie ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `review`
--

DROP TABLE IF EXISTS review;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE review (
  id int NOT NULL AUTO_INCREMENT,
  comments varchar(255) DEFAULT NULL,
  title varchar(255) DEFAULT NULL,
  movie_id int NOT NULL,
  rating double NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `review`
--

LOCK TABLES review WRITE;
/*!40000 ALTER TABLE review DISABLE KEYS */;
INSERT INTO review VALUES (27,'datar maayya datar maayya....','RRR',23,4,NULL),(29,'samaramey....','Pokiri',25,4,NULL),(30,'krishna manohar IPS','Pokiri',25,5,NULL),(31,'good pardhu','Athadu',21,5,NULL),(32,'nice one ','Athadu',21,4,NULL),(33,'repeat stuff','Athadu',21,3,NULL),(34,'nyc','Athadu',21,3,NULL),(35,'guruji good\n','Athadu',21,4,NULL),(36,'good','HIT2',38,4,NULL),(37,'dada','Shankar Dada MBBS',23,4,NULL),(39,'good','Shankar Dada MBBS',23,4,NULL),(40,'mass','Vikramarkudu',24,4,NULL),(41,'raees','Raees',33,4,NULL),(43,'nice','HIT2',38,5,NULL),(44,'good','Athadu',21,4,NULL),(45,'nice','Athadu',21,5,NULL),(46,'jalsa','Jalsa',26,4,NULL),(47,'biggest','RRR',30,5,NULL),(49,'good','Athadu',21,4,NULL),(50,'tiles','Pokiri',25,5,NULL),(51,'sequel flop','Robo',34,5,NULL);
/*!40000 ALTER TABLE review ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS user;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  id int NOT NULL AUTO_INCREMENT,
  email varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  roles varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES user WRITE;
/*!40000 ALTER TABLE user DISABLE KEYS */;
INSERT INTO user VALUES (6,'apple.com','apple','chandu','USER'),(9,'bali.com','asif','asif','USER'),(16,'meer.com','meer','shaik','USER'),(17,'chandupoorna582@gmail.com','chandu','chandu','USER'),(20,'sam.com','samsung','exynos','USER'),(21,'chandupoorna582@gmail.com','chandupoorna582','9951793865','USER'),(22,'shaik@gmail.com','shaik','shaik','USER'),(23,'kiran.com','kiran','kiran','USER'),(26,'cricbuzz.com','cricket','cric','USER'),(27,'moto.com','moto','motoedge','USER'),(28,'relame.com','realme','realme','USER'),(29,'mac.com','macbook','macbook','USER');
/*!40000 ALTER TABLE user ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-08-26 15:39:32
