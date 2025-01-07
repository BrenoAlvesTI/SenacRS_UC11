<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> c450c737a71acf335b855c0a1a2612704236b0fa
-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 27-Abr-2023 às 17:58
-- Versão do servidor: 10.4.24-MariaDB
-- versão do PHP: 8.1.6

<<<<<<< HEAD
>>>>>>> c450c737a71acf335b855c0a1a2612704236b0fa
=======
>>>>>>> c450c737a71acf335b855c0a1a2612704236b0fa
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `uc11`
--

<<<<<<< HEAD
<<<<<<< HEAD
CREATE DATABASE uc11_atv1;
USE uc11_atv1;
=======
-- --------------------------------------------------------
>>>>>>> c450c737a71acf335b855c0a1a2612704236b0fa
=======
-- --------------------------------------------------------
>>>>>>> c450c737a71acf335b855c0a1a2612704236b0fa

--
-- Estrutura da tabela `produtos`
--

CREATE TABLE `produtos` (
<<<<<<< HEAD
<<<<<<< HEAD
  `id` BIGINT(20) AUTO_INCREMENT PRIMARY KEY,
  `nome` TEXT NOT NULL,
  `valor` DECIMAL(10, 2) NOT NULL,
  `status` TEXT NOT NULL
=======
=======
>>>>>>> c450c737a71acf335b855c0a1a2612704236b0fa
  `id` bigint(20) UNSIGNED NOT NULL,
  `nome` text DEFAULT NULL,
  `valor` int(11) DEFAULT NULL,
  `status` text DEFAULT NULL
<<<<<<< HEAD
>>>>>>> c450c737a71acf335b855c0a1a2612704236b0fa
=======
>>>>>>> c450c737a71acf335b855c0a1a2612704236b0fa
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `produtos`
--

INSERT INTO `produtos` (`id`, `nome`, `valor`, `status`) VALUES
(2, 'PS4', 1500, 'Vendido'),
(3, 'Xbox 360', 800, 'Vendido'),
(4, 'Iphone 12', 4800, 'Vendido'),
(5, 'PS2', 400, 'A Venda');

--
-- Índices para tabelas despejadas
--

--
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> c450c737a71acf335b855c0a1a2612704236b0fa
-- Índices para tabela `produtos`
--
ALTER TABLE `produtos`
  ADD PRIMARY KEY (`id`);
<<<<<<< HEAD
>>>>>>> c450c737a71acf335b855c0a1a2612704236b0fa
=======
>>>>>>> c450c737a71acf335b855c0a1a2612704236b0fa

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `produtos`
--
ALTER TABLE `produtos`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
<<<<<<< HEAD
<<<<<<< HEAD

select * from produtos;
=======
>>>>>>> c450c737a71acf335b855c0a1a2612704236b0fa
=======
>>>>>>> c450c737a71acf335b855c0a1a2612704236b0fa
