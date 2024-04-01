package com.ceica.springweb;

import jakarta.persistence.*;

@Entity
@Table(name = "preguntas")
public class Preguntas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String ask_numbers;
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

    public String getAsk_numbers() {
        return ask_numbers;
    }

    public void setAsk_numbers(String ask_numbers) {
        this.ask_numbers = ask_numbers;
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
                ", ask_numbers='" + ask_numbers + '\'' +
                ", respuestas=" + respuestas +
                '}';
    }
}
