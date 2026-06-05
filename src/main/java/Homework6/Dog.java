//@author Vakho Gvishiani

package Homework6;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": Bark! Bark loud!!");
    }

    public static void main(String[] args) {
        new Dog("Bondozavri").makeSound(); // Rex: Bark!
    }
}