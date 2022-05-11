package br.com.projeto.cadastro.dto;

import java.io.Serializable;

import br.com.projeto.cadastro.entity.Pessoa;

public class PessoaDTO implements Serializable {

private static final long serialVersionUID = 1L; 
	
	private Integer idPessoa;
	private String descricaoPessoa;
	private boolean flativo;
	private String titulo;

	
	
	public PessoaDTO() {}
	
	
	
	public PessoaDTO(Integer idCadastro, String descricaoPessoa, boolean flativo, String titulo) {
		super();
		this.idPessoa = idCadastro;
		this.descricaoPessoa = descricaoPessoa;
		this.flativo = flativo;
		this.titulo = titulo;
		
	}
	
	public Pessoa convertToEntity() {
		return new Pessoa(getIdPessoa(),
							getDescricaoPessoa(),
							isFlativo(),
							getTitulo());
	}
	
     
	public Integer getIdPessoa() {
		return idPessoa;
	}



	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}



	public String getDescricaoPessoa() {
		return getDescricaoPessoa();
	}



	public void setDescricaoPessoa(String descricaoPessoa) {
		this.descricaoPessoa = descricaoPessoa;
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


	
}

	
	
	

