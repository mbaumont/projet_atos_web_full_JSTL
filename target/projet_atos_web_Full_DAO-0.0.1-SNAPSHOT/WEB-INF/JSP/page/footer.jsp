<div class="footer">
	<%-- <a class="btn btn-warning" href='<%=getServletContext().getContextPath()+"/"%>'>
	Home</a>--%>
	<a class="btn btn-warning" href='Home'>
	Home</a>
	<a class="btn btn-warning" href='LogOut'>
	LogOut</a>
	
	<div class="footerlogin">
		<p class="btn btn-warning">
		<%=session.getAttribute("Login")%>
		</p>
	</div>
</div>
</body>
</html>