<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Coordenadores</title>

<jsp:useBean id="coordenador" scope="session" class="java.util.ArrayList"></jsp:useBean>
</head>
	<body>
		<div class="container">
			<table>
				
				<tr>
					<th>Cursos</th>
					<th>Coordenador</th>
					<th>Dias</th>
					<th>Horário</th>
				</tr>
				
				<!-- Montando linhas da tabela: -->	
		<c:forEach var="c" items="${coordenador}">
			<tr>
				<td>${c.nome}</td>
				<td>${c.curso.disciplina}<br></td>
				<td>${c.periodo.dia} - ${c.periodo.horarioInicial} às ${c.periodo.horarioFinal}<br></td>
			</tr>
		</c:forEach>	
			</table>
		</div>	
	</body>
</html>