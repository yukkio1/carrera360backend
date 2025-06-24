package com.carrera360.app_carrera360.apimodulofaltante;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ModuloFaltanteRepository extends JpaRepository<ModuloFalta, Integer> {

    @Query("SELECT mf FROM ModuloFalta mf WHERE mf.idModulo NOT IN (SELECT ml.idModulo FROM ModuloLeido ml WHERE ml.idUsuario = ?1)")
    List<ModuloFalta> findModulosFaltantesPorUsuario(int idUsuario);
}