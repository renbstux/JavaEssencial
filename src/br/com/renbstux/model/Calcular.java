package br.com.renbstux.model;

import java.util.Random;

public class Calcular {

	private int dificuldade;
	private int valor1;
	private int valor2;
	private int operacao;
	private int resultado;

	public Calcular(int dificuldade) {
		Random rand = new Random();

		this.operacao = rand.nextInt(3); // 0 - somar, 1 - diminuir, 2 - multiplicar
		this.dificuldade = dificuldade;

		switch (dificuldade) {
		case 1:
			// Facil-Easy
			this.valor1 = rand.nextInt(10); // 0 a 9
			this.valor2 = rand.nextInt(10); // 0 a 9
			break;

		case 2:
			// Media-Medium
			this.valor1 = rand.nextInt(100); // 0 a 99
			this.valor2 = rand.nextInt(100); // 0 a 99
			break;

		case 3:
			// Dificil-Hard
			this.valor1 = rand.nextInt(1000); // 0 a 999
			this.valor2 = rand.nextInt(1000); // 0 a 999
			break;

		case 4:
			// Insano
			this.valor1 = rand.nextInt(10000); // 0 a 9999
			this.valor2 = rand.nextInt(10000); // 0 a 9999
			break;

		default:
			// Ultra
			this.valor1 = rand.nextInt(100000); // 0 a 99999
			this.valor2 = rand.nextInt(100000); // 0 a 99999
			break;
		}

	}

	public int getDificuldade() {
		return dificuldade;
	}

	public int getValor1() {
		return valor1;
	}

	public int getValor2() {
		return valor2;
	}

	public int getOperacao() {
		return operacao;
	}

	public int getResultado() {
		return resultado;
	}

	@Override
	public String toString() {
		String op;
		if (this.getOperacao() == 0) {
			op = "Somar";
		} else if (this.getOperacao() == 1) {
			op = "Diminuir";
		} else if (this.getOperacao() == 2) {
			op = "Multiplicar";
		} else {
			op = "Operação Desconhecida";
		}
		return "Valor 1: " + this.getValor1() + "\nValor 2: " + this.getValor2() + "\nDificuldade: "
				+ this.getDificuldade() + "\nOperação: " + op;
	}

	public boolean somar(int resposta) {
		this.resultado = this.getValor1() + this.getValor2();
		boolean certo = false;

		if (resposta == this.getResultado()) {
			System.out.println("Resposta correta!");
			certo = true;
		} else {
			System.out.println("Resposta errada!");
		}
		System.out.println(this.getValor1() + " + " + this.getValor2() + " = " + this.getResultado());
		return certo;
	}

	public boolean diminuir(int resposta) {
		this.resultado = this.getValor1() - this.getValor2();
		boolean certo = false;

		if (resposta == this.getResultado()) {
			System.out.println("Resposta correta!");
			certo = true;
		} else {
			System.out.println("Resposta errada!");
		}
		System.out.println(this.getValor1() + " - " + this.getValor2() + " = " + this.getResultado());
		return certo;
	}

	public boolean multiplicar(int resposta) {
		this.resultado = this.getValor1() * this.getValor2();
		boolean certo = false;

		if (resposta == this.getResultado()) {
			System.out.println("Resposta correta!");
			certo = true;
		} else {
			System.out.println("Resposta errada!");
		}
		System.out.println(this.getValor1() + " * " + this.getValor2() + " = " + this.getResultado());
		return certo;
	}
}
