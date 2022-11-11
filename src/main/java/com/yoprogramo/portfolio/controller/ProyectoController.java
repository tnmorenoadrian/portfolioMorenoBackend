/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yoprogramo.portfolio.controller;

import com.yoprogramo.portfolio.model.Proyecto;
import com.yoprogramo.portfolio.service.IProyectoService;
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
public class ProyectoController {
 
  @Autowired
    private IProyectoService proyServ;
    
    @PostMapping ("/new/proyecto")
    public void agregarProyecto(@RequestBody Proyecto newProyecto){
       proyServ.crearProyecto(newProyecto);
    }
    
    @GetMapping("/list/proyectos")
    @ResponseBody
    public List<Proyecto>  verProyecto (){
       return proyServ.verProyectos();
    }
    
    @DeleteMapping("/delete/proyecto/{id}")
    public void borrarProyecto(@PathVariable Long id){
      proyServ.borrarProyecto(id);
    }
    
    @GetMapping("/proyecto/{persona}")
    public List<Proyecto> verProyecto(@PathVariable int persona){
      return proyServ.buscarProyecto(persona);
    }
   
    
    @PutMapping("/update/proyecto/{id}")
    public ResponseEntity<Proyecto> updateProyecto(@PathVariable Long id, @RequestBody Proyecto newProyecto) {
        Proyecto proyecto = proyServ.updateProyecto(id, newProyecto);
        return new ResponseEntity<>(proyecto, HttpStatus.OK);
    }   
    
}
