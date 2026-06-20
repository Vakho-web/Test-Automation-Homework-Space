//@author Vakho Gvishiani

package homework10;

import java.util.List;

public class ReduceSum {
    public static void main(String[] args) {

        List<Integer> nums = List.of(1, 2, 3, 4, 5);

        int sum = nums.stream()
                .reduce(0, Integer::sum);

        int product = nums.stream()
                .reduce(1, (a, b) -> a * b);

        int max = nums.stream()
                .reduce(Integer::max)
                .orElseThrow();

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Max: " + max);
    }
}
