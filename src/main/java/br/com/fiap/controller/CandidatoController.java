package br.com.fiap.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.fiap.domain.Candidato;
import br.com.fiap.repository.CandidatoRepository;
import br.com.fiap.repository.GeneroRepository;

@Controller
@RequestMapping("candidato")
public class CandidatoController {

	@Autowired
	private CandidatoRepository repository;
	
    @Autowired 
    private GeneroRepository generoRepository; 

    @GetMapping("cadastrar") 
    public String abrirFormulario(Candidato candidato, Model model){ 
        model.addAttribute("generos", generoRepository.findAll()); 
        return "candidato/cadastro"; 
    } 
	
	@PostMapping("cadastrar")
	public String realizarCadastro(@Valid Candidato candidato, BindingResult result, RedirectAttributes redirectAttributes) {
        if(result.hasErrors()) { 
			return "candidato/cadastro";
		}
        redirectAttributes.addFlashAttribute("msg", "Candidato cadastrado com sucesso!"); 
        repository.save(candidato);
        return "redirect:listar";
	}
	
	@GetMapping("listar")
	public String listarCandidatos(Model model) {
		model.addAttribute("candidatos", repository.findAll());
		return "candidato/lista";
	}
	
    @GetMapping("editar/{id}") 
    public String editar(@PathVariable("id") int codigo, Model model){ 
        model.addAttribute("candidatos",repository.findById(codigo)); 
        return "candidato/cadastro"; 
    }
    
    @PostMapping("excluir") 
    public String remover(int codigo, RedirectAttributes redirectAttributes) { 
        redirectAttributes.addFlashAttribute("msg", "Removido!"); 
        repository.deleteById(codigo); 
        return "redirect:listar"; 
    }
    
}
