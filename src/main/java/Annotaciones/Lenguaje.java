package Annotaciones;

import java.lang.annotation.Repeatable;
//Indicamos que Lenguajes va a poder repetir Lenguaje
@Repeatable(value = Lenguajes.class)
public @interface Lenguaje {
    String value();
}
