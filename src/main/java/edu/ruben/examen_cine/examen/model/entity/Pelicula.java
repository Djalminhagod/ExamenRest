package edu.ruben.examen_cine.examen.model.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pelicula")

public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pelicula_id")
    private long id_pelicula;

    @Column(name = "titulo", length = 150, nullable = false, unique = true)
    private String titulo;

    @Column(name = "director", length = 100, nullable = false)
    private String director;

    @Column(name = "anion")
    private int anion;

    @Column(name = "duracion")
    private int minutos;

    public long getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(long id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnion() {
        return anion;
    }

    public void setAnion(int anion) {
        this.anion = anion;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

}
