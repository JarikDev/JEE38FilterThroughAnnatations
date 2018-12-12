package jsp;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;
import java.io.PrintWriter;
@WebFilter(value="/myfilter"/*,initParams = {@WebInitParam(name="name",value="value")}*/)
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println(filterConfig.getInitParameter("name"));
        System.out.println("Init filter");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.getServletContext().log("This is log message");
        System.out.println(servletRequest.getRemoteHost());
        servletResponse.getWriter().write(" before ");
        if (true) {
            filterChain.doFilter(servletRequest, new MyResponseWrapper ((HttpServletResponse)servletResponse));
        }
        servletResponse.getWriter().write(" after ");
    }

    @Override
    public void destroy() {
        System.out.println("Destroy filter");
    }
}
class MyResponseWrapper extends HttpServletResponseWrapper{
    public MyResponseWrapper(HttpServletResponse response) {
        super(response);
    }

    @Override
    public PrintWriter getWriter() throws IOException {
        return super.getWriter();
    }
}