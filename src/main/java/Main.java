import Coleccion.Coleccion;
import DefaultMethods.DefaultMethod;
import InterfacesFuncioanales.InterfacesFuncionales;
import MethodReferences.MethodReferences;
import Optional.OptionalTest;
import Streams.Streams;
import Streams.StreamsParalelos;
import lambdas.Lambda;
import lambdas.LambdaScope;

public class Main {
    public static void main(String[] args) {
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
    }
}
