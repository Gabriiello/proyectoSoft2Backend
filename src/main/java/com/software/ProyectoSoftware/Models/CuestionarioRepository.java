package com.software.ProyectoSoftware.Models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CuestionarioRepository extends JpaRepository<Cuestionario, Long> {
}
