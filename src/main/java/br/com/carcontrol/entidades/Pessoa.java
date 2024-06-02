package br.com.carcontrol.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import br.com.carcontrol.entidades.enuns.TipoPessoa;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Pessoa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String usuario;
	private String senha;
	private Integer tipo;
	
	//fetch = FetchType.EAGER
	@OneToMany(mappedBy="condutor")
	private List<Verificacao> verificacoes = new ArrayList<>();
	
	public Pessoa() {}

	public Pessoa(Integer id, String nome, String usuario, String senha, TipoPessoa tipo) {
		super();
		this.id = id;
		this.nome = nome;
		this.usuario = usuario;
		this.senha = senha;
		this.tipo = tipo.getCod();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public TipoPessoa getTipo() {
		return TipoPessoa.toEnum(tipo);
	}
	
	public void setTipo(TipoPessoa tipo) {
		this.tipo = tipo.getCod();
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
		Pessoa other = (Pessoa) obj;
		return Objects.equals(id, other.id);
	}
	
}
