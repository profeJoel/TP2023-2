package com.biblioteca.libro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.libro.dao.LibroDao;

@Service
public class LibroService {

    @Autowired
    private LibroDao libroDao;

    public void fetchLibro(){
        libroDao.readLibroFromDB();
    }
}
