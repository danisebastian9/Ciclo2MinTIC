CREATE TABLE estudiantes (
    Nombres TEXT NOT NULL,
    Apellidos TEXT NOT NULL,
    FechaNacimiento TEXT NOT NULL,
    CorreoInstitucional INTEGER NOT NULL PRIMARY KEY,
    CorreoPersonal TEXT NOT NULL,
    TelCel INT NOT NULL,
    TelFijo INT NOT NULL,
    Programa TEXT NOT NULL );

LOAD DATA infile 'C:\\Users\\sebas\\Documents\\Development\\MinTic\\Ciclo2MinTIC\\Semana6\\RetoFinal06\\infoestudiantes.csv'
INTO TABLE productos
fields terminated BY ','
lines terminated BY '\r\n';
INSERT INTO estudiantes ( id, name, email, website )
VALUES (1, 'Pepe', 'pepe@hotmail.com','www.pepeton.com'); 

DROP TABLE estudiantes