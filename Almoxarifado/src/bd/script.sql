-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema Almoxarifado
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Almoxarifado
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Almoxarifado` DEFAULT CHARACTER SET utf8 ;

-- -----------------------------------------------------
-- Table `Almoxarifado`.`nome`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Almoxarifado`.`pedido` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `descricao` VARCHAR(255) not null,
  `data` DATETIME not null,
  `saida` BOOL not null,
  `entrada` BOOL not null,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB;

-- almoxarifado.`local` definition

CREATE TABLE `local` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `setor` varchar(50) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- almoxarifado.estoque definition

CREATE TABLE `estoque` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `produto` bigint(100) NOT NULL,
  `ferramenta` bigint(100) NOT NULL,
  `componente` bigint(100) NOT NULL,
  PRIMARY KEY (`codigo`),
  CONSTRAINT `estoque_FK` FOREIGN KEY (`codigo`) REFERENCES `local` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;


