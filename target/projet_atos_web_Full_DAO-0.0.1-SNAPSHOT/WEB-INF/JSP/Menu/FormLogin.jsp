<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:include page="../page/header.jsp">
<jsp:param name="title" value="Login" />
</jsp:include>
<%-- D�but body --%>
<%--Balise form pour pouvoir g�rer des saisies en HTML --%>
<div class="container">
	<div class="row">
		<form action="Login" method="post">
			
			<label>Login :</label><input type="text" size="15" 
			name="login" required="required">
			<br/>	
			<label>Mdp :</label><input type="password" size="15" 
			name="mdp" required="required">
			<br/>
			<%-- Bouton Valider pour envoyer � la page TraitementPersonne.jsp nos donn�es --%>
			<input type="submit" value="Valider">
		</form> 
	</div>
</div>
	

<%-- Fin Body --%>		
<jsp:include page="../page/footer.jsp"/>