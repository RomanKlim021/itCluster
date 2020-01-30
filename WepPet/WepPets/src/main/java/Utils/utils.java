package Utils;

import Common.Pet;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;



public class utils {

    public static boolean idIsNumber(HttpServletRequest request) {
        final String id = request.getParameter("id");
        return id != null &&
                (id.length() > 0) &&
                id.matches("[+]?\\d+");
    }

    public static boolean requestIsValid(HttpServletRequest request) {
        final String name = request.getParameter("name");
        final String age = request.getParameter("age");
        final String breed = request.getParameter("breed");


        return name != null && name.length() > 0 &&
                breed != null && breed.length() >0 &&
                age != null && age.length() > 0 &&
                age.matches("[+]?\\d+");
    }
    public static Pet createStubUser(final int id,
                                     final String name,
                                     final String breed,
                                     final int age) {
        Pet pet = new Pet();
        pet.setId(id);
        pet.setName(name);
        pet.setAge(age);
        pet.setBreed(breed);
        return pet;
    }

    public static boolean idIsInvalid(final String id, Map<Integer, Pet> repo) {
        return !(id != null &&
                id.matches("[+]?\\d+") &&
                repo.get(Integer.parseInt(id)) != null);
    }
}
