package com.barclays.controller;

import java.io.IOException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletConfigTest extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletConfig sc= getServletConfig();
		String s1=sc.getInitParameter("driver");
		String s2=sc.getInitParameter("url");
		String s3 = sc.getInitParameter("pwd");
		System.out.println(s1 + " " + s2 + " "+ s3);
	}

}
