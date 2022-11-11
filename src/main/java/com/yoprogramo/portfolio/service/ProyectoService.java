/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yoprogramo.portfolio.service;

import com.yoprogramo.portfolio.model.Proyecto;
import com.yoprogramo.portfolio.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Adrian
 */
@Service
public class ProyectoService implements IProyectoService {

    @Autowired
    public ProyectoRepository repoProyecto;
    
    @Override
    public List<Proyecto> verProyectos() {
       return repoProyecto.findAll();
    }

    @Override
    public void crearProyecto(Proyecto newProyecto) {
       repoProyecto.save(newProyecto);
    }

    @Override
    public void borrarProyecto(Long id) {
        repoProyecto.deleteById(id);
    }

    @Override
    public List<Proyecto> buscarProyecto(int persona) {
       return repoProyecto.findByPersona(persona);
    }
    
    @Override
    public Proyecto updateProyecto(Long id, Proyecto newProyecto) {
        Proyecto proyecto = repoProyecto.findById(id).get();
        newProyecto.setId(proyecto.getId());
        return repoProyecto.save(newProyecto);
    }
    
    
}
