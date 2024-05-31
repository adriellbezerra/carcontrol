package br.com.carcontrol;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.carcontrol.entidades.Oficina;
import br.com.carcontrol.entidades.Pessoa;
import br.com.carcontrol.entidades.Veiculo;
import br.com.carcontrol.entidades.Verificacao;
import br.com.carcontrol.entidades.enuns.TipoPessoa;
import br.com.carcontrol.entidades.enuns.verificacoes.Agua;
import br.com.carcontrol.entidades.enuns.verificacoes.Combustivel;
import br.com.carcontrol.entidades.enuns.verificacoes.Freios;
import br.com.carcontrol.entidades.enuns.verificacoes.Oleo;
import br.com.carcontrol.entidades.enuns.verificacoes.Pneus;
import br.com.carcontrol.repositorios.OficinaRepository;
import br.com.carcontrol.repositorios.PessoaRepository;
import br.com.carcontrol.repositorios.VeiculoRepository;
import br.com.carcontrol.repositorios.VerificacaoRepository;

@SpringBootApplication
public class CarcontrolApplication implements CommandLineRunner{

	@Autowired
	private VeiculoRepository veiculoRepository;
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private OficinaRepository oficinaRepository;
	
	@Autowired
	private VerificacaoRepository verificacaoRepository;
	
	public static void main(String[] args){
		SpringApplication.run(CarcontrolApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Pessoa p1 = new Pessoa(null, "Pessoa1 de sobrenome1", "pessoa1", "pessoa1", TipoPessoa.CONDUTOR);
		Pessoa p2 = new Pessoa(null, "Pessoa2 de Sobrenome2", "pessoa2", "pessoa2", TipoPessoa.CONDUTOR);
		Pessoa p3 = new Pessoa(null, "Pessoa3 de Sobrenome3", "pessoa3", "pessoa3", TipoPessoa.SUPERVISOR);
								
		Veiculo v1 = new Veiculo(null, "Fiat", "Uno mile", "2012", "123456", "PDC 7B07");
		Veiculo v2 = new Veiculo(null, "Fiat", "Strada", "2010", "654321", "OGA 5415");
		
		Oficina o1 = new Oficina(null, "Oficina do Baixio LTDA", "23.432.212/0001-23", "Solânea", "Baixio", "Travessa Manoel Gomes", "298", "998437618");
		Oficina o2 = new Oficina(null, "Oficina de Lucas LTDA", "23.432.213/0001-23", "Solânea", "Centro", "Praça 26 de Novembro", "55", "998437618");
		
		pessoaRepository.saveAll(Arrays.asList(p1, p2, p3));
		veiculoRepository.saveAll(Arrays.asList(v1, v2));
		oficinaRepository.saveAll(Arrays.asList(o1, o2));
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Verificacao ve = new Verificacao(null, v1, p1, 123493, Agua.NORMAL, Oleo.NORMAL, Combustivel.CHEIO, Pneus.BOM_ESTADO, Freios.NORMAL, "Tudo Normal", sdf.parse("25/02/2024"));
		
		verificacaoRepository.saveAll(Arrays.asList(ve));
		
	}

}
