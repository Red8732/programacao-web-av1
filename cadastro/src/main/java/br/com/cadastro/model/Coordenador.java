package br.com.cadastro.model;

import java.util.ArrayList;
import java.util.List;

public class Coordenador {
	
	private String nome;
	Curso curso;
	Periodo periodo;
	
	public Coordenador(String nome, Curso curso, Periodo periodo) {
		this.nome = nome;
		this.curso = curso;
		this.periodo = periodo;
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
