//@author Vakho Gvishiani

package homework8;

public class FinallyDemo {

    public static int readNumber(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("Error: Incorrect Number -> " + s);
            return -1;
        } finally {
            System.out.println("Finished readNumber");
        }
    }

    public static void main(String[] args) {
        System.out.println("readNumber(\"100\") -> " + readNumber("100"));
        System.out.println();
        System.out.println("readNumber(\"xyz\") -> " + readNumber("xyz"));
    }
}
