//@author Vakho Gvishiani

package homework4;

public class EvenOddCounter {
    public static void main(String[] args) {

        int birthYear = 19985;

        int lastTwoDigits = birthYear % 100;

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 1; i <= lastTwoDigits; i++) {
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Last two digits: " + lastTwoDigits);
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}
