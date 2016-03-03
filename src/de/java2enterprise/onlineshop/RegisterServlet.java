package de.java2enterprise.onlineshop;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/register", name="registerservlet")
public class RegisterServlet extends HttpServlet {

	private static final long serialVersionUID = -3377146157514902441L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		PrintWriter writer = resp.getWriter();
		writer.println("<!DOCTYPE html>");
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<br>Ihre eingegebenen Daten:");
		writer.println("<br>Email: " + email);
		writer.println("<br>Password: " + password);
		writer.println("</body>");
		writer.println("</html>");
	}

}
