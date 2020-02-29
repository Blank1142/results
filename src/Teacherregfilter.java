

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class Teacherregfilter
 */
@WebFilter(dispatcherTypes = {DispatcherType.REQUEST }
					, urlPatterns = { "/Teacherregfilter" }, servletNames = { "Teacherreg" })
public class Teacherregfilter implements Filter {

    /**
     * Default constructor. 
     */
    public Teacherregfilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String Name=request.getParameter("Name");
		
		
		String Username=request.getParameter("Username");
		String Password=request.getParameter("Password");
		String Cpassword=request.getParameter("Cpassword");
		String Age=request.getParameter("Age");
		String Subject=request.getParameter("Subject");
		String Joining=request.getParameter("Joining");
		
		if(Name.length()!=0 && Username.length()!=0 && Password.length()!=0 && Cpassword.length()!=0 && Age.length()!=0 && Joining.length()!=0 &&Subject.length()!=0)
		{
			if(Password.contentEquals(Cpassword))
			{
				chain.doFilter(request, response);
			}
		}
		else
		{
			((HttpServletResponse) response).sendRedirect("/Nokr/Wrong.html");
		}
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
