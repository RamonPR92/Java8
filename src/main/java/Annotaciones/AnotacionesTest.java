package Annotaciones;

/**
 * Las anotaciones son una forma de metadatos que proporcionan datos sobre un programa que no forma parte del programa en sí.
 * Las anotaciones no tienen ningún efecto directo en el funcionamiento del código que anotan.
 *
 * Las anotaciones tienen una serie de usos, entre ellos:
 *
 *  -> Información para el compilador: El compilador puede utilizar las anotaciones para detectar errores o suprimir las advertencias.
 *  ->Procesamiento en tiempo de compilación y tiempo de implementación: Las herramientas de software pueden procesar información de
 *      anotaciones para generar código, archivos XML, etc.
 *  ->Procesamiento de tiempo de ejecución: algunas anotaciones están disponibles para ser examinadas en tiempo de ejecución.
 */

@DocumentacionClase(
        autor = "Ramon",
        fecha = "03/10/2019",
        revisionActual = 2,
        ultimaModificacion = "02/10/2019",
        ultimaModificacionPor = "Ramon",
        revisadores = {"Adrian", "Chava"}
)
public class AnotacionesTest {


    public void mostrarMetadatos(){
        System.out.println("Autor: " + AnotacionesTest.class.getAnnotation(DocumentacionClase.class).autor());
    }
}
