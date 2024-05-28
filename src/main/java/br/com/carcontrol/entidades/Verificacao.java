package br.com.carcontrol.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import br.com.carcontrol.entidades.enuns.verificacoes.Agua;
import br.com.carcontrol.entidades.enuns.verificacoes.Combustivel;
import br.com.carcontrol.entidades.enuns.verificacoes.Freios;
import br.com.carcontrol.entidades.enuns.verificacoes.Oleo;
import br.com.carcontrol.entidades.enuns.verificacoes.Pneus;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Verificacao implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "veiculo_id")
	private Veiculo veiculo;
	
	private Integer condutor;
	private Integer quilometro;
	private Integer agua;
	private Integer oleo;
	private Integer combustivel;
	private Integer pneus;
	private Integer freios;
	private String outrasInformacoes;
	private Date data;
	
	public Verificacao(Integer id, Veiculo veiculo, Pessoa pessoa, Integer quilometro, 
			Agua agua, Oleo oleo, Combustivel combustivel, Pneus pneus, Freios freios,
			String outrasInformacoes, Date data) {
		this.id = id;
		this.veiculo = veiculo;
		this.condutor = pessoa.getId();
		this.quilometro = quilometro;
		this.agua = agua.getCod();
		this.oleo = oleo.getCod();
		this.combustivel = combustivel.getCod();
		this.pneus = pneus.getCod();
		this.freios = freios.getCod();
		this.outrasInformacoes = outrasInformacoes;
		this.data = data;
	}
	
	public Verificacao() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuilometro() {
		return quilometro;
	}

	public void setQuilometro(Integer quilometro) {
		this.quilometro = quilometro;
	}

	public Agua getAgua() {
		return Agua.toEnum(agua);
	}

	public void setAgua(Agua agua) {
		this.agua = agua.getCod();
	}

	public Oleo getOleo() {
		return Oleo.toEnum(oleo);
	}

	public void setOleo(Oleo oleo) {
		this.oleo = oleo.getCod();
	}

	public Combustivel getCombustivel() {
		return Combustivel.toEnum(combustivel);
	}

	public void setCombustivel(Combustivel combustivel) {
		this.combustivel = combustivel.getCod();
	}

	public Pneus getPneus() {
		return Pneus.toEnum(pneus);
	}

	public void setPneus(Pneus pneus) {
		this.pneus = pneus.getCod();
	}

	public Freios getFreios() {
		return Freios.toEnum(freios);
	}

	public void setFreios(Freios freios) {
		this.freios = freios.getCod();
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
	
	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Integer getCondutor() {
		return condutor;
	}

	public void setCondutor(Pessoa condutor) {
		this.condutor = condutor.getId();
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
		Verificacao other = (Verificacao) obj;
		return Objects.equals(id, other.id);
	}

}
