/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.yoprogramo.portfolio.repository;

import com.yoprogramo.portfolio.model.Persona;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Adrian
 */
@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long>{
    Optional<Persona> findOneByEmail(String email);
}
