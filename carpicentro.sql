-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema carpicentro
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `carpicentro` ;

-- -----------------------------------------------------
-- Schema carpicentro
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `carpicentro` DEFAULT CHARACTER SET utf8 ;
USE `carpicentro` ;

-- -----------------------------------------------------
-- Table `carpicentro`.`cliente`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `carpicentro`.`cliente` ;

CREATE TABLE IF NOT EXISTS `carpicentro`.`cliente` (
  `numeroCliente` INT(11) NOT NULL AUTO_INCREMENT,
  `nombreCliente` VARCHAR(45) NOT NULL,
  `apellidoPaternoCliente` VARCHAR(45) NOT NULL,
  `apellidoMaternoCliente` VARCHAR(45) NOT NULL,
  `telefonoCliente` INT(11) NOT NULL,
  `correoElectronico` VARCHAR(30) NOT NULL,
  `celularCliente` INT(11) NOT NULL,
  `direccion` VARCHAR(60) NOT NULL,
  `rfc` VARCHAR(13) NOT NULL,
  PRIMARY KEY (`numeroCliente`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `carpicentro`.`solicitud`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `carpicentro`.`solicitud` ;

CREATE TABLE IF NOT EXISTS `carpicentro`.`solicitud` (
  `folio` INT(11) NOT NULL AUTO_INCREMENT,
  `cliente_numeroCliente` INT(11) NOT NULL,
  `fecha` DATE NOT NULL,
  `fechaEntrega` DATE NOT NULL,
  `numeroPlano` INT(11) NOT NULL,
  `estado` VARCHAR(40) NOT NULL,
  `color` VARCHAR(30) NOT NULL,
  `medida` VARCHAR(30) NOT NULL,
  `tipoMadera` VARCHAR(30) NOT NULL,
  `acabado` VARCHAR(30) NOT NULL,
  PRIMARY KEY (`folio`),
  INDEX `fk_solicitud_cliente1_idx` (`cliente_numeroCliente` ASC),
  CONSTRAINT `fk_solicitud_cliente1`
    FOREIGN KEY (`cliente_numeroCliente`)
    REFERENCES `carpicentro`.`cliente` (`numeroCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `carpicentro`.`evaluaciones`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `carpicentro`.`evaluaciones` ;

CREATE TABLE IF NOT EXISTS `carpicentro`.`evaluaciones` (
  `solicitud_folio` INT(11) NOT NULL,
  INDEX `fk_evaluciones_solicitud1_idx` (`solicitud_folio` ASC),
  PRIMARY KEY (`solicitud_folio`),
  CONSTRAINT `fk_evaluciones_solicitud1`
    FOREIGN KEY (`solicitud_folio`)
    REFERENCES `carpicentro`.`solicitud` (`folio`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `carpicentro`.`evaluacion_fabricacion`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `carpicentro`.`evaluacion_fabricacion` ;

CREATE TABLE IF NOT EXISTS `carpicentro`.`evaluacion_fabricacion` (
  `evaluciones_solicitud_folio` INT(11) NOT NULL,
  `superficieMadera` TINYINT(1) NOT NULL,
  `comentarioSuperficie` VARCHAR(50) NOT NULL,
  `imperfeccionMadera` TINYINT(1) NOT NULL,
  `comentarioImperfeccion` VARCHAR(50) NOT NULL,
  `tipoMadera` TINYINT(1) NOT NULL,
  `comentarioTipoMadera` VARCHAR(50) NOT NULL,
  INDEX `fk_evaluacion_fabricacion_evaluciones1_idx` (`evaluciones_solicitud_folio` ASC),
  PRIMARY KEY (`evaluciones_solicitud_folio`),
  CONSTRAINT `fk_evaluacion_fabricacion_evaluciones1`
    FOREIGN KEY (`evaluciones_solicitud_folio`)
    REFERENCES `carpicentro`.`evaluaciones` (`solicitud_folio`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `carpicentro`.`evaluacion_lijado`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `carpicentro`.`evaluacion_lijado` ;

CREATE TABLE IF NOT EXISTS `carpicentro`.`evaluacion_lijado` (
  `evaluciones_solicitud_folio` INT(11) NOT NULL,
  `superficieLijada` TINYINT(1) NOT NULL,
  `comentarioSuperficieLijada` VARCHAR(50) NOT NULL,
  `imperfeccionLijada` TINYINT(1) NOT NULL,
  `comentarioImperfeccionLijada` VARCHAR(50) NOT NULL,
  INDEX `fk_evaluacion_lijado_evaluciones1_idx` (`evaluciones_solicitud_folio` ASC),
  PRIMARY KEY (`evaluciones_solicitud_folio`),
  CONSTRAINT `fk_evaluacion_lijado_evaluciones1`
    FOREIGN KEY (`evaluciones_solicitud_folio`)
    REFERENCES `carpicentro`.`evaluaciones` (`solicitud_folio`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `carpicentro`.`evaluacion_pintura`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `carpicentro`.`evaluacion_pintura` ;

CREATE TABLE IF NOT EXISTS `carpicentro`.`evaluacion_pintura` (
  `evaluciones_solicitud_folio` INT(11) NOT NULL,
  `tinteMadera` TINYINT(1) NOT NULL,
  `comentarioTinte` VARCHAR(50) NOT NULL,
  `acabadoMadera` TINYINT(1) NOT NULL,
  `comentarioAcabado` VARCHAR(50) NOT NULL,
  `detalladoMadera` TINYINT(1) NOT NULL,
  `comentarioDetallado` VARCHAR(50) NOT NULL,
  INDEX `fk_evaluacion_pintura_evaluciones1_idx` (`evaluciones_solicitud_folio` ASC),
  PRIMARY KEY (`evaluciones_solicitud_folio`),
  CONSTRAINT `fk_evaluacion_pintura_evaluciones1`
    FOREIGN KEY (`evaluciones_solicitud_folio`)
    REFERENCES `carpicentro`.`evaluaciones` (`solicitud_folio`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `carpicentro`.`usuario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `carpicentro`.`usuario` ;

CREATE TABLE IF NOT EXISTS `carpicentro`.`usuario` (
  `tipoUsuario` VARCHAR(30) NOT NULL,
  `nombreUsuario` VARCHAR(30) NOT NULL,
  `contrasena` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`tipoUsuario`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
