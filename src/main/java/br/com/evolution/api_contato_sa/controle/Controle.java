package br.com.evolution.api_contato_sa.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.evolution.api_contato_sa.modelo.Contato;
import br.com.evolution.api_contato_sa.repositorio.Repositorio;

@RestController
@CrossOrigin(origins = "*") // Porta do Front-End que deve ser liberada, para comunicar com a API no Back-End.
public class Controle {
 
    @Autowired // Para não objeto instanciar esse objeto em cada rota
    private Repositorio acao; // Objeto para cadastrar, selecionar, alterar e remover contato

    @PostMapping("/")
    public Contato cadastrar(@RequestBody Contato objc){

        return acao.save(objc);
        
    }
    @GetMapping("/")
    public Iterable<Contato> selecionar(){
        return acao.findAll();
    }

    //@GetMapping("/")
    //public String teste(){
    //    return "Hello World!";
    //}

    @PutMapping("/")
    public Contato editar(@RequestBody Contato objc){
        return acao.save(objc);
    }

    @DeleteMapping("/{codigo}") // Por padrão o método remover não tem retorno.
    public void remover(@PathVariable long codigo){

        acao.deleteById(codigo);

    }
    
}
