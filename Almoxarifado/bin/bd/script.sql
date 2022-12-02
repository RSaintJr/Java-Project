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




