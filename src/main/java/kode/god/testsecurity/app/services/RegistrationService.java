/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kode.god.testsecurity.app.services;

import kode.god.testsecurity.infrastructure.entity.UsuarioEntity;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 *
 * @author alejandromacedop
 */
public class RegistrationService {
    
   
    private final UsuarioService userService;
    private final PasswordEncoder passwordEncoder;

    public RegistrationService(UsuarioService userService, PasswordEncoder passwordEncoder) {
        
        this.userService = userService;
        this.passwordEncoder = passwordEncoder;
    }

    
    public void register(UsuarioEntity user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userService.createUser(user);
    }
    
}
