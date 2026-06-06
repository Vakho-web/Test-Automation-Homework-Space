//@author Vakho Gvishiani

package Homework6;

public class Car extends Vehicle {

    int doors;

    public Car(String brand, int year, int doors) {
        super(brand, year);
        this.doors = doors;
    }

    @Override
    public void info() {
        System.out.println(brand + " " + year + ", " + doors + " doors");
    }

    public static void main(String[] args) {
        new Car("Lamborghini", 2010, 2).info();
    }
}
