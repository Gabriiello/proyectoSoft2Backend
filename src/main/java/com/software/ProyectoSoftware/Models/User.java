package com.software.ProyectoSoftware.Models;
import jakarta.persistence.*;


@Entity(name="proyectosoft2")
@Table(name="User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "email")
    private String email;
    @Column(name = "pw")
    private String pw;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;


    public User() {

    }
    public User(String email, String pw, String nombre, String apellido) {
        this.email = email;
        this.pw = pw;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public  String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
