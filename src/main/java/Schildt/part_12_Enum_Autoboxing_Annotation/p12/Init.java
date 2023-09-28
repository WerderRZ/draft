package Schildt.part_12_Enum_Autoboxing_Annotation.p12;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Init {
    boolean suppressException() default false;
}
