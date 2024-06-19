package br.com.fiap.sprint.bean;

import java.util.ArrayList;
import java.util.List;

public class Modulo {
	private String titulo;
	private String descricao;
	private List<Conteudo> conteudos;

	// Construtor
	public Modulo(String titulo, String descricao) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.conteudos = new ArrayList<>();
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

	public List<Conteudo> getConteudos() {
		return conteudos;
	}

	// Métodos operacionais
	public void adicionarConteudo(Conteudo conteudo) {
		conteudos.add(conteudo);
		System.out.println("\nConteúdo " + conteudo.getTitulo() + " adicionado.");
	}

	public List<Conteudo> listarConteudos() {
		return conteudos;
	}
}
