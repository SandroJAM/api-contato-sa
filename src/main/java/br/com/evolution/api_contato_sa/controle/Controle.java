package br.com.evolution.api_contato_sa.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controle {

    @GetMapping("/")
    public String teste(){
        return "Hello World!";
    }
    
}
