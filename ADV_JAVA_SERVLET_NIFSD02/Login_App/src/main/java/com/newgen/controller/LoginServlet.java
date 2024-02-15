package com.newgen.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.newgen.dao.LoginDAO;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class LoginServlet extends GenericServlet {
	LoginDAO login = new LoginDAO(); //Sington 

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String uname = req.getParameter("name");
		String password = req.getParameter("pwd");

		PrintWriter pw = res.getWriter();
		pw.println("<html>");
		boolean result = login.getLogin(uname, password);
		if (result) {
			pw.println("<h2>Login Success</h2>");
		} else {
			pw.println("<h2>Login Failed</h2>");
		}
		pw.println("</html>");
	}
}
