package br.com.fiap.api.techBrasil.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class Skill {

	@Id
	@GeneratedValue(generator = "skill", strategy = GenerationType.SEQUENCE)
	private int id;

	@NotBlank(message = "Tipo obrigatório.")
	@Size(max = 200)
	private String tipoSkill;

	private String certificado;

	private String escolaFaculdade;

	private LocalDate dataCertificado;
	
}

	
	