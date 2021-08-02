import com.beans.User;
import com.dao.UserDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", value = "/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       // int i = Integer.parseInt(request.getParameter("userId"));
        String f =  request.getParameter("fname");
        String n =  request.getParameter("lname");
        String u = request.getParameter("username");
        String e = request.getParameter("email");
        String p=request.getParameter("psw");

User user = new User();
//user.setUserId(i);
user.setFirsName(f);
user.setLastName(n);
user.setUsername(u);
user.setEmail(e);
user.setPassword(p);
        PrintWriter out = response.getWriter();

        UserDao userDao = new UserDao();
        try {
            userDao.commitDB(user);
           // out.println("Success");

        }
        catch (Exception ee){
            out.println(ee.getCause());
        }

        response.sendRedirect("UserSuccess.jsp");
     }
}
