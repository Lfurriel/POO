package p2.wildcards;

import java.util.List;

public class CalculadoraSelvagem {
    public double somarValores(List<? extends Number> numeros) {
        double soma = 0;
        for (Number numero : numeros) {
            soma += numero.doubleValue();
        }
        return soma;
    }

    public static void main(String[] args) {
        CalculadoraSelvagem calculadora = new CalculadoraSelvagem();

        List<Integer> inteiros = List.of(1, 2, 3, 4, 5);
        double somaInteiros = calculadora.somarValores(inteiros);
        System.out.println("Soma dos inteiros: " + somaInteiros);

        List<Double> decimais = List.of(1.5, 2.5, 3.5, 4.5, 5.5);
        double somaDecimais = calculadora.somarValores(decimais);
        System.out.println("Soma dos decimais: " + somaDecimais);
    }
}
