-- Consulta de los Empleados contratados el año 2011
SELECT primer_nombre, appaterno
FROM empleado
WHERE fecha_contrato BETWEEN '2011/01/01' AND '2011/12/31';

SELECT primer_nombre, appaterno
FROM empleado
WHERE fecha_contrato LIKE '2011%';

-- Obtener los empleados que son administrativos y vendedores

SELECT e.primer_nombre, e.appaterno
FROM empleado AS e, tipo_empleado AS t
WHERE e.tipo_empleado = t.tipo_empleado 
AND t.desc_tipo_empleado IN ('Administrativo', 'Vendedor');


-- Obtener las comisiones total de todos los empleados

SELECT DISTINCT e.primer_nombre, e.appaterno, SUM(c.monto_comision) comision_total
FROM empleado AS e, ventas AS v, comision_ventas AS c
WHERE e.id_empleado = v.id_empleado AND v.nro_boleta = c.nro_boleta
group by e.primer_nombre, e.appaterno;






