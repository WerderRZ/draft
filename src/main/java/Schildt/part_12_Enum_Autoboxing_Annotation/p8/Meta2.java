package Schildt.part_12_Enum_Autoboxing_Annotation.p8;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String description();
}

@What(description = "Annotation of class")
@MyAnno(str = "Meta2", val = 99)
class Meta2 {
    @What(description = "Annotation of method")
    @MyAnno(str = "Testing", val = 100)
    public static void myMeth() {
        Meta2 ob = new Meta2();
        try {
            Annotation[] annos = ob.getClass().getAnnotations();

            System.out.println("Все аанотации класса Meta2:");
            for (Annotation a : annos) {
                System.out.println(a);
            }

            Method m = ob.getClass().getMethod("myMeth");
            annos  = m.getAnnotations();
            System.out.println("Все аанотации метода MyMeth:");
            for (Annotation a : annos) {
                System.out.println(a);
            }

        } catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
