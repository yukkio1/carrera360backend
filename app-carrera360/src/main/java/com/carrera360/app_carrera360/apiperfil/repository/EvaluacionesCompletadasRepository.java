package com.carrera360.app_carrera360.apiperfil.repository;

import com.carrera360.app_carrera360.apiperfil.model.EvaluacionesCompletadas;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

public interface EvaluacionesCompletadasRepository extends Repository<EvaluacionesCompletadas, Integer> {

    @Query("SELECT COUNT(e) FROM EvaluacionesCompletadas e WHERE e.idUsuario = :idUsuario")
    long contarPorUsuario(int idUsuario);
}