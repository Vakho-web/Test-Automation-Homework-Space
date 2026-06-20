//@author Vakho Gvishiani

package homework10;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

/*Instead of AuthorAnnotation this file is called Author, because:
any public top-level type must be placed in a file with the exact same name.*/

public @interface Author {
    String name();
    String date() default "unknown";
}
