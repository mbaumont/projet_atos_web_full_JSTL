<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c" %>
<%@ page import="net.atos.englishbattle.service.impl.*" %> 
<%@ page import="net.atos.englishbattle.service.*" %>
<%@ page import="net.atos.englishbattle.business.*"%>
<%@ page import="java.util.List" %>

<c:import url="../page/header.jsp">
<c:param name="title" value="Gestion des Niveaux" />
</c:import>

<%--
	NiveauService niveauService = new NiveauServiceImpl();

--%>

<div class="container">
<ul>
	
	<c:forEach items="${SniveauService.recupererNiveaux()}" var="item">
	<li>
	    <c:out value="${item.getNom()}"/><br>
	</li>
	</c:forEach>
	

	<%--
	for (Niveau niveau : niveauService.recupererNiveaux()) {
		out.println("<li>"+niveau.getId() + " - " + niveau.getNom()+"</li>");
	}
	--%>
</ul>
</div>

<%-- Fin Body --%>		
<jsp:include page="../page/footer.jsp"/>

