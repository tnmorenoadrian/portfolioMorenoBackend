package com.yoprogramo.portfolio.security;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.yoprogramo.portfolio.model.Persona;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserDetailsImpl implements UserDetails{

    private final Persona persona;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
       
        return Collections.emptyList();
    }

    @Override
    public String getPassword() {
        
        return persona.getPassword();
    }

    @Override
    public String getUsername() {
        
        return persona.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
       
        return true;
    }

    @Override
    public boolean isEnabled() {
        
        return true;
    }

    public String getNombres() {
        return persona.getNombres();
    }

    
}
