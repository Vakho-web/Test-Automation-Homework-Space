//@author Vakho Gvishiani

package homework8;

public class StringToNumber {

    public static int parseSafe(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("Not a number: " + s);
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("parseSafe(\"42\") -> " + parseSafe("42"));
        System.out.println("parseSafe(\"abc\") -> " + parseSafe("abc"));
        System.out.println("parseSafe(\"\") -> " + parseSafe(""));
    }
}
