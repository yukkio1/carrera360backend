package com.carrera360.app_carrera360.apilogro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogroService {

    @Autowired
    private LogrosPerfilRepository logrosPerfilRepository;

    public List<LogrosPerfil> getLogrosByUsuario(int idUsuario) {
        return logrosPerfilRepository.findByIdUsuario(idUsuario);
    }
}