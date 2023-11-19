/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package kode.god.testsecurity.app.repository;

import kode.god.testsecurity.infrastructure.entity.UsuarioEntity;

/**
 *
 * @author alejandromacedop
 */
public interface UsuarioRepository {
    public UsuarioEntity createUser(UsuarioEntity user);
    public UsuarioEntity findByEmail(String email); 
    public UsuarioEntity findById(Integer id); 
    
}
