package com.ceica.springweb;


import jakarta.persistence.*;


@Entity
@Table(name = "respuestas_users")
public class Respuestas_users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    public Integer id_nombre;
    public Integer id_ask_numbers;
    @Column(name = "resp_final")
    public Integer resp;

    public Respuestas_users() {
    }


}
