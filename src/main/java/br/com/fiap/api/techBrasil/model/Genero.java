package br.com.fiap.api.techBrasil.model;

public enum Genero {

	MASCULINO ("M"),
	FEMININO ("F");
	
		
	private String sigla;

	private Genero(String sigla) {
		this.sigla = sigla;
	}

	
	public String getSigla() {
		return sigla;
	}
	
}
