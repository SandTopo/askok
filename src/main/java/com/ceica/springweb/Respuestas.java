package com.ceica.springweb;

import jakarta.persistence.*;

@Entity
@Table(name = "respuestas")
public class Respuestas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String resp_final;

    public Respuestas() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResp_final() {
        return resp_final;
    }

    public void setResp_final(String resp_final) {
        this.resp_final = resp_final;
    }

    @Override
    public String toString() {
        return "Respuestas{" +
                "id=" + id +
                ", resp_final='" + resp_final + '\'' +
                '}';
    }
}
