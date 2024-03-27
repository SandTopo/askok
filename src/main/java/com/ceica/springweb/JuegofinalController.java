package com.ceica.springweb;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class JuegofinalController {
    @GetMapping("/juegofinal")
    public String home() {
        return "juegofinal";
    }
}
