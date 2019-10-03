import Annotaciones.AnotacionesTest;
import Annotaciones.LenguajeTest;
import Coleccion.Coleccion;
import DateAPI.DateAPITest;
import DefaultMethods.DefaultMethod;
import InterfacesFuncioanales.InterfacesFuncionales;
import Map.MapTest;
import MethodReferences.MethodReferences;
import Optional.OptionalTest;
import Streams.Streams;
import Streams.StreamsParalelos;
import lambdas.Lambda;
import lambdas.LambdaScope;

import java.text.ParseException;

public class Main {
    public static void main(String[] args)throws InterruptedException, ParseException {
        Lambda lambda = new Lambda();
        lambda.ordenar();
        System.out.println("*-----------LAMBDAS----------*");
        lambda.calcular(9, 8);

        System.out.println("*------------LAMBDAS-SCOPE-LOCAL--------*");
        LambdaScope lambdaScope = new LambdaScope();
        System.out.println(lambdaScope.probarVariableLocal(6, 8));

        System.out.println("*----------LAMBDAS-SCOPE-GLOBAL----------*");
        System.out.println(lambdaScope.probarVariableEstatica(5, 3));

        System.out.println("*------------DEFAULT METHODS -------------*");
        DefaultMethod defaultMethod = new DefaultMethod();
        defaultMethod.caminar();
        defaultMethod.hablar();

        System.out.println("*------------INTERFACES FUNCIONALES-------------*");
        InterfacesFuncionales interfacesFuncionales = new InterfacesFuncionales();
        System.out.println(interfacesFuncionales.operar(10, 15));

        System.out.println("*------------REFERENCIAS A METODOS-------------*");
        MethodReferences methodReferences = new MethodReferences();
        methodReferences.saludar();

        methodReferences.referenciarMetodoInstanciaObjetoArbitrario();

        methodReferences.referenciaConstrucor();

        System.out.println("*------------COLECCION-------------*");
        System.out.println("*------------FOREACH-------------*");
        Coleccion coleccion = new Coleccion();
        coleccion.llenarLista();
        coleccion.usarForEach();
        coleccion.ordenarLista();
        //coleccion.usarRemoveIf();
        coleccion.usarForEach();

        System.out.println("*------------STREAMS-------------*");
        Streams streams = new Streams();
        streams.filtrar();
        streams.ordenar();
        streams.transformar();
        streams.limitar();
        streams.contar();

        System.out.println("*------------OPTIONAL-------------*");
        OptionalTest optionalTest = new OptionalTest();
        optionalTest.probar(null);
        optionalTest.orElse("Ramon");
        optionalTest.orThrow("Ramon");
        optionalTest.isPresent(null);

        System.out.println("*------------STREAM PARALELO-------------*");

        StreamsParalelos streamsParalelos = new StreamsParalelos();
        streamsParalelos.probarStream();
        System.out.println("--------------");
        streamsParalelos.porbarStreamParalelo();

        System.out.println("*------------MAP-----------*");
        MapTest mapTest = new MapTest();
        mapTest.llenarMapa();
        System.out.println("*------------------ v7*");
        mapTest.imprimirJava7();
        System.out.println("*------------------ v8*");
        mapTest.imprimirJava8();
        System.out.println("*------------------ v8*");
        mapTest.insertarSiEsAusente();
        mapTest.imprimirJava8();

        System.out.println("*------------------ v8*");
        mapTest.operarSiPresente();
        mapTest.imprimirJava8();

        System.out.println("*------------------ v8*");
        mapTest.obtenerValorOPredeterminado();

        System.out.println("*------------------ v8*");
        mapTest.recolectar();

        System.out.println("*------------ANOTACIONES------------*");
        AnotacionesTest anotacionesTest = new AnotacionesTest();
        anotacionesTest.mostrarMetadatos();

        LenguajeTest lenguajeTest = new LenguajeTest();
        lenguajeTest.mostrar();

        System.out.println("*------------DATEAPI------------*");
        DateAPITest dateAPITest = new DateAPITest();
        dateAPITest.compararFechas(8);
        dateAPITest.medirTiempo(8);
        dateAPITest.periodoEntreFechas(8);
        dateAPITest.convertir(8);
    }
}
