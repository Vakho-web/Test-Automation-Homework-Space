//@author Vakho Gvishiani

package homework7;

public class PolymorphismDemo {

    public static void main(String[] args) {

        Animal[] animals = {
                new Dog("Bondo"),
                new Cat("Dzvali"),
                new Dog("Jeronimo"),
                new Cat("Jokeri")
        };

        for (Animal animal : animals) {

            if (animal instanceof Dog) {
                System.out.print(animal.name + " (Dog): ");
            } else if (animal instanceof Cat) {
                System.out.print(animal.name + " (Cat): ");
            }

            animal.makeSound();
            animal.sleep();
        }
    }
}
