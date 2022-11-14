/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yoprogramo.portfolio.controller;

/**
 *
 * @author Adrian
 */

import com.yoprogramo.portfolio.filter.JwtAuthenticationEntryPoint;
import com.yoprogramo.portfolio.filter.RequestFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfigurer extends WebSecurityConfigurerAdapter {
    
    @Autowired
    private JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;
    
    @Autowired
    private UserDetailsService customUserDetailsService;

    @Autowired
    private RequestFilter requestFilter;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customUserDetailsService);
    }

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf().disable()
                .authorizeRequests()
                .antMatchers("/list/**")
                .permitAll()
                .and()
                .authorizeRequests()
                .antMatchers("/new/**")
                .permitAll()
                .and()
                .authorizeRequests()
                .antMatchers("/delete/**")
                .permitAll()
                .and()
                .authorizeRequests()
                .antMatchers("/update/**")
                .permitAll()
                .and()
                .authorizeRequests()
                .antMatchers("/persona/**")
                .permitAll()
                .and()
                .authorizeRequests()
                .antMatchers("/get/**")
                .permitAll()
                .and()
                .authorizeRequests()
                .antMatchers("/buscar/**")
                .permitAll()
                .and()
                .authorizeRequests()
                .antMatchers("/upload/**")
                .permitAll()
                .and()
                .authorizeRequests()
                .antMatchers("/experiencia/**")
                .permitAll()
                .and()
                .authorizeRequests()
                .antMatchers("/educacion/**")
                .permitAll()
                .and()
                .authorizeRequests()
                .antMatchers("/proyecto/**")
                .permitAll()
                .and()
                .authorizeRequests()
                .antMatchers("/authenticate")
                .permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .exceptionHandling()
                .authenticationEntryPoint(jwtAuthenticationEntryPoint)
                .and()
                .sessionManagement()				
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        
        // Add a filter to validate the tokens with every request
	httpSecurity.addFilterBefore(requestFilter, UsernamePasswordAuthenticationFilter.class);
        
    }

    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}
