package de.java2enterprise.onlineshop;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RevisionServlet
 */
@WebServlet("/revision")
public class RevisionServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1965071303199709283L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String remoteAddr = request.getRemoteAddr();
		log("RemoteAddress: " + remoteAddr);
		
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("Your IP address: " + remoteAddr);
		writer.println("</body>");
		writer.println("</html>");
	}

}
