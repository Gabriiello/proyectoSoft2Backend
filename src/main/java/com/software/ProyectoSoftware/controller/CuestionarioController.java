package com.software.ProyectoSoftware.controller;

import com.software.ProyectoSoftware.Models.Cuestionario;
import com.software.ProyectoSoftware.dao.CuestionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/cuestionarios")
public class CuestionarioController {
    @Autowired
    private CuestionarioService cuestionarioService;

    @GetMapping
    public List<Cuestionario> getAllCuestionarios() {
        return cuestionarioService.getAllCuestionarios();
    }

    @GetMapping("/{id}")
    public Optional<Cuestionario> getCuestionarioById(@PathVariable Long id) {
        return cuestionarioService.getCuestionarioById(id);
    }

    @PostMapping
    public Cuestionario createCuestionario(@RequestBody Cuestionario cuestionario) {
        return cuestionarioService.saveCuestionario(cuestionario);
    }

    @PutMapping("/{id}")
    public Cuestionario updateCuestionario(@PathVariable Long id, @RequestBody Cuestionario cuestionario) {
        cuestionario.setId(id);
        return cuestionarioService.saveCuestionario(cuestionario);
    }

    @DeleteMapping("/{id}")
    public void deleteCuestionario(@PathVariable Long id) {
        cuestionarioService.deleteCuestionario(id);
    }
}
