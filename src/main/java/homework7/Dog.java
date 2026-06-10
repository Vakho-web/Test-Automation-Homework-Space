//@author Vakho Gvishiani

package homework7;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Bark! Woof Woof!");
    }

    public static void main(String[] args) {

        Dog d = new Dog("Bondozavri");

        d.makeSound();
        d.sleep();
    }
}
