<%@page import="com.alvaro.models.Habitacion"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    
${requestScope.laHabitacion} 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="./header.jsp"></jsp:include>

	<h1>Datos de la Habitación</h1>
	<ul>
		<li>Habitacion Id: ${requestScope.laHabitacion.hid}</li>
		<li>Dirección: ${requestScope.laHabitacion.address}</li>
		<li>Número: ${requestScope.laHabitacion.number}</li>
		<li>Ciudad: ${requestScope.laHabitacion.ciudad}</li>
		
		
		</ul>
		
		<button id="BtnVolver">Volver</button>
	
</body>

<script src="./js/script.js"></script>

</html>