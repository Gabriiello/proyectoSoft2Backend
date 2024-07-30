package com.software.ProyectoSoftware.controller;
import com.software.ProyectoSoftware.Models.Respuesta;
import com.software.ProyectoSoftware.dao.RespuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/respuestas")
public class RespuestaController {
    @Autowired
    private RespuestaService respuestaService;

    @GetMapping
    public List<Respuesta> getAllRespuestas() {
        return respuestaService.getAllRespuestas();
    }

    @GetMapping("/{id}")
    public Optional<Respuesta> getRespuestaById(@PathVariable Long id) {
        return respuestaService.getRespuestaById(id);
    }

    @PostMapping
    public Respuesta createRespuesta(@RequestBody Respuesta respuesta) {
        return respuestaService.saveRespuesta(respuesta);
    }

    @PutMapping("/{id}")
    public Respuesta updateRespuesta(@PathVariable int id, @RequestBody Respuesta respuesta) {
        respuesta.setId(id);
        return respuestaService.saveRespuesta(respuesta);
    }

    @DeleteMapping("/{id}")
    public void deleteRespuesta(@PathVariable Long id) {
        respuestaService.deleteRespuesta(id);
    }
}
