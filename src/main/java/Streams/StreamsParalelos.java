package Streams;

import java.util.ArrayList;
import java.util.List;

public class StreamsParalelos {

    private List<Integer> listaNumeros;

    public void llenar(){
        listaNumeros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listaNumeros.add(i);
        }
    }

    public void probarStream(){
        llenar();
        listaNumeros.stream().forEach(System.out::println);
    }

    public void porbarStreamParalelo(){
        llenar();
        //La ejecucion no es ordenada
        listaNumeros.parallelStream().forEach(System.out::println);
    }
}
