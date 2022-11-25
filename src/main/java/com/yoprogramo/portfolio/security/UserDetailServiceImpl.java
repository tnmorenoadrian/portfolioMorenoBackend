package com.yoprogramo.portfolio.security;
import com.yoprogramo.portfolio.model.Persona;
import com.yoprogramo.portfolio.repository.PersonaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailsService{

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
       Persona persona = personaRepository
              .findOneByEmail(email)
              .orElseThrow(() -> new UsernameNotFoundException("El usuario con email " + email + " no existe."));

              return  new UserDetailsImpl(persona);
    }

    
    
}
