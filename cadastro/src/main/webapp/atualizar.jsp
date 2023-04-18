<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Atualizar</title>

<jsp:useBean id="coordenadores" scope="session" class="java.util.ArrayList"></jsp:useBean>
</head>
	<body>
	<h1>Atualizar Informações</h1>
	<hr />
		<div class="atualizar"> 
			<form action="atualizar" method="POST">
			<input type="hidden" name="id" value="${coordenador.id}" >
			
			Nome: <input type="text" value="${coordenador.nome}" name="nome" required/><br />
			Curso: <input type="text" value="${coordenador.curso.disciplina}" name="curso" required/><br />
			
			<p> Período de Disponibilidade: </p>
			Dia: <input type="text" value="${coordenador.periodo.dia}" name="dia" required/><br />
			Horário Inicial: <input type="text" value="${coordenador.periodo.horarioInicial}" name="horaInicial" required/><br />
			Horário Final: <input type="text" value="${coordenador.periodo.horarioFinal}" name="horaFinal" required/><br />
		</div>

		 <input type="submit" value="Gravar" />
		</form>
	</body>
</html>