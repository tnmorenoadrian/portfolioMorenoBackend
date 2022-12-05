/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yoprogramo.portfolio.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
/**
 *
 * @author Adrian
 */
@Getter @Setter
@Entity
public class Habilidad {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int persona;
    private String titulo_habilidad;
    private String nivel_habilidad;
     
    public Habilidad(){
        
    }
    
    public Habilidad(Long id,
            int persona,
            String titulo_habilidad,
            String nivel_habilidad
            
             ){
       this.id = id;
       this.persona = persona;
       this.titulo_habilidad = titulo_habilidad;
       this.nivel_habilidad = nivel_habilidad;
      
    }
    
}
