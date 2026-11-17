public class Carro extends Veiculo {
    private double tempo0a100;

    public Carro(String marca, String modelo, int ano, double tempo0a100) {
        super(marca, modelo, ano);
        this.tempo0a100 = tempo0a100;
    }

    @Override
    public void acelerar() {
        System.out.println(modelo + " " + marca + " está acelerando de 0 a 100 km/h em " + tempo0a100 + " segundos.");
    }
}
