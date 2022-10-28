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
public class Educacion {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long id_persona;
    private String image_educacion;
    private String titulo_educacion;
    private String info_educacion;
    private String desde_educacion;
    private String hasta_educacion;
     
    public Educacion(){
        
    }
    
    public Educacion(
            Long id,
            Long id_persona,
            String image_educacion,
            String titulo_educacion,
            String info_educacion,
            String desde_educacion,
            String hasta_educacion
             ){
       this.id = id;
       this.id_persona = id_persona;
       this.image_educacion = image_educacion;
       this.titulo_educacion = titulo_educacion;
       this.info_educacion = info_educacion;
       this.desde_educacion = desde_educacion;
       this.hasta_educacion = hasta_educacion;
      
    }
    
}
