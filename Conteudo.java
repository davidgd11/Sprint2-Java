package br.com.fiap.sprint.bean;

public class Conteudo {

	private String titulo;
	private String descricao;

	// Construtor
	public Conteudo(String titulo, String descricao) {
		this.titulo = titulo;
		this.descricao = descricao;
	}

	// Getters e Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	// Método operacional
	public void exibirConteudo() {
		System.out.println("\nExibindo conteúdo: " + titulo);
	}
}
