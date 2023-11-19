/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package kode.god.testsecurity.infrastructure.adapter;

import java.util.Optional;
import kode.god.testsecurity.infrastructure.entity.UsuarioEntity;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author alejandromacedop
 */
public interface UsuarioCrud extends CrudRepository<UsuarioEntity, Integer> {

    Optional<UsuarioEntity> findByEmail(String Email);
}
