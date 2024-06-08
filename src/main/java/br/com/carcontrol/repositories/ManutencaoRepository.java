package br.com.carcontrol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.carcontrol.domain.Manutencao;

@Repository
public interface ManutencaoRepository extends JpaRepository<Manutencao, Integer>{

}
