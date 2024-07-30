package com.software.ProyectoSoftware.controller;

import com.software.ProyectoSoftware.Models.Pregunta;
import com.software.ProyectoSoftware.dao.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/preguntas")

public class PreguntaController {
    @Autowired
    private PreguntaService preguntaService;

    @GetMapping
    public List<Pregunta> getAllPreguntas() {
        return preguntaService.getAllPreguntas();
    }

    @GetMapping("/{id}")
    public Optional<Pregunta> getPreguntaById(@PathVariable Long id) {
        return preguntaService.getPreguntaById(id);
    }

    @PostMapping
    public Pregunta createPregunta(@RequestBody Pregunta pregunta) {
        return preguntaService.savePregunta(pregunta);
    }

    @PutMapping("/{id}")
    public Pregunta updatePregunta(@PathVariable Long id, @RequestBody Pregunta pregunta) {
        pregunta.setId(id);
        return preguntaService.savePregunta(pregunta);
    }

    @DeleteMapping("/{id}")
    public void deletePregunta(@PathVariable Long id) {
        preguntaService.deletePregunta(id);
    }
}
