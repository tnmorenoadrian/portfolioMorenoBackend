/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yoprogramo.portfolio.service;
import com.yoprogramo.portfolio.model.Persona;
import com.yoprogramo.portfolio.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Adrian
 */
@Service
public class PersonaService implements IPersonaService {

    @Autowired
    public PersonaRepository persoRepo;
    
    @Override
    public List<Persona> verPersonas() {
       return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona newPersona) {
       persoRepo.save(newPersona);
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
       return persoRepo.findById(id).orElse(null);
    }
    
    @Override
    public Persona updatePersona(Long id, Persona newPersona) {
        Persona persona = persoRepo.findById(id).get();
        newPersona.setId(persona.getId());
        return persoRepo.save(newPersona);
    }
    
    
}
