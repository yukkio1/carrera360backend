package com.carrera360.app_carrera360.apiperfil.repository;

import com.carrera360.app_carrera360.apiperfil.model.EncuestaTotalRespuesta;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface EncuestaTotalRepository extends Repository<EncuestaTotalRespuesta, Integer> {

    @Query("SELECT e.respuesta FROM EncuestaTotalRespuesta e WHERE e.idUsuario = :idUsuario")
    List<String> obtenerRespuestasPorUsuario(int idUsuario);
}