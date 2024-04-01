package com.ceica.springweb;


import jakarta.persistence.*;
import org.springframework.scheduling.config.Task;

import java.util.List;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer idusers;
    public String nombres;

    public String puntuacion;

    public Users() {
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Integer getIdusers() {
        return idusers;
    }

    public void setIdusers(Integer idusers) {
        this.idusers = idusers;
    }

    public String getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(String puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "Users{" +
                "nombres='" + nombres + '\'' +
                ", idusers=" + idusers +
                ", puntuacion='" + puntuacion + '\'' +
                '}';
    }
}