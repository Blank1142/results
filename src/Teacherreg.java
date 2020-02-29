

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Teacherreg
 */
@WebServlet("/Teacherreg")
public class Teacherreg extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Name=request.getParameter("Name");
        String name="";
		for(int i=Name.length()-1;i>=0;i--)
		{
			name +=Name.charAt(i);
		}
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
		String Age=request.getParameter("Age");
		String Subject=request.getParameter("Subject");
		String Joining=request.getParameter("Joining");
		Modell m=new Modell();
		m.setName(name);
		m.setUsername(username);
		m.setPassword(password);
		m.setAge(Age);
		m.setSubject(Subject);
		m.setJoining(Joining);
		
		
		int x=m.register();
		if(x==1)
		{
			response.sendRedirect("/Vtu/Sucessfull.html");
		}
	}
	}

