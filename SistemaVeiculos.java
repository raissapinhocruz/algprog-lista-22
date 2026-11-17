public class SistemaVeiculos {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Honda", "Civic", 2022, 7.5);
        Veiculo moto = new Moto("Yamaha", "MT-07", 2021);
        Veiculo caminhao = new Caminhao("Volvo", "FH 540", 2020);

        carro.exibirDetalhes();
        carro.acelerar();
        System.out.println();

        moto.exibirDetalhes();
        moto.acelerar();
        System.out.println();

        caminhao.exibirDetalhes();
        caminhao.acelerar();
    }
}
