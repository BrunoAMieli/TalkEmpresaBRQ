package br.com.fiap.api.techBrasil.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import lombok.Data;

@Data
@Entity
@SequenceGenerator(name = "candidato", sequenceName = "SQ_TB_CANDIDATO", allocationSize = 1)
public class Candidato {

	@Id
	@GeneratedValue(generator = "candidato", strategy = GenerationType.IDENTITY)
	private int codigo;
	
	@NotBlank(message = "Nome obrigatório.")
	@Size(max = 200)
	@NotNull
	private String nomeCompleto;
	
	@CPF
	@NotNull
	private String cpf;
	
	@Email
	@NotNull
	private String email;
	
	@NotNull
	private String telefone;
	
	@ManyToOne
	private Genero genero;
	
	@Past
	private LocalDate dataNascimento;
	
	@NotNull
	private String skill;
	
	@NotNull
	private int experiencia;
	
	private String certificado;

	@NotNull
	private String escolaFaculdade;

	@Past
	private LocalDate dataCertificado;

	@Override
	public String toString() {
		return "Candidato [codigo=" + codigo + ", nomeCompleto=" + nomeCompleto + ", cpf=" + cpf + ", email=" + email
				+ ", telefone=" + telefone + ", genero=" + genero + ", dataNascimento=" + dataNascimento + ", skill="
				+ skill + "]";
	}

	public void setCodigo(int id) {
		// TODO Auto-generated method stub
		
	}

}
