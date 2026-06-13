//@author Vakho Gvishiani

package homework8;

public class MultiCatchDemo {

    public static void processInput(String input) {
        try {
            int result = Integer.parseInt(input);

            int[] arr = {10, 20};
            int value = arr[result];

            int finalResult = value / result;

            System.out.println("Result: " + finalResult);

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Incorrect number");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Index out of bounds");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Division by zero");
        }
    }

    public static void main(String[] args) {
        processInput("abc");
        processInput("0");
        processInput("99");
    }
}
