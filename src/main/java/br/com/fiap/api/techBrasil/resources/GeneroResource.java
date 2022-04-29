package br.com.fiap.api.techBrasil.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.api.techBrasil.entity.Genero;
import br.com.fiap.api.techBrasil.repository.GeneroRepository;

@RestController
@RequestMapping("genero")
public class GeneroResource {

	@Autowired
	private GeneroRepository generoRepository;
	
    @ResponseStatus(code = HttpStatus.CREATED) 
    @PostMapping 
    public Genero cadastrarGenero(@RequestBody Genero genero) { 
        return generoRepository.save(genero); 
    }
    
    @GetMapping("editar/{id}") 
    public String editar(@PathVariable("id") int codigo, Model model){ 
        model.addAttribute("generos",generoRepository.findById(codigo)); 
        return "candidato/cadastro"; 
    }
    
	@GetMapping("listar")
	public String listarCandidatos(Model model) {
		model.addAttribute("generos", generoRepository.findAll());
		return "candidato/lista";
	}
}
