package Bridge;


public class Etanol implements Combustivel {

    @Override
    public float custoPorLitro() {
        return 8.00f; // valor fictício em reais
    }

}