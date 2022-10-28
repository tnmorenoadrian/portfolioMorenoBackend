/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yoprogramo.portfolio.service;

import com.yoprogramo.portfolio.model.Experiencia;
import com.yoprogramo.portfolio.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Adrian
 */
@Service
public class ExperienciaService implements IExperienciaService {

    @Autowired
    public ExperienciaRepository repoExperiencia;
    
    @Override
    public List<Experiencia> verExperiencias() {
       return repoExperiencia.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia newExperiencia) {
       repoExperiencia.save(newExperiencia);
    }

    @Override
    public void borrarExperiencia(Long id) {
        repoExperiencia.deleteById(id);
    }

    @Override
    public List<Experiencia> buscarExperiencia(int persona) {
       return repoExperiencia.findByPersona(persona);
    }
    
    @Override
    public Experiencia updateExperiencia(Long id, Experiencia newExperiencia) {
        Experiencia experiencia = repoExperiencia.findById(id).get();
        newExperiencia.setId(experiencia.getId());
        return repoExperiencia.save(newExperiencia);
    }
    
    
}
