package AdvancedJava.AnotherThemes.JavaReflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, ClassNotFoundException{
        Scanner scanner = new Scanner(System.in);
       Class classObject1 = Class.forName(scanner.next());
       Class classObject2 = Class.forName(scanner.next());
        String methodName = scanner.next();

        Method method = classObject1.getMethod(methodName, classObject2);
                Object o1 = classObject1.newInstance();
                Object o2 = classObject2.getConstructor(String.class).newInstance("String value");
                method.invoke(o1, o2);

        System.out.println(o1);
    }
}
