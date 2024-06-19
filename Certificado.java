package br.com.fiap.sprint.bean;

import java.time.LocalDate;

public class Certificado {

	private int codigo;
	private LocalDate dataEmissao;

	// Construtor
	public Certificado(int codigo, LocalDate dataEmissao) {
		this.codigo = codigo;
		setDataEmissao(dataEmissao);
	}

	// Getters e Setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public LocalDate getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(LocalDate dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	// Método operacional
	public void emitirCertificado(Aluno aluno, Modulo modulo) {
		System.out.println("Emitindo certificado para o aluno " + aluno.getNome() 
		+ "no módulo " + modulo.getTitulo() + "!");
	}
}
