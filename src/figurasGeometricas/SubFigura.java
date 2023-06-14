package figurasGeometricas;

public class SubFigura extends FiguraGeometrica{
    private String nome;
    public SubFigura(Integer lado, String nome) {
        super(lado);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void teste() {
        System.out.println("SubFigura");
    }

    public void inacessivel(){
        System.out.println("Wallace");
    }
}
