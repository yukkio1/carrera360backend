package com.carrera360.app_carrera360.apirecuperacion.service;

import com.carrera360.app_carrera360.apirecuperacion.model.RecuperacionRequest;
import com.carrera360.app_carrera360.apirecuperacion.repository.UsuarioRecuperadoRepository;
import org.springframework.stereotype.Service;

@Service
public class RecuperacionService {

    private final UsuarioRecuperadoRepository usuarioRepository;

    public RecuperacionService(UsuarioRecuperadoRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public String buscarContrasena(RecuperacionRequest req) {
        return usuarioRepository
                .findByCorreoAndNombreAndApellidoAndEdad(
                        req.getCorreo(),
                        req.getNombre(),
                        req.getApellido(),
                        req.getEdad())
                .map(usuario -> usuario.getContrasena())
                .orElse(null);
    }
}
