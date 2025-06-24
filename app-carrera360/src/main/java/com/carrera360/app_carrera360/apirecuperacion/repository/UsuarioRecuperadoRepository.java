package com.carrera360.app_carrera360.apirecuperacion.repository;

import com.carrera360.app_carrera360.apirecuperacion.model.UsuarioRecuperado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRecuperadoRepository extends JpaRepository<UsuarioRecuperado, Integer> {
    Optional<UsuarioRecuperado> findByCorreoAndNombreAndApellidoAndEdad(String correo, String nombre, String apellido,
            int edad);
}
