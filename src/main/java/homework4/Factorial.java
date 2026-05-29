//@author Vakho Gvishiani

package homework4;

public class Factorial {
    public static void main(String[] args) {

        int birthMonth = 4;

        long factorial = 1;
        int i = 1;

        while (i <= birthMonth) {
            factorial *= i;
            i++;
        }

        System.out.println(birthMonth + "! = " + factorial);
    }
}
