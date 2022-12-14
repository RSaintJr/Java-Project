-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema Almoxarifado
-- -----------------------------------------------------

CREATE SCHEMA IF NOT EXISTS `Almoxarifado` DEFAULT CHARACTER SET utf8 ;

-- -----------------------------------------------------
-- Table `Almoxarifado`.`pedido`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS `Almoxarifado`.`pedido` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `pessoa_codigo` int not null,
  `codProduto` INT NOT NULL,
  `entrada` BOOL not null,
  `data` DATETIME not null,
  PRIMARY KEY (`codigo`),
 foreign key (`pessoa_codigo`) references `pessoa` (`codigo`)
  )
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `Almoxarifado`.`local`
-- -----------------------------------------------------

CREATE table if not exists `Almoxarifado`.`local` (
  `codigo` INT not null auto_increment,
  `setor` varchar(50) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- -----------------------------------------------------
-- Table `Almoxarifado`.`estoque`
-- -----------------------------------------------------

CREATE table if not exists `Almoxarifado`.`estoque` (
  `codigo` INT not null auto_increment,
  `codigo_setor` int not null,
  `produto` bigint(100) NOT NULL,
  `ferramenta` bigint(100) NOT NULL,
  `componente` bigint(100) NOT NULL,
  PRIMARY KEY (`codigo`),
  CONSTRAINT `estoque_FK` FOREIGN KEY (`codigo_setor`) REFERENCES `local` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- -----------------------------------------------------
-- Table `Almoxarifado`.`pedidos_estoque`
-- -----------------------------------------------------

create table if not exists `Almoxarifado`.`pedidos_estoque`(
	`codigo_pedido` int not null,
	`codigo_estoque` int not null,
	FOREIGN KEY (`codigo_estoque`) REFERENCES `estoque` (`codigo`),
	FOREIGN KEY (`codigo_pedido`) REFERENCES `pedido` (`codigo`),
	primary key (codigo_pedido,codigo_estoque)
) engine=InnoDB default CHARSET=utf8 collate=utf8_general_ci;

-- -----------------------------------------------------
-- Table `Almoxarifado`.`pessoa`
-- -----------------------------------------------------

create table if not exists `Almoxarifado`.`pessoa`(
	`codigo` int not null auto_increment,
	`nome` varchar(255) not null,
	`cpf` varchar(255) not null,
	`telefone` int not null,
	primary key (`codigo`)
)engine=InnoDB default CHARSET=utf8 collate=utf8_general_ci;


