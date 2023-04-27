package aula07;

public class Calculator {
    public static double calcular(double a, double b, char operador) throws JuloiaException {
        switch (operador) {
            case '+' -> {
                return a + b;
            }
            case '-' -> {
                return a - b;
            }
            case '*' -> {
                return a * b;
            }
            case '/' -> {
                if (b == 0)
                    throw new ArithmeticException("DIVISÃO POR ZERO");
                else
                 return a/b;
            }

            default -> throw new JuloiaException("NUM TEM " + operador);
        }
    }
}
