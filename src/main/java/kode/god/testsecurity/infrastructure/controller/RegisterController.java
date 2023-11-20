/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kode.god.testsecurity.infrastructure.controller;

import java.time.LocalDateTime;
import kode.god.testsecurity.app.services.RegistrationService;
import kode.god.testsecurity.infrastructure.entity.UserType;
import kode.god.testsecurity.infrastructure.entity.UsuarioEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author alejandromacedop
 */
@Controller
@RequestMapping("/register")
public class RegisterController {
    
    private final RegistrationService registrationService;    
    private final Logger log = LoggerFactory.getLogger(RegisterController.class);
    
    public RegisterController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }
    
    @GetMapping
    public String register() {
        return "register";
    }
    
    @PostMapping
    public String registerUser(UsuarioEntity usuarioEntity) {
        usuarioEntity.setDateCreated(LocalDateTime.now());
        usuarioEntity.setUserType(UserType.USER);
        usuarioEntity.setUsername(usuarioEntity.getEmail());
        
        registrationService.register(usuarioEntity);
        
        return "redirect:/login";
    }
    
}
