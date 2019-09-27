package Coleccion;

import java.util.*;

public class Coleccion {
    private List<String>listaNombres;

    public void llenarLista(){
        listaNombres = new ArrayList();
        listaNombres.add("Ramon");
        listaNombres.add("Juan");
        listaNombres.add("Luis");
        listaNombres.add("Fer");
    }

    public void usarForEach(){
        //Java 1.7
        /*for (String valor: listaNombres) {
            System.out.println(valor);
        }*/

        //Java 1.8 Lambda
        //listaNombres.forEach(valor -> System.out.println(valor));

        listaNombres.forEach(System.out::println);
    }

    public void usarRemoveIf(){
        //Java 1.7
        /*Iterator<String> iterator = listaNombres.iterator();
        while(iterator.hasNext()) {
            if (iterator.next().equals("Ramon")) {
                iterator.remove();
            }
        }*/
        //java 1.8
        listaNombres.removeIf(x -> x.equalsIgnoreCase("Ramon"));
    }

    public void ordenarLista(){
        //java 1.7
        /*listaNombres.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });*/

        //java 1.8
        listaNombres.sort((x,y) -> x.compareToIgnoreCase(y));
    }
}
