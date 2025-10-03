package Bridge;


public class Moto extends Veiculo {

    private float distanciaKm;

    public Moto(float peso) {
        super(peso);
    }

    public void setDistanciaKm(float distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    @Override
    public float calcularCustoPorKm() {
        // Exemplo: custo depende do combustível e da distância percorrida
        return (this.distanciaKm * (this.peso / 500)) * this.combustivel.custoPorLitro();
    }
}
