package br.com.fiap.sprint.bean;

public class Avaliacao {

	private double nota;
	private String comentario;

	// Construtor
	public Avaliacao(double nota, String comentario) {
		this.nota = nota;
		this.comentario = comentario;
	}

	// Getters e Setters
	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	// Método operacional
	public void realizarAvaliacao() {
		System.out.println("\nAvaliando com nota: " + nota + " e comentário: " + comentario);
	}
}
