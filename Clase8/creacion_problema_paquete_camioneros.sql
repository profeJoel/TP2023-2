-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Problema_paquetes_camioneros
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Problema_paquetes_camioneros
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Problema_paquetes_camioneros` DEFAULT CHARACTER SET utf8 ;
USE `Problema_paquetes_camioneros` ;

-- -----------------------------------------------------
-- Table `Problema_paquetes_camioneros`.`CAMIONERO`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Problema_paquetes_camioneros`.`CAMIONERO` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `RUN` VARCHAR(10) NOT NULL,
  `NOMBRE` VARCHAR(100) NOT NULL,
  `TELEFONO` INT ZEROFILL NULL,
  `DIRECCION` TEXT(100) NULL,
  `SUELDO` REAL NOT NULL,
  `POBLACION` VARCHAR(45) NULL,
  PRIMARY KEY (`ID`),
  UNIQUE INDEX `RUN_UNIQUE` (`RUN` ASC) VISIBLE,
  UNIQUE INDEX `ID_UNIQUE` (`ID` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Problema_paquetes_camioneros`.`PROVINCIA`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Problema_paquetes_camioneros`.`PROVINCIA` (
  `CODIGO` INT NOT NULL,
  `NOMBRE` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`CODIGO`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Problema_paquetes_camioneros`.`PAQUETE`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Problema_paquetes_camioneros`.`PAQUETE` (
  `CODIGO` INT NOT NULL AUTO_INCREMENT,
  `DESCRIPCION` TEXT(100) NOT NULL,
  `DESTINATARIO` VARCHAR(45) NOT NULL,
  `DIRECCION` TEXT(100) NOT NULL,
  `CAMIONERO_ID` INT NOT NULL,
  `PROVINCIA_CODIGO` INT NOT NULL,
  PRIMARY KEY (`CODIGO`, `CAMIONERO_ID`, `PROVINCIA_CODIGO`),
  INDEX `fk_PAQUETE_CAMIONERO_idx` (`CAMIONERO_ID` ASC) VISIBLE,
  INDEX `fk_PAQUETE_PROVINCIA1_idx` (`PROVINCIA_CODIGO` ASC) VISIBLE,
  CONSTRAINT `fk_PAQUETE_CAMIONERO`
    FOREIGN KEY (`CAMIONERO_ID`)
    REFERENCES `Problema_paquetes_camioneros`.`CAMIONERO` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_PAQUETE_PROVINCIA1`
    FOREIGN KEY (`PROVINCIA_CODIGO`)
    REFERENCES `Problema_paquetes_camioneros`.`PROVINCIA` (`CODIGO`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Problema_paquetes_camioneros`.`CAMION`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Problema_paquetes_camioneros`.`CAMION` (
  `idCAMION` INT NOT NULL AUTO_INCREMENT,
  `PATENTE` VARCHAR(6) NOT NULL,
  `MODELO` VARCHAR(45) NOT NULL,
  `TIPO` VARCHAR(45) NOT NULL,
  `POTENCIA` INT NULL,
  PRIMARY KEY (`idCAMION`),
  UNIQUE INDEX `PATENTE_UNIQUE` (`PATENTE` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Problema_paquetes_camioneros`.`CAMIONERO_has_CAMION`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Problema_paquetes_camioneros`.`CAMIONERO_has_CAMION` (
  `CAMIONERO_ID` INT NOT NULL,
  `CAMION_idCAMION` INT NOT NULL,
  `FECHA` DATETIME NOT NULL,
  PRIMARY KEY (`CAMIONERO_ID`, `CAMION_idCAMION`),
  INDEX `fk_CAMIONERO_has_CAMION_CAMION1_idx` (`CAMION_idCAMION` ASC) VISIBLE,
  INDEX `fk_CAMIONERO_has_CAMION_CAMIONERO1_idx` (`CAMIONERO_ID` ASC) VISIBLE,
  CONSTRAINT `fk_CAMIONERO_has_CAMION_CAMIONERO1`
    FOREIGN KEY (`CAMIONERO_ID`)
    REFERENCES `Problema_paquetes_camioneros`.`CAMIONERO` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_CAMIONERO_has_CAMION_CAMION1`
    FOREIGN KEY (`CAMION_idCAMION`)
    REFERENCES `Problema_paquetes_camioneros`.`CAMION` (`idCAMION`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
