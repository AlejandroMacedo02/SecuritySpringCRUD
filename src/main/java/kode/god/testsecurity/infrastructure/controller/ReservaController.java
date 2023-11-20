/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kode.god.testsecurity.infrastructure.controller;

import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import kode.god.testsecurity.app.services.ReservaService;
import kode.god.testsecurity.app.services.TurnoService;
import kode.god.testsecurity.app.services.UsuarioService;
import kode.god.testsecurity.infrastructure.entity.ReservaEntity;
import kode.god.testsecurity.infrastructure.entity.TurnoEntity;
import kode.god.testsecurity.infrastructure.entity.UsuarioEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author alejandromacedop
 */
@Controller
@RequestMapping("/user/reserva")
public class ReservaController {

    private final TurnoService turnoService;
    private final ReservaService reservaService;
    private final UsuarioService usuarioService;

    public ReservaController(TurnoService turnoService, ReservaService reservaService, UsuarioService usuarioService) {
        this.turnoService = turnoService;
        this.reservaService = reservaService;
        this.usuarioService = usuarioService;
    }

    @GetMapping("/create")
    public String create(Model model,HttpSession httpSession) {
        Iterable<TurnoEntity> turnos = turnoService.getTurnos();
        model.addAttribute("listTurnos", turnos);
        model.addAttribute("id", httpSession.getAttribute("iduser").toString());
        return "user/create";
    }

    @PostMapping("/save-create")
    public String create(Model model, ReservaEntity reserva, @RequestParam("turno_id") Integer turno_id, HttpSession httpSession) throws IOException {
        TurnoEntity turno = new TurnoEntity();
        UsuarioEntity user = usuarioService.findById(Integer.parseInt(httpSession.getAttribute("iduser").toString()));
        turno.setId(turno_id);
        reserva.setTurnoEntity(turno);
        reserva.setUsuarioEntity(user);
        reservaService.saveReservas(reserva);
        return "redirect:/home";
    }

}
