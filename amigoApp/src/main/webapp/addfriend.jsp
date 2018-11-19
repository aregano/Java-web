<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Añadir Amigos</h1>

	<div class="error">${mensaje_error}</div>

	<form action="" method="POST" id="nuevousuarioform" novalidate>

		<div>
			<input type="text" placeholder="id" name="id"
				value="${addfriend.id}" id="id" required />
		</div>
		<div>
			<input type="text" placeholder="Nombre" name="name"
				value="${addfriend.name}" id="name" required />
		</div>
		<div>
			<input type="text" placeholder="Apellido" name="apellido"
				value="${addfriend.apellido}" id="apellido" />
		</div>
		<!-- 		<div><input type="email" placeholder="Confirmar Email" name="email" id="conf_email" required/></div>-->
		<div>
			<input type="text" placeholder="Edad" name="edad"
				value="${addfriend.edad}" id="edad" />
		</div>

		<div>
			<input type="text" placeholder="Descripción"
				name="descripcion" id="descripcion"  />
		</div>
		<button id="enviarBtn">Enviar</button>
	</form>
	
	<ul> 
   			<li>
   					<div>( ${nuevoAmigo.id} )</div>
   					<div>Nombre: ${nuevoAmigo.name}</div>
   					<div>Apellido: ${nuevoAmigo.apellido}</div>
   					<div>Edad: ${nuevoAmigo.edad}</div>
   					<div>Descripcion: ${nuevoAmigo.descripcion}</div>
   			</li> 
	</ul>
</body>
</html>