package br.com.fiap.sprint.bean;

public class VideoAula extends Conteudo {
	private int duracao;

	// Construtor
	public VideoAula(String titulo, String tipo, String descricao, int duracao) {
		super(titulo, descricao);
		this.duracao = duracao;
	}

	// Getters e Setters
	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	// Método operacional
	public void reproduzir() {
		System.out.println("\nReproduzindo videoaula: " + getTitulo());
	}
}
