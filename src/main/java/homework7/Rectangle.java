//@author Vakho Gvishiani

package homework7;

public class Rectangle implements Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    public static void main(String[] args) {

        Shape s1 = new Rectangle(40, 65);
        System.out.println(s1.area());

        Shape s2 = new Circle(40);
        System.out.println(s2.area());
    }
}
