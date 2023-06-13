package aula06.produtos;

import aula06.Produto;

public class Biscoito extends Produto {

    private int cancer;

    public Biscoito(String nome, double preco, int cancer) {
        super(nome, preco);
        this.cancer = cancer;
        setCustoBeneficio(calculaCustoBeneficio());
    }

    public int getCancer() {
        return cancer;
    }

    public void setCancer(int cancer) {
        this.cancer = cancer;
    }

    @Override
    public int compareTo(Object o) {
        Biscoito compare = (Biscoito) o;
        return Double.compare(this.getCustoBeneficio(), compare.getCustoBeneficio());
    }

    @Override
    public double calculaCustoBeneficio() {
        return getPreco()/cancer;
    }
}
