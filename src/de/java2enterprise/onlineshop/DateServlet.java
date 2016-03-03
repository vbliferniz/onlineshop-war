package de.java2enterprise.onlineshop;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DateServlet
 */
@WebServlet(description = "Returns actual date", urlPatterns = { "/date" })
public class DateServlet extends HttpServlet {
	
	private static final long serialVersionUID = 8503296509681251227L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		writer.println("<!DOCTYPE html>");
		writer.println("<html>");
		writer.println("<body>");
		writer.println("Date: " + new Date());
		writer.println("</body>");
		writer.println("</html>");
	}

}
