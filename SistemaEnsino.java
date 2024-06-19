package br.com.fiap.sprint.bean;

public class SistemaEnsino {
	
	private String nome;
	private String descricao;

	// Construtor
	public SistemaEnsino(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	// Métodos operacionais
	public void iniciarTreinamento() {
		System.out.println("\nTreinamento iniciado.");
	}

	public void adicionarModulo(Modulo modulo) {
		System.out.println("Módulo " + modulo.getTitulo() + " adicionado.");
	}
}
