package br.com.carcontrol.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.carcontrol.domain.dto.VerificacaoDTO;
import br.com.carcontrol.services.VerificacaoService;

@RestController
@RequestMapping(value = "/verificacoes")
public class VerificacaoResource {

	@Autowired
	private VerificacaoService verificacaoService;
	
	@GetMapping("veiculo/{id}")
	public ResponseEntity<List<VerificacaoDTO>> findByVeiculo(@PathVariable Integer id) {
		List<VerificacaoDTO> verificacoesDTO = verificacaoService.findByVeiculo(id);
		return ResponseEntity.ok().body(verificacoesDTO);
	}
	
	@GetMapping("condutor/{id}")
	public ResponseEntity<List<VerificacaoDTO>> findByCondutor(@PathVariable Integer id) {
		List<VerificacaoDTO> verificacoesDTO = verificacaoService.findByCondutor(id);
		return ResponseEntity.ok().body(verificacoesDTO);
	}
	
	@GetMapping("/{data}")
	public ResponseEntity<List<VerificacaoDTO>> findByData(@PathVariable String data){
		List<VerificacaoDTO> verificacoesDTO = verificacaoService.findByData(data);
		return ResponseEntity.ok().body(verificacoesDTO);
	}
	
	
}
