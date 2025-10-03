package Decorator;


public class Queijo extends PizzaDecorator {

    public Queijo(Pizza pizza) {
        super(pizza);
    }

    @Override
    public float getAcrescimoCusto() {
        return 2.5f; // valor adicional do queijo
    }

    @Override
    public String getNomeIngrediente() {
        return "Queijo";
    }
}
