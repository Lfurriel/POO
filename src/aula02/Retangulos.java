package aula02;

import figurasGeometricas.Cores;
import figurasGeometricas.Retangulo;

public class Retangulos {
    public static void main(String[] args) {

        Retangulo retangulo1 = new Retangulo();
        Retangulo retangulo2 = new Retangulo();

        retangulo1.setNome("Retângulo Azul");
        retangulo1.setAltura(10.0);
        retangulo1.setLargura(5.0);
        retangulo1.setCor(Cores.AZUL);

        retangulo2.setNome("Retangulo ROSA");
        retangulo2.setAltura(2.0);
        retangulo2.setLargura(7.0);
        retangulo2.setCor(Cores.ROSA);

        System.out.println("Áera do retângulo azul: " + retangulo1.calculaArea());
        System.out.println("Áera do retângulo rosa: " + retangulo2.calculaArea());
    }
}
