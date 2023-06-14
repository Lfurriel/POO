package p2.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();

        fila.offer("Furri");
        fila.offer("Juloia");
        fila.offer("Scarancio");

        System.out.println(fila.size());
        System.out.println(fila.peek()); //Cabeca
    }
}
