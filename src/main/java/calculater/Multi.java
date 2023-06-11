package calculater;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


public class Multi extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String num1=req.getParameter("num1");
		int n1=Integer.parseInt(num1);
		String num2=req.getParameter("num2");
		int n2=Integer.parseInt(num2);
			
		res.getWriter().print("<h1>The sum of "+n1+" and "+n2+" is "+(n1*n2)+"</h1>");
			
		
	}

	
}
