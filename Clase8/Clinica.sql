-- Cuáles son los médicos que atieden en nov-2022

SELECT M.idm, m.nombrem
FROM medico as M, atiende as A
WHERE A.medico = M.idm AND 
A.fechaAtencion BETWEEN '2022-11-01 00:00:00' AND '2022-12-01 00:00:00';


-- Sub Consultas o Consultas anidadas
-- Cuales son las especialidades de los medicos que atienden en nov-2022
SELECT M.nombrem, M.nombreesp
FROM atiende as A, 
(SELECT me.idm, me.nombrem, E.nombreesp
FROM medico as me, tiene as T, especialidad as E
WHERE me.idm = T.idm AND T.codigoesp = E.CodigoEsp) AS M
WHERE A.medico = M.idm AND 
A.fechaAtencion BETWEEN '2022-11-01 00:00:00' AND '2022-12-01 00:00:00';

-- cuantas fueron las atenciones en nov-2022

SELECT COUNT(M.idm)
FROM medico as M, atiende as A
WHERE A.medico = M.idm AND 
A.fechaAtencion BETWEEN '2022-11-01 00:00:00' AND '2022-12-01 00:00:00';