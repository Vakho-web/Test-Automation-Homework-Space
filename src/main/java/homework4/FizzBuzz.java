package homework4;

public class FizzBuzz {
    public static void main(String[] args) {

        int Age = 34;

        for (int i = 1; i <= Age * 3; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }

        }
    }

}
