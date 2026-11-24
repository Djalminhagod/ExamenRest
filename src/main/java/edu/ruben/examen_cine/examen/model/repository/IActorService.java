package edu.ruben.examen_cine.examen.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.ruben.examen_cine.examen.model.entity.Actor;

public interface IActorService extends JpaRepository<Long, Actor> {

}
