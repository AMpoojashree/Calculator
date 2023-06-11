package calculater;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class Division
 */
public class Division extends GenericServlet implements Servlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		String num1=request.getParameter("num1");
		int n1=Integer.parseInt(num1);
		String num2=request.getParameter("num2");
		int n2=Integer.parseInt(num2);
			
		response.getWriter().print("<h1>The div of "+n1+" and "+n2+" is "+(n1/n2)+"</h1>");
			
	}

}
