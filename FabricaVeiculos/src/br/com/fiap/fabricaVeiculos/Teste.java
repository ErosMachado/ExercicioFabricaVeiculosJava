package br.com.fiap.fabricaVeiculos;

public class Teste {

	public static void main(String[] args) {

		Combustivel gasolina = new Gasolina();
		Combustivel alcool = new Alcool();

		Carro carro1 = new Carro("Fiat", "Prata", "123", "Argo", "Manual", "163/5500", "Eros Machado", "2000",
				"2004", 123456789, 18, 100, 220, true, 40, "Gasolina");

		Carro carro2 = new Carro("Volkswagen", "Azul", "Gol", "Motor AP", "Manual", "1.6", "Alice Santos", "2015",
				"2016", 987654321, 15, 80, 180, false, 0, "Ambos");

		Carro carro3 = new Carro("Chevrolet", "Vermelho", "Onix", "1.0 Turbo", "Automático", "1.0 Turbo",
				"Carlos Oliveira", "2019", "2020", 112233445, 16, 90, 200, true, 0, "Alcool");

		Carro carro4 = new Carro("Ford", "Preto", "Focus", "2.0 Duratec", "Automático", "2.0", "Juliana Pereira",
				"2018", "2019", 334455667, 17, 85, 210, false, 0, "Ambos");

		Carro carro5 = new Carro("Honda", "Branco", "Civic", "1.8 i-VTEC", "Manual", "1.8", "Roberto Lima", "2020",
				"2021", 556677889, 18, 95, 220, true, 0, "Gasolina");

		Carro carro6 = new Carro("Toyota", "Cinza", "Corolla", "2.0 Dual VVT-i", "CVT", "2.0", "Mariana Costa", "2021",
				"2022", 667788990, 16, 100, 230, true, 0, "Ambos");

		Carro carro7 = new Carro("Renault", "Verde", "Sandero", "1.6 SCe", "Manual", "1.6", "Fernando Silva", "2017",
				"2018", 778899001, 15, 80, 180, false, 0, "Gasolina");

		// exibição primária de todos os carros
		carro1.exibirDados();
		carro2.exibirDados();
		carro3.exibirDados();
		carro4.exibirDados();
		carro5.exibirDados();
		carro6.exibirDados();
		carro7.exibirDados();

		// Teste dos diferentes Métodos dos carros:
		carro5.acelerar(15);
		carro7.desligar();
		carro4.frear(45);
		carro6.desligar();

		// Teste do Método abastecer
		carro1.abastecer(gasolina, 20);
		carro2.abastecer(alcool, 15);
		carro3.abastecer(alcool, 40);

		// Nova Exibição dos carros
		carro1.exibirDados();
		carro2.exibirDados();
		carro3.exibirDados();

	}

}
