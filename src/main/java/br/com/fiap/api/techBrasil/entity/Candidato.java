package br.com.fiap.api.techBrasil.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

import br.com.fiap.api.techBrasil.model.Genero;
import lombok.Data;

@Data
@Entity
@SequenceGenerator(name = "candidato", sequenceName = "SQ_TB_CANDIDATO", allocationSize = 1)
public class Candidato {

	@Id
	@GeneratedValue(generator = "candidato", strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	@NotBlank(message = "Nome obrigatório.")
	@Size(max = 200)
	private String nomeCompleto;
	
	@CPF
	private String cpf;
	
	@Email
	private String email;
	
	private String telefone;
	
	private Genero genero;
	
	@Past
	private LocalDate dataNascimento;
	
	private String skill;

	public Candidato() {
		super();

	}

	public Candidato(int codigo, @NotBlank(message = "Nome obrigatório.") @Size(max = 200) String nomeCompleto,
			@CPF String cpf, @Email String email, String telefone, Genero genero, @Past LocalDate dataNascimento,
			String skill) {
		super();
		this.codigo = codigo;
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.genero = genero;
		this.dataNascimento = dataNascimento;
		this.skill = skill;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public String toString() {
		return "Candidato [codigo=" + codigo + ", nomeCompleto=" + nomeCompleto + ", cpf=" + cpf + ", email=" + email
				+ ", telefone=" + telefone + ", genero=" + genero + ", dataNascimento=" + dataNascimento + ", skill="
				+ skill + "]";
	}

}
