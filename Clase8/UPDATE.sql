-- Actualizar el valor de la columna Direccion del camionero Juan Perez
UPDATE Problema_paquetes_camioneros.CAMIONERO
SET Problema_paquetes_camioneros.CAMIONERO.DIRECCION = "Egaña 40"
WHERE Problema_paquetes_camioneros.CAMIONERO.ID = 1;

-- Actualizar el suelto para los camioneros que tienen un sueldo menor a 1.200.00.0.-
UPDATE Problema_paquetes_camioneros.CAMIONERO
SET Problema_paquetes_camioneros.CAMIONERO.SUELDO = 1200000.0
WHERE Problema_paquetes_camioneros.CAMIONERO.SUELDO < 1200000.0;

