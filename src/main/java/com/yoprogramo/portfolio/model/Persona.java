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
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombres;
    private String apellido;
    private String fecha_nacimiento;
    private String nacionalidad;
    @Column(nullable = false, length = 50, unique = true)
    private String email;
    @Column(nullable = false, length = 64)
    private String password;
    @Column(columnDefinition="TEXT")
    private String sobre_mi;
    private String ocupacion;
    private String image_background;
    private String image_perfil;
    
    
    public Persona(){
        
    }
    
    public Persona(Long id,
            String nombres,
            String apellido,
            String fecha_nacimiento,
            String nacionalidad,
            String email,
            String password,
            String sobre_mi,
            String ocupacion,
            String image_background,
            String image_perfil ){
       this.id = id;
       this.nombres = nombres;
       this.apellido = apellido;
       this.fecha_nacimiento = fecha_nacimiento;
       this.nacionalidad = nacionalidad;
       this.email = email;
       this.password = password;
       this.sobre_mi = sobre_mi;
       this.ocupacion = ocupacion;
       this.image_background = image_background;
       this.image_perfil = image_perfil;
    }
    
}
