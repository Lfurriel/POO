package aula03.classes;

public class TestePonteiro {
    public static void main(String[] args) {
        Ponteiro ponteiro = new Ponteiro(10, 10);

        RetanguloDois retanguloDois = new RetanguloDois(ponteiro);
        retanguloDois.setAltura(100);
        retanguloDois.setLargura(100);

        retanguloDois.printaOrigem();

        ponteiro.setX(50);
        ponteiro.setY(50);

        retanguloDois.printaOrigem();
    }
}
