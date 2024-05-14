package br.com.carcontrol.entidades.enuns.verificacoes;

public enum Agua {
	
	NORMAL(1, "Normal"),
	BAIXO(2, "Abaixo do nível aceitável"),
	VAZIO(3, "Reservatório vazio");
	
	
	
	private int cod;
	private String descricao;
	
	private Agua (int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public static Agua toEnum(Integer id) {
		if(id == null) {
			return null;
		}
		
		for (Agua x : Agua.values()) {
			if (id.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido " + id);
	}

}
