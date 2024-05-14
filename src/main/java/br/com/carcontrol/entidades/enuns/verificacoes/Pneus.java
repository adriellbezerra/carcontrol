package br.com.carcontrol.entidades.enuns.verificacoes;

public enum Pneus {
	
	BOM_ESTADO(1, "Todos os pneus estão em bom estados e calibrados"),
	BOM_ESTADO_DESCALIBRADO(2, "Todos os pneus estão em bom estados, porém um ou mais está descalibrado"),
	PRECISA_SUBSTITUIR(3, "É preciso substituir um ou mais pneus, porém todos estão calibrados"),
	PRECISA_SUBSTITUIR_DESCALIBRADO(4, "Um ou mais pneus precisa ser substituído e um ou mais pneus está descalibrado"),
	PESSIMO_ESTADO(5, "Substituir imediatamente pois oferece riscos");
	
	
	private int cod;
	private String descricao;
	
	private Pneus (int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public static Pneus toEnum(Integer id) {
		if(id == null) {
			return null;
		}
		
		for (Pneus x : Pneus.values()) {
			if (id.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido " + id);
	}

}
