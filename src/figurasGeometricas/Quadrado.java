package figurasGeometricas;

public class Quadrado {

    private double lado;

    public Quadrado() {
        this.lado = 1;
    }

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double calculaPerimetro() {
        return lado * 4;
    }

    public double calculaArea() {
        return lado * lado;
    }

    public double calculaDiagonal() {
        return lado * Math.sqrt(2);
    }

}
