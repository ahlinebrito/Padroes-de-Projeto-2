package Decorator;


public class Calabresa extends PizzaDecorator {

    public Calabresa(Pizza pizza) {
        super(pizza);
    }

    @Override
    public float getAcrescimoCusto() {
        return 4.0f; // valor adicional da calabresa
    }

    @Override
    public String getNomeIngrediente() {
        return "Calabresa";
    }
}
