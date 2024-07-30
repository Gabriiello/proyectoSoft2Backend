package com.software.ProyectoSoftware.dao;


import com.software.ProyectoSoftware.Models.Usuario;
import com.software.ProyectoSoftware.Models.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> getUsuarioById(Long id) {
        return usuarioRepository.findById(id);
    }

    public Usuario saveUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public void deleteUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }

    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public void register(Usuario usuario) {
        usuario.setContraseña(passwordEncoder.encode(usuario.getContraseña()));
        usuarioRepository.save(usuario);
    }

    public boolean authenticate(Usuario usuario) {
        Usuario existingUser = usuarioRepository.findByEmail(usuario.getEmail());
        if (existingUser != null) {
            return passwordEncoder.matches(usuario.getContraseña(), existingUser.getContraseña());
        }
        return false;
    }
}
