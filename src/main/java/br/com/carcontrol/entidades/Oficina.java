package br.com.carcontrol.entidades;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Oficina implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String razaoSocial;
	private String cNPJ;
	//private Endereco endereco;
	private String numeroParaContato;
	
	public Oficina() {
	}

	public Oficina(Integer id, String razaoSocial, String cNPJ, String numeroParaContato) {
		super();
		this.id = id;
		this.razaoSocial = razaoSocial;
		this.cNPJ = cNPJ;
		this.numeroParaContato = numeroParaContato;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getcNPJ() {
		return cNPJ;
	}

	public void setcNPJ(String cNPJ) {
		this.cNPJ = cNPJ;
	}

	public String getNumeroParaContato() {
		return numeroParaContato;
	}

	public void setNumeroParaContato(String numeroParaContato) {
		this.numeroParaContato = numeroParaContato;
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
		Oficina other = (Oficina) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Oficina [id=" + id + ", razaoSocial=" + razaoSocial + ", cNPJ=" + cNPJ + ", numeroParaContato="
				+ numeroParaContato + "]";
	}
	
	
	
	
	
	

}
