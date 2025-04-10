package br.com.carcontrol.domain.enuns;

public enum TipoManutencao {
	
	PREVENTIVA(1, "Preventiva"),
	CORRETIVA(2, "Corretiva");
	
	private int cod;
	private String descricao;
	
	private TipoManutencao (int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public static TipoManutencao toEnum(Integer id) {
		if(id == null) {
			return null;
		}
		
		for (TipoManutencao x : TipoManutencao.values()) {
			if (id.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido " + id);
	}
}
