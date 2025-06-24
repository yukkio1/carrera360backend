package com.carrera360.app_carrera360.apiperfil.repository;

import com.carrera360.app_carrera360.apiperfil.model.ModulosLeidos;
import com.carrera360.app_carrera360.apiperfil.model.ModulosLeidosId;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

public interface ModulosLeidosRepository extends Repository<ModulosLeidos, ModulosLeidosId> {

    @Query("SELECT COUNT(m) FROM ModulosLeidos m WHERE m.id.idUsuario = :idUsuario")
    long contarPorUsuario(int idUsuario);
}