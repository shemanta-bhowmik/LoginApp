import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Dummy check, replace with actual authentication logic
        if ("root".equals(username) && "1234".equals(password)) {
            response.sendRedirect("Home.jsp"); // Redirect to home page
        } else {
            response.sendRedirect("index.jsp"); // Redirect to login with an error message
        }
    }
}