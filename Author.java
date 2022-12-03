package AdvancedJava.AnotherThemes.JavaReflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE})
public @interface Author {
    String author() default "Author";
    String date() default "20.08.22";
}
