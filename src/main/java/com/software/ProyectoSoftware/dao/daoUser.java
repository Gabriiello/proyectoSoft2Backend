package com.software.ProyectoSoftware.dao;

import com.software.ProyectoSoftware.Models.User;

import java.util.List;

public interface daoUser {
    List<User> getUsuarios();

    void eliminar(int id);

    void agregar(User NuevoUsuario);

    User iniciarSesion(User usuario);
}
