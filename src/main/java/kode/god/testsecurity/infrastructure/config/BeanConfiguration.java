/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kode.god.testsecurity.infrastructure.config;

import kode.god.testsecurity.app.repository.ReservaRepository;
import kode.god.testsecurity.app.repository.TurnoRepository;
import kode.god.testsecurity.app.repository.UsuarioRepository;
import kode.god.testsecurity.app.services.LoginService;
import kode.god.testsecurity.app.services.LogoutService;
import kode.god.testsecurity.app.services.RegistrationService;
import kode.god.testsecurity.app.services.ReservaService;
import kode.god.testsecurity.app.services.TurnoService;
import kode.god.testsecurity.app.services.UsuarioService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.context.WebApplicationContext;

/**
 *
 * @author alejandromacedop
 */
@Configuration
public class BeanConfiguration {
    
    @Bean
    @Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
    public ReservaService reservaService(ReservaRepository reservaRepository){
        return new ReservaService(reservaRepository);
    }
    
    @Bean
    public TurnoService turnoService(TurnoRepository turnoRepository){
        return new TurnoService(turnoRepository);
    }
    
    @Bean
    public UsuarioService usuarioService(UsuarioRepository usuarioRepository){
        return new UsuarioService(usuarioRepository);
    }
    
    @Bean
    public LoginService loginService(UsuarioService userService){
        return new LoginService(userService);
    }
    @Bean
    public LogoutService logoutService(){
        return  new LogoutService();
    } 
    @Bean
    public RegistrationService registrationService(UsuarioService userService, PasswordEncoder passwordEncoder){
        return  new RegistrationService(userService, passwordEncoder);
    }
}
