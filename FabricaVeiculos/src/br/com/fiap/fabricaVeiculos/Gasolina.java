package br.com.fiap.fabricaVeiculos;

public class Gasolina implements Combustivel {
	@Override
	public double abastecimento(double qtdLitros) {
		return qtdLitros * 10; // // fator rendimento da gasolina
	}
}
