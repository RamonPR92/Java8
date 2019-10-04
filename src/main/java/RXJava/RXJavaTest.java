package RXJava;

import io.reactivex.Observable;

import java.util.ArrayList;
import java.util.List;

public class RXJavaTest {

    private List<Integer> listOne;
    private List<Integer> listTwo;

    private void llenarListas(){
       listOne = new ArrayList<>();
       listTwo = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listOne.add(i);
            listTwo.add(i);
        }
    }

    /**
     * Busca en las dos listas al mismo tiempo de manera paralela
     */
    public void buscar(){
        llenarListas();
        Observable<Integer> observableOne = Observable.fromIterable(listOne);
        Observable<Integer> observableTwo = Observable.fromIterable(listTwo);

        /*Observable.merge(observableOne, observableTwo).subscribe(x ->{
            if(x == 1){
                System.out.println(x);
            }
        });*/

        Observable.merge(observableOne, observableTwo).filter(x -> x == 1).subscribe(System.out::println);
    }
}
