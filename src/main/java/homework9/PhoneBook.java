//@author Vakho Gvishiani

package homework9;

import java.util.HashMap;

public class PhoneBook {

    public static String findPhone(HashMap<String, String> phoneBook, String name) {
        if (phoneBook.containsKey(name)) {
            return phoneBook.get(name);
        }
        return "Contact Not Found";
    }

    public static void main(String[] args) {

        HashMap<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Vakho", "555111111");
        phoneBook.put("Anna", "555222222");
        phoneBook.put("Nino", "555333333");
        phoneBook.put("Giorgi", "555444444");

        System.out.println("Anna: " + findPhone(phoneBook, "Anna"));
        System.out.println("Eka: " + findPhone(phoneBook, "Eka"));

        for (String name : phoneBook.keySet()) {
            System.out.println(name + " -> " + phoneBook.get(name));
        }
    }
}
