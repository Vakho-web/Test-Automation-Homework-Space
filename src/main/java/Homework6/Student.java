//@author Vakho Gvishiani

package Homework6;

public class Student {

    String name;
    int[] grades;

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public double averageGrade() {
        int sum = 0;

        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.length;
    }

    public String getStatus() {
        if (averageGrade() >= 60) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {
        Student student = new Student("Vakho", new int[]{85, 92, 78, 99, 95, 65});

        System.out.println(student.getStatus());
    }
}
