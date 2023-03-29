package aula03;

import aula03.classes.Ponteiro;
import figurasGeometricas.RetanguloDois;

public class TestePonteiro {
    public static void main(String[] args) {
        Ponteiro ponteiro = new Ponteiro(10, 10);

        RetanguloDois retanguloDois = new RetanguloDois(ponteiro);
        retanguloDois.setAltura(100);
        retanguloDois.setLargura(100);

        retanguloDois.printaOrigem();

        ponteiro = new Ponteiro(0, 0);

        retanguloDois.printaOrigem();
    }
}
