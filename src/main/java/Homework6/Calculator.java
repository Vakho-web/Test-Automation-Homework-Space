//@author Vakho Gvishiani

package Homework6;

public class Calculator {

    public double calculate(double a, double b, char op) {

        switch (op) {
            case '+':
                return a + b;

            case '-':
                return a - b;

            case '*':
                return a * b;

            case '/':
                if (b == 0) {
                    return Double.NaN;
                }
                return a / b;

            default:
                return Double.NaN;
        }
    }

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println(calc.calculate(1050, 53, '+'));
        System.out.println(calc.calculate(810, 25, '*'));
        System.out.println(calc.calculate(1001, 0, '/'));
        System.out.println(calc.calculate(1001, 10, '/'));
        System.out.println(calc.calculate(2506, 156, '-'));
    }
}
