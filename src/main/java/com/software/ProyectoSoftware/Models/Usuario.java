package com.software.ProyectoSoftware.Models;
import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name="Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String email;

    private String contraseña;

    @Enumerated(EnumType.STRING)
    private Rol rol;

    @Column(name = "creado_en")
    private LocalDateTime creadoEn = LocalDateTime.now();

    // Getters y Setters

    public enum Rol {
        ADMIN, USUARIO
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public void setCreadoEn(LocalDateTime creadoEn) {
        this.creadoEn = creadoEn;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public Rol getRol() {
        return rol;
    }

    public LocalDateTime getCreadoEn() {
        return creadoEn;
    }
}
