package br.com.renbstux.secao17;

import java.io.IOException;
import java.util.Scanner;

import br.com.renbstux.secao11.Cliente;
import br.com.renbstux.secao11.Conta;

/*
 * Gerando executáveis jar
 * 
 * JAR - Java Archive
 * 
 * Java Archive - Arquivo Compactado Java
 * 
 *
 */
public class Principal {
	static Cliente cliente = new Cliente(18, "Angelina Jolie", "Rua da Paz, 45");
	static Conta conta = new Conta(1, 200, 300, cliente);
	static Scanner teclado = new Scanner(System.in);
	
	public static void depositar() {
		System.out.println("================= Depósito =================");
		System.out.println(" Informe o valor para depósito: ");
		float valor = teclado.nextFloat();
		if(valor > 0) {
			conta.depositar(valor);
			System.out.println("Depósito efetuado com sucesso.");
		}else {
			System.out.println("O Valor precisa ser positivo.");
		}
	}
	
	public static void sacar() {
		System.out.println("================ Saque ===============");
		System.out.println("Informe o valor para saque: ");
		float valor = teclado.nextFloat();
		if(valor > 0) {
			conta.sacar(valor);
		}else {
			System.out.println("O valor precisa ser positivo.");
		}
	}
	
	public static void consultar() {
		System.out.println("Seu Saldo é " + conta.getSaldo());
	}
	
	public static void main(String[] args) throws Exception, IOException {
		int opcao = 0;
		System.out.println("Bem-Vindo ao Banco Geek");
		
		//Limpa a tela no windows, no linux e no MacOS
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");

		
		do {
			
			System.out.println("Selecione uma opção abaixo: ");
			System.out.println("1 - Depositar");
			System.out.println("2 - Sacar");
			System.out.println("3 - Consultar Saldo");
			System.out.println("0 - Sair");
			opcao = teclado.nextInt();
			
			switch (opcao) {
			
			case 1:
				depositar();
				break;
			case 2:
				sacar();
				break;
			case 3:
				consultar();
				break;
			case 0:
				break;
			default:
				System.out.println("Opção Inválida.");
				break;
			}
			
		}while(opcao > 0);
		teclado.close();

	}

	
}
