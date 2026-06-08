//@Author Vakho Gvishiani

package Homework5;

public class PasswordChecker {

    public static boolean isStrong(String password) {

        if (password.length() < 8) {
            return false;
        }

        boolean hasDigit = false;
        boolean hasUpper = false;

        for (int i = 0; i < password.length(); i++) {

            char c = password.charAt(i);

            if (Character.isDigit(c)) {
                hasDigit = true;
            }

            if (Character.isUpperCase(c)) {
                hasUpper = true;
            }
        }

        return hasDigit && hasUpper;
    }

    public static void main(String[] args) {

        System.out.println(isStrong("Hello123"));
        System.out.println(isStrong("hello"));
        System.out.println(isStrong("HELLO123"));
    }
}
