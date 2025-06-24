package com.carrera360.app_carrera360.apiperfil.repository;

import com.carrera360.app_carrera360.apiperfil.model.Logros;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

public interface LogrosRepository extends Repository<Logros, Integer> {

    @Query("SELECT COUNT(l) FROM Logros l")
    long contarTotal();
}