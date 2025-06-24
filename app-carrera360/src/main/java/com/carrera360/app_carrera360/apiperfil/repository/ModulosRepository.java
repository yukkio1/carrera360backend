package com.carrera360.app_carrera360.apiperfil.repository;

import com.carrera360.app_carrera360.apiperfil.model.Modulos;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

public interface ModulosRepository extends Repository<Modulos, Integer> {

    @Query("SELECT COUNT(m) FROM Modulos m")
    long contarTotal();
}