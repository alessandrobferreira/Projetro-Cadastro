package br.com.projeto.cadastro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.cadastro.dto.PessoaDTO;
import br.com.projeto.cadastro.service.CadastroService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/cadastro")
public class CadastroController {

	@Autowired
	CadastroService service;
	
	@GetMapping
	public List<PessoaDTO> getAll() {
		return service.getAll();
	}
	
	@PostMapping
	public ResponseEntity<PessoaDTO> save(@RequestBody PessoaDTO Pessoa) {
		return new ResponseEntity<PessoaDTO>(service.save(Pessoa), HttpStatus.CREATED);
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> delete(@PathVariable("id") Integer idCadastro) throws Exception {
		return new ResponseEntity<>(service.delete(idCadastro), HttpStatus.OK);
	}
	 

}
