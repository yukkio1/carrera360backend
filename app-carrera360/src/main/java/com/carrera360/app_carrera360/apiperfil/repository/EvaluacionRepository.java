package com.carrera360.app_carrera360.apiperfil.repository;

import com.carrera360.app_carrera360.apiperfil.model.Evaluacion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

public interface EvaluacionRepository extends Repository<Evaluacion, Integer> {

    @Query("SELECT COUNT(e) FROM Evaluacion e")
    long contarTotal();
}