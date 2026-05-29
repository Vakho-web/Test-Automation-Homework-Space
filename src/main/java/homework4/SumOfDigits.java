//@author Vakho Gvishiani

package homework4;

public class SumOfDigits {
    public static void main(String[] args) {

        int birthYear = 1992;

        int sum = 0;

        while (birthYear > 0) {
            int digit = birthYear % 10;
            sum += digit;
            birthYear = birthYear / 10;
        }

        System.out.println("Sum of digits = " + sum);
    }
}
