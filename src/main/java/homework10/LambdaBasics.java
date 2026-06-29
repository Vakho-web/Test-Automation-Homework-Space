//@author Vakho Gvishiani

package homework10;

import java.util.Comparator;
import java.util.function.Predicate;

public class LambdaBasics {
    public static void main(String[] args) {

        Runnable r = () -> System.out.println("Hello Lambda");
        r.run();

        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println("5 is even? " + isEven.test(5));
        System.out.println("6 is even? " + isEven.test(6));

        Comparator<String> byLength = (a, b) -> a.length() - b.length();

        String str1 = "Java";
        String str2 = "Programming";

        int result = byLength.compare(str1, str2);

        if (result < 0) {
            System.out.println(str1 + " is shorter than " + str2);
        } else if (result > 0) {
            System.out.println(str2 + " is shorter than " + str1);
        } else {
            System.out.println("Both strings have equal length");
        }
    }
}