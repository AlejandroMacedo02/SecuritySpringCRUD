/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kode.god.testsecurity.app.services;

import kode.god.testsecurity.app.repository.UsuarioRepository;
import kode.god.testsecurity.infrastructure.entity.UsuarioEntity;

/**
 *
 * @author alejandromacedop
 */
public class UsuarioService {
    
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    
    public UsuarioEntity createUser(UsuarioEntity user){
        return usuarioRepository.createUser(user);
    }
    public UsuarioEntity findByEmail(String email){
        return usuarioRepository.findByEmail(email);
    }
    public UsuarioEntity findById(Integer id){
        return usuarioRepository.findById(id);
    }
}
