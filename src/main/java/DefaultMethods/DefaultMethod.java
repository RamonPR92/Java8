package DefaultMethods;

public class DefaultMethod implements Persona, PersonaB {

    @Override
    public void caminar() {
        System.out.println("Estoy caminando");
    }

    //Cuando el metodo por defecto cuenta con la misma firma, en dos interfaces que se estan implementando
    //Nos obliga a sobreescribirlo ya que no va a saber que metodo ejecutar
    @Override
    public void hablar() {
        System.out.println("Estoy hablando desde el default method");
    }
}
