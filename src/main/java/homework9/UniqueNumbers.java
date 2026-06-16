//@author Vakho Gvishiani

package homework9;

import java.util.HashSet;

public class UniqueNumbers {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 1, 5};

        HashSet<Integer> uniqueNumbers = new HashSet<>();

        for (int num : arr) {
            uniqueNumbers.add(num);
        }

        System.out.println("Unique: " + uniqueNumbers);
        System.out.println("Size: " + uniqueNumbers.size());

        System.out.println("Contains 3? " + uniqueNumbers.contains(3));
        System.out.println("Contains 10? " + uniqueNumbers.contains(10));
    }
}