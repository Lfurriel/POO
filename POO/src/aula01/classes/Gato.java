package aula01.classes;

public class Gato extends Animal {

    private Integer vidas;

    public Integer getVidas() {
        return vidas;
    }

    public void setVidas(Integer vidas) {
        this.vidas = vidas;
    }

    public void brincar(Gato gato, Cachorro cachorro) {
        System.out.println("O gato " + gato.getNome() + " brincou com o cachorro " + cachorro.getNome());
    }

    public void miar() {
        System.out.println("miau");
    }

    public void perderVidas(Gato gato) {
        this.vidas--;
        if (vidas <= 0)
            System.out.println("O gato foi de arrasta pra cima");
    }
}