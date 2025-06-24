package com.carrera360.app_carrera360.apiresiduo.service;

import com.carrera360.app_carrera360.apiresiduo.model.ResiduoResponse;
import com.carrera360.app_carrera360.apiresiduo.repository.ResiduoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ResiduoService {

    @Autowired
    private ResiduoRepository residuoRepository;

    public ResiduoResponse getResiduosByUserId(int id_usuario) {
        // Contar cuántos logros tiene el usuario
        int cantidadHecho = residuoRepository.countByIdUsuario(id_usuario);

        // Obtener IDs de logros del usuario
        List<Integer> idsLogros = residuoRepository.findIdLogroByIdUsuario(id_usuario);

        // Devolver nombres de logros (puedes usar otro repositorio para eso)
        List<String> nombreLogro = idsLogros.stream()
                .map(id -> "Logro #" + id) // Aquí deberías traer el nombre real desde otra tabla
                .collect(Collectors.toList());

        return new ResiduoResponse(cantidadHecho, nombreLogro);
    }
}