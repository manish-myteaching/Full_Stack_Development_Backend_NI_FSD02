package com.tcs.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class RegistrationServlet extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		Enumeration e = req.getParameterNames();

		while (true) {
			while (e.hasMoreElements()) {
				Object o = e.nextElement();
				String str = (String) o;
				String[] val = req.getParameterValues(str);
				if (val.length > 1) {
					StringBuffer sb = new StringBuffer();

					for (int i = 0; i < val.length; ++i) {
						sb.append(val[i]);
						sb.append("\t");
					}

					pw.println("<h2>" + str + " " + sb.toString() + "<h2><br>");
				} else {
					pw.print("<h2> " + str + " : " + val[0] + "</h2><br>");
				}
			}

			return;
		}
	}
}
