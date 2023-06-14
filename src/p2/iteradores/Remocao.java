package p2.iteradores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Remocao {

    static void filterSafe(List<Integer> lista) {
        lista.removeIf(integer -> integer > 50); //Melhor jeito de remover
    }
    static void filterUnsafe(List<Integer> lista) {
        for(int i = 0; i < lista.size(); i ++) {
            if (lista.get(i) > 10)
                lista.remove(i);
        }
    }
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(9);
        lista.add(12);
        lista.add(18);
        lista.add(25);
        lista.add(55);
        lista.add(67);
        lista.add(81);
        lista.add(83);

        //filterSafe(lista);
        filterUnsafe(lista); //COM UNSAFE NÃO REMOVE 18, 55 E 81 pois ao mexer no tamanho da lista o código "buga"
        System.out.println(lista);
    }
}