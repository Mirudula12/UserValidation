
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

import java.io.*;
@WebServlet("/login")
public class Login implements Servlet
{
	public void init(ServletConfig config)
	{
		
	}
	public ServletConfig getServletConfig()
	{
		return null;
	}
	
	public void service(ServletRequest request,ServletResponse response)throws ServletException,IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();
		
		String email=request.getParameter("email");
		String pwd=request.getParameter("pwd");
		if(email.equals("mirudula12@gmail.com")&& pwd.equals("admin")) {
			
			
			out.println("<h1>Dashboard</h1>");
				out.print("Welcome  "+email);
				out.print("<br><br><br><a href='logoutsucess'>Logout</a>");
							
		}
		else {
			out.print("Invalid....Login failed");
		   
		}
		

		}
	
		
	public String getServletInfo()
	{
		return null;
	}
	public void destroy()
	{
		
	}

	

}