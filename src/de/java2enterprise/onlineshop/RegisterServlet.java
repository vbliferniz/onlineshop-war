package de.java2enterprise.onlineshop;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/register", name="registerservlet")
public class RegisterServlet extends HttpServlet {

	private static final long serialVersionUID = -3377146157514902441L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String email = req.getParameter("email");
		String password = req.getParameter("password");

		Cookie cookieEmail = new Cookie("email", email);
		res.addCookie(cookieEmail);
		
		Cookie cookiePassword = new Cookie("password", password);
		res.addCookie(cookiePassword);
		
		
		res.setContentType("text/html;charset=UTF-8");

		RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.html");
		requestDispatcher.forward(req, res);
	}

}
