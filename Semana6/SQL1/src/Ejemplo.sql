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
    ISBN VARCHAR(50) NOT NULL UNIQUE, -- no se puede repetir, unico para cada linea
    Editorial VARCHAR(50) DEFAULT 'Planeta',
    Autor VARCHAR(50) NOT NULL
    -- Fecha DATE '2020-02-15' Formato 'AAAA-MM-DD'
);

-- Estructura de la tabla
describe libro;

ALTER table libro add fecha DATE;

-- eliminar tabla -- Elimina datos
DROP table libro;

-- DML - Lenguaje de manipulacion de datos - CRUD 
-- Insertar datos a tabla

-- CREATE
INSERT INTO libro (CodigoLibro, Titulo, Subtitulo, Paginas, ISBN, Editorial, Autor) VALUES ('1001', 'La Ciencia de lo Cotidiano', NULL, '500', 'Lib001', 'Norma', 'Anonimo');
INSERT INTO libro (CodigoLibro, Titulo, Paginas, ISBN, Autor) VALUES (1002, 'Aprendiendo Java', 1500, 'Lib002', 'Pepito'); -- Insertar registros a la tabla
INSERT INTO libro (CodigoLibro, Titulo, Paginas, ISBN, Autor, fecha) VALUES (1003, 'Aprendiendo SQL', 200, 'Lib003', 'Maria', '2000-02-15');

-- READ
SELECT * from libro; -- Muestra todos los libros
SELECT codigoLibro, titulo, editorial from libro; -- Muestra solo 3 filas especificas
SELECT codigoLibro, titulo, editorial, autor from libro WHERE autor = "Maria"; -- Con criterio
SELECT codigoLibro, titulo, editorial, autor from libro WHERE CodigoLibro = 1003 AND autor = "Maria";



-- DCL - Lenguaje de control de datos - Seguridad de los datos
