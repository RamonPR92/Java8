package lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * El uso de los lambdas en java es para las clases anonimas
 */
public class Lambda {

    public void ordenar(){
        List<String> lista = new ArrayList<>();
        lista.add("Ramon");
        lista.add("Juan");
        lista.add("Sergio");

        //Forma java 1.7
        /*Collections.sort(lista, new Comparator<String>() {
            @Override
            public int compare(String valor1, String valor2) {
                return valor1.compareTo(valor2);
            }
        });*/

        //Forma java 1.8
        Collections.sort(lista, ( parametro1,  parametro2) -> parametro1.compareTo(parametro2));

        for (String elemento: lista) {
            System.out.println(elemento);
        }
    }

    public void calcular( int n1, int n2){
        //Forma java 1.7
        /*Operacion operacion = new Operacion() { //Clase anonima
            @Override
            public int calcularPromedio(int n1, int n2) {
                return (n1 * n2) / 2;
            }
        };*/

        //Forma java 1.8
        Operacion operacion = (int p1, int p2) -> (p1 * p2) / 2;//Clase anonima
        System.out.println(operacion.calcularPromedio(n1, n2));
    }
}
