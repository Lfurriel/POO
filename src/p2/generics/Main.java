package p2.generics;

public class Main {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();
        for (int i = 0; i < 10; i ++)
            pilha.push(i * 10);

        for (int i = 0; i < 11; i ++) //11 para estourar um "null"
            System.out.println(pilha.pop());
    }
}
