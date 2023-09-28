package Schildt.part_12_Enum_Autoboxing_Annotation.p12;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCreateInstance {
    static void loadService(String className) {
        try {
            Class<?> clazz = Class.forName(className);
            if (clazz.isAnnotationPresent(Service.class)) {
                //Object serviceObj = clazz.newInstance();

                Constructor<?> constructor = clazz.getConstructor(String.class);
                int countParameters = constructor.getParameterCount();
                System.out.println(countParameters);

                Object serviceObj;
                if (countParameters > 0) {
                    Object[] paramTypes = new Object[] {"RE"};
                    serviceObj = constructor.newInstance(paramTypes);
                } else {
                    serviceObj = constructor.newInstance();
                }

                Method[] methods = clazz.getDeclaredMethods();
                for (Method m:methods) {
                   //
                    if (m.isAnnotationPresent(Init.class)) {



                        m.invoke(serviceObj);
                        //System.out.println("Init annotation is true");
                    }

                }



            }



        } catch (ClassNotFoundException cnfe) {
            System.out.println("Not found class: " + className);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }


    }

    public static void main(String[] args) {
        loadService("Schildt.part_12_Enum_Autoboxing_Annotation.p12.SimpleService");
        loadService("Schildt.part_12_Enum_Autoboxing_Annotation.p12.LazyService");
        loadService("java.lang.String");
    }
}

