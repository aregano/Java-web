<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="./css/styles.css">

</head>
<body>

	<h1>Crea una Habitación</h1>

	<div class="mensaje_error">${mensaje_error}</div>

	<form action="" method="POST">
	
		<div>
			<input type="text" placeholder="Direccion" name="address"
				value="${newroom.address}" id="address" required />
		</div>
		<div>
			<input type="text" placeholder="Number" name="number"
				value="${newroom.number}" id="number" />
		</div>
		<!-- 		<div><input type="email" placeholder="Confirmar Email" name="email" id="conf_email" required/></div>-->
		<div>
			<input type="text" placeholder="Ciudad" name="ciudad"
				value="${newroom.ciudad}" id="ciudad" required />
		</div>
		
		<button>Enviar</button>
	</form>

</body>

<script type="text/javascript" src="./js/script.js"></script>
</html>