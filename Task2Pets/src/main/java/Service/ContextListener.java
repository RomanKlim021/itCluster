package Service;

import Common.Pet;
import Utils.utils;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@WebListener
public class ContextListener implements ServletContextListener {

    private Map<Integer, Pet> pets;

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

        final ServletContext servletContext =
                servletContextEvent.getServletContext();

        pets = new ConcurrentHashMap<>();

        servletContext.setAttribute("pet", pets);

        final Pet pet = utils.createStubUser(1, "Генрі", "Сіамський кіт", 5);
        this.pets.put(pet.getId(), pet);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        //Close recourse.
        pets = null;
    }
}
