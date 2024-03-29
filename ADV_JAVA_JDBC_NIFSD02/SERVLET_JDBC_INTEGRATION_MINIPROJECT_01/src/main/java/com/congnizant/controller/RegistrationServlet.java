package com.congnizant.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.congnizant.service.RegistrationSevice;
import com.congnizant.service.RegistrationSeviceImpl;
import com.congnizant.vo.UserInfoVO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class RegistrationServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// get the request Parameter
		String firstName=req.getParameter("fname");
		String lastName=req.getParameter("lname");
		String userName=req.getParameter("userName");
		String password=req.getParameter("pwd");

		// call the service layer
		RegistrationSevice rd=RegistrationSeviceImpl.getInstace();
		UserInfoVO userInfo = rd.registerUserInfo(new UserInfoVO(firstName,lastName, userName, password));
		resp.setContentType("text/html");  
		PrintWriter pw=resp.getWriter();
		if(userInfo !=null) {
			pw.println("<h1>You have Successfully Registred<h1>");
			pw.println("<a href="+"login.html"+">Login</a>");
		} else {
			pw.println("<h1>You have not Registred..Pleas Try again<h1>");
		}	
	}

}
