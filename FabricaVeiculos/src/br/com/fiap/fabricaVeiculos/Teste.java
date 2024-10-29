package br.com.fiap.fabricaVeiculos;


public class Teste {

	public static void main(String[] args) {
			Carro carro1 = new Carro();
			carro1.cor = "Prata";
			carro1.marca = "Fiat";
			carro1.modelo="123";
			carro1.aroRodas=18;
			carro1.renavam=123456789;
			carro1.tipoCambio="Manual";
			carro1.nomeCondutor="Eros";
			carro1.limiteVelocidade=220;
			carro1.tipoMotor="163/5500";
		
			carro1.exibirDados();
	}

}
