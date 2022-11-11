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
    private int persona;
    private String image_proyecto;
    private String titulo_proyecto;
    @Column(columnDefinition="TEXT")
    private String info_proyecto;
    private String desde_proyecto;
    private String hasta_proyecto;
    private String link_proyecto;
     
    public Proyecto(){
        
    }
    
    public Proyecto(Long id,
            int persona,
            String image_proyecto,
            String titulo_proyecto,
            String info_proyecto,
            String desde_proyecto,
            String hasta_proyecto,
            String link_proyecto
             ){
       this.id = id;
       this.persona = persona;
       this.image_proyecto = image_proyecto;
       this.titulo_proyecto = titulo_proyecto;
       this.info_proyecto = desde_proyecto;
       this.hasta_proyecto = hasta_proyecto;
       this.link_proyecto = link_proyecto;
      
    }
    
}
