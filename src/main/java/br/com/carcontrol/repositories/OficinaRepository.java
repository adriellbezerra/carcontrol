package br.com.carcontrol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.carcontrol.domain.Oficina;

@Repository
public interface OficinaRepository extends JpaRepository<Oficina, Integer>{

}
