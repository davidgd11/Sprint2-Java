package br.com.fiap.sprint.bean;

public class Usuario {
	private String nome;
	private String email;

	// Construtor
	public Usuario(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// Método operacional
	public void acessarSistema() {
		System.out.println("Usuário " + nome + " acessou o sistema.");
	}
}
