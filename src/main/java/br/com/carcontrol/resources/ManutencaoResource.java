package br.com.carcontrol.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.carcontrol.domain.dto.ManutencaoDTO;
import br.com.carcontrol.services.ManutencaoService;

@RestController
@RequestMapping(value = "/manutencoes")
public class ManutencaoResource {

	@Autowired
	private ManutencaoService manutencaoService;
	
	@GetMapping("veiculo/{id}")
	public ResponseEntity<List<ManutencaoDTO>> findByVeiculo(@PathVariable Integer id) {
		List<ManutencaoDTO> manutencoesDTO = manutencaoService.findByVeiculo(id);
		return ResponseEntity.ok().body(manutencoesDTO);
	}
	
}
