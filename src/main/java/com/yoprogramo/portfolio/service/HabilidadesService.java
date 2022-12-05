/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yoprogramo.portfolio.service;

import com.yoprogramo.portfolio.model.Habilidad;
import com.yoprogramo.portfolio.repository.HabilidadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Adrian
 */
@Service
public class HabilidadesService implements IHabilidadesService {

    @Autowired
    public HabilidadesRepository repoHabilidades;
    
    @Override
    public List<Habilidad> verHabilidades() {
       return repoHabilidades.findAll();
    }

    @Override
    public void crearHabilidad(Habilidad newHabilidad) {
       repoHabilidades.save(newHabilidad);
    }

    @Override
    public void borrarHabilidad(Long id) {
        repoHabilidades.deleteById(id);
    }

    @Override
    public List<Habilidad> buscarHabilidades(int persona) {
       return repoHabilidades.findByPersona(persona);
    }
    
    @Override
    public Habilidad updateHabilidad(Long id, Habilidad newHabilidad) {
        Habilidad habilidad = repoHabilidades.findById(id).get();
        newHabilidad.setId(habilidad.getId());
        return repoHabilidades.save(newHabilidad);
    }
    
    
}

