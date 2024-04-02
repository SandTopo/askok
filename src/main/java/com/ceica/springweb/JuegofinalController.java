package com.ceica.springweb;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class JuegofinalController {

    UsersRepository usersRepository;
    PreguntasRepository preguntasRepository;
    RespuestasRepository respuestasRepository;
    SavedataRepository savedataRepository;

    @Autowired
    public JuegofinalController(UsersRepository usersRepository,PreguntasRepository preguntasRepository,RespuestasRepository respuestasRepository,SavedataRepository savedataRepository){
        this.usersRepository = usersRepository;
        this.preguntasRepository=preguntasRepository;
        this.respuestasRepository=respuestasRepository;
        this.savedataRepository=savedataRepository;
    }
    @PostMapping("/juegofinal")
    public String home(Model model, HttpSession httpSession, @RequestParam(required = false) Integer idpregunta, @RequestParam(required = false) String respuesta) {

        Users user= (Users) httpSession.getAttribute("user");
        if(user==null){
            return  "redirect:/";
        }else{
            if(idpregunta==null){
                return "juegofinal";

            }else{

            Integer respuestaId = respuestasRepository.findByresp(respuesta).getId();
            Savedata savedata=new Savedata();
            savedata.nombre=user.getIdusers();
            savedata.ask=idpregunta;
            savedata.resp=respuestaId;
            savedataRepository.save(savedata);
            return "redirect:/jugando";
            }
        }

    }
    @GetMapping("/juegofinal")
    public String ultimapantalla(Model model, HttpSession httpSession){
        return "juegofinal";
    }
}
