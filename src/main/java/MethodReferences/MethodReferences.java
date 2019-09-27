package MethodReferences;

import java.util.Arrays;

/**
 * Los metodos a referencias siempre se apoyan de las interfaces funcionales, los metodos a referencias no aceptan el
 * paso de parametros, el constructor necesita de unos parametros pero se agregan implicitamente mediante el unico metodo de
 * la interfaz funcional, y el contstructor.
 */
public class MethodReferences {

    public static void referenciaMetodoEstatico(){
        System.out.println("Referencia a metodo estatico");
    }

    public void referenciarMetodoInstanciaObjetoArbitrario(){
        String[] nombres = {"Ramon", "Juan", "Luis"};

        //Java 1.7
       /* Arrays.sort(nombres, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return  o1.compareTo(o2);
            }
        });*/

       //Java 1.8 Lambda
        //Arrays.sort(nombres, (p1, p2) -> p1.compareTo(p2));

        //Java 1.8 Referencia a metodo
        //El metodo sort intera nombres y cada elemento hacer referencia a su metodo compareTo
        Arrays.sort(nombres, String::compareTo);

        System.out.println(Arrays.toString(nombres));
    }

    public void referenciarMetodoInstanciaObjetoParticular(){
        System.out.println("Referencia a metodo de intancia a objeto particular");
    }

    public void referenciaConstrucor(){

       /*Java 1.7 con clase anonima
       IEstudiante iEstudiante = new IEstudiante() {
           @Override
           public Estudiante crear(int id, String nombre) {
               return new Estudiante(id, nombre);
           }
       };*/

       //Java 1.8 Lambda
//        IEstudiante iEstudiante = (id, nombre) -> new Estudiante(id, nombre);
        //Java 1.8 Referencia a metodos,
        IEstudiante iEstudiante = Estudiante::new;
        Estudiante estudiante =  iEstudiante.crear(13, "Ramon");
        System.out.println("Id = " + estudiante.getId() +", " + "Nombre = " + estudiante.getNombre());
    }

    public void saludar(){
        /*Saludo saludo = () -> MethodReferences.referenciaMetodoEstatico();
        saludo.saludar();*/

        //Una interfaz funcional recibe un metodo estatico que no devulee algo y no tiene parametros
        Saludo saludo1 = MethodReferences::referenciaMetodoEstatico;
        saludo1.saludar();

        //Una interfaz funcional recibe un metodo de una instancia que no devulee algo y no tiene parametros
        saludo1 = this::referenciarMetodoInstanciaObjetoParticular;
        saludo1.saludar();
    }
}
