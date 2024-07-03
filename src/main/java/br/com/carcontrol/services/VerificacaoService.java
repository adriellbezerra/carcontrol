package br.com.carcontrol.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.carcontrol.domain.Veiculo;
import br.com.carcontrol.domain.Verificacao;
import br.com.carcontrol.repositories.VerificacaoRepository;

@Service
public class VerificacaoService {

	@Autowired
	private VerificacaoRepository verificacaoRepository;
	
	@Autowired
	private VeiculoService veiculoService;
	
	public List<Verificacao> findByVeiculo(Integer id_veiculo) {
		Veiculo veiculo = veiculoService.findById(id_veiculo);
		return  verificacaoRepository.findByVeiculo(veiculo);
	}	
	
	
	
	
	
}
