package br.com.carcontrol.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.carcontrol.entidades.Oficina;

@Repository
public interface OficinaRepository extends JpaRepository<Oficina, Integer>{

}
