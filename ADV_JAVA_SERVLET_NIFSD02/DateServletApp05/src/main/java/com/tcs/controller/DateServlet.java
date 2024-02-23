package com.tcs.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DateServlet extends HttpServlet {

	public DateServlet() {
		System.out.println("DateServlet");
	}
	
	public void init() {
		System.out.println("init");
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		getContent(request,response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		getContent(request,response);
	}
	
	public void getContent(HttpServletRequest request,HttpServletResponse response) throws IOException {
		PrintWriter pw = response.getWriter();
		java.util.Date d = new java.util.Date();
		response.setContentType("text/html");
		response.setHeader("Refresh", "1");
		pw.println("<h2>" + d.toString() + "Manish" + "<h2>");
		pw.close();
	}
}
