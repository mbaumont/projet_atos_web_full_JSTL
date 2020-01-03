<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="projet_atos_web.app.*"%>
<jsp:include page="../page/header.jsp">
<jsp:param name="title" value="Liste des Personnes" />
</jsp:include>
	<%-- D�but body --%>
	<h3>Listes des Personnes</h3>
	<ol>
		<%
		    ListePersonne listepersonnes = (ListePersonne)session.getAttribute("listepersonne");
			if(listepersonnes == null ) listepersonnes = new ListePersonne();
			for(Personne 
					p:listepersonnes.getPersonnes()) {
				out.append("<li>"+p.getNom()+
						"-"+p.getPrenom()+"</li>");
			}
		%>
	</ol>
	<%--Fin body --%>
<jsp:include page="../page/footer.jsp"/>