package Decorator;

public class Presunto extends PizzaDecorator {

    public Presunto(Pizza pizza) {
        super(pizza);
    }

    @Override
    public float getAcrescimoCusto() {
        return 3.0f; // valor adicional do presunto
    }

    @Override
    public String getNomeIngrediente() {
        return "Presunto";
    }
}
