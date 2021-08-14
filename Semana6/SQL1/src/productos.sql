-- Crear BD Lista Productos
CREATE database Lista_productos;
use Lista_Productos;
CREATE TABLE productos(
    Referencia VARCHAR(50) PRIMARY KEY,
    Nombre VARCHAR(100) NOT NULL,
    Precio BIGINT(11) NOT NULL,
    Categoria VARCHAR(100) NOT NULL
);

DROP TABLE productos;

-- Insertar datos desde Archivo.csv
LOAD DATA infile 'C:\\Users\\sebas\\Documents\\Development\\MinTic\\Ciclo2MinTIC\\Semana6\\SQL1\\src\\Productos - Hoja 1.csv'
INTO TABLE productos
fields terminated BY ','
lines terminated BY '\r\n';

-- Consultas de Productos

SELECT * FROM productos WHERE Categoria = 'Bebidas' OR Categoria = 'Lacteos' ORDER BY Categoria;
SELECT * FROM productos WHERE Precio > 5000 AND Categoria = 'Reposteria';

-- Consultas resumen - Agrupando datos

SELECT Categoria,COUNT(referencia) FROM productos GROUP BY Categoria;
SELECT Categoria,COUNT(referencia), SUM(precio), AVG(precio), MIN(precio), MAX(precio) FROM productos GROUP BY Categoria;