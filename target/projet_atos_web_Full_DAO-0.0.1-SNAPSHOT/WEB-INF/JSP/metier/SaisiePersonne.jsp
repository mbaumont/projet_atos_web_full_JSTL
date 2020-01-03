<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:include page="../page/header.jsp">
<jsp:param name="title" value="Saisie d'une Personne" />
</jsp:include>
<%-- D�but body --%>
<%--Balise form pour pouvoir g�rer des saisies en HTML --%>
<div class="container">
	<div class="row">
		<form action="TraitementPersonne" method="post">
			<%-- Il faut mettre le nom du champ de saisie dans name="" --%>
			<label>Nom :</label><input type="text" size="15" name="nom">
			<br/>	
			<label>Pr�nom :</label><input type="text" size="15" name="prenom">
			<br/>
			<%-- Bouton Valider pour envoyer � la page TraitementPersonne.jsp nos donn�es --%>
			<input type="submit" value="Valider">
		</form> 
	</div>
</div>
	

<%-- Fin Body --%>		
<jsp:include page="../page/footer.jsp"/>