//@Author Vakho Gvishiani

package Homework6;

public class Circle extends Shape {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        System.out.println(new Rectangle(40, 55).area());
        System.out.println(new Circle(30).area());
    }
}
