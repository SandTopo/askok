package com.ceica.springweb;

import jakarta.persistence.*;

@Entity
@Table(name = "savedata")
public class Savedata {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    public Integer nombre;
    public Integer ask;
    public Integer resp;

    public Savedata() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNombre() {
        return nombre;
    }

    public void setNombre(Integer nombre) {
        this.nombre = nombre;
    }

    public Integer getAsk() {
        return ask;
    }

    public void setAsk(Integer ask) {
        this.ask = ask;
    }

    public Integer getResp() {
        return resp;
    }

    public void setResp(Integer resp) {
        this.resp = resp;
    }

    @Override
    public String
    toString() {
        return "Savedata{" +
                "id=" + id +
                ", nombre=" + nombre +
                ", ask=" + ask +
                ", resp=" + resp +
                '}';
    }
}
