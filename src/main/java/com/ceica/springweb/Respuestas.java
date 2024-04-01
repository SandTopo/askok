package com.ceica.springweb;

import jakarta.persistence.*;

@Entity
@Table(name = "respuestas")
public class Respuestas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "resp_final")
    private String resp;

    public Respuestas() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResp() {
        return resp;
    }

    public void setResp(String resp) {
        this.resp = resp;
    }

    @Override
    public String toString() {
        return "Respuestas{" +
                "id=" + id +
                ", resp='" + resp + '\'' +
                '}';
    }
}
