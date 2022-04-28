package br.com.fiap.api.techBrasil.model;

public enum Genero {

	MASCULINO ("Masculino", "M"),
	FEMININO ("Feminino", "F");
	
	private String descricao;
	
	private String sigla;

	private Genero(String descricao, String sigla) {
		this.descricao = descricao;
		this.sigla = sigla;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getSigla() {
		return sigla;
	}
	
}
