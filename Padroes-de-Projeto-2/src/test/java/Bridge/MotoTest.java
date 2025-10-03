package Bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotoTest {

    @Test
    void deveRetornarCustoMotoComGasolina() {
        Combustivel gasolina = new Gasolina();
        Moto moto = new Moto(200.0f); // peso em kg
        moto.setCombustivel(gasolina);
        moto.setDistanciaKm(10.0f); // rodar 10 km

        float custo = moto.calcularCustoPorKm();
        assertEquals((10.0f * (200.0f / 500)) * 6.0f, custo, 0.01f);
    }

    @Test
    void deveRetornarCustoMotoComEtanol() {
        Combustivel etanol = new Etanol();
        Moto moto = new Moto(200.0f);
        moto.setCombustivel(etanol);
        moto.setDistanciaKm(10.0f);

        float custo = moto.calcularCustoPorKm();
        assertEquals((10.0f * (200.0f / 500)) * 8.0f, custo, 0.01f);
    }

}
