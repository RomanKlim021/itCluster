package Service;

import Common.Pet;
import Utils.utils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@WebServlet("/delete")
public class DeletePetServlet extends HttpServlet {

    private Map<Integer, Pet> pets;

    @Override
    public void init() throws ServletException {

        final Object pets = getServletContext().getAttribute("pets");

        if (pets == null || !(pets instanceof ConcurrentHashMap)) {

            throw new IllegalStateException("You're repo does not initialize!");
        } else {

            this.pets = (ConcurrentHashMap<Integer, Pet>) pets;
        }
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        if (utils.idIsNumber(req)) {
            pets.remove(Integer.valueOf(req.getParameter("id")));
        }

        resp.sendRedirect(req.getContextPath() + "/");
    }
}
