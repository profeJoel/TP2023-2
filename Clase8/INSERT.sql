INSERT INTO Problema_paquetes_camioneros.CAMIONERO
VALUES (null,"111111-1", "Juan Pérez", 1111111, "Calle 1", 1000000, "poblacion 1"),
(null,"2222222-2", "Moncho Concha", 2222222, "Calle 2", 1200000, "poblacion 2");

INSERT INTO Problema_paquetes_camioneros.CAMIONERO (RUN, NOMBRE, SUELDO)
VALUES ("3333333-3", "Gerardo Mora", 100000);

INSERT INTO Problema_paquetes_camioneros.PROVINCIA 
VALUES (102,"Llanquihue"),
(101, "Osorno"),
(103, "Palena"),
(104, "Chiloe");

INSERT INTO Problema_paquetes_camioneros.CAMION (PATENTE, MODELO, TIPO, POTENCIA)
VALUES ("AABB00", "VOLVO", "tracto", 80),
("CCDD11", "Scania", "Acoplado", 120);

INSERT INTO Problema_paquetes_camioneros.PAQUETE
VALUES (null, "Envio Normal", "David Marquez", "Puerto Varas",3,102),
(null, "Envio Express", "Diego Teihuel", "Puerto Montt", 3, 102),
(null, "Envio Normal", "Nikito_tranqui", "Ancud", 1, 104);

INSERT INTO Problema_paquetes_camioneros.CAMIONERO_has_CAMION
VALUES (1,1,"2023-10-29");


INSERT INTO Problema_paquetes_camioneros.CAMIONERO_has_CAMION
VALUES (2,1,"2023-10-30"), (3,2, "2023-10-31");
