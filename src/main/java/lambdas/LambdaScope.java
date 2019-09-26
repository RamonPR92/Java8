package lambdas;

public class LambdaScope {

    private static int valorGlobal1;
    private int valorGlobal2;

    public int probarVariableLocal(int n1, int n2) {
        //Las vaqriables locales usadas dentro de un lambda debe ser final, ya que su valor no se puede cambiar
        final int valor = 3;

//        java 1.7
        /*Operacion operacion = new Operacion() {
            @Override
            public int calcularPromedio(int n1, int n2) {
                return n1 + n2 + valor;
            }
        };*/

        Operacion operacion = (p1, p2) -> {
          return p1 + p2 + valor;
        };

        return operacion.calcularPromedio(n1, n2);
    }

    public int probarVariableEstatica(int n1, int n2){
        //Las variables globales no estaticas y estaticas pueden cambiar su valor dentro de los lambdas
        Operacion operacion = (p1, p2) ->{
          valorGlobal1 = p1 + p2;
          valorGlobal2 = valorGlobal1;
          return valorGlobal2;
        };

        return operacion.calcularPromedio(n1, n2);
    }
}
