/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yoprogramo.portfolio.controller;

import com.yoprogramo.portfolio.model.Experiencia;
import com.yoprogramo.portfolio.service.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author Adrian
 */
@RestController
@CrossOrigin
public class ExperienciaController {
 
  @Autowired
    private IExperienciaService expeServ;
    
    @PostMapping ("/new/experiencia")
    public void agregarEducacion(@RequestBody Experiencia newExperiencia){
       expeServ.crearExperiencia(newExperiencia);
    }
    
    @GetMapping("/list/experiencias")
    @ResponseBody
    public List<Experiencia>  verExperiencia (){
       return expeServ.verExperiencias();
    }
    
    @DeleteMapping("/delete/experiencia/{id}")
    public void borrarExperiencia(@PathVariable Long id){
      expeServ.borrarExperiencia(id);
    }
    
    @GetMapping("/open/experiencia/{persona}")
    public List<Experiencia> verExperiencia(@PathVariable int persona){
      return expeServ.buscarExperiencia(persona);
    }
   
    
    @PutMapping("/update/experiencia/{id}")
    public ResponseEntity<Experiencia> updateExperiencia(@PathVariable Long id, @RequestBody Experiencia newExperiencia) {
        Experiencia experiencia = expeServ.updateExperiencia(id, newExperiencia);
        return new ResponseEntity<>(experiencia, HttpStatus.OK);
    }   
    
}
