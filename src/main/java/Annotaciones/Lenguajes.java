package Annotaciones;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Lenguajes {
    Lenguaje[] value() default {};
}
