package br.com.fiap.sprint.bean;

public class Instrutor extends Usuario {

	private String especialidade;

	// Construtor
	public Instrutor(String nome, String email, String especialidade) {
		super(nome, email);
		this.especialidade = especialidade;
	}

	// Getters e Setters
	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	// Método operacional
	public void criarModulo(Modulo modulo) {
		System.out.println("Instrutor " + getNome() + " criou o módulo: " + modulo.getTitulo());
	}

}
