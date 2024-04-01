package com.ceica.springweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller

public class JugandoController {
    UsersRepository usersRepository;
    PreguntasRepository preguntasRepository;

    @Autowired
    public JugandoController(UsersRepository usersRepository,PreguntasRepository preguntasRepository) {
        this.usersRepository = usersRepository;
        this.preguntasRepository=preguntasRepository;
    }

    @GetMapping("/jugando")
    public String home(Model model, @RequestParam String username) {
      Users users= new Users();
      users.setNombres(username);
      usersRepository.save(users);

      List<Preguntas> preguntasList= (List<Preguntas>) preguntasRepository.findAll();
        model.addAttribute("user",users);
        model.addAttribute("pregunta",preguntasList.get(7));
        return "jugando";
    }
}