package com.software.ProyectoSoftware.controller;

import com.software.ProyectoSoftware.Models.User;
import com.software.ProyectoSoftware.dao.daoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioController {
    @Autowired
    private daoUser daoUser;


    @RequestMapping(value="Usuario/registro", method= RequestMethod.POST)
    public void agregarUsuario(@RequestBody User nuevoUsuario) {
        //encriptamos pw



        //cambiamos por la  pw encriptada

        daoUser.agregar(nuevoUsuario);
    }
    @RequestMapping(value="Usuario/hola", method= RequestMethod.GET)

    public  Map<String, String> hola() {
        Map<String, String> json= new HashMap<>();
        json.put("Message","Hola");
        //encriptamos pw


        //cambiamos por la  pw encriptada
        return json;

    }
}
