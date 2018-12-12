package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.Principal;

public class AuthServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.isUserInRole("Administrator")){
            resp.getWriter().write("User logged as admin");
            System.out.println(req.getRemoteUser());
//            Principal userPrincipal=req.getUserPrincipal();
//            System.out.println(userPrincipal.toString());
        }
    }
}
