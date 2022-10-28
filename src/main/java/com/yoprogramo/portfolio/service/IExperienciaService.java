/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.yoprogramo.portfolio.service;

import com.yoprogramo.portfolio.model.Experiencia;
import java.util.List;

/**
 *
 * @author Adrian
 */
public interface IExperienciaService {
    
    public List<Experiencia> verExperiencias ();
    
    public void crearExperiencia (Experiencia newExperiencia);
    
    public void borrarExperiencia (Long id);
    
    public List<Experiencia> buscarExperiencia (int persona);
    
    public Experiencia updateExperiencia(Long id, Experiencia newExperiencia);    
}
