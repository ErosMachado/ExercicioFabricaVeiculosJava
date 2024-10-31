package br.com.fiap.fabricaVeiculos;

public class TesteCaminhao {
	public static void main(String[] args) {
		Caminhao caminhao = new Caminhao();
		caminhao.marca = "Volvo";
		caminhao.modelo = "FH";
		caminhao.cor = "Branco";
		caminhao.renavam = 123456789;
		caminhao.motor = "13L";
		caminhao.tipoCambio = "Automático";
		caminhao.aroRodas = 22.5;
		caminhao.eixos = 3;
		caminhao.capacidadeCarga = 25.0; 
		caminhao.limiteVelocidade = 120.0; 
		caminhao.velocidade = 15;
		caminhao.tipoCarga = "Grãos";
		caminhao.nomeCondutor = "Eros Machado";
		
		caminhao.exibirDados();
	}
}