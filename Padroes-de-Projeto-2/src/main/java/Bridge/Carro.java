package Bridge;


public class Carro extends Veiculo {

    private float distanciaKm;

    public Carro (float peso) {
        super(peso);
    }

    public void setDistanciaKm (float distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    @Override
    public float calcularCustoPorKm() {
        return (this.distanciaKm * (this.peso / 1000)) * this.combustivel.custoPorLitro();
    }
}



