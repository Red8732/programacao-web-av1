package br.com.cadastro.model;

import java.util.ArrayList;

public class Coordenador {
	
	private String nome;
	private int id;
	Curso curso;
	Periodo periodo;
	
	public Coordenador(String nome, Curso curso, Periodo periodo) {
		id += 1;
		this.nome = nome;
		this.curso = curso;
		this.periodo = periodo;
	}
	
	public Coordenador() {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Periodo getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}
	
}
