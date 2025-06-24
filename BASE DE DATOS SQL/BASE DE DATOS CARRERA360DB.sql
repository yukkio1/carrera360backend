-- MySQL dump 10.13  Distrib 8.0.42, for Win64 (x86_64)
--
-- Host: localhost    Database: carrera360db
-- ------------------------------------------------------
-- Server version	8.0.42

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
-- Table structure for table `encuesta_inicial_alternativa`
--

DROP TABLE IF EXISTS `encuesta_inicial_alternativa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `encuesta_inicial_alternativa` (
  `id_alternativa` int NOT NULL AUTO_INCREMENT,
  `id_pregunta` int DEFAULT NULL,
  `texto_alternativa` varchar(255) NOT NULL,
  `impacto_perfil` varchar(255) NOT NULL,
  PRIMARY KEY (`id_alternativa`),
  KEY `id_pregunta` (`id_pregunta`),
  CONSTRAINT `encuesta_inicial_alternativa_ibfk_1` FOREIGN KEY (`id_pregunta`) REFERENCES `encuesta_inicial_pregunta` (`id_pregunta`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `encuesta_inicial_alternativa`
--

LOCK TABLES `encuesta_inicial_alternativa` WRITE;
/*!40000 ALTER TABLE `encuesta_inicial_alternativa` DISABLE KEYS */;
INSERT INTO `encuesta_inicial_alternativa` VALUES (1,1,'No estoy seguro','No cuento con una carrera'),(2,1,'Estoy explorando mis opciones','Estoy por encontrar mi carrera'),(3,1,'Tengo una carrera específica en mente','Ya decidí que estudiar'),(4,2,'No tengo experiencia','No cuento con experiencia'),(5,2,'Menos de un año','Cuento con menos de un año de experiencia'),(6,2,'Más de un año','Cuento con más de un año de experiencia'),(7,3,'Servicios públicos','Servicios públicos'),(8,3,'Software y tecnología','Software y tecnología'),(9,3,'Servicios financieros','Servicios financieros'),(10,3,'Educación','Educación'),(11,3,'Comercio y ventas','Comercio y ventas'),(12,3,'Industria creativa y medios','Industria creativa y medios'),(13,4,'Colaboración en equipo','Colaboración en equipo'),(14,4,'Pensamiento crítico','Pensamiento crítico'),(15,4,'Creatividad e innovación','Creatividad e innovación'),(16,5,'Actualización de habilidades','Actualización de Habilidades - Adaptabilidad y Crecimiento Profesional'),(17,5,'Mejorar habilidades de liderazgo','Desarrollo de Habilidades Clave - Red de Contactos y Confianza - Adaptabilidad y Crecimiento Profesional'),(18,5,'Obtener experiencia práctica en proyectos','Realidad Laboral y Adaptación - Transiciones Laborales y Evolución Profesional - Cómo Buscar Empleos'),(19,5,'Desarrollar networking y conexiones profesionales','Red de Contactos y Confianza - Marketing Personal y Visibilidad Profesional'),(20,5,'Dominar metodologías ágiles y gestión de proyectos','Gestión de Riesgos en la Carrera Profesional - Evaluación de Oportunidades y Crecimiento - Diseño y planificación de carrera');
/*!40000 ALTER TABLE `encuesta_inicial_alternativa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `encuesta_inicial_pregunta`
--

DROP TABLE IF EXISTS `encuesta_inicial_pregunta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `encuesta_inicial_pregunta` (
  `id_pregunta` int NOT NULL AUTO_INCREMENT,
  `texto_pregunta` varchar(255) NOT NULL,
  PRIMARY KEY (`id_pregunta`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `encuesta_inicial_pregunta`
--

LOCK TABLES `encuesta_inicial_pregunta` WRITE;
/*!40000 ALTER TABLE `encuesta_inicial_pregunta` DISABLE KEYS */;
INSERT INTO `encuesta_inicial_pregunta` VALUES (1,'¿Ya cuentas con una carrera en específico?'),(2,'¿Tienes experiencia en el mundo laboral?'),(3,'¿Cuál es su preferencia en cuanto a tipos de trabajo?'),(4,'¿Cuál de estas habilidades consideras más importante?'),(5,'¿Qué aspecto consideras más importante en tu desarrollo profesional?');
/*!40000 ALTER TABLE `encuesta_inicial_pregunta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `encuesta_inicial_respuesta`
--

DROP TABLE IF EXISTS `encuesta_inicial_respuesta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `encuesta_inicial_respuesta` (
  `id_respuesta` int NOT NULL AUTO_INCREMENT,
  `id_usuario` int DEFAULT NULL,
  `id_pregunta` int DEFAULT NULL,
  `id_alternativa` int DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL,
  `fecha_inicio_app` varchar(255) DEFAULT NULL,
  `respuesta` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_respuesta`),
  KEY `id_usuario` (`id_usuario`),
  KEY `id_pregunta` (`id_pregunta`),
  KEY `id_alternativa` (`id_alternativa`),
  CONSTRAINT `encuesta_inicial_respuesta_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`),
  CONSTRAINT `encuesta_inicial_respuesta_ibfk_2` FOREIGN KEY (`id_pregunta`) REFERENCES `encuesta_inicial_pregunta` (`id_pregunta`),
  CONSTRAINT `encuesta_inicial_respuesta_ibfk_3` FOREIGN KEY (`id_alternativa`) REFERENCES `encuesta_inicial_alternativa` (`id_alternativa`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `encuesta_inicial_respuesta`
--

LOCK TABLES `encuesta_inicial_respuesta` WRITE;
/*!40000 ALTER TABLE `encuesta_inicial_respuesta` DISABLE KEYS */;
INSERT INTO `encuesta_inicial_respuesta` VALUES (1,6,2,3,'1','2025-06-15 23:25:06','Ya decidí que estudiar'),(2,7,1,3,'1','2025-06-17 23:31:07.846167',NULL),(3,6,1,3,'1','2025-06-17 23:43:57.085094','Ya decidí que estudiar'),(4,23,1,3,'1','2025-06-18 00:02:50.66576','Ya decidí que estudiar'),(11,19,1,2,'1','2025-06-18 09:05:59.181505','Estoy por encontrar mi carrera'),(12,19,1,2,'1','2025-06-18 13:00:46.103208','Estoy por encontrar mi carrera'),(13,19,1,2,'1','2025-06-18 13:01:15.613964','Estoy por encontrar mi carrera'),(14,5,1,2,'1','2025-06-18 13:45:19.741034','Estoy por encontrar mi carrera'),(15,5,1,1,'1','2025-06-18 13:45:51.782704','No cuento con una carrera'),(16,7,1,1,'1','2025-06-18 13:56:19.037875','No cuento con una carrera'),(17,5,1,1,'1','2025-06-18 14:11:50.200516','No cuento con una carrera'),(18,3,1,1,'1','2025-06-18 14:59:57.094563','No cuento con una carrera'),(19,24,1,3,'1','2025-06-18 15:12:38.853402','Ya decidí que estudiar'),(20,25,1,3,'1','2025-06-18 15:22:02.216444','Ya decidí que estudiar'),(21,20,1,3,'1','2025-06-18 18:35:16.270743','Ya decidí que estudiar'),(22,20,2,6,'1','2025-06-18 18:35:17.656294','Cuento con más de un año de experiencia'),(26,20,4,15,'1','2025-06-18 18:49:59.744091','Creatividad e innovación'),(27,26,1,3,'1','2025-06-18 19:24:47.114338','Ya decidí que estudiar'),(28,26,2,6,'1','2025-06-18 19:24:48.337132','Cuento con más de un año de experiencia'),(29,26,3,8,'1','2025-06-18 19:24:53.140501','Software y tecnología'),(30,26,3,9,'1','2025-06-18 19:24:53.144506','Servicios financieros'),(31,26,3,10,'1','2025-06-18 19:24:53.150202','Educación'),(32,26,3,11,'1','2025-06-18 19:24:53.154706','Comercio y ventas'),(33,26,3,12,'1','2025-06-18 19:24:53.159227','Industria creativa y medios'),(34,26,4,15,'1','2025-06-18 19:24:55.217778','Creatividad e innovación'),(35,27,1,3,'1','2025-06-18 19:25:40.326354','Ya decidí que estudiar'),(36,27,2,6,'1','2025-06-18 19:25:41.714701','Cuento con más de un año de experiencia'),(37,27,3,11,'1','2025-06-18 19:25:43.514813','Comercio y ventas'),(38,27,3,12,'1','2025-06-18 19:25:43.521826','Industria creativa y medios'),(39,27,4,15,'1','2025-06-18 19:25:44.861687','Creatividad e innovación'),(40,28,1,3,'1','2025-06-18 19:36:32.247095','Ya decidí que estudiar'),(41,28,2,6,'1','2025-06-18 19:36:34.016077','Cuento con más de un año de experiencia'),(42,28,3,11,'1','2025-06-18 19:36:36.647949','Comercio y ventas'),(43,28,3,12,'1','2025-06-18 19:36:36.652956','Industria creativa y medios'),(44,28,4,15,'1','2025-06-18 19:36:41.152856','Creatividad e innovación'),(45,29,1,3,'1','2025-06-18 19:37:50.798654','Ya decidí que estudiar'),(46,29,2,6,'1','2025-06-18 19:37:52.330775','Cuento con más de un año de experiencia'),(47,29,3,10,'1','2025-06-18 19:37:54.562587','Educación'),(48,29,3,11,'1','2025-06-18 19:37:54.567694','Comercio y ventas'),(49,29,3,12,'1','2025-06-18 19:37:54.572704','Industria creativa y medios'),(50,29,4,15,'1','2025-06-18 19:37:55.998892','Creatividad e innovación'),(51,30,1,3,'1','2025-06-18 19:38:26.609891','Ya decidí que estudiar'),(52,30,2,6,'1','2025-06-18 19:38:27.696141','Cuento con más de un año de experiencia'),(53,30,3,12,'1','2025-06-18 19:38:29.544587','Industria creativa y medios'),(54,30,4,15,'1','2025-06-18 19:38:37.478982','Creatividad e innovación'),(55,30,5,20,'1','2025-06-18 19:47:59.375165','Gestión de Riesgos en la Carrera Profesional - Evaluación de Oportunidades y Crecimiento - Diseño y planificación de carrera'),(56,30,5,19,'1','2025-06-18 19:47:59.379175','Red de Contactos y Confianza - Marketing Personal y Visibilidad Profesional'),(57,30,5,18,'1','2025-06-18 19:47:59.382683','Realidad Laboral y Adaptación - Transiciones Laborales y Evolución Profesional - Cómo Buscar Empleos'),(58,30,5,17,'1','2025-06-18 19:47:59.386212','Desarrollo de Habilidades Clave - Red de Contactos y Confianza - Adaptabilidad y Crecimiento Profesional'),(59,35,1,3,'1','2025-06-18 21:45:08.829935','Ya decidí que estudiar'),(60,35,2,6,'1','2025-06-18 21:45:10.896734','Cuento con más de un año de experiencia'),(61,35,3,10,'1','2025-06-18 21:45:14.287602','Educación'),(62,35,3,11,'1','2025-06-18 21:45:14.290618','Comercio y ventas'),(63,35,3,12,'1','2025-06-18 21:45:14.294132','Industria creativa y medios'),(64,35,4,15,'1','2025-06-18 21:45:16.898312','Creatividad e innovación'),(65,35,5,20,'1','2025-06-18 21:45:20.413396','Gestión de Riesgos en la Carrera Profesional - Evaluación de Oportunidades y Crecimiento - Diseño y planificación de carrera'),(66,35,5,18,'1','2025-06-18 21:45:20.416582','Realidad Laboral y Adaptación - Transiciones Laborales y Evolución Profesional - Cómo Buscar Empleos'),(67,35,5,19,'1','2025-06-18 21:45:20.42009','Red de Contactos y Confianza - Marketing Personal y Visibilidad Profesional'),(68,35,5,17,'1','2025-06-18 21:45:20.422414','Desarrollo de Habilidades Clave - Red de Contactos y Confianza - Adaptabilidad y Crecimiento Profesional'),(69,8,1,3,'1','2025-06-19 10:48:47.775304','Ya decidí que estudiar'),(70,8,2,6,'1','2025-06-19 10:48:48.887335','Cuento con más de un año de experiencia'),(71,8,3,11,'1','2025-06-19 10:48:51.396117','Comercio y ventas'),(72,8,3,12,'1','2025-06-19 10:48:51.399621','Industria creativa y medios'),(73,8,4,15,'1','2025-06-19 10:48:52.899513','Creatividad e innovación'),(74,8,5,20,'1','2025-06-19 10:48:57.983773','Gestión de Riesgos en la Carrera Profesional - Evaluación de Oportunidades y Crecimiento - Diseño y planificación de carrera'),(75,8,5,19,'1','2025-06-19 10:48:57.987102','Red de Contactos y Confianza - Marketing Personal y Visibilidad Profesional'),(76,8,5,18,'1','2025-06-19 10:48:57.991099','Realidad Laboral y Adaptación - Transiciones Laborales y Evolución Profesional - Cómo Buscar Empleos'),(77,8,5,17,'1','2025-06-19 10:48:57.99531','Desarrollo de Habilidades Clave - Red de Contactos y Confianza - Adaptabilidad y Crecimiento Profesional'),(78,36,1,3,'1','2025-06-20 22:59:27.573829','Ya decidí que estudiar'),(79,36,2,6,'1','2025-06-20 22:59:28.63515','Cuento con más de un año de experiencia'),(80,36,3,11,'1','2025-06-20 22:59:30.392653','Comercio y ventas'),(81,36,3,12,'1','2025-06-20 22:59:30.395654','Industria creativa y medios'),(82,36,4,15,'1','2025-06-20 22:59:31.66061','Creatividad e innovación'),(83,36,5,20,'1','2025-06-20 22:59:34.848731','Gestión de Riesgos en la Carrera Profesional - Evaluación de Oportunidades y Crecimiento - Diseño y planificación de carrera'),(84,36,5,19,'1','2025-06-20 22:59:34.850731','Red de Contactos y Confianza - Marketing Personal y Visibilidad Profesional'),(85,36,5,18,'1','2025-06-20 22:59:34.854619','Realidad Laboral y Adaptación - Transiciones Laborales y Evolución Profesional - Cómo Buscar Empleos'),(86,36,5,17,'1','2025-06-20 22:59:34.856619','Desarrollo de Habilidades Clave - Red de Contactos y Confianza - Adaptabilidad y Crecimiento Profesional'),(87,37,1,3,'1','2025-06-20 23:00:16.001888','Ya decidí que estudiar'),(88,37,2,6,'1','2025-06-20 23:00:16.980236','Cuento con más de un año de experiencia'),(89,37,3,8,'1','2025-06-20 23:00:19.091697','Software y tecnología'),(90,37,3,9,'1','2025-06-20 23:00:19.094831','Servicios financieros'),(91,37,3,10,'1','2025-06-20 23:00:19.097831','Educación'),(92,37,4,15,'1','2025-06-20 23:00:21.242006','Creatividad e innovación'),(93,37,5,20,'1','2025-06-20 23:00:24.265481','Gestión de Riesgos en la Carrera Profesional - Evaluación de Oportunidades y Crecimiento - Diseño y planificación de carrera'),(94,37,5,19,'1','2025-06-20 23:00:24.268007','Red de Contactos y Confianza - Marketing Personal y Visibilidad Profesional'),(95,37,5,18,'1','2025-06-20 23:00:24.271014','Realidad Laboral y Adaptación - Transiciones Laborales y Evolución Profesional - Cómo Buscar Empleos'),(96,37,5,17,'1','2025-06-20 23:00:24.274219','Desarrollo de Habilidades Clave - Red de Contactos y Confianza - Adaptabilidad y Crecimiento Profesional'),(97,38,1,3,'1','2025-06-20 23:01:11.270514','Ya decidí que estudiar'),(98,48,1,3,'1','2025-06-21 20:33:42.916684','Ya decidí que estudiar'),(99,48,2,6,'1','2025-06-21 20:33:49.167726','Cuento con más de un año de experiencia'),(100,48,3,7,'1','2025-06-21 20:34:02.468997','Servicios públicos'),(101,48,3,8,'1','2025-06-21 20:34:02.473509','Software y tecnología'),(102,48,4,13,'1','2025-06-21 20:34:10.594935','Colaboración en equipo'),(103,48,5,20,'1','2025-06-21 20:34:25.94824','Gestión de Riesgos en la Carrera Profesional - Evaluación de Oportunidades y Crecimiento - Diseño y planificación de carrera'),(104,48,5,19,'1','2025-06-21 20:34:25.953241','Red de Contactos y Confianza - Marketing Personal y Visibilidad Profesional'),(105,48,5,18,'1','2025-06-21 20:34:25.957752','Realidad Laboral y Adaptación - Transiciones Laborales y Evolución Profesional - Cómo Buscar Empleos'),(106,48,5,17,'1','2025-06-21 20:34:25.961263','Desarrollo de Habilidades Clave - Red de Contactos y Confianza - Adaptabilidad y Crecimiento Profesional');
/*!40000 ALTER TABLE `encuesta_inicial_respuesta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `evaluacion`
--

DROP TABLE IF EXISTS `evaluacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `evaluacion` (
  `id_evaluacion` int NOT NULL AUTO_INCREMENT,
  `id_modulo` int DEFAULT NULL,
  `titulo` varchar(100) NOT NULL,
  `descripcion` text NOT NULL,
  PRIMARY KEY (`id_evaluacion`),
  KEY `id_modulo` (`id_modulo`),
  CONSTRAINT `evaluacion_ibfk_1` FOREIGN KEY (`id_modulo`) REFERENCES `modulos` (`id_modulo`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `evaluacion`
--

LOCK TABLES `evaluacion` WRITE;
/*!40000 ALTER TABLE `evaluacion` DISABLE KEYS */;
INSERT INTO `evaluacion` VALUES (1,7,'Evaluación ','Evaluación adicional para reforzar aprendizajes'),(2,8,'Evaluación Intermedia','Evaluación intermedia para reforzar conceptos'),(3,9,'Evaluación ','Evaluación adicional para reforzar aprendizajes'),(4,10,'Evaluación ','Evaluación adicional para reforzar aprendizajes'),(5,11,'Evaluación ','Evaluación adicional para reforzar aprendizajes'),(6,12,'Prueba Parcial','Prueba parcial para medir progreso'),(7,13,'Evaluación Extra','Evaluación adicional para reforzar aprendizajes'),(8,1,'Prueba Parcial','Prueba parcial para medir progreso'),(9,2,'Prueba Parcial','Prueba parcial para medir progreso'),(10,3,'Prueba Parcial','Prueba parcial para medir progreso'),(11,4,'Prueba Parcial','Prueba parcial para medir progreso'),(12,5,'Prueba Parcial','Prueba parcial para medir progreso'),(13,6,'Examen Final','Examen final del curso');
/*!40000 ALTER TABLE `evaluacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `evaluaciones_completadas`
--

DROP TABLE IF EXISTS `evaluaciones_completadas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `evaluaciones_completadas` (
  `id_usuario` int NOT NULL,
  `id_evaluacion` int NOT NULL,
  `fecha_completada` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id_usuario`,`id_evaluacion`),
  KEY `id_evaluacion` (`id_evaluacion`),
  CONSTRAINT `evaluaciones_completadas_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`),
  CONSTRAINT `evaluaciones_completadas_ibfk_2` FOREIGN KEY (`id_evaluacion`) REFERENCES `evaluacion` (`id_evaluacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `evaluaciones_completadas`
--

LOCK TABLES `evaluaciones_completadas` WRITE;
/*!40000 ALTER TABLE `evaluaciones_completadas` DISABLE KEYS */;
INSERT INTO `evaluaciones_completadas` VALUES (1,5,'2025-06-19 19:45:24'),(6,1,'2025-06-20 15:28:09'),(6,3,'2025-06-19 22:25:39'),(48,1,'2025-06-21 15:38:45'),(48,5,'2025-06-21 15:41:42');
/*!40000 ALTER TABLE `evaluaciones_completadas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `invitado_rol`
--

DROP TABLE IF EXISTS `invitado_rol`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `invitado_rol` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_rol` int NOT NULL,
  `id_usuario` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `invitado_rol`
--

LOCK TABLES `invitado_rol` WRITE;
/*!40000 ALTER TABLE `invitado_rol` DISABLE KEYS */;
INSERT INTO `invitado_rol` VALUES (1,1,1),(2,1,2);
/*!40000 ALTER TABLE `invitado_rol` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `invitado_usuario`
--

DROP TABLE IF EXISTS `invitado_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `invitado_usuario` (
  `id` int NOT NULL AUTO_INCREMENT,
  `apellido` varchar(255) DEFAULT NULL,
  `id_rol` int NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `nombre_usuario` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `invitado_usuario`
--

LOCK TABLES `invitado_usuario` WRITE;
/*!40000 ALTER TABLE `invitado_usuario` DISABLE KEYS */;
INSERT INTO `invitado_usuario` VALUES (1,'Automático',1,'Invitado','guest_1750126270'),(2,'Automático',1,'Invitado','guest_1750132508');
/*!40000 ALTER TABLE `invitado_usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `logros`
--

DROP TABLE IF EXISTS `logros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `logros` (
  `id_logro` int NOT NULL AUTO_INCREMENT,
  `nombre_logro` varchar(255) NOT NULL,
  PRIMARY KEY (`id_logro`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `logros`
--

LOCK TABLES `logros` WRITE;
/*!40000 ALTER TABLE `logros` DISABLE KEYS */;
INSERT INTO `logros` VALUES (1,'Finalizo  el curso de aprendizaje de la insercion laboral'),(2,'Finalizo  el curso de administracion de carrera');
/*!40000 ALTER TABLE `logros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `logros_perfil`
--

DROP TABLE IF EXISTS `logros_perfil`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `logros_perfil` (
  `id_usuario` int NOT NULL,
  `id_logro` int NOT NULL,
  `fecha_logro` varchar(255) DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_usuario`,`id_logro`),
  KEY `fk_logro_perfil` (`id_logro`),
  CONSTRAINT `fk_logro_perfil` FOREIGN KEY (`id_logro`) REFERENCES `logros` (`id_logro`) ON DELETE CASCADE,
  CONSTRAINT `logros_perfil_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `logros_perfil`
--

LOCK TABLES `logros_perfil` WRITE;
/*!40000 ALTER TABLE `logros_perfil` DISABLE KEYS */;
INSERT INTO `logros_perfil` VALUES (6,1,'2025-06-19',NULL),(6,2,'2025-06-22',NULL);
/*!40000 ALTER TABLE `logros_perfil` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `modulos`
--

DROP TABLE IF EXISTS `modulos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `modulos` (
  `id_modulo` int NOT NULL AUTO_INCREMENT,
  `nombre_modulo` varchar(255) NOT NULL,
  `vista` varchar(50) NOT NULL,
  PRIMARY KEY (`id_modulo`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `modulos`
--

LOCK TABLES `modulos` WRITE;
/*!40000 ALTER TABLE `modulos` DISABLE KEYS */;
INSERT INTO `modulos` VALUES (1,'Marketing personal y visibilidad profesional','INICIO'),(2,'Desarrollo de habilidades clave','INICIO'),(3,'Red de contactos y confianza','INICIO'),(4,'Realidad laboral y adaptación','INICIO'),(5,'Errores que dificultan la inserción laboral','INICIO'),(6,'Dominar entrevistas de trabajo','INICIO'),(7,'Diseño y planificación de carrera','APRENDER'),(8,'Adaptabilidad y crecimiento profesional','APRENDER'),(9,'Evaluación de oportunidades y crecimiento','APRENDER'),(10,'Gestión de riesgos en la carrera profesional','APRENDER'),(11,'Transiciones laborales y evolución profesional','APRENDER'),(12,'Cómo buscar empleos','APRENDER'),(13,'Actualización de habilidades','APRENDER');
/*!40000 ALTER TABLE `modulos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `modulos_leidos`
--

DROP TABLE IF EXISTS `modulos_leidos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `modulos_leidos` (
  `id_usuario` int NOT NULL,
  `id_modulo` int NOT NULL,
  `fecha_leido` varchar(255) DEFAULT NULL,
  `mes_leido` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_usuario`,`id_modulo`),
  KEY `id_modulo` (`id_modulo`),
  CONSTRAINT `modulos_leidos_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`),
  CONSTRAINT `modulos_leidos_ibfk_2` FOREIGN KEY (`id_modulo`) REFERENCES `modulos` (`id_modulo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `modulos_leidos`
--

LOCK TABLES `modulos_leidos` WRITE;
/*!40000 ALTER TABLE `modulos_leidos` DISABLE KEYS */;
INSERT INTO `modulos_leidos` VALUES (6,1,'2025-06-18 11:00:00','6'),(6,2,'2025-06-18 08:00:00','6'),(6,3,'2025-06-18 09:00:00','6'),(6,4,'2025-06-18 10:00:00','6'),(6,5,'2025-06-22 21:18:18','6'),(6,6,'2025-06-22 21:18:28','6'),(6,7,'2025-06-19 22:18:40','6'),(6,8,'2025-06-19 18:43:08','6'),(6,9,'2025-06-19 22:22:06','6'),(6,10,'2025-06-22 21:28:02','6'),(6,11,'2025-06-22 21:28:05','6'),(6,12,'2025-06-22 21:28:12','6'),(6,13,'2025-06-22 22:37:32','6'),(48,3,'2025-06-21 15:42:09','6'),(48,7,'2025-06-21 15:36:41','6'),(48,8,'2025-06-21 15:39:55','6'),(48,11,'2025-06-21 15:41:32','6');
/*!40000 ALTER TABLE `modulos_leidos` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `before_insert_modulos_leidos` BEFORE INSERT ON `modulos_leidos` FOR EACH ROW BEGIN
  SET NEW.fecha_leido = NOW();
  SET NEW.mes_leido = MONTH(NOW());
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `primerlogro` AFTER INSERT ON `modulos_leidos` FOR EACH ROW BEGIN
    DECLARE modulo_count INT;
    DECLARE logro_existe INT;

    -- Contamos los módulos leídos (1 a 6) del usuario
    SELECT COUNT(*) INTO modulo_count
    FROM modulos_leidos
    WHERE id_usuario = NEW.id_usuario
      AND id_modulo IN (1, 2, 3, 4, 5, 6);

    -- Verificamos si ya tiene registrado el logro #1
    SELECT COUNT(*) INTO logro_existe
    FROM logros_perfil
    WHERE id_usuario = NEW.id_usuario
      AND id_logro = 1;

    -- Si tiene todos los módulos y aún no tiene el logro, lo registramos
    IF modulo_count = 6 AND logro_existe = 0 THEN
        INSERT INTO logros_perfil (id_usuario, id_logro, fecha_logro)
        VALUES (NEW.id_usuario, 1, CURDATE());
    END IF;
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `segundologro` AFTER INSERT ON `modulos_leidos` FOR EACH ROW BEGIN
    -- Declaramos variables
    DECLARE modulo_count INT;
    DECLARE logro_existe INT;

    -- Contamos cuántos módulos (7, 8, 9, 10, 11, 12, 13) ha leído el usuario
    SELECT COUNT(*) INTO modulo_count
    FROM modulos_leidos
    WHERE id_usuario = NEW.id_usuario
      AND id_modulo IN (7, 8, 9, 10, 11, 12, 13);

    -- Verificamos si ya tiene registrado el logro #2
    SELECT COUNT(*) INTO logro_existe
    FROM logros_perfil
    WHERE id_usuario = NEW.id_usuario
      AND id_logro = 2;

    -- Si el usuario ha leído todos los módulos requeridos y aún no tiene el logro, lo registramos
    IF modulo_count = 7 AND logro_existe = 0 THEN
        INSERT INTO logros_perfil (id_usuario, id_logro, fecha_logro)
        VALUES (NEW.id_usuario, 2, CURDATE());
    END IF;
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `reconocimiento`
--

DROP TABLE IF EXISTS `reconocimiento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reconocimiento` (
  `id_reconocimiento` int NOT NULL AUTO_INCREMENT,
  `id_usuario` int DEFAULT NULL,
  `nombre_visita` enum('visita_1','visita_2','visita_3') DEFAULT NULL,
  `fecha_logro` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `tipo` enum('oro','plata','bronce') DEFAULT NULL,
  PRIMARY KEY (`id_reconocimiento`),
  KEY `id_usuario` (`id_usuario`),
  CONSTRAINT `reconocimiento_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reconocimiento`
--

LOCK TABLES `reconocimiento` WRITE;
/*!40000 ALTER TABLE `reconocimiento` DISABLE KEYS */;
/*!40000 ALTER TABLE `reconocimiento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `residuos`
--

DROP TABLE IF EXISTS `residuos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `residuos` (
  `id_residuo` int NOT NULL AUTO_INCREMENT,
  `nombre_residuo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_residuo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `residuos`
--

LOCK TABLES `residuos` WRITE;
/*!40000 ALTER TABLE `residuos` DISABLE KEYS */;
/*!40000 ALTER TABLE `residuos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `roles` (
  `id_rol` int NOT NULL AUTO_INCREMENT,
  `nombre_rol` varchar(50) NOT NULL,
  PRIMARY KEY (`id_rol`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
INSERT INTO `roles` VALUES (1,'invitado'),(2,'usuario'),(3,'admin');
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `uso_app`
--

DROP TABLE IF EXISTS `uso_app`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `uso_app` (
  `id_usuario` int NOT NULL,
  `fecha_inicio` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `fecha_fin` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id_usuario`,`fecha_inicio`),
  CONSTRAINT `uso_app_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `uso_app`
--

LOCK TABLES `uso_app` WRITE;
/*!40000 ALTER TABLE `uso_app` DISABLE KEYS */;
/*!40000 ALTER TABLE `uso_app` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario_ingreso`
--

DROP TABLE IF EXISTS `usuario_ingreso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario_ingreso` (
  `id` bigint NOT NULL,
  `contrasena` varchar(255) DEFAULT NULL,
  `correo` varchar(255) DEFAULT NULL,
  `usuario` varchar(255) DEFAULT NULL,
  `id_usuario` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario_ingreso`
--

LOCK TABLES `usuario_ingreso` WRITE;
/*!40000 ALTER TABLE `usuario_ingreso` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario_ingreso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `id_usuario` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NULL,
  `apellido` varchar(255) DEFAULT NULL,
  `edad` int DEFAULT '0',
  `correo` varchar(255) DEFAULT NULL,
  `contrasena` varchar(255) DEFAULT 'invitado123',
  `usuario` varchar(255) DEFAULT NULL,
  `fecha_creacion` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `fechaCreacion` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id_usuario`),
  UNIQUE KEY `usuario` (`usuario`),
  UNIQUE KEY `correo` (`correo`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'Demo','User',25,'demo@email.com','password123','demo_user','2025-06-16 04:20:06',NULL),(2,'Test','User',30,'test_user@email.com','password123','test_user','2025-06-16 04:34:01',NULL),(3,'Pedro','Ramirez',29,'test1@email.com','clave123','usuario1','2025-06-16 04:35:46',NULL),(4,'gato','gatoape',20,'gato@gmail.com','gato','gato','2025-06-16 04:41:51',NULL),(5,'gato','gatoape',45,'gato1@gmail.com','gato','gato1','2025-06-16 04:47:32',NULL),(6,'perro','perroape',40,'perro@gmail.com','perro','perro','2025-06-16 04:54:35',NULL),(7,'billy','billyape',24,'bill@gmail.com','billy','billy','2025-06-16 04:58:49',NULL),(8,'fido','fidoape',70,'fido@gmail.com','fido','fido','2025-06-16 05:03:04',NULL),(9,'Usuario','Invitado',30,'Invitado9022@gmail.com','invitado123','Invitado9022','2025-06-17 04:36:43',NULL),(10,'Usuario','Invitado',30,'Invitado5164@gmail.com','invitado123','Invitado5164','2025-06-17 04:48:49',NULL),(11,'Usuario','Invitado',30,'Invitado9442@gmail.com','invitado123','Invitado9442','2025-06-17 05:04:30',NULL),(12,'Usuario','Invitado',30,'Invitado8850@gmail.com','invitado123','Invitado8850','2025-06-17 21:19:50',NULL),(13,'Usuario','Invitado',30,'Invitado318@gmail.com','invitado123','Invitado318','2025-06-17 21:36:42',NULL),(14,'Usuario','Invitado',30,'Invitado6476@gmail.com','invitado123','Invitado6476','2025-06-17 21:37:46',NULL),(15,'Usuario','Invitado',30,'Invitado4492@gmail.com','invitado123','Invitado4492','2025-06-17 23:43:32',NULL),(16,'Usuario','Invitado',30,'Invitado3278@gmail.com','invitado123','Invitado3278','2025-06-18 00:57:31',NULL),(17,'Usuario','Invitado',30,'Invitado2966@gmail.com','invitado123','Invitado2966','2025-06-18 00:58:31',NULL),(18,'1Test','1User',25,'1test@email.com','1testpass','1testuser','2025-06-18 01:27:41',NULL),(19,'cat','catape',15,'cat@gmail.com','cat','cat','2025-06-18 01:35:30',NULL),(20,'Usuario','Invitado',30,'Invitado760@gmail.com','invitado123','Invitado760','2025-06-18 01:40:10',NULL),(21,'Usuario','Invitado',30,'Invitado3538@gmail.com','invitado123','Invitado3538','2025-06-18 04:45:38',NULL),(22,'Usuario','Invitado',30,'Invitado5852@gmail.com','invitado123','Invitado5852','2025-06-18 04:51:56',NULL),(23,'Usuario','Invitado',30,'Invitado9449@gmail.com','invitado123','Invitado9449','2025-06-18 05:02:47',NULL),(24,'Usuario','Invitado',30,'Invitado1114@gmail.com','invitado123','Invitado1114','2025-06-18 20:12:37',NULL),(25,'Usuario','Invitado',30,'Invitado8125@gmail.com','invitado123','Invitado8125','2025-06-18 20:22:00',NULL),(26,'Usuario','Invitado',30,'Invitado5595@gmail.com','invitado123','Invitado5595','2025-06-19 00:24:44',NULL),(27,'Usuario','Invitado',30,'Invitado1523@gmail.com','invitado123','Invitado1523','2025-06-19 00:25:38',NULL),(28,'Usuario','Invitado',30,'Invitado2153@gmail.com','invitado123','Invitado2153','2025-06-19 00:36:30',NULL),(29,'Usuario','Invitado',30,'Invitado408@gmail.com','invitado123','Invitado408','2025-06-19 00:37:49',NULL),(30,'Usuario','Invitado',30,'Invitado1177@gmail.com','invitado123','Invitado1177','2025-06-19 00:38:25',NULL),(31,'Usuario','Invitado',30,'Invitado2446@gmail.com','invitado123','Invitado2446','2025-06-19 02:17:02',NULL),(32,'Usuario','Invitado',30,'Invitado9919@gmail.com','invitado123','Invitado9919','2025-06-19 02:21:16',NULL),(33,'Usuario','Invitado',30,'Invitado8900@gmail.com','invitado123','Invitado8900','2025-06-19 02:33:05',NULL),(34,'Usuario','Invitado',30,'Invitado9493@gmail.com','invitado123','Invitado9493','2025-06-19 02:36:51',NULL),(35,'Usuario','Invitado',30,'Invitado8250@gmail.com','invitado123','Invitado8250','2025-06-19 02:44:54',NULL),(36,'Usuario','Invitado',30,'Invitado4533@gmail.com','invitado123','Invitado4533','2025-06-21 03:59:24',NULL),(37,'Usuario','Invitado',30,'Invitado9928@gmail.com','invitado123','Invitado9928','2025-06-21 04:00:14',NULL),(38,'Usuario','Invitado',30,'Invitado1405@gmail.com','invitado123','Invitado1405','2025-06-21 04:00:52',NULL),(39,'Usuario','Invitado',30,'Invitado4531@gmail.com','invitado123','Invitado4531','2025-06-21 04:02:43',NULL),(40,'Usuario','Invitado',30,'Invitado2952@gmail.com','invitado123','Invitado2952','2025-06-21 04:00:42',NULL),(41,'Usuario','Invitado',30,'Invitado8760@gmail.com','invitado123','Invitado8760','2025-06-21 04:00:42',NULL),(42,'Usuario','Invitado',30,'Invitado9311@gmail.com','invitado123','Invitado9311',NULL,NULL),(43,'Usuario','Invitado',30,'Invitado4142@gmail.com','invitado123','Invitado4142',NULL,NULL),(44,'Usuario','Invitado',30,'Invitado2223@gmail.com','invitado123','Invitado2223','2025-06-21 05:43:42',NULL),(45,'Usuario','Invitado',30,'Invitado7186@gmail.com','invitado123','Invitado7186','2025-06-21 11:28:10',NULL),(46,'Usuario','Invitado',30,'Invitado6863@gmail.com','invitado123','Invitado6863','2025-06-21 01:30:33','2025-06-21 06:30:33.771566'),(47,'Usuario','Invitado',30,'Invitado1196@gmail.com','invitado123','Invitado1196','2025-06-21 03:04:45','2025-06-21 08:04:45.399884'),(48,'prueba','prueba',25,'prueba123@gmail.com','123','prueba111','2025-06-22 01:33:16',NULL);
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios_roles`
--

DROP TABLE IF EXISTS `usuarios_roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios_roles` (
  `id_usuario` int NOT NULL,
  `id_rol` int NOT NULL DEFAULT '2',
  PRIMARY KEY (`id_usuario`),
  KEY `fk_roles` (`id_rol`),
  CONSTRAINT `fk_roles` FOREIGN KEY (`id_rol`) REFERENCES `roles` (`id_rol`) ON DELETE CASCADE,
  CONSTRAINT `usuarios_roles_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios_roles`
--

LOCK TABLES `usuarios_roles` WRITE;
/*!40000 ALTER TABLE `usuarios_roles` DISABLE KEYS */;
INSERT INTO `usuarios_roles` VALUES (9,1),(10,1),(11,1),(12,1),(13,1),(14,1),(15,1),(16,1),(17,1),(20,1),(21,1),(22,1),(23,1),(24,1),(25,1),(26,1),(27,1),(28,1),(29,1),(30,1),(31,1),(32,1),(33,1),(34,1),(35,1),(36,1),(37,1),(38,1),(39,1),(40,1),(41,1),(42,1),(43,1),(44,1),(45,1),(46,1),(47,1),(1,2),(2,2),(3,2),(4,2),(5,2),(6,2),(7,2),(8,2),(18,2),(19,2),(48,2);
/*!40000 ALTER TABLE `usuarios_roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'carrera360db'
--

--
-- Dumping routines for database 'carrera360db'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-06-23 22:51:49
