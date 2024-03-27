package com.ceica.springweb;

import org.springframework.data.repository.CrudRepository;
public interface PreguntasRepository extends CrudRepository<Preguntas,Integer>{
    public Preguntas findPreguntasById(Integer id);
}
