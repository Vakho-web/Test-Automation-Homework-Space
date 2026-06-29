//@author Vakho Gvishiani

package homework9;

public class GenericBox {

    public static void main(String[] args) {

        Box<String> stringBox = new Box<>();
        stringBox.set("Hello");

        Box<Integer> intBox = new Box<>();
        intBox.set(42);

        Box<Double> doubleBox = new Box<>();
        doubleBox.set(3.14);

        System.out.println("String box: " + stringBox.get());
        System.out.println("Integer box: " + intBox.get());
        System.out.println("Double box: " + doubleBox.get());
    }
}

class Box<T> {
    private T value;

    public Box() {}

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }
}
