package br.com.carcontrol.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.carcontrol.domain.Pessoa;
import br.com.carcontrol.domain.Veiculo;
import br.com.carcontrol.domain.Verificacao;
import br.com.carcontrol.domain.dto.VerificacaoDTO;
import br.com.carcontrol.repositories.VerificacaoRepository;

@Service
public class VerificacaoService {

	@Autowired
	private VerificacaoRepository verificacaoRepository;
	
	@Autowired
	private VeiculoService veiculoService;
	
	@Autowired
	private PessoaService pessoaService;
	
	public List<VerificacaoDTO> findByVeiculo(Integer id_veiculo) {
		Veiculo veiculo = veiculoService.findById(id_veiculo);
		List<Verificacao> listaVerificacao =   verificacaoRepository.findByVeiculo(veiculo);
		return toDTO(listaVerificacao);
	}	
	
	public List<VerificacaoDTO> findByCondutor(Integer id_condutor) {
		Pessoa pessoa = pessoaService.findById(id_condutor);
		List<Verificacao> listaVerificacao = verificacaoRepository.findByCondutor(pessoa);
		return toDTO(listaVerificacao);
	}
	
	public List<VerificacaoDTO> findByData(String data){
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		try {
			List<Verificacao> listaVerificacao =  verificacaoRepository.findByData(sdf.parse(data));
			return toDTO(listaVerificacao);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<VerificacaoDTO> toDTO(List<Verificacao> listaDeVerificacao) {
		List<VerificacaoDTO> listaDTO = new ArrayList<>();
		for (int i =0; i <= listaDeVerificacao.size()-1; i++) {
			VerificacaoDTO verificacaoDTO = new VerificacaoDTO(listaDeVerificacao.get(i));
			listaDTO.add(verificacaoDTO);
		}
		return listaDTO;
	}
	
	
}
