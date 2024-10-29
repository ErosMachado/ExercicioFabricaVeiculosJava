package br.com.fiap.fabricaVeiculos;

import java.util.Date;

public class Carro {
	String marca, motor, modelo, cor, tipoCambio, tipoMotor, nomeCondutor;
	Date anoFabricacao = new Date();
	Date anoModelo = new Date();
	int renavam;
	double aroRodas, velocidade;
	boolean ligado;

	public void ligar() {
		if (!this.ligado) {
			this.ligado = true;
		}
	}

	public void desligar() {
		if (this.velocidade == 0) {
				this.ligado = false;
		}
	}

	public void acelerar(double valor) {
		if (this.ligado) {
			this.velocidade += valor;
		}
	}

	public void frear(double valor) {
		if (this.velocidade > 0) {
			velocidade -= valor;
		}
		 if (this.velocidade < 0) {
             this.velocidade = 0;
         }
	}

	public void exibirDados() {
		System.out.println("Dados do Carro:");
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ano de Fabricação: " + this.anoFabricacao);
		System.out.println("Ano do Modelo: " + this.anoModelo);
		System.out.println("Renavam: " + this.renavam);
		System.out.println("Motor: " + this.motor);
		System.out.println("Tipo de Câmbio: " + this.tipoCambio);
		System.out.println("Aro das Rodas: " + this.aroRodas);
		System.out.println("Velocidade Atual: " + this.velocidade + " km/h");
		System.out.println("Nome do Condutor: " + this.nomeCondutor);
		System.out.println("Status: " + (ligado ? "Ligado" : "Desligado"));
	}
}
