package p2.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class FilaPilha {
    public static void main(String[] args) {
        Deque<String> filaPilha = new ArrayDeque<>(); //Fila/Pilha pois pode ser tratada das duas formas, removendo elemento da head ou tail
        filaPilha.add("Furri");
        filaPilha.add("Juloia");
        filaPilha.add("Bianca");
        filaPilha.add("Scarancio");

        System.out.println(filaPilha.peekFirst()); //Primeiro da fila || Último da pilha
        System.out.println(filaPilha.peekLast());  //Primeiro da pilha || Último da fila
    }
}
