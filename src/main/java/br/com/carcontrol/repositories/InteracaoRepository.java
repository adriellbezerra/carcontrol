package br.com.carcontrol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.carcontrol.domain.Interacao;

@Repository
public interface InteracaoRepository extends JpaRepository<Interacao, Integer>{

}
