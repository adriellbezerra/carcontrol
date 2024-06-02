package br.com.carcontrol.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.carcontrol.entidades.Manutencao;

@Repository
public interface ManutencaoRepository extends JpaRepository<Manutencao, Integer>{

}
