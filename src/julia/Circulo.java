/*Escreva um programa que leia o raio de um círculo e imprima o diˆametro,  ́area e circunferˆencia do
círculo. Os resultados devem ser escritos com duas casas decimais.*/

package julia;

public class Circulo {
    static final double PI = 3.1415;
    double raio;
    double area;
    double diametro;

    public Circulo (double raio) {
        this.raio = raio;
        this.area = raio * raio * PI;
        this.diametro = 2 * raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio (double raio) {
        this.raio = raio;
    }
}
