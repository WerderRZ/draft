package Schildt.part_12_Enum_Autoboxing_Annotation.p14;

import java.lang.annotation.*;

@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Marker {
    int value();
    String text() default "Example";
}
