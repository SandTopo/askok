package com.ceica.springweb;

import jakarta.persistence.*;

@Entity
@Table(name = "preguntas")
public class Preguntas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String ask_numbers;
    private Integer respuestas_id;

    @OneToOne
    @JoinColumn(name = "respuestas")
    private Respuestas respuestas;

    public Preguntas() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAsk_numbers() {
        return ask_numbers;
    }

    public void setAsk_numbers(String ask_numbers) {
        this.ask_numbers = ask_numbers;
    }

    public Integer getRespuestas_id() {
        return respuestas_id;
    }

    public void setRespuestas_id(Integer respuestas_id) {
        this.respuestas_id = respuestas_id;
    }

    @Override
    public String toString() {
        return "Preguntas{" +
                "id=" + id +
                ", ask_numbers='" + ask_numbers + '\'' +
                ", respuestas_id=" + respuestas_id +
                '}';
    }
}
