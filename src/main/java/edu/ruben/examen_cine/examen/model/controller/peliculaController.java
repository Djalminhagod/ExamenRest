package edu.ruben.examen_cine.examen.model.controller;

import org.hibernate.query.results.ResultSetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

public interface peliculaController {

    @PostMapping ("/api/peliculas")

    @GetMapping ("/api/peliculas")
    @GetMapping ("/api/peliculas/{id}")
    @PutMapping ("/api/peliculas/{id}")
    
    @DeleteMapping("/api/peliculas/{id}")

}
