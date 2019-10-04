package FuncionesAltoOrden;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Predicate: Es una condicion la cual evalua un tipo de dato dado y devuelve verdadero o falso.
 *
 * Consumer: Es un proceso que toma un tipo dado, lo procesa y no devuelve nada
 *
 * Function
 */

public class FuncionesAltoOrdenTest {

    private Function<String, String> convertirMayusculas = String::toUpperCase;
    private Function<String, String> convertirMinusculas = String::toLowerCase;

    public void imprimir(Function<String, String> function, String valor) {
        System.out.println(function.apply(valor));
    }

    public Function<String, String> mostrar(String valor) {
        return (String x) -> valor + x;
    }

    public Function<String, String> getConvertirMayusculas() {
        return convertirMayusculas;
    }

    public void filtrar(List<String> lista, Consumer<String> consumer, int longitud) {
        lista.stream().filter(this.menorALongitud(longitud)).forEach(consumer);
    }

    private Predicate<String> menorALongitud(int longitud) {
        return texto -> texto.length() < longitud;
    }

    public Function<String, String> getConvertirMinusculas() {
        return convertirMinusculas;
    }

}
