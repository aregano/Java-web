<%@page import="com.alvaro.models.Usuario"%>
<%@page import="com.alvaro.models.Habitacion"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    
<%-- <%
	Usuario elUsuario = (Usuario)request.getAttribute("elUsuario");
%> --%>
    
${requestScope.elUsuario}

${requestScope.laHabitacion}
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="./header.jsp"></jsp:include>

	<h1>Datos de usuario</h1>
	<ul>
		<li>Id: ${requestScope.elUsuario.id}</li>
		<li>Nombre: ${requestScope.elUsuario.name}</li>
		<li>Email: ${requestScope.elUsuario.email}</li>
		<li>Habitacion Id: <a href="./habitacion?hid=${elUsuario.habitacion.hid}">${elUsuario.habitacion.hid}</a></li>
<%-- 		<li>Id: <%=elUsuario.id%></li>
		<li>Nombre: <%=elUsuario.name%></li>
		<li>Email: <%=elUsuario.email%></li> --%>
	</ul>
	
	<button id="BtnVolver">Volver</button>
	
</body>

<script src="./js/script.js"></script>

</html>


