package br.com.carcontrol.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.carcontrol.entidades.Verificacao;

@Repository
public interface VerificacaoRepository extends JpaRepository<Verificacao, Integer>{

}
