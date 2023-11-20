/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kode.god.testsecurity.infrastructure.adapter;

import kode.god.testsecurity.app.repository.UsuarioRepository;
import kode.god.testsecurity.infrastructure.entity.UsuarioEntity;

/**
 *
 * @author alejandromacedop
 */
public class UsuarioCrudImpl implements UsuarioRepository{
    
    private final UsuarioCrudRepository usuarioCrud;

    public UsuarioCrudImpl(UsuarioCrudRepository usuarioCrud) {
        this.usuarioCrud = usuarioCrud;
    }

    @Override
    public UsuarioEntity createUser(UsuarioEntity user) {
        return usuarioCrud.save(user);
    }

    @Override
    public UsuarioEntity findByEmail(String email) {
        return usuarioCrud.findByEmail(email).get();
    }

    @Override
    public UsuarioEntity findById(Integer id) {
        return usuarioCrud.findById(id).get();
    }
    
}
