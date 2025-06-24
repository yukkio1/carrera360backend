package com.carrera360.app_carrera360.apilogro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository // ⬅️ Importante: esta anotación permite que Spring lo detecte como un bean
public interface LogrosPerfilRepository extends JpaRepository<LogrosPerfil, LogrosPerfilId> {

    List<LogrosPerfil> findByIdUsuario(int idUsuario);
}