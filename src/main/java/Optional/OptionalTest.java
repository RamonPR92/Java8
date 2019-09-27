package Optional;

import java.util.Optional;

/**
 * Es cosotoso usar optional a nivel de recursos, es mejor no usarlo
 */
public class OptionalTest {

    public void probar(String valor){
        //System.out.println(valor.contains("Ramon"));
        try{
            Optional optional = Optional.empty();
            optional.get();
        }catch(Exception ex){
            System.out.println("No hay elemento");
        }

    }

    public void orElse(String valor){
        //Si el valor puede ser null
        Optional<String> optional = Optional.ofNullable(valor);
        //Cuando lo obtenga y sea null, que lo reemplace por un valor predeterminado
        String valorString = optional.orElse("Predeterminado");
        System.out.println(valorString);
    }

    public void orThrow(String valor){
        //Si el valor puede ser null
        Optional<String> optional = Optional.ofNullable(valor);
        //Si el valor es null se lanza una exception
        String valorString = optional.orElseThrow(NumberFormatException::new);
        System.out.println(valorString);
    }

    public void isPresent(String valor){
        //Si el valor puede ser null
        Optional<String> optional = Optional.ofNullable(valor);
        //Nos indica si el valor diferente esta presente
        System.out.println(optional.isPresent());
    }
}
