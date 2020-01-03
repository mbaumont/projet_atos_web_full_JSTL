package projet_atos_web.servlets;

import java.io.IOException;
import java.util.List;

import javax.mail.Session;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import projet_atos_web.app.userExo3;

/**
 * Servlet implementation class Exo3Login
 */

@WebServlet(urlPatterns = { 
		"/Exo3Login"
},
		initParams = { 
				@WebInitParam(name = "exo", value = "/WEB-INF/JSP/exos")
		})
public class Exo3Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Exo3Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		
		List<userExo3> listU = (List<userExo3>)session.getAttribute("ListUsers");
		System.out.println(listU);
		System.out.println(request.getParameter("NU"));
		System.out.println(request.getParameter("MP"));
		RequestDispatcher requestDispatcher = null;
		boolean flag = true;
		for(userExo3 user:listU) {
			if (request.getParameter("NU")!=null && request.getParameter("NU").equals(user.getNomU())) {
				if (request.getParameter("MP")!=null && request.getParameter("MP").equals(user.getPassWord())) {
					requestDispatcher = request.getRequestDispatcher(getInitParameter("exo")+"/exo3/exo3.jsp");
					requestDispatcher.forward(request, response);
					flag = false;
				}
				
			}
		}
		if (flag==true) {
			requestDispatcher = request.getRequestDispatcher(getInitParameter("exo")+"/exo3/formulaire.jsp");
			requestDispatcher.forward(request, response);
		}
	}
}