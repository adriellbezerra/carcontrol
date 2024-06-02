package br.com.carcontrol;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.carcontrol.entidades.Arquivo;
import br.com.carcontrol.entidades.Interacao;
import br.com.carcontrol.entidades.Manutencao;
import br.com.carcontrol.entidades.Oficina;
import br.com.carcontrol.entidades.Pessoa;
import br.com.carcontrol.entidades.Veiculo;
import br.com.carcontrol.entidades.Verificacao;
import br.com.carcontrol.entidades.enuns.TipoManutencao;
import br.com.carcontrol.entidades.enuns.TipoPessoa;
import br.com.carcontrol.entidades.enuns.verificacoes.Agua;
import br.com.carcontrol.entidades.enuns.verificacoes.Combustivel;
import br.com.carcontrol.entidades.enuns.verificacoes.Freios;
import br.com.carcontrol.entidades.enuns.verificacoes.Oleo;
import br.com.carcontrol.entidades.enuns.verificacoes.Pneus;
import br.com.carcontrol.repositorios.ArquivoRepository;
import br.com.carcontrol.repositorios.InteracaoRepository;
import br.com.carcontrol.repositorios.ManutencaoRepository;
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
	
	@Autowired
	private ManutencaoRepository manutencaoRepository;
	
	@Autowired
	private InteracaoRepository interacaoRepository;
	
	@Autowired
	private ArquivoRepository arquivoRepository;
	
	public static void main(String[] args){
		SpringApplication.run(CarcontrolApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Pessoa p1 = new Pessoa(null, "Matheus Ribeiro", "matheus", "matheus", TipoPessoa.CONDUTOR);
		Pessoa p2 = new Pessoa(null, "Elton Lima", "elton", "elton", TipoPessoa.CONDUTOR);
		Pessoa p3 = new Pessoa(null, "Adriell Bezerra", "adriell", "adriell", TipoPessoa.SUPERVISOR);
		Pessoa p4 = new Pessoa(null, "Elivaldo Júnior", "junior", "junior", TipoPessoa.CONDUTOR);
		Pessoa p5 = new Pessoa(null, "Lenilson Lima", "lenilson", "lenilson", TipoPessoa.CONDUTOR);
		Pessoa p6 = new Pessoa(null, "Emanuel Alexandre", "emanuel", "emanuel", TipoPessoa.SUPERVISOR);
		Pessoa p7 = new Pessoa(null, "Wenio Alail", "wenio", "wenio", TipoPessoa.CONDUTOR);
										
		Veiculo v1 = new Veiculo(null, "Fiat", "Strada", "2012", "123456", "PDC 7B07");
		Veiculo v2 = new Veiculo(null, "Fiat", "Strada", "2010", "654321", "OGA 5415");
		Veiculo v3 = new Veiculo(null, "Fiat", "Uno Vivace", "2013", "654351", "HOI 3C63");
		Veiculo v4 = new Veiculo(null, "Mitsubishi", "L200", "2008", "654442", "KLU 5220");
		Veiculo v5 = new Veiculo(null, "Fiat", "Uno Mile", "2011", "654458", "NOC 1821");
		Veiculo v6 = new Veiculo(null, "Fiat", "Uno Mile", "2010", "654381", "KLY 2F73");
		Veiculo v7 = new Veiculo(null, "Fiat", "Uno Mile", "2012", "652490", "NOD 3381");
				
		Oficina o1 = new Oficina(null, "Alinharcar LTDA", "23.432.212/0001-22", "Solânea", "Centro", "Governador João Fernandes de Lima", "10000", "998437729");
		Oficina o2 = new Oficina(null, "Oficina de Lucas LTDA", "23.432.213/0001-23", "Solânea", "Centro", "Praça 26 de Novembro", "55", "998437618");
		
		pessoaRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7));
		veiculoRepository.saveAll(Arrays.asList(v1, v2, v3, v4, v5, v6, v7));
		oficinaRepository.saveAll(Arrays.asList(o1, o2));
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Verificacao veM1 = new Verificacao(null, v1, p1, 123493, Agua.NORMAL, Oleo.NORMAL, Combustivel.CHEIO, Pneus.BOM_ESTADO, Freios.NORMAL, "Tudo Normal", sdf.parse("25/02/2024"));
		Verificacao veM2 = new Verificacao(null, v1, p1, 123721, Agua.NORMAL, Oleo.NORMAL, Combustivel.CHEIO, Pneus.BOM_ESTADO, Freios.NORMAL, "Luz de freio queimada", sdf.parse("26/02/2024"));
		Verificacao veM3 = new Verificacao(null, v1, p1, 123812, Agua.NORMAL, Oleo.NORMAL, Combustivel.RESERVA, Pneus.BOM_ESTADO, Freios.NORMAL, "Seta esquerda sem funcionar", sdf.parse("27/02/2024"));
		Verificacao veM4 = new Verificacao(null, v1, p1, 123924, Agua.NORMAL, Oleo.NORMAL, Combustivel.CHEIO, Pneus.BOM_ESTADO, Freios.NORMAL, "Tudo Normal", sdf.parse("28/02/2024"));
		
		Verificacao veL1 = new Verificacao(null, v2, p5, 40921, Agua.NORMAL, Oleo.NORMAL, Combustivel.RESERVA, Pneus.BOM_ESTADO, Freios.NORMAL, "Tudo Normal", sdf.parse("25/02/2024"));
		Verificacao veL2 = new Verificacao(null, v2, p5, 41000, Agua.NORMAL, Oleo.NORMAL, Combustivel.CHEIO, Pneus.BOM_ESTADO, Freios.NORMAL, "Escape perfurado", sdf.parse("26/02/2024"));
		Verificacao veL3 = new Verificacao(null, v2, p5, 41070, Agua.NORMAL, Oleo.NORMAL, Combustivel.CHEIO, Pneus.BOM_ESTADO, Freios.NORMAL, "Lanterna dianteira quebrada", sdf.parse("27/02/2024"));
		Verificacao veL4 = new Verificacao(null, v2, p5, 41121, Agua.NORMAL, Oleo.NORMAL, Combustivel.CHEIO, Pneus.BOM_ESTADO, Freios.NORMAL, "Tudo Normal", sdf.parse("28/02/2024"));
		
		Verificacao veW1 = new Verificacao(null, v7, p7, 25985, Agua.NORMAL, Oleo.NORMAL, Combustivel.CHEIO, Pneus.BOM_ESTADO, Freios.NORMAL, "Tudo Normal", sdf.parse("25/02/2024"));
		Verificacao veW2 = new Verificacao(null, v7, p7, 26010, Agua.NORMAL, Oleo.BAIXO, Combustivel.CHEIO, Pneus.BOM_ESTADO, Freios.NORMAL, "Tudo Normal", sdf.parse("26/02/2024"));
		
		
		p1.setVerificacoes(Arrays.asList(veM1, veM2, veM3, veM4));
		p5.setVerificacoes(Arrays.asList(veL1, veL2, veL3, veL4));
		p7.setVerificacoes(Arrays.asList(veW1, veW2));
		v1.setVerificacoes(Arrays.asList(veM1, veM2, veM3, veM4));
		v2.setVerificacoes(Arrays.asList(veL1, veL2, veL3, veL4));
		v7.setVerificacoes(Arrays.asList(veW1, veW2));
		
		pessoaRepository.saveAll(Arrays.asList(p1, p2, p7));
		veiculoRepository.saveAll(Arrays.asList(v1, v2, v7));
		
		verificacaoRepository.saveAll(Arrays.asList(veM1, veM2, veM3, veM4, veL1, veL2, veL3, veL4, veW1, veW2));
		
		Manutencao m1v7 = new Manutencao(null, TipoManutencao.PREVENTIVA, 26030, "Trocar Óleo", o1, sdf.parse("27/02/2024"), sdf.parse("27/02/2024"), new BigDecimal(40.00) , v7, "Mecânico da Alinhacar");
		
		Interacao inM1v7 = new Interacao(null, sdf.parse("27/02/2024"), "Iniciada e finalizada a troca de óleo", m1v7);
		
		Arquivo arM1v7 = new Arquivo(null, "Óleo que colocado", "https://drive.google.com/file/d/1_aHAaynLEpgqB4jjJZbY19YS3kN4qNrk/view?usp=sharing", m1v7);
		
		m1v7.setInteracoes(Arrays.asList(inM1v7));
		m1v7.setArquivos(Arrays.asList(arM1v7));
		manutencaoRepository.saveAll(Arrays.asList(m1v7));
		interacaoRepository.saveAll(Arrays.asList(inM1v7));
		arquivoRepository.saveAll(Arrays.asList(arM1v7));
		
	}

}
