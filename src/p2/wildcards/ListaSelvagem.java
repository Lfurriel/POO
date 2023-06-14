package p2.wildcards;

import java.util.ArrayList;
import java.util.List;

public class ListaSelvagem {
    public static void imprimirLista(List<?> lista) {
        for (Object elemento : lista)
            System.out.println(elemento);
    }

    public static void main(String[] args) {
        List<Integer> listaInteiros = new ArrayList<>();
        listaInteiros.add(10);
        listaInteiros.add(20);
        listaInteiros.add(30);

        List<String> listaStrings = new ArrayList<>();
        listaStrings.add("Hello");
        listaStrings.add("World");
        listaStrings.add("!");

        System.out.println("Imprimindo lista de inteiros:");
        imprimirLista(listaInteiros);

        System.out.println("Imprimindo lista de strings:");
        imprimirLista(listaStrings);
    }
}

