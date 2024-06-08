package br.com.carcontrol.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.carcontrol.domain.Pessoa;
import br.com.carcontrol.services.PessoaService;

@RestController
@RequestMapping(value = "/pessoas")
public class PessoaResource {

	@Autowired
	private PessoaService pessoaService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Pessoa> findById(@PathVariable Integer id) {
		Pessoa obj = pessoaService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
