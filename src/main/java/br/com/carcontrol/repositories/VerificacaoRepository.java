package br.com.carcontrol.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.carcontrol.domain.Pessoa;
import br.com.carcontrol.domain.Veiculo;
import br.com.carcontrol.domain.Verificacao;


@Repository
public interface VerificacaoRepository extends JpaRepository<Verificacao, Integer>{

	List<Verificacao> findByVeiculo(Veiculo veiculo);
	
	List<Verificacao> findByCondutor(Pessoa condutor);
	
}
