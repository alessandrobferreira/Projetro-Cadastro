package br.com.projeto.cadastro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.cadastro.entity.Pessoa;

@Repository
public interface CadastroRepository extends JpaRepository<Pessoa, Integer>{

	public List<Pessoa> findByTituloContaining(String titulo);
}
