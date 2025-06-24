package com.carrera360.app_carrera360.apiresiduo.repository;

import com.carrera360.app_carrera360.apiresiduo.model.Residuo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ResiduoRepository extends CrudRepository<Residuo, Integer> {

    // Contar cuántos logros tiene el usuario
    @Query(value = "SELECT COUNT(*) FROM logros_perfil WHERE id_usuario = ?1", nativeQuery = true)
    int countByIdUsuario(int id_usuario);

    // Obtener lista de id_logro por id_usuario
    @Query(value = "SELECT id_logro FROM logros_perfil WHERE id_usuario = ?1", nativeQuery = true)
    List<Integer> findIdLogroByIdUsuario(int id_usuario);
}