//@author Vakho Gvishiani

package homework8;

public class NullCheck {

    public static int safeLength(String s) {
        try {
            return s.length();
        } catch (NullPointerException e) {
            System.out.println("Value is null");
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("safeLength(\"Hello\") -> " + safeLength("Hello"));
        System.out.println("safeLength(null) -> " + safeLength(null));
    }
}