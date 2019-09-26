import lambdas.Lambda;
import lambdas.LambdaScope;

public class Main {
    public static void main(String[] args) {
        Lambda lambda = new Lambda();
        lambda.ordenar();
        System.out.println("*--------------------------------*");
        lambda.calcular(9, 8);

        System.out.println("*--------------------------------*");
        LambdaScope lambdaScope = new LambdaScope();
        System.out.println(lambdaScope.probarVariableLocal(6, 8));

        System.out.println("*------------------------------*");
        System.out.println(lambdaScope.probarVariableEstatica(5, 3));
    }
}
