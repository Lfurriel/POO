package aula06;

public abstract class Produto implements Comparable {

    private String nome;
    private double preco;
    private double custoBeneficio;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getCustoBeneficio() {
        return custoBeneficio;
    }

    public void setCustoBeneficio(double custoBeneficio) {
        this.custoBeneficio = custoBeneficio;
    }

    public abstract double calculaCustoBeneficio();
}
