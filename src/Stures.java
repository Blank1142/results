

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Stures
 */
@WebServlet("/Stures")
public class Stures extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Usn=request.getParameter("Usn");
		Mode m=new Mode();
		
		m.setUsn(Usn);
		
		int x=m.Res();
		if(x==1)
		{
			String Name=m.getName();
			String Ten=m.getTen();
			String Inter=m.getInter();
			String BE=m.getBE();
			
			
			System.out.println("display"+Ten+Inter+BE);
			HttpSession session=request.getSession(true);
			session.setAttribute("Name", Name);
			session.setAttribute("Usn", Usn);
			session.setAttribute("Ten", Ten);
			session.setAttribute("Inter", Inter);
			session.setAttribute("BE", BE);
			
			response.sendRedirect("/Vtu/desp.jsp");
		}
		
	}

}
