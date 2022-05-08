package br.com.fiap.api.techBrasil.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Data
@Entity
public class Genero {
	
	@Id
	@SequenceGenerator(name = "genero", sequenceName = "SQ_GENERO", allocationSize = 1)
	@GeneratedValue(generator = "genero", strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	private String nome;
	
	private double valor;
	
	
}
