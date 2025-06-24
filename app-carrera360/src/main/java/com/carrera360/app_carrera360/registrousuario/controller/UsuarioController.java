package com.carrera360.app_carrera360.registrousuario.controller;

import com.carrera360.app_carrera360.registrousuario.model.Usuario;
import com.carrera360.app_carrera360.registrousuario.model.UsuarioResponse;
import com.carrera360.app_carrera360.registrousuario.model.UsuarioRol;
import com.carrera360.app_carrera360.registrousuario.repository.UsuarioRepository;
import com.carrera360.app_carrera360.registrousuario.repository.UsuarioRolRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    private final UsuarioRepository usuarioRepository;
    private final UsuarioRolRepository usuarioRolRepository;

    public UsuarioController(UsuarioRepository usuarioRepository, UsuarioRolRepository usuarioRolRepository) {
        this.usuarioRepository = usuarioRepository;
        this.usuarioRolRepository = usuarioRolRepository;
    }

    @PostMapping
    public ResponseEntity<UsuarioResponse> guardarUsuario(@RequestBody Usuario usuario) {
        if (usuarioRepository.existsByUsuario(usuario.getUsuario())) {
            return ResponseEntity.badRequest().body(new UsuarioResponse("Error: Usuario ya registrado ❌", false));
        }
        if (usuarioRepository.existsByCorreo(usuario.getCorreo())) {
            return ResponseEntity.badRequest().body(new UsuarioResponse("Error: Correo en uso ❌", false));
        }

        usuario.setFechaCreacion(LocalDateTime.now());
        Usuario nuevoUsuario = usuarioRepository.save(usuario);
        usuarioRepository.flush();

        if (nuevoUsuario.getIdUsuario() > 0) {
            UsuarioRol usuarioRol = new UsuarioRol(nuevoUsuario.getIdUsuario(), 2);
            usuarioRolRepository.save(usuarioRol);
        } else {
            return ResponseEntity.internalServerError().body(new UsuarioResponse("Error: ID no generado ❌", false));
        }

        return ResponseEntity.ok(new UsuarioResponse("Registro exitoso ✅", true));
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> listarUsuarios() {
        return ResponseEntity.ok(usuarioRepository.findAll());
    }
}
