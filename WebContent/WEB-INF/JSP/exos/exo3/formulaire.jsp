<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c" %> 
<c:import url="../../page/header.jsp">
<c:param name="title" value="Gestion des Verbes" />
</c:import>
<!DOCTYPE html>
<html>
<head>

<title>Formulaire</title>
</head>
<body>
<h1 align = center>Page d'accueil</h1>
<form action='Exo3Login' method="post">



<label>Nom d'utilisateur: </label> <input type=text name="NU" size=10 maxlength=10>

<label>Mot de passe: </label> <input type=password name="MP" size=10 maxlength=15>

<input type=submit value="Ouverture de session">


</form>

</body>

</html>
<c:import url="../../page/footer.jsp"/>