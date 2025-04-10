package br.com.carcontrol.domain.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import br.com.carcontrol.domain.Manutencao;

public class ManutencaoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String tipoManutencao;
	private Integer quilometro;
	private String descricaoProblema;
	private String descricaoSolucao;
	private Date dataInicio;
	private Date dataFinal;
	private BigDecimal valorTotal;
	private String mecanicoResponsavel;
	private String oficina;
	private String veiculo;
	
	
 	public ManutencaoDTO(Manutencao manutencao) {
 		this.id = manutencao.getId();
 		this.tipoManutencao = manutencao.getTipoManutencao().getDescricao();
 		this.quilometro = manutencao.getQuilometro();
 		this.descricaoProblema = manutencao.getDescricaoProblema();
 		this.descricaoSolucao = manutencao.getDescricaoSolucao();
 		this.dataInicio = manutencao.getDataInicio();
 		this.dataFinal = manutencao.getDataFinal();
 		this.valorTotal = manutencao.getValorTotal();
 		this.mecanicoResponsavel = manutencao.getMecanicoResponsavel();
 		this.oficina = manutencao.getOficina().getRazaoSocial();
 		this.veiculo = manutencao.getVeiculo().getPlaca();
 		
 	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipoManutencao() {
		return tipoManutencao;
	}

	public void setTipoManutencao(String tipoManutencao) {
		this.tipoManutencao = tipoManutencao;
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

	public String getDescricaoSolucao() {
		return descricaoSolucao;
	}

	public void setDescricaoSolucao(String descricaoSolucao) {
		this.descricaoSolucao = descricaoSolucao;
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

	public String getMecanicoResponsavel() {
		return mecanicoResponsavel;
	}

	public void setMecanicoResponsavel(String mecanicoResponsavel) {
		this.mecanicoResponsavel = mecanicoResponsavel;
	}

	public String getOficina() {
		return oficina;
	}

	public void setOficina(String oficina) {
		this.oficina = oficina;
	}

	public String getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}
	
 }
