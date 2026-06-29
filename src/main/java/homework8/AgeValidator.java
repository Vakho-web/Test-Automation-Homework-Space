//@author Vakho Gvishiani

package homework8;

public class AgeValidator {

    public static void validate(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Invalid Age: " + age);
        }
        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) {
        try {
            validate(25);
            validate(-5);
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            validate(200);
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
