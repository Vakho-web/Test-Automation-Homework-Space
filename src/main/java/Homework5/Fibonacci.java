//@author Vakho Gvishiani

package Homework5;

public class Fibonacci {

    public static long fib(int n) {

        if (n == 0) return 0;
        if (n == 1) return 1;

        long a = 0;
        long b = 1;
        long result = 0;

        for (int i = 2; i <= n; i++) {

            result = a + b;
            a = b;
            b = result;
        }

        return result;
    }

    public static void main(String[] args) {

        int age = 34;

        System.out.println("Fibonacci: " + fib(age));
    }
}
