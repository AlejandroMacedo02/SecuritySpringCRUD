/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kode.god.testsecurity.app.services;

import kode.god.testsecurity.app.repository.ReservaRepository;
import kode.god.testsecurity.infrastructure.entity.ReservaEntity;

/**
 *
 * @author alejandromacedop
 */
public class ReservaService {
    
    public final ReservaRepository reservaRepository;

    public ReservaService(ReservaRepository reservaRepository) {
        this.reservaRepository = reservaRepository;
    }
    
    public Iterable<ReservaEntity> getReservas(){
        return reservaRepository.getReservas();
    }
    public ReservaEntity getReservasById(Integer id){
        return reservaRepository.getReservasById(id);
    }
    public ReservaEntity saveReservas(ReservaEntity reserva){
        return reservaRepository.saveReservas(reserva);
    }
    public void deleteReservaById(Integer id){
        reservaRepository.deleteReservaById(id);
    }
}
