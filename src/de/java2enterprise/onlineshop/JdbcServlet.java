package de.java2enterprise.onlineshop;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JdbcServlet")
public class JdbcServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String driver = request.getServletContext().getInitParameter("driver");
		response.getWriter().println(driver);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String driver = request.getServletContext().getInitParameter("driver");
		response.getWriter().println(driver);
	}
}
