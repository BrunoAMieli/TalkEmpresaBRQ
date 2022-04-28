package br.com.fiap.api.techBrasil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.api.techBrasil.entity.Candidato;

@Repository
public interface GeneroRepository extends JpaRepository<Candidato, Integer>{

}
