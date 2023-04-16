package br.com.cadastro.model;

import java.util.ArrayList;
import java.util.List;

public class Coordenador {
	
	private String nome;
	private List<Curso> cursos = new ArrayList<>();
	private List<Periodo> periodos = new ArrayList<>();
	
	
	public Coordenador(String nome, List<Curso> cursos, List<Periodo> periodos) {
		this.nome = nome;
		this.cursos = cursos;
		this.periodos = periodos;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Curso> getCursos() {
		return cursos;
	}
	
	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	
	public List<Periodo> getPeriodos() {
		return periodos;
	}
	
	public void setPeriodos(List<Periodo> periodos) {
		this.periodos = periodos;
	}
	
}
