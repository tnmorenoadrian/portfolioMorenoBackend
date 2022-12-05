/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.yoprogramo.portfolio.repository;

import com.yoprogramo.portfolio.model.Habilidad;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Adrian
 */
public interface HabilidadesRepository extends JpaRepository <Habilidad, Long>{
    
    List<Habilidad> findByPersona (int persona);
    
}
