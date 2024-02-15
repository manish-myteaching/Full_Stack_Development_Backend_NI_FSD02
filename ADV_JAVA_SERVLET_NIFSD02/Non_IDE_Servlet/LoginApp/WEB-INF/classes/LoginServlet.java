package com.newgen.controller;
import jakarta.servlet.*;
import java.io.*;
public class LoginServlet  extends GenericServlet
{
   public  void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
    
   String uname=req.getParameter("name");
   String password=  req.getParameter("pwd");  

   PrintWriter pw=res.getWriter();
   pw.println("<html>");
   if(uname.equals("manish") && password.equals("12345")){
      pw.println("<h2>Login Success</h2>");
  }else{
      pw.println("<h2>Login Failed</h2>");
  }
   pw.println("</html>");
}

}