package DefaultMethods;

public interface PersonaB {

    void caminar();

    //Es un metodo con un comportamiento por defecto
    default public void hablar(){
        System.out.println("Estoy hablando");
    }
}
