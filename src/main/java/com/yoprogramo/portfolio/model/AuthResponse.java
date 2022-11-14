/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yoprogramo.portfolio.model;

/**
 *
 * @author Adrian
 */
import java.io.Serializable;
public class AuthResponse implements Serializable{
    private static final long serialVersionUID = -8091879091924046844L;
    private final String jwt;

    public AuthResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return this.jwt;
    }
}
