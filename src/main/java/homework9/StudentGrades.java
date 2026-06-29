//@author Vakho Gvishiani

package homework9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentGrades {

    private static HashMap<String, List<Integer>> students = new HashMap<>();

    public static double averageFor(String name) {
        List<Integer> grades = students.get(name);

        if (grades == null || grades.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.size();
    }

    public static void main(String[] args) {

        List<Integer> vakho = new ArrayList<>();
        vakho.add(85);
        vakho.add(92);
        vakho.add(78);
        vakho.add(90);

        List<Integer> beka = new ArrayList<>();
        beka.add(70);
        beka.add(65);
        beka.add(80);
        beka.add(75);

        List<Integer> cika = new ArrayList<>();
        cika.add(95);
        cika.add(98);
        cika.add(92);
        cika.add(100);

        students.put("Vakho", vakho);
        students.put("Beka", beka);
        students.put("Cika", cika);

        for (String name : students.keySet()) {
            System.out.println(name + ": " + students.get(name)
                    + " avg=" + averageFor(name));
        }
    }
}
