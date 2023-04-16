<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastrar</title>

<jsp:useBean id="coordenadores" scope="session" class="java.util.ArrayList"></jsp:useBean>
</head>
	<body>
	<h1>Adicionar Coordenador</h1>
	<hr />
		<div class="form"> 
			<form action="lista" method="POST">
			Nome: <input type="text" name="nome" required/><br />
			Curso: <input type="text" name="curso" required/><br />
			
			<p> Período de Disponibilidade: </p>
			Dia: <input type="text" name="dia" required/><br />
			Horário Inicial: <input type="text" name="horaInicial" required/><br />
			Horário Final: <input type="text" name="horaFinal" required/><br />
		</div>

		 <input type="submit" value="Gravar" />
		</form>
	</body>
</html>