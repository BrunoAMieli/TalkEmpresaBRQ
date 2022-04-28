package br.com.fiap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.domain.Candidato;

@Repository
public interface GeneroRepository extends JpaRepository<Candidato, Integer>{

}
