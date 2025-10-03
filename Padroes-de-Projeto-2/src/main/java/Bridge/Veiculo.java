package Bridge;


public abstract class Veiculo {

    protected Combustivel combustivel;

    protected float peso;

    public Veiculo(float peso) {
        this.peso = peso;
    }

    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public abstract float calcularCustoPorKm();
}