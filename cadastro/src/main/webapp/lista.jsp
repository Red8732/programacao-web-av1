<%@page import="br.com.cadastro.model.Coordenador"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Coordenadores</title>
<jsp:useBean id="coordenadores" scope="session" class="java.util.ArrayList"></jsp:useBean>

</head>
	<body>
		<div class="container">
			<table>
				
				<tr>
					<th>Coordenador</th>
					<th>Cursos</th>
					<th>Dias</th>
					<th>Horário</th>
					
					<a href="/cadastro/form.jsp"> <button>Adicionar Coordenador</button>
				</tr>
				
				<!-- Montando linhas da tabela: -->	
		<c:forEach var="c" items="${coordenadores}">
			<tr>
				<td>${c.nome}</td>
				<td>${c.curso.disciplina}<br></td>
				<td>${c.periodo.dia} - ${c.periodo.horarioInicial} às ${c.periodo.horarioFinal}<br></td>
				
				<td><a href="/cadastro/excluir?id=${c.id}">Excluir</a> </td>
				<td><a href="/cadastro/atualizar?id=${c.id}">Atualizar</a> </td>
			</tr>
		</c:forEach>	
			</table>
		</div>	
	</body>
</html>