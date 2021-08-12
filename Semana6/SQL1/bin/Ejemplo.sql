-- SQL - es el Lenguaje de consulta estructural - Crear y Administrar BD
-- DDL - Lenguaje de definicion de datos - Crear estructura BD

CREATE database Libros_31;

use libros_31; -- Seleccionar la BD 

-- Crear tabla
CREATE table libro(
    CodigoLibro INT(4) PRIMARY KEY,
    Titulo VARCHAR(100) NOT NULL,
    Subtitulo VARCHAR(100),
    Paginas int(4) NOT NULL,
    ISBN VARCHAR(50) NOT NULL,
    Editorial VARCHAR(50) DEFAULT 'Planeta',
    Autor VARCHAR(50) NOT NULL
);

-- Estructura de la tabla
describe libro;

ALTER table libro add Precio int();

-- eliminar tabla -- Elimina datos
DROP table libro;

-- DML - Lenguaje de manipulacion de datos - CRUD 

-- DCL - Lenguaje de control de datos - Seguridad de los datos
