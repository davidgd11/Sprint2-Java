package br.com.fiap.sprint.bean;

public class Simulacao3D extends Conteudo {

	private String dificuldade;

	// Construtor
	public Simulacao3D(String titulo, String tipo, String descricao, String dificuldade) {
		super(titulo, descricao);
		this.dificuldade = dificuldade;
	}

	// Getters e Setters
	public String getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(String dificuldade) {
		this.dificuldade = dificuldade;
	}

	// Método operacional
	public void iniciarSimulacao() {
		System.out.println("Iniciando simulação 3D: " + getTitulo());
	}
}
