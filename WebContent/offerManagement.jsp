<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Création d'une offre</h1>
	
	<form action="CreateOffer" method="post">
		<p>
			Description de l'offre <br/>
			<textarea rows="5" cols="50"></textarea> <br/><br/>
			
			Choix du lieu <br/>
			<select name="choix">
				<c:forTokens var="lieu" items="France/Angleterre/Brézil/Canada" delims="/ ">
    				<option value="${ lieu }">${ lieu }</p>
				</c:forTokens>
			</select>
		</p>
		
		<input type="submit" value="Créer l'offre"/>
	</form>
</body>
</html>