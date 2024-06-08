package br.com.carcontrol.domain.enuns.verificacoes;

public enum Oleo {
	
	NORMAL(1, "Normal"),
	BAIXO(2, "Abaixo do nível aceitável"),
	ESCURO(3, "Óleo escuro demais"),
	VAZIO(4, "Reservatório totalmente vazio");
	
	
	private int cod;
	private String descricao;
	
	private Oleo (int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public static Oleo toEnum(Integer id) {
		if(id == null) {
			return null;
		}
		
		for (Oleo x : Oleo.values()) {
			if (id.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido " + id);
	}

}
