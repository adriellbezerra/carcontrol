package br.com.carcontrol.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.carcontrol.domain.Pessoa;
import br.com.carcontrol.domain.Veiculo;
import br.com.carcontrol.domain.Verificacao;
import br.com.carcontrol.repositories.VerificacaoRepository;

@Service
public class VerificacaoService {

	@Autowired
	private VerificacaoRepository verificacaoRepository;
	
	@Autowired
	private VeiculoService veiculoService;
	
	@Autowired
	private PessoaService pessoaService;
	
	public List<Verificacao> findByVeiculo(Integer id_veiculo) {
		Veiculo veiculo = veiculoService.findById(id_veiculo);
		return  verificacaoRepository.findByVeiculo(veiculo);
	}	
	
	public List<Verificacao> findByCondutor(Integer id_condutor) {
		Pessoa pessoa = pessoaService.findById(id_condutor);
		return  verificacaoRepository.findByCondutor(pessoa);
	}
	
	public List<Verificacao> findByData(String data){
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		try {
			return  verificacaoRepository.findByData(sdf.parse(data));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
}
