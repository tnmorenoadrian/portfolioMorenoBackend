/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.yoprogramo.portfolio.service;

import com.yoprogramo.portfolio.model.Educacion;
import java.util.List;

/**
 *
 * @author Adrian
 */
public interface IEducacionService {
    
    public List<Educacion> verEducaciones ();
    
    public void crearEducacion (Educacion newEducaciones);
    
    public void borrarEducacion (Long id);
    
    public Educacion buscarEducacion (Long id);
    
    public Educacion updateEducacion(Long id, Educacion newEducacion);    
}

