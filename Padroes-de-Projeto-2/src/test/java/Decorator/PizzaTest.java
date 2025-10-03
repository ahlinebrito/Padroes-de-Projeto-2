package Decorator;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {

    @Test
    void deveRetornarCustoPizzaPequena() {
        Pizza pizza = new PizzaPequena(10.0f);

        assertEquals(10.0f, pizza.getCusto());
    }

    @Test
    void deveRetornarCustoPizzaComQueijo() {
        Pizza pizza = new Queijo(new PizzaPequena(10.0f));

        assertEquals(12.5f, pizza.getCusto());
    }

    @Test
    void deveRetornarCustoPizzaComPresunto() {
        Pizza pizza = new Presunto(new PizzaPequena(10.0f));

        assertEquals(13.0f, pizza.getCusto());
    }

    @Test
    void deveRetornarCustoPizzaComCalabresa() {
        Pizza pizza = new Calabresa(new PizzaPequena(10.0f));

        assertEquals(14.0f, pizza.getCusto());
    }

    @Test
    void deveRetornarCustoPizzaComQueijoMaisPresunto() {
        Pizza pizza = new Presunto(new Queijo(new PizzaPequena(10.0f)));

        assertEquals(15.5f, pizza.getCusto());
    }

    @Test
    void deveRetornarCustoPizzaComQueijoMaisCalabresa() {
        Pizza pizza = new Calabresa(new Queijo(new PizzaPequena(10.0f)));

        assertEquals(16.5f, pizza.getCusto());
    }

    @Test
    void deveRetornarCustoPizzaComPresuntoMaisCalabresa() {
        Pizza pizza = new Calabresa(new Presunto(new PizzaPequena(10.0f)));

        assertEquals(17.0f, pizza.getCusto());
    }

    @Test
    void deveRetornarCustoPizzaComQueijoMaisPresuntoMaisCalabresa() {
        Pizza pizza = new Calabresa(new Presunto(new Queijo(new PizzaPequena(10.0f))));

        assertEquals(19.5f, pizza.getCusto());
    }

    @Test
    void deveRetornarDescricaoPizzaPequena() {
        Pizza pizza = new PizzaPequena(10.0f);

        assertEquals("Pizza Pequena", pizza.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPizzaComQueijo() {
        Pizza pizza = new Queijo(new PizzaPequena(10.0f));

        assertEquals("Pizza Pequena + Queijo", pizza.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPizzaComPresunto() {
        Pizza pizza = new Presunto(new PizzaPequena(10.0f));

        assertEquals("Pizza Pequena + Presunto", pizza.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPizzaComCalabresa() {
        Pizza pizza = new Calabresa(new PizzaPequena(10.0f));

        assertEquals("Pizza Pequena + Calabresa", pizza.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPizzaComQueijoMaisPresuntoMaisCalabresa() {
        Pizza pizza = new Calabresa(new Presunto(new Queijo(new PizzaPequena(10.0f))));

        assertEquals("Pizza Pequena + Queijo + Presunto + Calabresa", pizza.getDescricao());
    }

}
