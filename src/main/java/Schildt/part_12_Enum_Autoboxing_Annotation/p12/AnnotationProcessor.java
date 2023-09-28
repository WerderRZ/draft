package Schildt.part_12_Enum_Autoboxing_Annotation.p12;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class AnnotationProcessor {

    static void inspectService(Class<?> service) {
        System.out.print(service.getName() + ": ");
        if (service.isAnnotationPresent(Service.class)) {
            Service ann = service.getAnnotation(Service.class);
            System.out.println(ann.name());

            Method[] methods = service.getDeclaredMethods();
            for (Method m:methods) {
                System.out.println(m.getName() + ": ");
                if (m.isAnnotationPresent(Init.class)) {
                    System.out.println("Init annotation is true");
                } else {
                    System.out.println("Init annotation is false");
                }

            }

        } else {
            System.out.println("Not found");
        }

        System.out.println("------------");


    }


    public static void main(String[] args) {
        inspectService(SimpleService.class);
        inspectService(LazyService.class);
        inspectService(String.class);

    }

}
