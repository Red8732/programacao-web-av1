package br.com.cadastro.controller;

import java.io.IOException;
import java.util.List;

import br.com.cadastro.model.Coordenador;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/atualizar")
public class AtualizarController extends HttpServlet {

	private static final long serialVersionUID = 873256145902791570L;
	
	protected void doGet(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
		List<Coordenador> coordenadores = (List<Coordenador>) req.getSession().getAttribute("coordenadores");
		String disciplina = req.getParameter("curso");
		
		Coordenador coordenador = null;
		for (int i = 0; i < coordenadores.size(); i++) {
			if(coordenadores.get(i).getCurso().equals(disciplina)){
				coordenador = coordenadores.get(i);
			}
		}
		req.setAttribute("coordenadores", coordenador);
		RequestDispatcher rd = req.getRequestDispatcher("atualizar.jsp");
		rd.forward(req, resp);
	}
	
	protected void doPost(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
		List<Coordenador> coordenadores = (List<Coordenador>) req.getSession().getAttribute("coordenadores");
		String nome = req.getParameter("nome");
		String curso = req.getParameter("curso");
		String dia = req.getParameter("dia");
		String horaInicial = req.getParameter("horaInicial");
		String horaFinal = req.getParameter("horaFinal");
		String id = req.getParameter("id");
		
		int idvalue = Integer.parseInt(id);
		Coordenador coordenador = null;
		for (int i = 0; i < coordenadores.size(); i++) {
			if(coordenadores.get(i).getId() == idvalue){
				coordenador = coordenadores.get(i);
			}
		}
		coordenador.setNome(id);
		req.getSession().setAttribute("coordenadores", coordenadores);
		resp.sendRedirect("/cadastro/");
	}
	
}
