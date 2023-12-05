select * from mydb.LIBRO as L, mydb.TEMA as T
where L.TEMA_codigo = T.codigo and T.codigo = 1