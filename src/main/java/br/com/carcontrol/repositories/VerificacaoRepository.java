package br.com.carcontrol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.carcontrol.domain.Verificacao;

@Repository
public interface VerificacaoRepository extends JpaRepository<Verificacao, Integer>{

}
