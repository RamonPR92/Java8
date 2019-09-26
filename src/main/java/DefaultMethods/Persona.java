package DefaultMethods;

public interface Persona {

    void caminar();

    //Es un metodo con un comportamiento por defecto
    default public void hablar(){
        System.out.println("Estoy hablando");
    }
}
