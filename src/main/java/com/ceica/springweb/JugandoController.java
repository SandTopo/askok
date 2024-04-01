package com.ceica.springweb;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Random;


@Controller

public class JugandoController {
    //Random rand ;
    private double aleatorio;
    private double aleatorio1;
    private double aleatorio2;
    private int correctN;
    private int failAns1;
    private int failAns2;

    UsersRepository usersRepository;
    PreguntasRepository preguntasRepository;

    RespuestasRepository respuestasRepository;

    @Autowired
    public JugandoController(UsersRepository usersRepository,PreguntasRepository preguntasRepository,RespuestasRepository respuestasRepository) {
        this.usersRepository = usersRepository;
        this.preguntasRepository=preguntasRepository;
        this.respuestasRepository=respuestasRepository;

    }

    @GetMapping("/jugando")
    public String home(Model model, @RequestParam(required = false) String username, HttpSession httpSession) {
        Randomnumber();
        correctN = (int)aleatorio;
        failAns1= (int)aleatorio1;
        failAns2= (int)aleatorio2;

        Users users= (Users) httpSession.getAttribute("user");

        if(users==null){
            users=new Users();
            users.setNombres(username);
            usersRepository.save(users);
            httpSession.setAttribute("user",users);
        }

      List<Preguntas> preguntasList= (List<Preguntas>) preguntasRepository.findAll();
      List<Respuestas> respuestasList= (List<Respuestas>) respuestasRepository.findAll();
        model.addAttribute("user",users);
        model.addAttribute("pregunta",preguntasList.get(correctN));
        model.addAttribute("respuesta1",respuestasList.get(correctN));
        model.addAttribute("respuesta2",respuestasList.get(failAns1));
        model.addAttribute("respuesta3",respuestasList.get(failAns2));
        return "jugando";



    }
    public void Randomnumber(){
        aleatorio =Math.random()*(50);
        aleatorio1 =Math.random()*(50);
        aleatorio2 =Math.random()*(50);

    }
}
