package br.com.carcontrol.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.carcontrol.domain.Manutencao;
import br.com.carcontrol.domain.Veiculo;
import br.com.carcontrol.domain.Verificacao;

@Repository
public interface ManutencaoRepository extends JpaRepository<Manutencao, Integer>{

	List<Manutencao> findByVeiculo(Veiculo veiculo);
}
