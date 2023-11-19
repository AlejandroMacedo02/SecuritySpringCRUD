/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kode.god.testsecurity.infrastructure.adapter;

import kode.god.testsecurity.app.repository.ReservaRepository;
import kode.god.testsecurity.infrastructure.entity.ReservaEntity;
import org.springframework.context.annotation.Lazy;

/**
 *
 * @author alejandromacedop
 */
public class ReservaCrudImpl implements ReservaRepository{
    
    private final ReservaCrud reservaCrud;

    public ReservaCrudImpl(@Lazy ReservaCrud reservaCrud) {
        this.reservaCrud = reservaCrud;
    }

    @Override
    public Iterable<ReservaEntity> getReservas() {
        return reservaCrud.findAll();
    }

    @Override
    public ReservaEntity getReservasById(Integer id) {
        return reservaCrud.findById(id).get();
    }

    @Override
    public ReservaEntity saveReservas(ReservaEntity reserva) {
        return reservaCrud.save(reserva);
    }

    @Override
    public void deleteReservaById(Integer id) {
        reservaCrud.deleteById(id);
    }
    
    
}
