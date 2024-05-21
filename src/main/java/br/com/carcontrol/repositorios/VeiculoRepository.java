package br.com.carcontrol.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.carcontrol.entidades.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Integer>{

}
