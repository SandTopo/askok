package com.ceica.springweb;

import org.springframework.data.repository.CrudRepository;
public interface RespuestasRepository extends CrudRepository<Respuestas,Integer>{

    public Respuestas findRespuestasById (Integer id);
}
