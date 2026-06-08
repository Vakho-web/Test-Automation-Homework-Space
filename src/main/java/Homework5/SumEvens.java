//@Author Vakho Gvishiani

package Homework5;

public class SumEvens {

    public static int sumEvens(int from, int to) {

        int sum = 0;

        for (int i = from; i <= to; i++) {

            if (i % 2 == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        int age = 34;

        int result = sumEvens(1, age * 2);

        System.out.println("Sum of even numbers: " + result);
    }
}
