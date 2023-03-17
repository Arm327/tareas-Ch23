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
-- Table `mydb`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`users` (
  `idtable1` VARCHAR(60) NOT NULL,
  `name` VARCHAR(60) NULL,
  `Apellido` VARCHAR(45) NULL,
  `Comida Fav` VARCHAR(50) NULL,
  `type` VARCHAR(45) NULL,
  PRIMARY KEY (`idtable1`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`pets`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`pets` (
  `idtable1` VARCHAR(60) NOT NULL,
  `name` VARCHAR(60) NULL,
  `Apellido` VARCHAR(45) NULL,
  `Comida Fav` VARCHAR(50) NULL,
  `type` VARCHAR(45) NULL,
  `users_idtable1` VARCHAR(60) NOT NULL,
  PRIMARY KEY (`idtable1`),
  INDEX `fk_pets_users_idx` (`users_idtable1` ASC) VISIBLE,
  CONSTRAINT `fk_pets_users`
    FOREIGN KEY (`users_idtable1`)
    REFERENCES `mydb`.`users` (`idtable1`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
