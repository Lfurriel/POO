package aula03.classes;

public class Conta {
    private Cliente cliente;
    private static final int agencia = 1;
    private static int contador = 1;
    private int conta;
    private double saldo;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.conta = contador;
        this.saldo = 0.0;
        contador++;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getConta() {
        return conta;
    }

    public void depositar(double deposito){
        this.saldo += deposito;
        System.out.println("Seu novo saldo: R$" + this.saldo);
    }
    public void sacar(double saque){
        this.saldo -= saque;
        System.out.println("Seu novo saldo: R$" + this.saldo);
    }






}
