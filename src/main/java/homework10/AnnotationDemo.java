//@author Vakho Gvishiani

package homework10;

import java.lang.reflect.Method;

public class AnnotationDemo {

    @Author(name = "Vakho", date = "2026-06-20")
    public void firstMethod() {
        System.out.println("First method");
    }

    @Author(name = "Anna")
    public void secondMethod() {
        System.out.println("Second method");
    }

    public static void main(String[] args) throws Exception {

        Class<AnnotationDemo> clazz = AnnotationDemo.class;

        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Author.class)) {

                Author author = method.getAnnotation(Author.class);

                System.out.println(
                        method.getName() + " -> " + author.name()
                );
            }
        }
    }
}
