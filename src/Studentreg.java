

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Studentreg
 */
@WebServlet("/Studentreg")
public class Studentreg extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Name=request.getParameter("Name");
		
		String Usn=request.getParameter("Usn");
		String Ten=request.getParameter("Ten");
		String Inter=request.getParameter("Inter");
		String BE=request.getParameter("BE");
		Mode m=new Mode();
		m.setName(Name);
		m.setUsn(Usn);
		m.setTen(Ten);
		m.setInter(Inter);
		m.setBE(BE);
		
		
		
		int x=m.register();
		if(x==1)
		{
			response.sendRedirect("/Vtu/stuSucessfull.html");
		}
	}


}
