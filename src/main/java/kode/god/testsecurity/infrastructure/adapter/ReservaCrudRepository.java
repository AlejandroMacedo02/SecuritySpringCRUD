/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package kode.god.testsecurity.infrastructure.adapter;

import kode.god.testsecurity.infrastructure.entity.ReservaEntity;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author alejandromacedop
 */
public interface ReservaCrudRepository extends CrudRepository<ReservaEntity, Integer>{
    
}
