<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:include page="../page/header.jsp">
<jsp:param name="title" value="Menu" />
</jsp:include>
<div class="container">
 <div class="row">
<%--
	<a class="col-md-2 btn btn-warning" href="Menu?choix=1">Info</a>  	
	<a class="btn btn-info" href="Menu?choix=2">Affiche Personne</a>
 	<a class="btn btn-info" href="Menu?choix=3">Saisie Personne</a>
 	<a class="btn btn-info" href="Menu?choix=4">Affiche Liste Personnes</a>
 --%>
 	<a class="col-md-2 btn btn-info" href="Menu?choix=50">Gestion des Joueurs</a>
 	<a class="col-md-2 offset-md-1 btn btn-info" href="Menu?choix=51">Gestion des Niveaux</a>
 	<a class="col-md-2 offset-md-1 btn btn-info" href="Menu?choix=52">Gestion des Verbes</a>
 	<a class="col-md-2 offset-md-1 btn btn-info" href="Menu?choix=53">Gestion des Parties</a>
 </div>
</div>

<%--Fin body --%>
<jsp:include page="../page/footer.jsp"/>