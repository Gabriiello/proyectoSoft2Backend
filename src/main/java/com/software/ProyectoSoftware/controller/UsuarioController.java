package com.software.ProyectoSoftware.controller;

import com.software.ProyectoSoftware.Models.User;
import com.software.ProyectoSoftware.dao.daoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    @Autowired
    private daoUser daoUser;


    @RequestMapping(value="Usuario/login", method= RequestMethod.POST)
    public void agregarUsuario(@RequestBody User nuevoUsuario) {
        //encriptamos pw



        //cambiamos por la  pw encriptada

        daoUser.agregar(nuevoUsuario);
    }
}
