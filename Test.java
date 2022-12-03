package AdvancedJava.AnotherThemes.JavaReflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException{
        PersonReflectation personReflectation = new PersonReflectation();
        Class myClass = PersonReflectation.class;
     /*   Class myClass2 = person.getClass();
        try{
            Class myClass3 = Class.forName("Person");
        }catch(ClassNotFoundException e){
            System.out.println("ClassNotFoundException : " + e.getCause());
        }

      */

    /*   Method[] methods = myClass.getMethods();
        for(Method method : methods){
            System.out.println(method.getName() + ", " + method.getReturnType() + ", " + Arrays.toString(method.getParameterTypes()));
       }

     */
       Field[] fields = myClass.getFields(); //возвращает только публичные поля
       for(Field field : fields){
           System.out.println(field.getName() + ", " + field.getType());
       }

        Annotation[] annotations = myClass.getAnnotations();
       for(Annotation annotation : annotations){
           if(annotation instanceof Author){
               System.out.println("Yes");
           }else{
               System.out.println("No");
           }
       }
    }
}
