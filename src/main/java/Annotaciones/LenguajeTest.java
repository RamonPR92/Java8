package Annotaciones;

//1.7
/*@Lenguajes({
        @Lenguaje("Java"),
        @Lenguaje("Python")
})*/

//1.8
@Lenguaje("Java")
@Lenguaje("Python")
public class LenguajeTest {
    public void mostrar(){

        Lenguaje[] lenguajeArray = LenguajeTest.class.getAnnotationsByType(Lenguaje.class);
        System.out.println("Total de anotaciones: " + lenguajeArray.length);

        Lenguajes lenguajes = LenguajeTest.class.getAnnotation(Lenguajes.class);
        for (Lenguaje lenguaje: lenguajes.value()) {
            System.out.println(lenguaje.value());
        }
    }
}
