package figurasGeometricas;

public class Circulo {
    private double raio;
    private static final double pi = Math.PI;

    public Circulo() {
        this.raio = 1;
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calculaDiametro() {
        return 2 * raio;
    }

    public double calculaCircuferencia() {
        return (pi * calculaDiametro());
    }

    public double calculaArea() {
        return pi * raio * raio;
    }
}
