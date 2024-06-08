package br.com.carcontrol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.carcontrol.domain.Arquivo;

@Repository
public interface ArquivoRepository extends JpaRepository<Arquivo, Integer>{

}
