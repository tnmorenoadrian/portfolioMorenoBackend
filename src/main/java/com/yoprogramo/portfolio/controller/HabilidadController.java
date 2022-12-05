package com.yoprogramo.portfolio.controller;

import com.yoprogramo.portfolio.model.Habilidad;
import com.yoprogramo.portfolio.service.IHabilidadesService;
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
public class HabilidadController {
 
  @Autowired
    private IHabilidadesService habiServ;
    
    @PostMapping ("/new/habilidad")
    public void agregarHabilidad(@RequestBody Habilidad newHabilidad){
       habiServ.crearHabilidad(newHabilidad);
    }
    
    @GetMapping("/list/habilidades")
    @ResponseBody
    public List<Habilidad>  verHabilidades (){
       return habiServ.verHabilidades();
    }
    
    @DeleteMapping("/delete/habilidad/{id}")
    public void borrarHabilidad(@PathVariable Long id){
      habiServ.borrarHabilidad(id);
    }
    
    @GetMapping("/open/habilidades/{persona}")
    public List<Habilidad> verHabilidades(@PathVariable int persona){
      return habiServ.buscarHabilidades(persona);
    }
   
    
    @PutMapping("/update/habilidad/{id}")
    public ResponseEntity<Habilidad> updateHabilidad(@PathVariable Long id, @RequestBody Habilidad newHabilidad) {
        Habilidad habilidad = habiServ.updateHabilidad(id, newHabilidad);
        return new ResponseEntity<>(habilidad, HttpStatus.OK);
    }   
    
}
