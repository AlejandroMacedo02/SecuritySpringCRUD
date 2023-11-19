/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kode.god.testsecurity.app.services;

import kode.god.testsecurity.infrastructure.entity.UserType;
import kode.god.testsecurity.infrastructure.entity.UsuarioEntity;

/**
 *
 * @author alejandromacedop
 */
public class LoginService {
    private final UsuarioService userService;

    public LoginService(UsuarioService userService) {
        this.userService = userService;
    }
    
    //retorna true si encuentra el user
    public boolean existUser(String email){
        try {
            UsuarioEntity user = userService.findByEmail(email);
        }catch(Exception e){
            return false;
        }
        return true;
    }
    //obtenemos el id del usuario
    public Integer getUserId(String email){
        try{
            return userService.findByEmail(email).getId();
        }catch (Exception e){
            return 0;
        }
    }
     //obtener tipo de usuario
    public UserType getUserType(String email){
        return userService.findByEmail(email).getUserType();
    }
     //obtenemos el user por email
    public UsuarioEntity getuser(String email){
        try{
            return userService.findByEmail(email);
        }catch (Exception e){
            return new UsuarioEntity();
        }
    }
    //obtenemos el user por id
    public UsuarioEntity getUser(Integer id){
        try{
            return userService.findById(id);
        }catch (Exception e){
            return new UsuarioEntity();
        }
    }
}
