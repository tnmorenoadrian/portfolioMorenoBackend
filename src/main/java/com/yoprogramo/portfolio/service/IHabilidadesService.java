/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.yoprogramo.portfolio.service;

import com.yoprogramo.portfolio.model.Habilidad;
import java.util.List;
/**
 *
 * @author Adrian
 */
public interface IHabilidadesService {

    public List<Habilidad> verHabilidades ();
    
    public void crearHabilidad (Habilidad newHabilidad);
    
    public void borrarHabilidad (Long id);
    
    public List<Habilidad> buscarHabilidades (int persona);
    
    public Habilidad updateHabilidad(Long id, Habilidad newHabilidad); 
    
}
