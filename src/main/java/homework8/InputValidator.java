//@author Vakho Gvishiani

package homework8;

public class InputValidator {

    public static int processAge(String input)
            throws NumberFormatException, IllegalArgumentException {

        int age = Integer.parseInt(input);

        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative: " + age);
        }

        return age * 12;
    }

    public static void main(String[] args) {

        try {
            System.out.println("Result: " + processAge("25"));
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: invalid number");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }

        try {
            System.out.println("Result: " + processAge("-5"));
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: invalid number");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }
    }
}
