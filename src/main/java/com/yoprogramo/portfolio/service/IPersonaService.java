/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.yoprogramo.portfolio.service;

import com.yoprogramo.portfolio.model.Persona;
import java.util.List;

/**
 *
 * @author Adrian
 */
public interface IPersonaService {
    
    public List<Persona> verPersonas ();
    
    public void crearPersona (Persona newPersona);
    
    public void borrarPersona (Long id);
    
    public Persona buscarPersona (Long id);
    
    public Persona updatePersona(Long id, Persona newPersona);    
}
