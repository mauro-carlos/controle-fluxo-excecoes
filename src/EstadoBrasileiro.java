package src;

public enum EstadoBrasileiro {
	
	SAO_PAULO ("SP", "SAO PAULO", 11),
	RIO_JANEIRO("RJ", "RIO DE JANEIRO", 12),
	PIAUI ("PI", "PIAUI",13),
	MARANHAO("MA", "MARANHAO",14),
	CEARA("CE", "CEARA",15);
	
	
	private String nome;
	private String sigla;
	private int ibge;
	
	private EstadoBrasileiro(String  sigla, String nome, int ibge) {
		this.nome = nome;
		this.sigla = sigla;
		this.ibge = ibge;
	}
	
	public int getIbge() {
		return ibge;
	}

	public String getNome() {
		return nome;
	}

	public String getSigla() {
		return sigla;
	}
	
	public String getNomeMaiusculo() {
		
		return nome.toUpperCase();
	}
	
	

}
