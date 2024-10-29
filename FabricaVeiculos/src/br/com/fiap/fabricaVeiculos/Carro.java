package br.com.fiap.fabricaVeiculos;


public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private int anoFabricacao;
    private int anoModelo;
    private String renavam;
    private String motor;
    private String tipoCambio;
    private int aroRodas;
    private int velocidade;
    private String nomeCondutor;
    private boolean ligado;

    public Carro(String marca, String modelo, String cor, int anoFabricacao, int anoModelo, 
                 String renavam, String motor, String tipoCambio, int aroRodas, String nomeCondutor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.renavam = renavam;
        this.motor = motor;
        this.tipoCambio = tipoCambio;
        this.aroRodas = aroRodas;
        this.velocidade = 0;
        this.nomeCondutor = nomeCondutor;
        this.ligado = false;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Carro ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    public void desligar() {
        if (ligado && velocidade == 0) {
            ligado = false;
            System.out.println("Carro desligado.");
        } else if (velocidade != 0) {
            System.out.println("O carro precisa estar parado para desligar.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }

    public void acelerar(int incremento) {
        if (ligado) {
            velocidade += incremento;
            System.out.println("Acelerando. Velocidade atual: " + velocidade + " km/h.");
        } else {
            System.out.println("O carro precisa estar ligado para acelerar.");
        }
    }

    public void frear(int decremento) {
        if (ligado && velocidade > 0) {
            velocidade -= decremento;
            if (velocidade < 0) {
                velocidade = 0;
            }
            System.out.println("Freando. Velocidade atual: " + velocidade + " km/h.");
        } else if (!ligado) {
            System.out.println("O carro precisa estar ligado para frear.");
        } else {
            System.out.println("O carro já está parado.");
        }
    }

    public void exibirDados() {
        System.out.println("Dados do Carro:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Ano do Modelo: " + anoModelo);
        System.out.println("Renavam: " + renavam);
        System.out.println("Motor: " + motor);
        System.out.println("Tipo de Câmbio: " + tipoCambio);
        System.out.println("Aro das Rodas: " + aroRodas);
        System.out.println("Velocidade Atual: " + velocidade + " km/h");
        System.out.println("Nome do Condutor: " + nomeCondutor);
        System.out.println("Status: " + (ligado ? "Ligado" : "Desligado"));
    }
}
