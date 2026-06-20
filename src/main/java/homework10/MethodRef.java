//@author Vakho Gvishiani

package homework10;

import java.util.List;
import java.util.stream.Collectors;

public class MethodRef {
    public static void main(String[] args) {

        List<String> names = List.of("Vakho", "Giorgi", "Laura");
        names.forEach(System.out::println);

        List<String> upper = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upper);

        List<String> numbersAsStrings = List.of("1", "2", "3");

        List<Integer> numbers = numbersAsStrings.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(numbers);
    }
}
