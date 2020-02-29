

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Techdisp
 */
@WebServlet("/Techdisp")
public class Techdisp extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Username=request.getParameter("Username");
		String username="";
		for(int i=Username.length()-1;i>=0;i--)
		{
			username +=Username.charAt(i);
		}
		String Password=request.getParameter("Password");
		String password="";
		for(int i=Password.length()-1;i>=0;i--)
		{
			password +=Password.charAt(i);
		}
		Modell m=new Modell();
		m.setUsername(username);
		m.setPassword(password);
		
		int x=m.eemplogin();
		if(x==1)
		{
			String Name=m.getName();
			String name="";
			for(int i=Name.length()-1;i>=0;i--)
			{
				name +=Name.charAt(i);
			}
			String Age=m.getAge();
			String Joining=m.getJoining();
			String  Subject  =m.getSubject();
			
			HttpSession session=request.getSession(true);
			session.setAttribute("Name", name);
			session.setAttribute("Age", Age);
			session.setAttribute("Joining",Joining );
			session.setAttribute("Subject", Subject);
			
			response.sendRedirect("/Vtu/Logindet.jsp");
		}
		else {
			response.sendRedirect("/Vtu/Error.html");
		}
	}
}
