//@author Vakho Gvishiani

package homework4;

public class PrimeCheck {
    public static void main(String[] args) {

        int age = 34;
        boolean isPrime = true;

        if (age <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= (age / 2); i++) {
                if (age % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(age + " is a prime number");
        } else {
            System.out.println(age + " is NOT a prime number");
        }
    }
}
