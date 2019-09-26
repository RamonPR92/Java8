package lambdas;

/**
 * La interfaz funcional es aquella que solo cuenta con un solo metodo, ademas se agrega una anotacion para
 * definir explicitamente una interfaz funcional
 */
@FunctionalInterface
public interface Operacion {

    int calcularPromedio(int n1, int n2);
}
