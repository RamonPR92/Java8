package Map;

import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Biconsumer es una expresion lambda de dos parametros
 */
public class MapTest {

    private Map<Integer, String> map;

    public void llenarMapa(){
        map = new HashMap<>();
        map.put(1, "Ramon");
        map.put(2, "Ramiro");
        map.put(3, "Rodolfo");
        map.put(4, "Rolo");
        map.put(5, "Rick");
    }

    public void imprimirJava7(){
        for (Map.Entry<Integer, String> elemento:map.entrySet()) {
            System.out.println("Clave: " + elemento.getKey() + ", " + "Valor: " + elemento.getValue());
        }
    }

    public void imprimirJava8(){
        map.forEach((k, v) -> System.out.println("Clave: " + k + ", " + "Valor: " + v));
    }

    //Si la clave no existe, agrega el elemento
    public void insertarSiEsAusente(){
        map.putIfAbsent(1, "Rock");
    }

    //Si la calve esta presente, realiza la operacion indicada en el lambda
    public void operarSiPresente(){
        map.computeIfPresent(3, (k, v) -> k + "--------" + v);
        System.out.println(map.get(3));
    }

    /**
     * Si la clave no existe, se le asigna un valor predeterminado
     */
    public void obtenerValorOPredeterminado(){
        String valor = map.getOrDefault(5, "Valor predeterminado");
        System.out.println(valor);
    }

    public void recolectar(){
        Map<Integer, String > mapaRecolectado = map.entrySet().stream()
                .filter(e -> e.getValue().contains("i"))//Si algun valor contiene la i
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));//Recolecta el valor y la clave y lo agregar al nuevo mapa

        mapaRecolectado.forEach((k, v) -> System.out.println("Clave: " + k + ", " + "Valor: " + v));
    }
}
