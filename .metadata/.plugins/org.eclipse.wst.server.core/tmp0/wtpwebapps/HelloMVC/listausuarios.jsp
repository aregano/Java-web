<%@page import="com.alvaro.models.Usuario"%>
<%@page import="com.alvaro.models.Habitacion"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

    
<%-- <%
	Usuario elUsuario = (Usuario)request.getAttribute("elUsuario");
%> --%>
    
${requestScope.elUsuario}

${requestScope.laHabitacion}
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Los Usuarios</title>

<link rel="stylesheet" href="./css/styles.css">

</head>
<body>

	<jsp:include page="./header.jsp"></jsp:include>

	<h1>Usuarios</h1>
	<ul>
		<c:forEach var="unUsuario" items="${losUsuarios}" >  
   			<li>
   				<a href="./usuario?id=${unUsuario.id}">
   					<div>( ${unUsuario.id} )</div>
   					<div>${unUsuario.name}</div>
   				</a>
   			</li> 
		</c:forEach> 
	</ul>
	
	<div><a href="./newuser">Crear Usuario</a></div>

</body>
</html>


