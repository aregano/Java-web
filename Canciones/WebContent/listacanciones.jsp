<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Titulo</h1>
	<ul>
		<c:forEach var="unaCancion" items="${lasCanciones}" >  
   				<li>
   					<a href="./cancion?id=${unaCancion.id}">
   						<div>( ${unaCancion.id} )</div>
   						<div>${unaCancion.name}</div>
   						<div>${unaCancion.author}</div>
   					</a>
   				</li> 
		</c:forEach>
	</ul> 

</body>
</html>