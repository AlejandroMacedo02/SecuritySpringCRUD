/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kode.god.testsecurity.infrastructure.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

/**
 *
 * @author alejandromacedop
 */
@Entity
@Table(name = "reservas")
public class ReservaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDateTime fecha_reserva;
    private Integer costo;
    private String horas;
    
    @ManyToOne
    @JoinColumn(name = "turno_id")
    private TurnoEntity turnoEntity;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private UsuarioEntity usuarioEntity;

    public ReservaEntity() {
    }

    public ReservaEntity(Integer id, LocalDateTime fecha_reserva, Integer costo, String horas, TurnoEntity turnoEntity, UsuarioEntity usuarioEntity) {
        this.id = id;
        this.fecha_reserva = fecha_reserva;
        this.costo = costo;
        this.horas = horas;
        this.turnoEntity = turnoEntity;
        this.usuarioEntity = usuarioEntity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getFecha_reserva() {
        return fecha_reserva;
    }

    public void setFecha_reserva(LocalDateTime fecha_reserva) {
        this.fecha_reserva = fecha_reserva;
    }

    public Integer getCosto() {
        return costo;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }

    public String getHoras() {
        return horas;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }

    public TurnoEntity getTurnoEntity() {
        return turnoEntity;
    }

    public void setTurnoEntity(TurnoEntity turnoEntity) {
        this.turnoEntity = turnoEntity;
    }

    public UsuarioEntity getUsuarioEntity() {
        return usuarioEntity;
    }

    public void setUsuarioEntity(UsuarioEntity usuarioEntity) {
        this.usuarioEntity = usuarioEntity;
    }

    @Override
    public String toString() {
        return "ReservaEntity{" + "id=" + id + ", fecha_reserva=" + fecha_reserva + ", costo=" + costo + ", horas=" + horas + ", turnoEntity=" + turnoEntity + ", usuarioEntity=" + usuarioEntity + '}';
    }
    
    
}
