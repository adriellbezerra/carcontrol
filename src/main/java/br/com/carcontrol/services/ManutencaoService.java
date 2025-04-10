package br.com.carcontrol.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.carcontrol.domain.Manutencao;
import br.com.carcontrol.domain.Veiculo;
import br.com.carcontrol.domain.dto.ManutencaoDTO;
import br.com.carcontrol.repositories.ManutencaoRepository;

@Service
public class ManutencaoService {

	
	@Autowired
	ManutencaoRepository manutencaoRepository;
	
	@Autowired
	VeiculoService veiculoService;
	
	public List<ManutencaoDTO> findByVeiculo(Integer id_veiculo) {
		Veiculo veiculo = veiculoService.findById(id_veiculo);
		List<Manutencao> listaManutencao =   manutencaoRepository.findByVeiculo(veiculo);
		return toDTO(listaManutencao);
	}
	
	public List<ManutencaoDTO> toDTO(List<Manutencao> listaDeManutencao) {
		List<ManutencaoDTO> listaDTO = new ArrayList<>();
		for (int i =0; i <= listaDeManutencao.size()-1; i++) {
			ManutencaoDTO manutencaoDTO = new ManutencaoDTO(listaDeManutencao.get(i));
			listaDTO.add(manutencaoDTO);
		}
		return listaDTO;
	}
	
}
