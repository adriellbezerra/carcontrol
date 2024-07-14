package br.com.carcontrol.domain.dto;

import java.io.Serializable;
import java.util.Date;

import br.com.carcontrol.domain.Verificacao;
import br.com.carcontrol.domain.enuns.verificacoes.Agua;
import br.com.carcontrol.domain.enuns.verificacoes.Combustivel;
import br.com.carcontrol.domain.enuns.verificacoes.Freios;
import br.com.carcontrol.domain.enuns.verificacoes.Oleo;
import br.com.carcontrol.domain.enuns.verificacoes.Pneus;

public class VerificacaoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String veiculo;
	private String condutor;
	private Integer quilometro;
	private Agua agua;
	private Oleo oleo;
	private Combustivel combustivel;
	private Pneus pneus;
	private Freios freios;
	private String outrasInformacoes;
	private Date data;
	
	public VerificacaoDTO(Verificacao verificacao) {
		this.id = verificacao.getId();
		this.veiculo = verificacao.getVeiculo().getPlaca();
		this.condutor = verificacao.getCondutor().getNome();
		this.quilometro = verificacao.getQuilometro();
		this.agua = verificacao.getAgua();
		this.oleo = verificacao.getOleo();
		this.combustivel = verificacao.getCombustivel();
		this.pneus = verificacao.getPneus();
		this.freios = verificacao.getFreios();
		this.outrasInformacoes = verificacao.getOutrasInformacoes();
		this.data = verificacao.getData();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}

	public String getCondutor() {
		return condutor;
	}

	public void setCondutor(String condutor) {
		this.condutor = condutor;
	}

	public Integer getQuilometro() {
		return quilometro;
	}

	public void setQuilometro(Integer quilometro) {
		this.quilometro = quilometro;
	}

	public Agua getAgua() {
		return agua;
	}

	public void setAgua(Agua agua) {
		this.agua = agua;
	}

	public Oleo getOleo() {
		return oleo;
	}

	public void setOleo(Oleo oleo) {
		this.oleo = oleo;
	}

	public Combustivel getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(Combustivel combustivel) {
		this.combustivel = combustivel;
	}

	public Pneus getPneus() {
		return pneus;
	}

	public void setPneus(Pneus pneus) {
		this.pneus = pneus;
	}

	public Freios getFreios() {
		return freios;
	}

	public void setFreios(Freios freios) {
		this.freios = freios;
	}

	public String getOutrasInformacoes() {
		return outrasInformacoes;
	}

	public void setOutrasInformacoes(String outrasInformacoes) {
		this.outrasInformacoes = outrasInformacoes;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}	
	
}
