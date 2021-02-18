-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3307
-- Tiempo de generación: 18-02-2021 a las 21:52:11
-- Versión del servidor: 8.0.21
-- Versión de PHP: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `ejemplo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `biblioteca`
--

CREATE TABLE `biblioteca` (
  `id` int NOT NULL,
  `isbn` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `autor` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `año` int DEFAULT NULL,
  `categoria` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `estado` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `nombre` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `biblioteca`
--

INSERT INTO `biblioteca` (`id`, `isbn`, `autor`, `año`, `categoria`, `estado`, `nombre`) VALUES
(3, '789798789789', 'Paco', 8978, 'Fantasia', 'disponible', 'Libro'),
(10, '5345349709', 'Homero', -850, 'Clásico', 'prestado', 'La Odisea'),
(12, '423423432', 'Homero', -800, 'Clásico', 'prestado', 'La Odisea'),
(13, '4546542417', 'Francisco Quevedo', 1626, 'Novela', 'disponible', 'El Buscón'),
(14, '937816592', 'Miguel de Cervantes', 1615, 'Novela', 'reparación', 'Don Quijote de la Mancha'),
(15, '42242352417', 'JK Rowling', 1998, 'Fantasia', 'prestado', 'Harry Potter y la piedra Filosofal'),
(16, '212389182', 'William Shakespeare', 1597, 'Clásico', 'reparación', 'Romeo y Julieta'),
(19, '73216491', 'JK Rowling', 2002, 'Fantasia', 'disponible', 'El prisionero de Azkaban');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `biblioteca`
--
ALTER TABLE `biblioteca`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
