package com.barclays.controller;

import java.io.IOException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletConfigTest2 extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		 * ServletConfig sc = getServletConfig(); System.out.println(req.hashCode());
		 * System.out.println(resp.hashCode()); System.out.println(sc.hashCode());
		 * String s1 = sc.getInitParameter("driver"); String s2 =
		 * sc.getInitParameter("url"); String s3 = sc.getInitParameter("pwd");
		 * System.out.println(s1); System.out.println(s2); System.out.println(s3);
		 */
		
		ServletContext sContext = getServletContext();
		System.out.println(sContext.hashCode());
		String s = (String) sContext.getInitParameter("name");
		System.out.println(s);
		String s2=(String) sContext.getInitParameter("company");
		System.out.println(s2);
	}

}
