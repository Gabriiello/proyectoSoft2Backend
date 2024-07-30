package com.software.ProyectoSoftware.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "respuestas")
public class Respuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pregunta_id")
    private Pregunta pregunta;

    @Column(columnDefinition = "TEXT")
    private String texto;

    @Column(name = "es_correcta")
    private boolean esCorrecta;

    // Getters y Setters

    public Long getId() {
        return id;
    }

    public Pregunta getPregunta() {
        return pregunta;
    }

    public String getTexto() {
        return texto;
    }

    public boolean isEsCorrecta() {
        return esCorrecta;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setEsCorrecta(boolean esCorrecta) {
        this.esCorrecta = esCorrecta;
    }
}
