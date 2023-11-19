/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package kode.god.testsecurity.app.repository;

import kode.god.testsecurity.infrastructure.entity.ReservaEntity;

/**
 *
 * @author alejandromacedop
 */
public interface ReservaRepository {
    Iterable<ReservaEntity> getReservas();
    ReservaEntity getReservasById(Integer id);
    ReservaEntity saveReservas(ReservaEntity reserva);
    void deleteReservaById(Integer id);
}
