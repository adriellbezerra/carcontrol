package br.com.carcontrol.entidades.enuns;

public enum TipoPessoa {
	
	SUPERVISOR(1, "Supervisor"),
	CONDUTOR(2, "Condutor");
	
	private int cod;
	private String descricao;
	
	private TipoPessoa (int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public static TipoPessoa toEnum(Integer id) {
		if(id == null) {
			return null;
		}
		
		for (TipoPessoa x : TipoPessoa.values()) {
			if (id.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido " + id);
	}
}
