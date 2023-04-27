package aula06.produtos;


import aula06.Produto;

public class Shampoo extends Produto {

    private int irritabilidade;
    private double custoBeneficio;
    public Shampoo(String nome, double preco, int irritabilidade) {
        super(nome, preco);
        this.irritabilidade = irritabilidade;
        setCustoBeneficio(calculaCustoBeneficio());
    }

    public int getIrritabilidade() {
        return irritabilidade;
    }

    public void setIrritabilidade(int irritabilidade) {
        this.irritabilidade = irritabilidade;
    }

    @Override
    public int compareTo(Object o) {
        Shampoo compare = (Shampoo) o;
        return Double.compare(getCustoBeneficio(), compare.getCustoBeneficio());
    }

    @Override
    public double calculaCustoBeneficio() {
       return getPreco()/irritabilidade;
    }
}
