/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kode.god.testsecurity.app.services;

import jakarta.servlet.http.HttpSession;

/**
 *
 * @author alejandromacedop
 */
public class LogoutService {
    
    public LogoutService() {
        
    }

    public void logout(HttpSession httpSession) {
        httpSession.removeAttribute("iduser");
    }
}
