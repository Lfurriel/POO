package p2.generics;

import java.util.List;

public class Soma {
    public static <T extends  Number> double somaElementos(List<T> elementos) {
        double soma = 0;
        for (T elem : elementos)
            soma += elem.doubleValue(); //doubleValue pode ser chamado por T extender Number

        return soma;
    }
}
