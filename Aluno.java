package br.com.fiap.sprint.bean;

public class Aluno extends Usuario {

	private String matricula;

	// Construtor
	public Aluno(String nome, String email, String matricula) {
		super(nome, email);
		this.matricula = matricula;
	}

	// Getters e Setters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	// Método operacional
	public void participarTreinamento(Modulo modulo) {
		System.out.println("Aluno " + getNome() + " entrou no módulo: " + modulo.getTitulo());
	}
}
