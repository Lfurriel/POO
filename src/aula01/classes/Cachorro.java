package aula01.classes;

public class Cachorro extends Animal {

    private Integer bolinhasPegas;

    public Integer getBolinhasPegas() {
        return bolinhasPegas;
    }

    public void setBolinhasPegas(Integer bolinhasPegas) {
        this.bolinhasPegas = bolinhasPegas;
    }

    public void brincar(Gato gato) {
        System.out.println("O cachorro " + this.getNome() + " brincou com o gato " + gato.getNome());
    }

    public void latir() {
        System.out.println("auau");
    }

    public int pegarBolinha() {
        this.bolinhasPegas++;
        return bolinhasPegas;
    }
}