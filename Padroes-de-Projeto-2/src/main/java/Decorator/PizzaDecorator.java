package Decorator;

public abstract class PizzaDecorator implements Pizza {

    private Pizza pizza;
    public String descricao;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }


    public abstract float getAcrescimoCusto();

    @Override
    public float getCusto() {
        return this.pizza.getCusto() + this.getAcrescimoCusto();
    }


    public abstract String getNomeIngrediente();

    @Override
    public String getDescricao() {
        return this.pizza.getDescricao() + " + " + this.getNomeIngrediente();
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
