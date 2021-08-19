CREATE TABLE estudiantes (
    Nombres VARCHAR(50) NOT NULL,
    Apellidos VARCHAR(50) NOT NULL,
    FechaNacimiento VARCHAR(50) NOT NULL,
    CorreoInstitucional VARCHAR(60) NOT NULL PRIMARY KEY,
    CorreoPersonal VARCHAR(50) NOT NULL,
    TelCel BIGINT NOT NULL,
    TelFijo BIGINT NOT NULL,
    Programa VARCHAR(50) NOT NULL 
);

LOAD DATA infile 'C:\\Users\\sebas\\Documents\\Development\\MinTic\\Ciclo2MinTIC\\Semana6\\RetoFinal06\\infoestudiantes.csv'
INTO TABLE productos
fields terminated BY ','
lines terminated BY '\r\n';
INSERT INTO estudiantes ( id, name, email, website )
VALUES (1, 'Pepe', 'pepe@hotmail.com','www.pepeton.com'); 

DROP TABLE estudiantes