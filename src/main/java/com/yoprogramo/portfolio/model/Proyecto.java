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
public class Proyecto {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long id_persona;
    private String image_proyecto;
    private String titulo_proyecto;
    private String info_proyecto;
    private String desde_proyecto;
    private String hasta_proyecto;
     
    public Proyecto(){
        
    }
    
    public Proyecto(Long id,
            Long id_persona,
            String image_proyecto,
            String titulo_proyecto,
            String info_proyecto,
            String desde_proyecto,
            String hasta_proyecto
             ){
       this.id = id;
       this.id_persona = id_persona;
       this.image_proyecto = image_proyecto;
       this.titulo_proyecto = titulo_proyecto;
       this.info_proyecto = desde_proyecto;
       this.hasta_proyecto = hasta_proyecto;
      
    }
    
}
