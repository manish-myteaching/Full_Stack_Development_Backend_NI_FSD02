import jakarta.servlet.*;
import java.io.*;
public class WelcomeServlet  extends GenericServlet
{
   public  void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{

      System.out.println("Welcome to Servlet");
      PrintWriter pw=res.getWriter();
      pw.println("<h1>Welcome to FlipKart<h1>");
   }
}