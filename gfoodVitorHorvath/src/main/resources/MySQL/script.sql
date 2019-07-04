/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
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
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
                           `id` int(11) NOT NULL AUTO_INCREMENT,
                           `nome` varchar(100) NOT NULL,
                           `endereco` varchar(200) DEFAULT NULL,
                           `nascimento` date NOT NULL,
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'Jorge Ferreira','Rua Tecel José Ferreira Lameirão 77 - Apto 44','1990-07-18'),(2,'Hélio Pierazzo','Avenida Yoshi Nomiyama, 398','1936-07-27'),(3,'Vitor Horvath','Rua Nêspera,149','1996-03-07'),(4,'Thais Cocuzza','Rua Celeste de Souza Cardi, 112','1996-04-22');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produto`
--

DROP TABLE IF EXISTS `produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `produto` (
                           `id` int(11) NOT NULL AUTO_INCREMENT,
                           `nome` varchar(100) NOT NULL,
                           `descricao` varchar(200) DEFAULT NULL,
                           `preco` decimal(6,2) NOT NULL,
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produto`
--

LOCK TABLES `produto` WRITE;
/*!40000 ALTER TABLE `produto` DISABLE KEYS */;
INSERT INTO `produto` VALUES (1,'Mcpicanha','Delicioso hambúrguer de picanha, molho de picanha,\n cebola crispy, tomate, mix de folhas, e o irresistível queijo coalho',29.00),(2,'Big Tasty','O maior hambúrguer de carne 100% bovina do mcdonald’s,\n 3 deliciosas fatias de queijo, tomate, alface crocante,\n cebola e o saboroso molho tasty.',27.00),(3,'Big Mac','Dois hambúrgueres, alface, queijo e\n molho especial, cebola e picles num pão com gergelim.',19.00),(4,'McChicken','Frango empanado e dourado com \n molho suave e cremoso, acompanhado de alface crocante num pão com gergelim.',19.00),(5,'McVeggie','Delicioso sanduíche no pão brioche, cenoura ralada,\n tomate e alface fresquinho, molho maionese, molho pimenta biquinho e \n irresistível queijo coalho.',27.00);
/*!40000 ALTER TABLE `produto` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-07-03 14:34:19


