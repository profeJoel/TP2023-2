-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`TEMA`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`TEMA` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `descripcion` TEXT(500) NOT NULL,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`LIBRO`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`LIBRO` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(50) NOT NULL,
  `autores` VARCHAR(100) NOT NULL,
  `ISBN` VARCHAR(20) NOT NULL,
  `TEMA_codigo` INT NOT NULL,
  PRIMARY KEY (`codigo`, `TEMA_codigo`),
  UNIQUE INDEX `ISBN_UNIQUE` (`ISBN` ASC) VISIBLE,
  INDEX `fk_LIBRO_TEMA_idx` (`TEMA_codigo` ASC) VISIBLE,
  CONSTRAINT `fk_LIBRO_TEMA`
    FOREIGN KEY (`TEMA_codigo`)
    REFERENCES `mydb`.`TEMA` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
