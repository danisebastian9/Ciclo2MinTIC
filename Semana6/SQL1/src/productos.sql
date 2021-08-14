-- Crear BD Lista Productos
CREATE database Lista_productos;
use Lista_Productos;
CREATE TABLE productos(
    Referencia VARCHAR(50) PRIMARY KEY,
    Nombre VARCHAR(100) NOT NULL,
    Precio BIGINT(11) NOT NULL,
    Categoria VARCHAR(100) NOT NULL
);

