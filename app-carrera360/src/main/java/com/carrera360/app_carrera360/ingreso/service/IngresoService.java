package com.carrera360.app_carrera360.ingreso.service;

import com.carrera360.app_carrera360.ingreso.model.LoginRequest;
import com.carrera360.app_carrera360.ingreso.model.LoginResponse;
import com.carrera360.app_carrera360.ingreso.model.UsuarioIngreso;
import com.carrera360.app_carrera360.ingreso.repository.IngresoRepository;
import org.springframework.stereotype.Service;

@Service
public class IngresoService {
    private final IngresoRepository ingresoRepository;

    public IngresoService(IngresoRepository ingresoRepository) {
        this.ingresoRepository = ingresoRepository;
    }

    public LoginResponse loginUsuario(LoginRequest request) {
        UsuarioIngreso usuarioIngreso = ingresoRepository.findByUsuarioOrCorreo(request.getUsuario(),
                request.getUsuario());

        if (usuarioIngreso == null) {
            return new LoginResponse(null, null, null, null, null, null, null, "Usuario o correo incorrecto");
        }

        if (!usuarioIngreso.getContrasena().equals(request.getContrasena())) {
            return new LoginResponse(null, null, null, null, null, null, null, "Contraseña incorrecta");
        }

        return new LoginResponse(
                usuarioIngreso.getIdUsuario(),
                usuarioIngreso.getNombre(),
                usuarioIngreso.getApellido(),
                usuarioIngreso.getEdad(),
                usuarioIngreso.getCorreo(),
                usuarioIngreso.getUsuario(),
                usuarioIngreso.getFecha_creacion(),
                "Inicio de sesión exitoso");
    }
}
