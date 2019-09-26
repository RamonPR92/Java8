package InterfacesFuncioanales;

import lambdas.Operacion;

public class InterfacesFuncionales {

    public int operar( int n1, int n2) {

        Operacion operacion = (int p1, int p2) -> (p1 + p2) / 2;
        return operacion.calcularPromedio(n1, n2);

    }
}
