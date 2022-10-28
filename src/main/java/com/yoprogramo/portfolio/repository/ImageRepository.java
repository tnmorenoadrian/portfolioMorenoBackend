/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.yoprogramo.portfolio.repository;

/**
 *
 * @author Adrian
 */
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.yoprogramo.portfolio.model.Image;
public interface ImageRepository extends JpaRepository<Image, Long> {
	Optional<Image> findByName(String name);
}
