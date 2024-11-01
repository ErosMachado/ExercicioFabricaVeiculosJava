package br.com.fiap.fabricaVeiculos;

public class Alcool implements Combustivel {
	@Override
	public double abastecimento(double qtdLitros) {
		return qtdLitros * 7.5; // fator rendimento do álcool
	}
}
