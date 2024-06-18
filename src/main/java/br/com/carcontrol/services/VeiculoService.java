package br.com.carcontrol.services;

import java.util.List;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.carcontrol.domain.Veiculo;
import br.com.carcontrol.repositories.VeiculoRepository;

@Service
public class VeiculoService {
	
	@Autowired
	private VeiculoRepository veiculoRepository;

	public List<Veiculo> findAll() {
		return veiculoRepository.findAll();
	}
	
		public Veiculo findById(Integer id) {
		Optional<Veiculo> obj = veiculoRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado!", id));
	}
}
