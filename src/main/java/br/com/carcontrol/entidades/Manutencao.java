package br.com.carcontrol.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Manutencao implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	//private Oficina oficina;
	private Date previsaoInicio;
	private Date dataInicio;
	private Date dataFinal;
	private BigDecimal precoMaoDeObra;
	private String audioDoMecanico;
	
	//private Produto precas;
	@ManyToOne
	@JoinColumn(name = "veiculo_id")
	private Veiculo veiculo;
	
	public Manutencao() {}

	public Manutencao(Integer id, String descricao, Date previsaoInicio, Date dataInicio, Date dataFinal,
			BigDecimal precoMaoDeObra, Veiculo veiculo, String audioDoMecanico) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.previsaoInicio = previsaoInicio;
		this.dataInicio = dataInicio;
		this.dataFinal = dataFinal;
		this.precoMaoDeObra = precoMaoDeObra;
		this.veiculo = veiculo;
		this.audioDoMecanico = audioDoMecanico;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getPrevisaoInicio() {
		return previsaoInicio;
	}

	public void setPrevisaoInicio(Date previsaoInicio) {
		this.previsaoInicio = previsaoInicio;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

	public BigDecimal getPrecoMaoDeObra() {
		return precoMaoDeObra;
	}

	public void setPrecoMaoDeObra(BigDecimal precoMaoDeObra) {
		this.precoMaoDeObra = precoMaoDeObra;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public String getAudioDoMecanico() {
		return audioDoMecanico;
	}

	public void setAudioDoMecanico(String audioDoMecanico) {
		this.audioDoMecanico = audioDoMecanico;
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
		Manutencao other = (Manutencao) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Manutencao [id=" + id + ", descricao=" + descricao + ", previsaoInicio=" + previsaoInicio
				+ ", dataInicio=" + dataInicio + ", dataFinal=" + dataFinal + ", precoMaoDeObra=" + precoMaoDeObra
				+ ", veiculo=" + veiculo + "]";
	}

	
	
	
	
	

}
