package Streams;

import java.util.ArrayList;
import java.util.List;

/**
 * Las funciones en los streams se pueden encadenar
 */
public class Streams {

    private List<String> listaNombres;
    private List<String> listaNumeros;

    public Streams(){
        listaNombres = new ArrayList<>();
        listaNombres.add("Ramon");
        listaNombres.add("Juan");
        listaNombres.add("Luis");
        listaNombres.add("Fer");

        listaNumeros = new ArrayList<>();
        listaNumeros.add("1");
        listaNumeros.add("2");
        listaNumeros.add("3");
        listaNumeros.add("4");
    }

    public void filtrar(){
        listaNombres.stream()
                .filter(x -> x.endsWith("n"))
                .forEach(System.out::println);
    }

    public void ordenar(){
        listaNombres.stream()
                .sorted((x, y) -> y.compareToIgnoreCase(x))
                .forEach(System.out::println);
    }

    public void transformar(){
        //Cambia toda la lista a mausculas y las imprime
        listaNombres.stream().map(String::toUpperCase).forEach(System.out::println);
        //Cambia las cadenas a numero, les suma un 1 y las imprime
        listaNumeros.stream().map((x) -> Integer.parseInt(x) + 1).forEach(System.out::println);
    }

    public void limitar(){
        listaNombres.stream().limit(2).forEach(System.out::println);
    }

    public void contar(){
        long resultado = listaNombres.stream().count();
        System.out.println(resultado);
    }
}
