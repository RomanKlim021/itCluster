package Service;

import Common.Pet;
import Utils.utils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;


public class AddPetServlet extends HttpServlet {
    private Map<Integer, Pet> pets;

    private AtomicInteger id;

    @Override
    public void init() throws ServletException {

        final Object pets = getServletContext().getAttribute("pets");

        if (pets == null || !(pets instanceof ConcurrentHashMap)) {

            throw new IllegalStateException("You're repo does not initialize!");
        } else {

            this.pets = (ConcurrentHashMap<Integer, Pet>) pets;
        }

        id = new AtomicInteger(2);

    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        if (utils.requestIsValid(req)) {

            final String name = req.getParameter("name");
            final String age = req.getParameter("age");
            final String breed = req.getParameter("breed");

            final Pet pet = new Pet();
            final int id = this.id.getAndIncrement();
            pet.setId(id);
            pet.setAge(Integer.valueOf(age));
            pet.setName(name);
            pet.setBreed(breed);

            pets.put(id, pet);
        }

        resp.sendRedirect(req.getContextPath() + "/");
    }
}
