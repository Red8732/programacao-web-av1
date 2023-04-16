package br.com.cadastro.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.cadastro.model.Coordenador;
import br.com.cadastro.model.Curso;
import br.com.cadastro.model.Periodo;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/lista")
public class CadastrarController extends HttpServlet {
	
	protected List<Coordenador> coordenadores = new ArrayList<>();
	
	@Override
	protected void doPost(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
		String nome = req.getParameter("nome");
		String disciplina = req.getParameter("curso");
		String dia = req.getParameter("dia");
		String horaInicial = req.getParameter("horaInicial");
		String horaFinal = req.getParameter("horaFinal");
		
		Curso curso = new Curso(disciplina);
		Periodo periodo = new Periodo(dia, horaInicial, horaFinal);
		
		if(nome != null && curso != null && periodo != null) {
			Coordenador coordenador = new Coordenador(nome, curso, periodo);
			coordenadores.add(coordenador);
			req.setAttribute("coordenador", coordenadores);
		}
		
		RequestDispatcher rd = req.getRequestDispatcher("lista.jsp");
		rd.forward(req, resp);
	}
	
}
