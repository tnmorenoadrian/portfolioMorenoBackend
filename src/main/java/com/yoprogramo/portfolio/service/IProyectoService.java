/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.yoprogramo.portfolio.service;

import com.yoprogramo.portfolio.model.Proyecto;
import java.util.List;

/**
 *
 * @author Adrian
 */
public interface IProyectoService {
    
    public List<Proyecto> verProyectos ();
    
    public void crearProyecto (Proyecto newProyecto);
    
    public void borrarProyecto (Long id);
    
    public List<Proyecto> buscarProyecto (int persona);
    
    public Proyecto updateProyecto(Long id, Proyecto newProyecto);    
    
}
