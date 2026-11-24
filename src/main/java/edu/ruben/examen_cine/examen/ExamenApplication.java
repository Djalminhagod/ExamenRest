package edu.ruben.examen_cine.examen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.ruben.examen_cine.examen.model.repository.IActorService;

@SpringBootApplication
public class ExamenApplication {
	@Autowired

	public static void main(String[] args) {
		SpringApplication.run(ExamenApplication.class, args);
	}

}
