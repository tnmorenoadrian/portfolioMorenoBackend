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
public class Experiencia {
      @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int persona;
    private String image_experiencia;
    private String titulo_experiencia;
    private String info_experiencia;
    private String desde_experiencia;
    private String hasta_experiencia;
     
    public Experiencia(){
        
    }
    
    public Experiencia(Long id,
            int persona,
            String image_experiencia,
            String titulo_experiencia,
            String info_experiencia,
            String desde_experiencia,
            String hasta_experiencia
             ){
       this.id = id;
       this.persona = persona;
       this.image_experiencia = image_experiencia;
       this.titulo_experiencia = titulo_experiencia;
       this.info_experiencia = info_experiencia;
       this.desde_experiencia = desde_experiencia;
       this.hasta_experiencia = hasta_experiencia;
      
    }
    
}
