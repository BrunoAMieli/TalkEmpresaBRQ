package br.com.fiap.api.techBrasil.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.api.techBrasil.entity.Candidato;
import br.com.fiap.api.techBrasil.repository.CandidatoRepository;

@RestController
@RequestMapping("candidato")
public class CandidatoResource {

	@Autowired
	private CandidatoRepository candidatoRepository;
	
	@GetMapping
	public List<Candidato> listar() {
		return candidatoRepository.findAll();
	}
	
	@GetMapping("{codigo}")
	public Candidato buscar(@PathVariable int codigo) {
		return candidatoRepository.findById(codigo).get();
	}
	
    @ResponseStatus(code = HttpStatus.CREATED) 
    @PostMapping 
    public Candidato cadastrar(@RequestBody Candidato candidato) { 
        return candidatoRepository.save(candidato); 
    }
    
    @PutMapping("{id}") 
    public Candidato atualizar(@RequestBody Candidato candidato, @PathVariable int id) { 
    	candidato.setCodigo(id); 
        return candidatoRepository.save(candidato); 
    }
    
    @DeleteMapping("{codigo}") 
    public void remover(@PathVariable int codigo) { 
        candidatoRepository.deleteById(codigo); 
    }
    
    @GetMapping(value = "/buscaAvancada" )
    public List<Candidato> findBySkill() {
               return candidatoRepository.findBySkill_OrderByCertificadoDesc("CSS");
    }

}