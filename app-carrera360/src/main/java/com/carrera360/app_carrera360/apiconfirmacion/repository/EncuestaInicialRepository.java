package com.carrera360.app_carrera360.apiconfirmacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.carrera360.app_carrera360.apiconfirmacion.model.EncuestaInicialRespuesta;

@Repository
public interface EncuestaInicialRepository extends JpaRepository<EncuestaInicialRespuesta, Integer> {
    boolean existsByIdUsuario(int idUsuario); // ✅ Ahora busca correctamente en la columna `id_usuario`
}
