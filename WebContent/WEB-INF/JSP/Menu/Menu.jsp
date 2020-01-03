<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c" %>
<c:import url="../page/header.jsp">
<c:param name="title" value="Menu" />
</c:import>
<div class="container">
 <div class="row">
<%--
	<a class="col-md-2 btn btn-warning" href="Menu?choix=1">Info</a>  	
	<a class="btn btn-info" href="Menu?choix=2">Affiche Personne</a>
 	<a class="btn btn-info" href="Menu?choix=3">Saisie Personne</a>
 	<a class="btn btn-info" href="Menu?choix=4">Affiche Liste Personnes</a>
 --%>
 	<a class="col-md-1 btn btn-info" href="Menu?choix=50">Gestion des Joueurs</a>
 	<a class="col-md-1  btn btn-info" href="Menu?choix=51">Gestion des Niveaux</a>
 	<a class="col-md-1  btn btn-info" href="Menu?choix=52">Gestion des Verbes</a>
 	<a class="col-md-1 btn btn-info" href="Menu?choix=53">Gestion des Parties</a>
 	<a class="col-md-1 btn btn-info" href="Menu?choix=54">Exo 1</a>
 	<a class="col-md-1 btn btn-info" href="Menu?choix=55">Exo 2</a>
 	<a class="col-md-1  btn btn-info" href="Menu?choix=56">Exo 3</a>
 	<a class="col-md-1  btn btn-info" href="Menu?choix=57">Exo 4</a>
 </div>

</div>

<%--Fin body --%>
<jsp:include page="../page/footer.jsp"/>