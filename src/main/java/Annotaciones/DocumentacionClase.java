package Annotaciones;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Define una anotacion, agrega los datos o propiedades de una anotacion, asi como sus tipos.
 * Esta anotacion sera utilizada para describir clases, para que sea tomada para la documentacion se agrega la anotacion @Documented
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)//Por default el ambito de una anotacion es CLASS
public @interface DocumentacionClase {
    String autor();
    String fecha();
    int revisionActual() default 1;
    String ultimaModificacion() default "N/A";
    String ultimaModificacionPor();
    String[] revisadores();
}
