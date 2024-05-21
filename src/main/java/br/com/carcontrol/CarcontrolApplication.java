package br.com.carcontrol;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.carcontrol.entidades.Veiculo;
import br.com.carcontrol.repositorios.VeiculoRepository;

@SpringBootApplication
public class CarcontrolApplication implements CommandLineRunner{

	@Autowired
	private VeiculoRepository veiculoRepository;
	
	public static void main(String[] args){
		SpringApplication.run(CarcontrolApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Veiculo v1 = new Veiculo(null, "Fiat", "Uno mile", "2012", "123456", "PDC 7B07");
		Veiculo v2 = new Veiculo(null, "Fiat", "Uno mile", "2010", "654321", "OGA 5415");
		
		veiculoRepository.saveAll(Arrays.asList(v1, v2));
		
	}

}
