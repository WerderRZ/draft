package Schildt.part_12_Enum_Autoboxing_Annotation.p13;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MyClass {

    private String stringValue;
    public int intValue;

    public static void main(String[] args) {
        MyClass a = new MyClass();
        //Class<MyClass> aclass = a.getClass();
        Class<MyClass> aclass = MyClass.class;

        try {
            Class<?> c = Class.forName("java.lang.Byte");
        } catch (ClassNotFoundException cnfe) {
            System.out.println(cnfe);
        }

        System.out.println(aclass.getName());
        System.out.println(aclass.getSimpleName());

        System.out.println(aclass.getModifiers());
        System.out.println(Modifier.isPublic(aclass.getModifiers()));

        System.out.println(aclass.getSuperclass());

        Class<?>[] listInterfaces = aclass.getInterfaces();
        System.out.println(listInterfaces.length);

        Field[] fields = aclass.getDeclaredFields();
        for (Field f:fields) {
            System.out.println(f.getName());
        }

        Method[] methods = aclass.getDeclaredMethods();
        for (Method m:methods) {
            System.out.println(m.getName());
        }



    }

    public void printText() {
        System.out.println("Text Example");
    }
}
