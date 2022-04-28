package br.com.fiap.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.domain.Candidato;

@Repository
public interface CandidatoRepository extends JpaRepository<Candidato, Integer> {

	List<Candidato> findByNome(String cand); 

}
