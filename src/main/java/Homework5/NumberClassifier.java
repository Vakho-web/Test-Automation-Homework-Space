//@Author Vakho Gvishiani

package Homework5;

public class NumberClassifier {

    public static String classify(int n) {

        if (n > 0) {
            return "Positive";
        } else if (n < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    public static String classify(double n) {

        String sign;

        if (n > 0) {
            sign = "Positive";
        } else if (n < 0) {
            sign = "Negative";
        } else {
            sign = "Zero";
        }

        if (n == (int) n) {
            return sign + " · Whole double";
        } else {
            return sign + " · Decimal";
        }
    }

    public static void main(String[] args) {

        System.out.println(classify(-5));
        System.out.println(classify(3.14));
        System.out.println(classify(7.0));
    }
}
