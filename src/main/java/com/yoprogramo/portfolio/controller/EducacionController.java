/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yoprogramo.portfolio.controller;

import com.yoprogramo.portfolio.model.Educacion;
import com.yoprogramo.portfolio.service.IEducacionService;
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
public class EducacionController {
    
    @Autowired
    private IEducacionService educaServ;
    
    @PostMapping ("/new/educacion")
    public void agregarEducacion(@RequestBody Educacion newEducacion){
       educaServ.crearEducacion(newEducacion);
    }
    
    @GetMapping("list/educaciones")
    @ResponseBody
    public List<Educacion>  verEducacion (){
       return educaServ.verEducaciones();
    }
    
    @DeleteMapping("/delete/educacion/{id}")
    public void borrarEducacion(@PathVariable Long id){
      educaServ.borrarEducacion(id);
    }
    
    @GetMapping("/educacion/{id}")
    public Educacion verEducacion(@PathVariable Long id){
      return educaServ.buscarEducacion(id);
    }
   
    
    @PutMapping("/update/educacion/{id}")
    public ResponseEntity<Educacion> updateEducacion(@PathVariable Long id, @RequestBody Educacion newEducacion) {
        Educacion educacion = educaServ.updateEducacion(id, newEducacion);
        return new ResponseEntity<>(educacion, HttpStatus.OK);
    }
    
}
