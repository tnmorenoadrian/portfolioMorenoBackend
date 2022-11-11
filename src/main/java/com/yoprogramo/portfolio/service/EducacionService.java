/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yoprogramo.portfolio.service;

import com.yoprogramo.portfolio.model.Educacion;
import com.yoprogramo.portfolio.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Adrian
 */
@Service
public class EducacionService implements IEducacionService {

    @Autowired
    public EducacionRepository servEducacion;
    
    @Override
    public List<Educacion> verEducaciones() {
       return servEducacion.findAll();
    }

    @Override
    public void crearEducacion(Educacion newEducacion) {
       servEducacion.save(newEducacion);
    }

    @Override
    public void borrarEducacion(Long id) {
        servEducacion.deleteById(id);
    }

    @Override
     public List<Educacion> buscarEducacion(int persona) {
       return servEducacion.findByPersona(persona);
    }
    
    @Override
    public Educacion updateEducacion(Long id, Educacion newEducacion) {
        Educacion educacion = servEducacion.findById(id).get();
        newEducacion.setId(educacion.getId());
        return servEducacion.save(newEducacion);
    }
    
    
}
