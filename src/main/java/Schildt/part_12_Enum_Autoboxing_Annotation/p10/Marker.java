package Schildt.part_12_Enum_Autoboxing_Annotation.p10;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker{}
class Marker {
    @MyMarker
    public static void myMeth() {
        Marker ob = new Marker();
        try {
            Method m = ob.getClass().getMethod("myMeth");
            if (m.isAnnotationPresent(MyMarker.class)) {
                System.out.println("MyMarker is here.");
            }
        } catch (NoSuchMethodException nsme) {
            System.out.println("Method not found.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
