package de.java2enterprise.onlineshop;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/signin")
public class SigninServlet extends HttpServlet {

	private static final long serialVersionUID = -6481447910533909617L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		res.setContentType("text/html;charset=UTF-8");
		
		String emailReq = req.getParameter("email");
		String passwordReq = req.getParameter("password");
		
		String cookieEmail = null;
		String cookiePassword = null;
		
		ServletOutputStream out = res.getOutputStream();
		out.println("<html>");
		out.println("<body>");
		out.println("<table>");
		out.println("<tr>");
		out.println("<td>Cookie Name</td>");
		out.println("<td>Cookie Value</td>");
		out.println("</tr>");
		
		Cookie[] cookies = req.getCookies();
		for(Cookie cookie : cookies){
			out.println("<tr>");
			out.println("<td>" + cookie.getName() + "</td>");
			out.println("<td>" + cookie.getValue() + "</td>");
			out.println("</tr>");
			
			if("email".equals(cookie.getName())){
				cookieEmail = cookie.getValue();
			}
			if ("password".equals(cookie.getName())) {
				cookiePassword = cookie.getValue();
			}
			
		}
		out.println("</table>");
		
		if(emailReq.equals(cookieEmail) && passwordReq.equals(cookiePassword)) {
			out.println("<h1>User successfully logged in!</h1>");
		}else {
			out.println("<h1>User not valid.<h1>");
		}
		
		out.println("</body>");
		out.println("</html>");
		
	}
	
}
