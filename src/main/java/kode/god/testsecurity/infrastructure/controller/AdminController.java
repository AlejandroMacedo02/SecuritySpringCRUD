/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kode.god.testsecurity.infrastructure.controller;

import kode.god.testsecurity.app.services.ReservaService;
import kode.god.testsecurity.infrastructure.entity.ReservaEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author alejandromacedop
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
    
    private final ReservaService reservaService;

    public AdminController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }
    
    @GetMapping
    public String home(){
        return "/admin/home_admin";
    }
    
    @GetMapping("/show")
    public String showReserva(Model model){
        Iterable<ReservaEntity> reserva = reservaService.getReservas();
        model.addAttribute("reservas", reserva);
        return "/admin/show";
    }
}
