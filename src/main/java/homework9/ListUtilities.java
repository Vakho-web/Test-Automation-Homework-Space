//@author Vakho Gvishiani

package homework9;

import java.util.ArrayList;
import java.util.List;

public class ListUtilities {

    public static <T> void printList(List<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }

    public static <T> T getFirst(List<T> list) {
        return list.get(0);
    }

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("Java");
        stringList.add("Git");
        stringList.add("OOP");

        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);

        System.out.println("String list:");
        printList(stringList);
        System.out.println("First: " + getFirst(stringList));

        System.out.println();

        System.out.println("Integer list:");
        printList(intList);
        System.out.println("First: " + getFirst(intList));
    }
}
