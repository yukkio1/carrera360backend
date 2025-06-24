package com.carrera360.app_carrera360.registrousuario.repository;

import com.carrera360.app_carrera360.registrousuario.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    boolean existsByUsuario(String usuario);

    boolean existsByCorreo(String correo);

    Optional<Usuario> findByUsuario(String usuario);

    Optional<Usuario> findByCorreo(String correo);
}
