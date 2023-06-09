package figurasGeometricas;

import aula03.classes.Ponteiro;

public class RetanguloDois {

    float altura;
    float largura;

    Ponteiro origem;

    public RetanguloDois(float altura, float largura, Ponteiro origem) {
        this.altura = altura;
        this.largura = largura;
        this.origem = origem;
    }

    public RetanguloDois(Ponteiro origem) {
        this.origem = origem;
    }

    public RetanguloDois() {
        origem.setX(0);
        origem.setY(0);
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }


    public void setOrigem(Ponteiro org) {
        this.origem.setX(org.getX());
        this.origem.setY(org.getY());
    }

    public void printaOrigem() {
        System.out.println(origem.getX() + " " + origem.getY());
    }
}
