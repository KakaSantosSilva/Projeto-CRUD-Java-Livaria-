-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 27-Fev-2023 às 15:17
-- Versão do servidor: 10.4.24-MariaDB
-- versão do PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `jbooker`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `book`
--

CREATE TABLE `book` (
  `id` int(11) NOT NULL,
  `title` varchar(200) NOT NULL,
  `author` varchar(200) NOT NULL,
  `isbn` varchar(50) NOT NULL,
  `pages` int(11) NOT NULL,
  `price` double(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `book`
--

INSERT INTO `book` (`id`, `title`, `author`, `isbn`, `pages`, `price`) VALUES
(1, 'Tartarugas Até Lá Embaixo', ' John Green', '978-8551002001', 256, 28.90),
(2, 'Garota exemplar', 'Gillian Flynn', '8580572908', 582, 42.21),
(3, 'O Homem de Giz', 'C. J. Tudor', '978-8551002933', 272, 42.90),
(4, 'Extraordinário', 'R J Palacio', '978-8580573015 ', 320, 42.99),
(5, 'Jogos vorazes', 'Suzanne Collins', '978-8579800245', 400, 46.12),
(6, 'Em chamas', 'Suzanne Collins', '978-6555320749', 416, 37.42),
(7, 'A esperança ', 'Suzanne Collins', '978-6555320756 ', 424, 37.42),
(8, 'Crepúsculo', 'Stephenie Meyer', '978-8598078304 ', 480, 44.90),
(9, 'Lua Nova', 'Stephenie Meyer', '978-8598078359 ', 401, 42.99),
(10, 'Eclipse', 'Stephenie Meyer', '978-8598078410', 464, 40.90),
(11, 'Amanhecer', 'Stephenie Meyer', '978-8598078465 ', 567, 27.88),
(12, 'A revolução dos bichos: Um conto de fadas', 'George Orwell', '978-8535909555 ', 152, 11.70);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `book`
--
ALTER TABLE `book`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
