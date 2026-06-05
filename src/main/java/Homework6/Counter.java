//@author Vakho Gvishiani

package Homework6;

public class Counter {

    int count;
    int maxValue;

    public Counter() {
        count = 0;
        maxValue = 10;
    }

    void increment() {
        if (count < maxValue) {
            count++;
        }
    }

    void reset() {
        count = 0;
    }

    void countTo(int target) {
        for (int i = 1; i <= target; i++) {
            increment();
        }
    }

    public static void main(String[] args) {
        Counter c = new Counter();

        c.countTo(5);
        System.out.println(c.count);

        c.countTo(2);
        System.out.println(c.count);

        c.countTo(6);
        System.out.println(c.count);

        c.reset();
        System.out.println(c.count);

        c.countTo(5);
        System.out.println(c.count);
    }
}
