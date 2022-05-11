package br.com.projeto.cadastro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.projeto.cadastro.dto.PessoaDTO;

@Entity
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	@Column(nullable = false, length = 20)
	private String descricao;
	
	@Column(name = "flativo", nullable = false)
	private boolean flativo;
	
	
	private String titulo;

	

	public Pessoa(Integer id, String descricao, boolean flativo, String titulo) {
		super();
		Id = id;
		this.descricao = descricao;
		this.flativo = flativo;
		this.titulo = titulo;
	}
	
	

	public Integer getId() {
		return Id;
	}



	public void setId(Integer id) {
		Id = id;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public boolean isFlativo() {
		return flativo;
	}



	public void setFlativo(boolean flativo) {
		this.flativo = flativo;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public PessoaDTO getDTO() {
		return new PessoaDTO(getId(), getDescricao(), isFlativo(), getTitulo());
	}	

}


