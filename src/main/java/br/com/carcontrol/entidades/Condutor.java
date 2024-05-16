package br.com.carcontrol.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Condutor implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="PESSOA_NOME")
	private String pessoaNome;
	private Date data;
	
	@ManyToMany(mappedBy="condutores") 
	private List<Veiculo> veiculos = new ArrayList<>();
	
	@OneToMany(mappedBy="condutor")
	private List<Verificacao> verificacoes = new ArrayList<>();
	
	public Condutor() {}

	public Condutor(Integer id, Pessoa pessoa, Date data) {
		super();
		this.id = id;
		this.pessoaNome = pessoa.getNome();
		this.data = data;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPessoa() {
		return pessoaNome;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoaNome = pessoa.getNome();
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
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
		Condutor other = (Condutor) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Condutor [id=" + id + ", pessoaNome=" + pessoaNome + ", data=" + data + ", veiculos=" + veiculos + "]";
	}

}
