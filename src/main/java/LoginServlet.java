import com.beans.User;
import com.dao.UserDao;
import com.services.LoginService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {

public void service(HttpServletRequest request , HttpServletResponse response) throws IOException {
    String username = request.getParameter("uname");
    String password = request.getParameter("psw");
    LoginService loginService = new LoginService();
    PrintWriter out = response.getWriter();


   // UserDao d = new UserDao();
   // d.login();
    if (loginService.checkUser(loginService.getUser(username), username, password)
            == true) {


        response.sendRedirect("UserProfile.jsp");
        out.println("User logged in");
    } else {
        out.println("Error!");

    }

}
}
