package figurasGeometricas;

public class Triangulo {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo() {
        this.ladoA = 1;
        this.ladoB = 1;
        this.ladoC = 1;
    }

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public double calculaPerimetro() {
        return ladoA + ladoB + ladoC;
    }

    public boolean verificaEquilatero() {
        return (ladoA == ladoB && ladoB == ladoC);
    }

    public boolean verificaIsoceles() {
        boolean result = false;

        if(!verificaEquilatero()) {
            if (ladoA == ladoB && ladoA != ladoC)
                result = true;
            else if (ladoA == ladoC && ladoA != ladoB)
                result = true;
            else if (ladoB == ladoC && ladoB != ladoA)
                result = true;
        }

        return result;
    }

    public boolean verificaEscaleno() {
        return (!verificaEquilatero() && !verificaIsoceles());
    }
}
