package aula06.produtos;


import aula06.Produto;

public class Leite extends Produto {

    private int validias;

    public Leite(String nome, double preco, int validias) {
        super(nome, preco);
        this.validias = validias;
        setCustoBeneficio(calculaCustoBeneficio());
    }

    public int getValidias() {
        return validias;
    }

    public void setValidias(int validias) {
        this.validias = validias;
    }

    @Override
    public int compareTo(Object o) {
        Leite compare = (Leite) o;
        return Double.compare(getCustoBeneficio(), compare.getCustoBeneficio());
    }

    @Override
    public double calculaCustoBeneficio() {
        return getPreco()/validias;
    }
}
