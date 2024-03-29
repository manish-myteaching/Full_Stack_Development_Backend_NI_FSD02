
package com.congnizant.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.congnizant.service.LoginService;
import com.congnizant.service.LoginServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// get the request Parameter
		String userName = req.getParameter("userName");
		String password = req.getParameter("pwd");

		// call the service layer
		LoginService loginService = LoginServiceImpl.getInstace();
		boolean isLogin = loginService.getLogin(userName, password);

		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		if (isLogin) {
			pw.println("<h1>Welcome " + userName+"<h1>");
		} else {
			pw.println("<h1>Your Name or Password is wrong..Please login again..<h1>");
		}
	}

}
