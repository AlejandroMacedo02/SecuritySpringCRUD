/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kode.god.testsecurity.infrastructure.controller;

import kode.god.testsecurity.app.services.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author alejandromacedop
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    
    public final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }
    
    
    @GetMapping
    public String login(){
        return "login";
    }
    
}
