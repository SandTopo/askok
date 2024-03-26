package com.ceica.springweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class JugandoController{
    @GetMapping("/jugando")
    public String home() {
        return "jugando";
    }
}