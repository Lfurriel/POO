package p2.generics;

import java.util.ArrayList;
import java.util.List;

public class Pilha<T> {
    private List<T> pilha = new ArrayList<>();

    public List<T> getPilha() {
        return pilha;
    }

    public void push(T elem) {
        pilha.add(elem);
    }

    public T pop() {
        if (!pilha.isEmpty())
            return pilha.remove(pilha.size() - 1);
        else
            return null;
    }
}
