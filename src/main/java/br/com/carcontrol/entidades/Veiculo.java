package br.com.carcontrol.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Veiculo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String fabricante;
	private String modelo;
	private String anoFabricacao;
	private String chassi;
	private String placa;	
	
	@OneToMany(mappedBy="veiculo")
	private List<Manutencao> manutencoes = new ArrayList<>();
	
	@OneToMany(mappedBy="veiculo")
	private List<Verificacao> verificacoes = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(name = "VEICULO_CONDUTOR", 
	joinColumns = @JoinColumn(name = "veiculo_id"), 
	inverseJoinColumns = @JoinColumn(name = "condutor_id") 
	)
	private List<Condutor> condutores = new ArrayList<>();
	
	public Veiculo() {}
	
	public Veiculo (Integer id, String fabricante, String modelo, 
			String anoFabricacao, String chassi, String placa) {
		super();
		this.id = id;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.setChassi(chassi);
		this.placa = placa;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	
	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public List<Manutencao> getManutencoes() {
		return manutencoes;
	}

	public void setManutencoes(List<Manutencao> manutencoes) {
		this.manutencoes = manutencoes;
	}

	public List<Condutor> getCondutores() {
		return condutores;
	}

	public void setCondutores(List<Condutor> condutores) {
		this.condutores = condutores;
	}
	
	public List<Verificacao> getVerificacoes() {
		return verificacoes;
	}

	public void setVerificacoes(List<Verificacao> verificacoes) {
		this.verificacoes = verificacoes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Veiculo [id=" + id + ", fabricante=" + fabricante + ", modelo=" + modelo + ", anoFabricacao="
				+ anoFabricacao + ", placa=" + placa + "]";
	}

	

}
