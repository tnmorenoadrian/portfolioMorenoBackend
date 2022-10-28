package com.yoprogramo.portfolio.controller;

import com.yoprogramo.portfolio.model.Persona;
import com.yoprogramo.portfolio.service.IPersonaService;
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
public class Controller {
    
    @Autowired
    private IPersonaService persoServ;
    
    @PostMapping ("/new/persona")
    public void agregarPersona(@RequestBody Persona newPersona){
       persoServ.crearPersona(newPersona);
    }
    
    @GetMapping("list/personas")
    @ResponseBody
    public List<Persona>  verPersonas (){
       return persoServ.verPersonas();
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarPersona(@PathVariable Long id){
      persoServ.borrarPersona(id);
    }
    
    @GetMapping("/persona/{id}")
    public Persona verPersona(@PathVariable Long id){
      return persoServ.buscarPersona(id);
    }
   
    
    @PutMapping("/update/{id}")
    public ResponseEntity<Persona> updatePersona(@PathVariable Long id, @RequestBody Persona newPersona) {
        Persona persona = persoServ.updatePersona(id, newPersona);
        return new ResponseEntity<>(persona, HttpStatus.OK);
    }
        
}
