package Decorator;

public class PizzaPequena implements Pizza {

    private float custo;

    public PizzaPequena() {
    }

    public PizzaPequena(float custo) {
        this.custo = custo;
    }

    @Override
    public float getCusto() {
        return custo;
    }

    @Override
    public String getDescricao() {
        return "Pizza Pequena";
    }
}
