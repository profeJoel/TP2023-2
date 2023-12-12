package com.biblioteca.libro.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LibroDao {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void readLibroFromDB(){
        // Podemos modificar, manipular cualquier informacion desde la base de datos
        //queryForMap devuelve 1 tupla
        //Map<String, Object> resultado = this.jdbcTemplate.queryForMap("SELECT * FROM LIBRO WHERE codigo=?", 1);
        //queryFoList devuelve varias tuplas
        //List<Map<String, Object>> resultado = this.jdbcTemplate.queryForList("SELECT * FROM LIBRO WHERE codigo>?", 1);
        //List<Map<String, Object>> resultado = this.jdbcTemplate.queryForList("SELECT * FROM LIBRO");
        //List<Map<String, Object>> resultado = this.jdbcTemplate.queryForList("SELECT * FROM LIBRO AS L, TEMA AS T WHERE L.Tema_codigo = T.codigo AND T.descripcion = 'Romance'");
        //System.out.println(resultado);

        //Inserciones a la DB
        this.jdbcTemplate.execute("INSERT INTO LIBRO VALUES (4, 'Las aventuras de Nicolas', 'Tranki', 'hjb3kj2h345', 3)");
    }
}
