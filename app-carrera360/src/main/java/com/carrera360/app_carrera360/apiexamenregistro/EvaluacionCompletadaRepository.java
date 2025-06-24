package com.carrera360.app_carrera360.apiexamenregistro;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EvaluacionCompletadaRepository
        extends JpaRepository<EvaluacionCompletada, EvaluacionCompletadaId> {

    boolean existsByIdUsuarioAndIdEvaluacion(Integer idUsuario, Integer idEvaluacion);
}
