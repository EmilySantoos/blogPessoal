package com.generation.blogpessoal.model;

public class UsuarioLogin {

	//classe usada para transitar dados do sistema sem revelar a classe model para o cliente.
	//todos os atributos da classe model usuario deve ser presente na classelogin
	//o atributo token,vai ser passado o cabeçalho de todas as requisiçoes do front-end,atributo fundamental para consumir a api
	private Long id;
	private String nome;
	private String usuario;
	private String senha;
	private String foto;
	private String token;

	public Long getId() {
		return this.id;//o id sera o atributo utilizado como credencial pelo frint-end para pegar o id do usuario
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return this.foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}