package com.software.ProyectoSoftware.Models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "preguntas")
public class Pregunta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "cuestionario_id")
    private Cuestionario cuestionario;

    @Column(columnDefinition = "TEXT")
    private String texto;

    @OneToMany(mappedBy = "pregunta")
    private
    Set<Respuesta> respuestas;

    // Getters y Setters

    public int getId() {
        return id;
    }

    public Cuestionario getCuestionario() {
        return cuestionario;
    }

    public String getTexto() {
        return texto;
    }

    public Set<Respuesta> getRespuestas() {
        return respuestas;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCuestionario(Cuestionario cuestionario) {
        this.cuestionario = cuestionario;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setRespuestas(Set<Respuesta> respuestas) {
        this.respuestas = respuestas;
    }
}
