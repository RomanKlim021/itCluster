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

public class UpdatePetServlet  extends HttpServlet {

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

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        final String id = req.getParameter("id");
        final String name = req.getParameter("name");
        final String breed = req.getParameter("breed");
        final String age = req.getParameter("age");


        final Pet pet = pets.get(Integer.parseInt(id));
         pet.setName(name);
         pet.setBreed(breed);
         pet.setAge(Integer.valueOf(age));

        resp.sendRedirect(req.getContextPath() + "/");
    }

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        final String id = req.getParameter("id");

        if (utils.idIsInvalid(id, pets)) {
            resp.sendRedirect(req.getContextPath() + "/");
            return;
        }

        final Pet pet = pets.get(Integer.parseInt(id));
        req.setAttribute("pet", pet);

        req.getRequestDispatcher("/WEB-INF/view/update.jsp")
                .forward(req, resp);
    }
}

