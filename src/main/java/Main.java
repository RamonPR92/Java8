import DefaultMethods.DefaultMethod;
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
    }
}
