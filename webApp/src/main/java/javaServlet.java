import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class javaServlet {
    @WebServlet("/loginServlet")
    public static class LoginServlet extends HttpServlet {

        protected void doPost(HttpServletRequest request,
                              HttpServletResponse response) throws ServletException, IOException {

            // code to process the form...

        }

    }
}
