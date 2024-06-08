package br.com.carcontrol.domain.enuns.verificacoes;

public enum Freios {
	
	NORMAL(1, "Freio e mão e de pé estão funcionando corretamente"),
	REQUER_REGULAGEM(2, "Freio de mão ou de pé está precisando de regulagem"),
	TOTALMENTE_SEM_FREIO(3, "Freio de mão ou de pé ou ambos estão danificados e requerem manutenção imediatamente");
	
	
	private int cod;
	private String descricao;
	
	private Freios (int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public static Freios toEnum(Integer id) {
		if(id == null) {
			return null;
		}
		
		for (Freios x : Freios.values()) {
			if (id.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido " + id);
	}

}
