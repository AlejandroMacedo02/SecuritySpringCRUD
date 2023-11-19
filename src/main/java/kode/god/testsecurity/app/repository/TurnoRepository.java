/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package kode.god.testsecurity.app.repository;

import kode.god.testsecurity.infrastructure.entity.TurnoEntity;

/**
 *
 * @author alejandromacedop
 */
public interface TurnoRepository {
    Iterable<TurnoEntity> getTurnos();
    TurnoEntity getTurnosById(Integer id);
}
