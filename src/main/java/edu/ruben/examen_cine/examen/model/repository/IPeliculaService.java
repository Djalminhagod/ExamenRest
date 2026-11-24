package edu.ruben.examen_cine.examen.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ruben.examen_cine.examen.model.entity.Pelicula;

public interface IPeliculaService extends JpaRepository<Long, Pelicula> {

}
