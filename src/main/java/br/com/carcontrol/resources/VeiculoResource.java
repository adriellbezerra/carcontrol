package br.com.carcontrol.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.carcontrol.domain.Veiculo;
import br.com.carcontrol.services.VeiculoService;

@RestController
@RequestMapping(value = "/veiculos")
public class VeiculoResource {

	@Autowired
	private VeiculoService veiculoService;
	
	@GetMapping
	public ResponseEntity<List<Veiculo>> findAll() {
		List<Veiculo> veiculos = veiculoService.findAll();
		return ResponseEntity.ok().body(veiculos);
	}	
		
	@GetMapping("/{id}")
	public ResponseEntity<Veiculo> findById(@PathVariable Integer id) {
		Veiculo obj = veiculoService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	
}
