<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
${requestScope.unaCancion}

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Cancion</h1>
	<ul>            
			<li>( ${requestScope.laCancion.id} )</li>
   			<li>${laCancion.name}</li>
   			<li>${laCancion.author}</li>
   			<li><audio src="">${laCancion.mp3}</audio></li>
	</ul>

</body>
</html>