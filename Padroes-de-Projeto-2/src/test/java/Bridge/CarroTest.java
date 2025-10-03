package Bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void deveRetornarCustoCarroComGasolina() {
        Combustivel gasolina = new Gasolina();
        Carro carro = new Carro(1200.0f); // peso em kg
        carro.setCombustivel(gasolina);
        carro.setDistanciaKm(1.0f);

        float custo = carro.calcularCustoPorKm();
        assertEquals((1.0f * (1200.0f / 1000f)) * 6.0f, custo, 0.01f);
    }


    @Test
    void deveRetornarCustoCarroComEtanol() {
        Combustivel etanol = new Etanol();
        Carro carro = new Carro(1200.0f); // peso em kg
        carro.setCombustivel(etanol);
        carro.setDistanciaKm(1.0f);

        float custo = carro.calcularCustoPorKm();
        assertEquals((1.0f * (1200.0f / 1000f)) * 8.0f, custo, 0.01f);
    }


}


