package br.com.carcontrol.entidades.enuns.verificacoes;

public enum Combustivel {
	
	CHEIO(1, "Normal"),
	RESERVA(2, "Abaixo do nível aceitável"),
	SEM_COMBUSTIVEL(3, "Reservatório vazio");
	
	
	
	private int cod;
	private String descricao;
	
	private Combustivel (int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public static Combustivel toEnum(Integer id) {
		if(id == null) {
			return null;
		}
		
		for (Combustivel x : Combustivel.values()) {
			if (id.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido " + id);
	}

}
