<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="projet_atos_web.app.*" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c" %>
<c:import url="../page/header.jsp">
<c:param name="title" value="Instanciation du Beans Personne" />
</c:import>
	<%-- D�but body --%>
	<%
	Personne personne = (Personne)session.getAttribute("personne");
	if(personne == null) personne = new Personne();
	%>
	<p>Nom initial = 
	<%= personne.getNom() %></p>
	<p>Pr�nom initial = 
	<%= personne.getPrenom() %></p>
	
<%--Fin body --%>
<jsp:include page="../page/footer.jsp"/>