<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Crear usuario</title>

<link rel="stylesheet" href="./css/styles.css">
</head>
<body>
	<h1>Date de Alta</h1>

	<div class="error">${mensaje_error}</div>

	<form action="" method="POST">


		<div>
			<input type="text" placeholder="Nombre" name="name"
				value="${newusuario.name}" id="name" required />
		</div>
		<div>
			<input type="email" placeholder="Email" name="email"
				value="${newusuario.email}" id="email" />
		</div>
		<!-- 		<div><input type="email" placeholder="Confirmar Email" name="email" id="conf_email" required/></div>-->
		<div>
			<input type="password" placeholder="Contraseña" name="password"
				value="${newusuario.password}" id="password" />
		</div>

		<div>
			<input type="password" placeholder="Confirmar contraseña"
				name="conf_password" id="conf_password"  />
		</div>
		<div>
			<label for="habitacion">Habitación</label> 
			<select name="habitacion"id="habitacion">
				<option selected disabled>Elegir Habitación</option>				
				<c:forEach var="unahab" items="${lasHabitaciones}">
					<option value="${unahab.hid}">${unahab.address}, ${unahab.number}, ${unahab.ciudad}</option>
				</c:forEach>
			</select>
			<!-- Aqui va la habitacion -->
		</div>
		<button id="Btncrearhab">Crear Habitacion</button>
		<button>Enviar</button>
	</form>
	
		
	
		<div><a href="./newroom">Crear Habitacion</a></div>


</body>

<script src="./js/script.js"></script>

</html>