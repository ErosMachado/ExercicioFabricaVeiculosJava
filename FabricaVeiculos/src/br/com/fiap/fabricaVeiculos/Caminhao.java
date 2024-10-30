package br.com.fiap.fabricaVeiculos;

import java.util.Date;

public class Caminhao {
	String marca, modelo, cor, motor, tipoCambio, tipoMotor, tipoCarga, nomeCondutor;
	Date anoFabricacao = new Date();
	Date anoModelo = new Date();
	int renavam, eixos;
	double aroRodas, velocidade, limiteVelocidade, capacidadeCarga, cargaAtual;
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
			if (this.velocidade > this.limiteVelocidade) {
				this.velocidade = this.limiteVelocidade;
			}
		}
	}

	public void frear(double valor) {
		if (this.velocidade > 0) {
			this.velocidade -= valor;
			if (this.velocidade < 0) {
				this.velocidade = 0;
			}
		}
	}

	public void carregar(double valor) {
		if (this.cargaAtual + valor <= this.capacidadeCarga) {
			this.cargaAtual += valor;
		}
	}

	public void descarregar(double valor) {
		if (valor <= this.cargaAtual) {
			this.cargaAtual -= valor;
		}
	}

	public void exibirDados() {
		System.out.println("Dados do Caminhão:");
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ano de Fabricação: " + this.anoFabricacao);
		System.out.println("Ano do Modelo: " + this.anoModelo);
		System.out.println("Renavam: " + this.renavam);
		System.out.println("Motor: " + this.motor);
		System.out.println("Tipo de Câmbio: " + this.tipoCambio);
		System.out.println("Aro das Rodas: " + this.aroRodas);
		System.out.println("Quantidade de Eixos: " + this.eixos);
		System.out.println("Capacidade de Carga: " + this.capacidadeCarga + " toneladas");
		System.out.println("Carga Atual: " + this.cargaAtual + " toneladas");
		System.out.println("Tipo de Carga: " + this.tipoCarga);
		System.out.println("Nome do Condutor: " + this.nomeCondutor);
		System.out.println("Status: " + (this.ligado ? "Ligado" : "Desligado"));
		System.out.println("Velocidade Atual: " + this.velocidade + " km/h");
	}
}