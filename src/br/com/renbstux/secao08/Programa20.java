package br.com.renbstux.secao08;

import java.util.Scanner;

//Criando nossas proprias fun��es
/*
 * Fa�a um programa, que receba um diversos nomes de frutas
 * do usuario e no final imprima essas frutas em ordem contr�ria. 
 * O Programa deve solicitar ao usuario quantas frutas ele quer informar.
 * 
 * Informe quantas frutas deseja cadastrar:
 * 
 * Informe o nome de uma Fruta:
 */
public class Programa20 {
	//Variaveis globais
	//declara��o do vetor
	static String frutas[];
	
	static Scanner teclado = new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
		//Vari�vel local
		int qtd;
					
		System.out.println("Informe a quantidade de frutas para cadastrar: ");
		qtd = Integer.parseInt(teclado.nextLine());
		
		cadastrar_dados(qtd);
		
		mostrar_dados(qtd);
		
		teclado.close();
	}
/*
 * Uma fun��o deve ter o seguinte:
 * a) Tipo de retorno(Tipo de dado que a fun��o vai retornar);
 * b) Nome - Corresponde a a��o que a fun��o realiza;
 * c) Parametros/Argumentos de entrada (opcional)
 * d) Retorno (Opcional - depende do tipo de retorno)
 * 
 *void = vazio
 */
	static void cadastrar_dados(int quantidade) {
		//Definindo o tamanho do vetor
		frutas = new String[quantidade];
				
		for(int i = 0; i < quantidade; i++) {
			System.out.println("Informe o nome da fruta " + (i + 1) + " :");
			frutas[i] = teclado.nextLine();
			}
	}
	
	static void mostrar_dados(int quantidade) {
		for(int i = (quantidade - 1); i >= 0; i--) {
			System.out.println(frutas[i]);
			}	
	}
}
