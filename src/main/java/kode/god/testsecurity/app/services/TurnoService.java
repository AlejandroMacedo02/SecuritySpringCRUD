/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kode.god.testsecurity.app.services;

import kode.god.testsecurity.app.repository.TurnoRepository;
import kode.god.testsecurity.infrastructure.entity.TurnoEntity;

/**
 *
 * @author alejandromacedop
 */
public class TurnoService {
    
    private final TurnoRepository turnoRepository;

    public TurnoService(TurnoRepository turnoRepository) {
        this.turnoRepository = turnoRepository;
    }
    
    public Iterable<TurnoEntity> getTurnos(){
        return turnoRepository.getTurnos();
    }
    public TurnoEntity getTurnosById(Integer id){
        return turnoRepository.getTurnosById(id);
    }
}
