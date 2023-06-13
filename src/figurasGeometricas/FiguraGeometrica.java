package figurasGeometricas;

public class FiguraGeometrica {
    private Integer lado;

    public FiguraGeometrica(Integer lado) {
        this.lado = lado;
    }

    public Integer getLado() {
        return lado;
    }

    public void setLado(Integer lado) {
        this.lado = lado;
    }

    public void teste() {
        System.out.println("Figura");
    }
}
