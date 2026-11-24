package edu.ruben.examen_cine.examen.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ruben.examen_cine.examen.model.entity.Reparto;

public interface IRepartoService extends JpaRepository<Long, Reparto> {

}
