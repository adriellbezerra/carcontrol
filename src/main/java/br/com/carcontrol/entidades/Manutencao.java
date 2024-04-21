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
	private Date dataInicio;
	private Date dataFinal;
	private BigDecimal valorTotal;
	private String audioDoMecanico;
	private String mecanicoResponsavel;
	
	@ManyToOne
	@JoinColumn(name = "oficina_id")
	private Oficina oficina;
	
	@ManyToOne
	@JoinColumn(name = "veiculo_id")
	private Veiculo veiculo;
	
	public Manutencao() {}

	public Manutencao(Integer id, String descricao, Oficina oficina, Date dataInicio, Date dataFinal,
			BigDecimal valorTotal, Veiculo veiculo, String audioDoMecanico, String mecanicoResponsavel) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.oficina = oficina;
		this.dataInicio = dataInicio;
		this.dataFinal = dataFinal;
		this.valorTotal = valorTotal;
		this.veiculo = veiculo;
		this.audioDoMecanico = audioDoMecanico;
		this.mecanicoResponsavel = mecanicoResponsavel;
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
	
	public Oficina getOficina() {
		return oficina;
	}

	public void setOficina(Oficina oficina) {
		this.oficina = oficina;
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

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
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
	
	public String getMecanicoResponsavel() {
		return mecanicoResponsavel;
	}

	public void setMecanicoResponsavel(String mecanicoResponsavel) {
		this.mecanicoResponsavel = mecanicoResponsavel;
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
		return "Manutencao [id=" + id + ", descricao=" + descricao + ", oficina=" + oficina + ", dataInicio="
				+ dataInicio + ", dataFinal=" + dataFinal + ", valorTotal=" + valorTotal + ", audioDoMecanico="
				+ audioDoMecanico + ", mecanicoResponsavel=" + mecanicoResponsavel + ", veiculo=" + veiculo + "]";
	}

}
