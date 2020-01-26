import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        String[] languages = request.getParameterValues("language");

        if (languages != null) {
            System.out.println("Languages are: ");
            for (String lang : languages) {
                System.out.println("\t" + lang);
            }
        }

        String gender = request.getParameter("gender");
        System.out.println("Gender is: " + gender);

        String feedback = request.getParameter("feedback");
        System.out.println("Feed back is: " + feedback);

        String jobCategory = request.getParameter("jobCat");
        System.out.println("Job category is: " + jobCategory);

        String htmlResp = "<html>";

        htmlResp += "<h2>Your username is: " + username + "<br/>";
        htmlResp += "Your password is: " + password + "<br/>";
        htmlResp += "Your language is: " + Arrays.toString(languages) + "<br/>";
        htmlResp += "Your gender is: " + gender +  "<br/>";
        htmlResp += "Your feedback is:  " + feedback +  "<br/>";
        htmlResp += "Your job category is: " + jobCategory + "<br/>" + "</h2>";

        htmlResp += "</html>";



        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

        PrintWriter writer = response.getWriter();

        writer.println(htmlResp);
    }
}
