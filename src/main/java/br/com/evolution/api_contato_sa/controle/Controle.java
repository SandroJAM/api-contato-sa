package br.com.evolution.api_contato_sa.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.evolution.api_contato_sa.repositorio.Repositorio;

@RestController
public class Controle {
 
    @Autowired // Para não objeto instanciar esse objeto em cada rota
    private Repositorio acao; // Objeto para cadastrar, selecionar, alterar e remover contato

    @GetMapping("/")
    public String teste(){
        return "Hello World!";
    }
    
}
