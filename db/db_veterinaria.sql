-- phpMyAdmin SQL Dump
-- version 5.3.0-dev+20221117.561d9ca705
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-02-2023 a las 20:47:31
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `db_veterinaria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_cita`
--

CREATE TABLE `tb_cita` (
  `id_cita` int(11) NOT NULL,
  `fecha_registro` date DEFAULT current_timestamp(),
  `fecha_reserva` date DEFAULT NULL,
  `estado` int(11) DEFAULT NULL COMMENT '1 cancelado, 0 no cancelado',
  `fk_dni` varchar(50) DEFAULT NULL,
  `fk_id_pet` int(11) DEFAULT NULL,
  `eliminado` int(11) DEFAULT 0 COMMENT '0: no, 1: si'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tb_cita`
--

INSERT INTO `tb_cita` (`id_cita`, `fecha_registro`, `fecha_reserva`, `estado`, `fk_dni`, `fk_id_pet`, `eliminado`) VALUES
(1, '2023-02-02', '2023-02-28', 1, '46464578', 2, 0),
(2, '2023-02-02', '2023-02-26', 1, '46464578', 3, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_customer`
--

CREATE TABLE `tb_customer` (
  `dni` varchar(10) NOT NULL,
  `names` varchar(40) DEFAULT NULL,
  `last_names` varchar(40) DEFAULT NULL,
  `telefono` varchar(20) DEFAULT NULL,
  `eliminado` int(11) DEFAULT 0 COMMENT '0: no, 1: si'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tb_customer`
--

INSERT INTO `tb_customer` (`dni`, `names`, `last_names`, `telefono`, `eliminado`) VALUES
('46464578', 'Renato Anthony', 'Valdivia Santos', '123123123', 0),
('73171689', 'Yasuhiro Yannick', 'Funes Santos', '789789798', 0),
('78541278', 'Marcos Jesus', 'Funes Chavez', '789456123', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_pets`
--

CREATE TABLE `tb_pets` (
  `id_pet` int(11) NOT NULL,
  `pet_name` varchar(40) DEFAULT NULL,
  `age` int(11) DEFAULT 0,
  `fk_dni` varchar(10) DEFAULT NULL,
  `fk_id_species` int(11) DEFAULT NULL,
  `fk_id_service` int(11) DEFAULT NULL,
  `fk_id_user` int(11) DEFAULT NULL,
  `eliminado` int(11) DEFAULT 0 COMMENT '0: no, 1: si'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tb_pets`
--

INSERT INTO `tb_pets` (`id_pet`, `pet_name`, `age`, `fk_dni`, `fk_id_species`, `fk_id_service`, `fk_id_user`, `eliminado`) VALUES
(2, 'Rufus', 4, '73171689', 2, 2, 1, 0),
(3, 'Roco', 4, '73171689', 1, 1, 2, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_service`
--

CREATE TABLE `tb_service` (
  `id_service` int(11) NOT NULL,
  `service_name` varchar(40) DEFAULT NULL,
  `eliminado` int(11) DEFAULT 0 COMMENT '0: no, 1: si'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tb_service`
--

INSERT INTO `tb_service` (`id_service`, `service_name`, `eliminado`) VALUES
(1, 'Baños y Estética', 0),
(2, 'Clínica Veterinaria', 0),
(3, 'Hospedaje de Mascotas', 0),
(4, 'Trámite de Viajes para Mascotas', 0),
(5, 'Cremación de Mascotas', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_species`
--

CREATE TABLE `tb_species` (
  `id_species` int(11) NOT NULL,
  `species_name` varchar(30) DEFAULT NULL,
  `eliminado` int(11) DEFAULT 0 COMMENT '0: no, 1: si'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tb_species`
--

INSERT INTO `tb_species` (`id_species`, `species_name`, `eliminado`) VALUES
(1, 'Perro', 0),
(2, 'Gato', 0),
(3, 'Pajaro', 0),
(4, 'Roedor', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_users`
--

CREATE TABLE `tb_users` (
  `id_user` int(11) NOT NULL,
  `names` varchar(40) DEFAULT NULL,
  `last_names` varchar(40) DEFAULT NULL,
  `user` varchar(30) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `eliminado` int(11) DEFAULT 0 COMMENT '0: no, 1: si'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tb_users`
--

INSERT INTO `tb_users` (`id_user`, `names`, `last_names`, `user`, `password`, `eliminado`) VALUES
(1, NULL, NULL, 'root', '63a9f0ea7bb98050796b649e85481845', 0),
(2, NULL, NULL, 'admin', '21232f297a57a5a743894a0e4a801fc3', 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tb_cita`
--
ALTER TABLE `tb_cita`
  ADD PRIMARY KEY (`id_cita`),
  ADD KEY `fk_dni` (`fk_dni`),
  ADD KEY `fk_id_pet` (`fk_id_pet`);

--
-- Indices de la tabla `tb_customer`
--
ALTER TABLE `tb_customer`
  ADD PRIMARY KEY (`dni`),
  ADD KEY `dni` (`dni`);

--
-- Indices de la tabla `tb_pets`
--
ALTER TABLE `tb_pets`
  ADD PRIMARY KEY (`id_pet`),
  ADD KEY `fk_dni` (`fk_dni`),
  ADD KEY `fk_id_species` (`fk_id_species`),
  ADD KEY `fk_id_service` (`fk_id_service`),
  ADD KEY `fk_id_user` (`fk_id_user`);

--
-- Indices de la tabla `tb_service`
--
ALTER TABLE `tb_service`
  ADD PRIMARY KEY (`id_service`),
  ADD KEY `id_service` (`id_service`);

--
-- Indices de la tabla `tb_species`
--
ALTER TABLE `tb_species`
  ADD PRIMARY KEY (`id_species`),
  ADD KEY `id_species` (`id_species`);

--
-- Indices de la tabla `tb_users`
--
ALTER TABLE `tb_users`
  ADD PRIMARY KEY (`id_user`),
  ADD KEY `id_user` (`id_user`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tb_cita`
--
ALTER TABLE `tb_cita`
  MODIFY `id_cita` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `tb_pets`
--
ALTER TABLE `tb_pets`
  MODIFY `id_pet` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `tb_service`
--
ALTER TABLE `tb_service`
  MODIFY `id_service` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `tb_species`
--
ALTER TABLE `tb_species`
  MODIFY `id_species` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `tb_users`
--
ALTER TABLE `tb_users`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `tb_cita`
--
ALTER TABLE `tb_cita`
  ADD CONSTRAINT `tb_cita_ibfk_1` FOREIGN KEY (`fk_dni`) REFERENCES `tb_customer` (`dni`),
  ADD CONSTRAINT `tb_cita_ibfk_2` FOREIGN KEY (`fk_id_pet`) REFERENCES `tb_pets` (`id_pet`);

--
-- Filtros para la tabla `tb_pets`
--
ALTER TABLE `tb_pets`
  ADD CONSTRAINT `tb_pets_ibfk_1` FOREIGN KEY (`fk_dni`) REFERENCES `tb_customer` (`dni`),
  ADD CONSTRAINT `tb_pets_ibfk_2` FOREIGN KEY (`fk_id_species`) REFERENCES `tb_species` (`id_species`),
  ADD CONSTRAINT `tb_pets_ibfk_3` FOREIGN KEY (`fk_id_service`) REFERENCES `tb_service` (`id_service`),
  ADD CONSTRAINT `tb_pets_ibfk_4` FOREIGN KEY (`fk_id_user`) REFERENCES `tb_users` (`id_user`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
