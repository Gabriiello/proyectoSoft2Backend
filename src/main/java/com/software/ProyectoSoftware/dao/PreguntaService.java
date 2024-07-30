package com.software.ProyectoSoftware.dao;
import com.software.ProyectoSoftware.Models.Pregunta;
import com.software.ProyectoSoftware.Models.PreguntaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PreguntaService {

    @Autowired
    private PreguntaRepository preguntaRepository;

    public List<Pregunta> getAllPreguntas() {
        return preguntaRepository.findAll();
    }

    public Optional<Pregunta> getPreguntaById(Long id) {
        return preguntaRepository.findById(id);
    }

    public Pregunta savePregunta(Pregunta pregunta) {
        return preguntaRepository.save(pregunta);
    }

    public void deletePregunta(Long id) {
        preguntaRepository.deleteById(id);
    }

}
