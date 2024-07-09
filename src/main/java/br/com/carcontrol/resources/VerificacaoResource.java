package br.com.carcontrol.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.carcontrol.domain.Verificacao;
import br.com.carcontrol.services.VerificacaoService;

@RestController
@RequestMapping(value = "/verificacoes")
public class VerificacaoResource {

	@Autowired
	private VerificacaoService verificacaoService;
	
	@GetMapping("veiculo/{id}")
	public ResponseEntity<List<Verificacao>> findByVeiculo(@PathVariable Integer id) {
		List<Verificacao> verificacoes = verificacaoService.findByVeiculo(id);
		return ResponseEntity.ok().body(verificacoes);
	}
	
	@GetMapping("condutor/{id}")
	public ResponseEntity<List<Verificacao>> findByCondutor(@PathVariable Integer id) {
		List<Verificacao> verificacoes = verificacaoService.findByCondutor(id);
		return ResponseEntity.ok().body(verificacoes);
	}
	
	
}
