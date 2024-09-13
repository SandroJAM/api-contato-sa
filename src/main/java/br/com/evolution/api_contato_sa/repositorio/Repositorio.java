package br.com.evolution.api_contato_sa.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.evolution.api_contato_sa.modelo.Contato;

@Repository
public interface Repositorio extends CrudRepository<Contato, Long> {
    
}
