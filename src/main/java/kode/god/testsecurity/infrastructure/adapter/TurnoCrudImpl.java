/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kode.god.testsecurity.infrastructure.adapter;

import kode.god.testsecurity.app.repository.TurnoRepository;
import kode.god.testsecurity.infrastructure.entity.TurnoEntity;
import org.springframework.stereotype.Repository;

/**
 *
 * @author alejandromacedop
 */
@Repository
public class TurnoCrudImpl implements TurnoRepository{
    
    private final TurnoCrudRepository turnoCrud;

    public TurnoCrudImpl(TurnoCrudRepository turnoCrud) {
        this.turnoCrud = turnoCrud;
    }

    @Override
    public Iterable<TurnoEntity> getTurnos() {
        return turnoCrud.findAll();
    }

    @Override
    public TurnoEntity getTurnosById(Integer id) {
        return turnoCrud.findById(id).get();
    }
    
}
