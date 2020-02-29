

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
 * Servlet Filter implementation class Studentregfilter
 */
@WebFilter(dispatcherTypes = {DispatcherType.REQUEST }
					, urlPatterns = { "/Studentregfilter" }, servletNames = { "Studentreg" })
public class Studentregfilter implements Filter {

    /**
     * Default constructor. 
     */
    public Studentregfilter() {
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
		String Usn=request.getParameter("Usn");
		String Ten=request.getParameter("Ten");
		String Inter=request.getParameter("Inter");
		String BE=request.getParameter("BE");
		
		if(Name.length()!=0 && Usn.length()!=0  && Ten.length()!=0 &&Inter.length()!=0 && BE.length()!=0)
		{
			
				chain.doFilter(request, response);
			
		}
		else
		{
			((HttpServletResponse) response).sendRedirect("/Vtu/stuWrong.html");
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
