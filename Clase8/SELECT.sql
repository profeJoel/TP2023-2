-- Recuperar informacion de tablas --
SELECT * 
FROM Problema_paquetes_camioneros.CAMION;

SELECT *
FROM Problema_paquetes_camioneros.CAMIONERO;

SELECT *
FROM Problema_paquetes_camioneros.CAMIONERO_has_CAMION;

SELECT *
FROM Problema_paquetes_camioneros.PAQUETE;

SELECT *
FROM Problema_paquetes_camioneros.PROVINCIA;

-- Consultas --
-- Consulta 1: Asociar los nombres de los camioneros a los paquetes que se han registrado --

SELECT *
FROM Problema_paquetes_camioneros.PAQUETE AS P, Problema_paquetes_camioneros.CAMIONERO AS C
WHERE P.CAMIONERO_ID = C.ID;

SELECT P.CODIGO, P.DESCRIPCION, P.DESTINATARIO, P.DIRECCION, C.NOMBRE
FROM Problema_paquetes_camioneros.PAQUETE AS P, Problema_paquetes_camioneros.CAMIONERO AS C
WHERE P.CAMIONERO_ID = C.ID;

-- BUscar los envíos que fueron a la Provincia de Chiloe --

SELECT P.CODIGO, P.DESCRIPCION, P.DESTINATARIO, P.DIRECCION, F.NOMBRE, C.NOMBRE
FROM Problema_paquetes_camioneros.PAQUETE AS P, Problema_paquetes_camioneros.CAMIONERO AS C, Problema_paquetes_camioneros.PROVINCIA AS F
WHERE P.CAMIONERO_ID = C.ID AND P.PROVINCIA_CODIGO = F.CODIGO AND F.NOMBRE = "Chiloe";

-- Indicar el camion que tuvo un viaje a Chiloe --

SELECT CA.PATENTE, CA.MODELO, CC.FECHA
FROM Problema_paquetes_camioneros.PAQUETE AS P, Problema_paquetes_camioneros.CAMIONERO AS C, Problema_paquetes_camioneros.PROVINCIA AS F, Problema_paquetes_camioneros.CAMION AS CA, Problema_paquetes_camioneros.CAMIONERO_has_CAMION AS CC
WHERE P.CAMIONERO_ID = C.ID AND P.PROVINCIA_CODIGO = F.CODIGO AND F.NOMBRE = "Chiloe" AND C.ID = CC.CAMIONERO_ID AND CC.CAMION_idCAMION = CA.idCAMION;