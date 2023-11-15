-- Eliminar al paquete con código 2
DELETE
FROM Problema_paquetes_camioneros.PAQUETE
WHERE Problema_paquetes_camioneros.PAQUETE.CODIGO = 2;

-- Eliminar a toda la información de la tabla Provincia
DELETE FROM Problema_paquetes_camioneros.PAQUETE;
DELETE FROM Problema_paquetes_camioneros.PROVINCIA;