package Schildt.part_12_Enum_Autoboxing_Annotation.p14;

import java.lang.reflect.*;

@Marker(20)
public class NewClass {

    public int age;
    public String name;

    public NewClass() {

    }

    public NewClass(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void testMethod() {
        System.out.println("This is testMethod");
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        NewClass newClass = new NewClass();
        Class<?> clazz = newClass.getClass();
        System.out.println(clazz.getName());
        System.out.println(clazz.getPackage().getName());

        for (Field f: clazz.getFields()) {
            System.out.println(f.getName());
        }

        for (Method m:clazz.getMethods()) {
            System.out.println(m.getName());
        }

        Constructor<?> constructor = clazz.getConstructor(int.class, String.class);


        Method method = clazz.getDeclaredMethod("testMethod");
        method.invoke(newClass);



    }
}
