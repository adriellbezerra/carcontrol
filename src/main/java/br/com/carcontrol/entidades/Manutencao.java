package br.com.carcontrol.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import br.com.carcontrol.entidades.enuns.TipoManutencao;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Manutencao implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer tipoManutencao;
	private Integer quilometro;
	private String descricaoProblema;
	private Date dataInicio;
	private Date dataFinal;
	private BigDecimal valorTotal;
	private String mecanicoResponsavel;
	
	@OneToMany(mappedBy="manutencao")
	private List<Arquivo> arquivos = new ArrayList<>();
	
	@OneToMany(mappedBy="manutencao")
	private List<Interacao> interacoes = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name = "oficina_id")
	private Oficina oficina;
	
	@ManyToOne
	@JoinColumn(name = "veiculo_id")
	private Veiculo veiculo;
	
	public Manutencao() {}

	public Manutencao(Integer id, TipoManutencao tipoManutencao, Integer quilometro, String descricaoProblema, Oficina oficina, Date dataInicio, Date dataFinal,
			BigDecimal valorTotal, Veiculo veiculo, String mecanicoResponsavel) {
		super();
		this.id = id;
		this.tipoManutencao = tipoManutencao.getCod();
		this.quilometro = quilometro;
		this.descricaoProblema = descricaoProblema;
		this.oficina = oficina;
		this.dataInicio = dataInicio;
		this.dataFinal = dataFinal;
		this.valorTotal = valorTotal;
		this.veiculo = veiculo;
		this.mecanicoResponsavel = mecanicoResponsavel;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public TipoManutencao getTipoManutencao() {
		return TipoManutencao.toEnum(tipoManutencao);
	}
	
	public void setTipoManutencao(TipoManutencao tipoManutencao) {
		this.tipoManutencao = tipoManutencao.getCod();
	}
	
	public Integer getQuilometro() {
		return quilometro;
	}

	public void setQuilometro(Integer quilometro) {
		this.quilometro = quilometro;
	}

	public String getDescricaoProblema() {
		return descricaoProblema;
	}

	public void setDescricaoProblema(String descricaoProblema) {
		this.descricaoProblema = descricaoProblema;
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

	public String getMecanicoResponsavel() {
		return mecanicoResponsavel;
	}

	public void setMecanicoResponsavel(String mecanicoResponsavel) {
		this.mecanicoResponsavel = mecanicoResponsavel;
	}
	
	public List<Arquivo> getArquivos() {
		return arquivos;
	}

	public void setArquivos(List<Arquivo> arquivos) {
		this.arquivos = arquivos;
	}
	
	public List<Interacao> getInteracoes() {
		return interacoes;
	}

	public void setInteracoes(List<Interacao> interacoes) {
		this.interacoes = interacoes;
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

}
