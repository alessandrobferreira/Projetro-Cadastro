package br.com.projeto.cadastro.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.cadastro.dto.PessoaDTO;
import br.com.projeto.cadastro.entity.Pessoa;
import br.com.projeto.cadastro.repository.CadastroRepository;

@Service
public class CadastroService {

	@Autowired
	CadastroRepository repository;
	
	//CRUD
	public List<PessoaDTO> getAll() {
		List<Pessoa> pessoas = repository.findAll();
		List<PessoaDTO> listDTOs = new ArrayList<>();

		for (Pessoa pessoa : pessoas) {
			listDTOs.add(pessoa.getDTO());
		}

		return listDTOs;
	}

	public PessoaDTO getById(Integer id) throws Exception {
		Pessoa pessoa = repository.findById(id).orElseThrow(() -> new Exception("Cadastro não encontrada"));

		return pessoa.getDTO();
	}

	public PessoaDTO save(PessoaDTO dto) {
		Pessoa pessoa = repository.save(dto.convertToEntity());
		return pessoa.getDTO();

	}

	public Boolean delete(Integer idCadastro) throws Exception {
		Pessoa pes = repository.findById(idCadastro).orElseThrow(() -> new Exception("Cadastro não encontrada"));
		repository.delete(pes);
		return false;
	}
}
