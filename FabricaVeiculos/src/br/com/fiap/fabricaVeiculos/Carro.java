package br.com.fiap.fabricaVeiculos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Carro {
	// definição de tipos e variaveis
	private String marca, cor, modelo, motor, tipoCambio, tipoMotor, nomeCondutor;
	private Date anoFabricacao = new Date(), anoModelo = new Date();
	private int renavam;
	private double aroRodas, velocidade, limiteVelocidade;
	private boolean ligado;
	private double capacidadeRodagem, qtdLitros;
	private String tipoCombustivel;
	// private Combustivel combustivel;

	// construtor
	public Carro(String marca, String cor, String modelo, String motor, String tipoCambio, String tipoMotor,
			String nomeCondutor, String anoFabricacao, String anoModelo, int renavam, double aroRodas,
			double velocidade, double limiteVelocidade, boolean ligado, double qtdLitros, String tipoCombustivel) {
		super();
		this.marca = marca;
		this.cor = cor;
		this.modelo = modelo;
		this.motor = motor;
		this.tipoCambio = tipoCambio;
		this.tipoMotor = tipoMotor;
		this.nomeCondutor = nomeCondutor;
		SimpleDateFormat format = new SimpleDateFormat("yyyy");
		try {
			this.anoFabricacao = format.parse(anoFabricacao);
		} catch (ParseException e) {
			System.err.println("Formato de data invalido: " + anoFabricacao);
			e.printStackTrace();
		}

		try {
			this.anoModelo = format.parse(anoModelo);
		} catch (ParseException e) {
			System.err.println("Formato de data invalido: " + anoModelo);
			e.printStackTrace();
		}
		this.renavam = renavam;
		this.aroRodas = aroRodas;
		this.velocidade = velocidade;
		this.limiteVelocidade = limiteVelocidade;
		this.ligado = ligado;
		this.qtdLitros = qtdLitros;
		this.tipoCombustivel = tipoCombustivel;
	}

	// Getters and Setters:

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTipoCambio() {
		return tipoCambio;
	}

	public void setTipoCambio(String tipoCambio) {
		this.tipoCambio = tipoCambio;
	}

	public String getTipoMotor() {
		return tipoMotor;
	}

	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}

	public String getNomeCondutor() {
		return nomeCondutor;
	}

	public void setNomeCondutor(String nomeCondutor) {
		this.nomeCondutor = nomeCondutor;
	}

	public Date getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(Date anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public Date getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(Date anoModelo) {
		this.anoModelo = anoModelo;
	}

	public int getRenavam() {
		return renavam;
	}

	public void setRenavam(int renavam) {
		this.renavam = renavam;
	}

	public double getAroRodas() {
		return aroRodas;
	}

	public void setAroRodas(double aroRodas) {
		this.aroRodas = aroRodas;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public double getLimiteVelocidade() {
		return limiteVelocidade;
	}

	public void setLimiteVelocidade(double limiteVelocidade) {
		this.limiteVelocidade = limiteVelocidade;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public double getCapacidadeRodagem() {
		return capacidadeRodagem;
	}

	public void setCapacidadeRodagem(double capacidadeRodagem) {
		this.capacidadeRodagem = capacidadeRodagem;
	}

	public double getQtdLitros() {
		return qtdLitros;
	}

	public void setQtdLitros(double qtdLitros) {
		this.qtdLitros = qtdLitros;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	// Postagem dos Métodos para o carro:
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
			if (this.velocidade >= this.limiteVelocidade) {
				this.velocidade = this.limiteVelocidade;
			}
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

	public void abastecer(Combustivel combustivel, double qtdLitros) {
		// Verifica se o tipoCombustivel usado no carro é "Gasolina", "Alcool" ou
		// "Ambos":
		if (!combustivel.getTipo().equalsIgnoreCase(this.tipoCombustivel)
				&& !this.tipoCombustivel.equalsIgnoreCase("Ambos")) {
			System.out.println("Tipo de combustível incompatível. Este carro aceita: " + this.tipoCombustivel);
			System.out.println("---------------------------------");
			return;
		}
		// Verifica se o abastecimento ultrapassaria o limite de 50 litros:
		if (this.qtdLitros + qtdLitros > 50) {
			// Ajusta para encher até o máximo ou exibe uma mensagem
			double litrosAdicionados = 50 - this.qtdLitros;
			this.qtdLitros = 50;
			System.out.println("Tanque cheio! Só foi possível abastecer " + litrosAdicionados
					+ " litros. A quantidade total de litros agora e: " + this.qtdLitros
					+ " L. A capacidade de rodagem antiga era: "
					+ (combustivel.abastecimento(this.qtdLitros - litrosAdicionados))
					+ " km, já a capacidade de rodagem atual é: " + (combustivel.abastecimento(50)) + " km.");
			System.out.println("---------------------------------");
		} else {
			this.qtdLitros += qtdLitros;
			System.out.println("Abastecido com " + qtdLitros + " litros. A capacidade de rodagem atual é: "
					+ (combustivel.abastecimento(qtdLitros)) + " km.");
			System.out.println("---------------------------------");
		}
	}

	public void exibirDados() {
		double capacidadeRodagem;
		System.out.println("Dados do Carro:");
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ano de Fabricação : " + this.anoFabricacao);
		System.out.println("Ano do Modelo: " + this.anoModelo);
		System.out.println("Renavam: " + this.renavam);
		System.out.println("Motor: " + this.motor);
		System.out.println("Tipo de Câmbio: " + this.tipoCambio);
		System.out.println("Aro das Rodas: " + this.aroRodas);
		System.out.println("Velocidade Atual: " + this.velocidade + " km/h");
		System.out.println("Nome do Condutor: " + this.nomeCondutor);
		System.out.println("Tipo de combustivel utilizado: " + this.tipoCombustivel);
		System.out.println("Quantidade de Litros atual: " + this.qtdLitros);
		System.out.println("Status: " + (this.ligado ? "Ligado" : "Desligado"));
		// Calculo da capacidade de rodagem baseado no tipo de combustível:
		if ("Gasolina".equalsIgnoreCase(this.tipoCombustivel)) {
			capacidadeRodagem = this.qtdLitros * 10;
		} else if ("Alcool".equalsIgnoreCase(this.tipoCombustivel)) {
			capacidadeRodagem = this.qtdLitros * 7.5;
		} else {
			capacidadeRodagem = 0; 
		}

		System.out.println("A capacidade de rodagem atual: " + capacidadeRodagem + " km.");
		System.out.println("---------------------------------");

	}
}
