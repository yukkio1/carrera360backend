package com.carrera360.app_carrera360.ingreso.repository;

import com.carrera360.app_carrera360.ingreso.model.UsuarioIngreso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngresoRepository extends JpaRepository<UsuarioIngreso, Integer> {
    UsuarioIngreso findByUsuarioOrCorreo(String usuario, String correo);
}
