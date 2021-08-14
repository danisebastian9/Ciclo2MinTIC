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