package br.com.fiap.api.techBrasil.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.api.techBrasil.entity.Candidato;

@Repository
public interface CandidatoRepository extends JpaRepository<Candidato, Integer> {

	List<Candidato> findByNomeCompleto(String cand); 

}
