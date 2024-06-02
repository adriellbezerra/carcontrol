package br.com.carcontrol.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.carcontrol.entidades.Arquivo;

@Repository
public interface ArquivoRepository extends JpaRepository<Arquivo, Integer>{

}
