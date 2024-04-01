package com.ceica.springweb;

import jakarta.persistence.*;

@Entity
@Table(name = "preguntas")
public class Preguntas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    @Column(name = "ask_numbers")
    private String ask;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "respuestas_id", referencedColumnName = "id")
    private Respuestas respuestas;


    public Preguntas() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAsk() {
        return ask;
    }

    public void setAsk(String ask) {
        this.ask = ask;
    }

    public Respuestas getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(Respuestas respuestas) {
        this.respuestas = respuestas;
    }

    @Override
    public String toString() {
        return "Preguntas{" +
                "id=" + id +
                ", ask='" + ask + '\'' +
                ", respuestas=" + respuestas +
                '}';
    }
}
