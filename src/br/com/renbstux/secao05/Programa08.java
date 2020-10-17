package br.com.renbstux.secao05;

import java.util.Scanner;

/*
 * Receba dados do usuario enquanto a idade for > que 0
 */

//do while
public class Programa08 {
	public static void main(String[] args) {
		
		int idade;
		String nome;
	
		//Para receber dados do usuário via teclado
		Scanner teclado = new Scanner(System.in);
		
		//Primeiro executa o bloco, depois faz a checagem
		do {				
			System.out.println("Informe Seu nome: ");	
			nome = teclado.nextLine();
			
			System.out.println("Informe sua idade: ");
			//idade = teclado.nextInt(); //BUG
			idade = Integer.parseInt(teclado.nextLine());
			//nextLine recebe o dado como uma string e o Integer.parseInt converte para uma numero Inteiro
			
			if(idade > 0) {
				System.out.println(nome + " tem " + idade + " Anos!");
			}
			
		}while(idade > 0);
				
		teclado.close();
				;
	}

}
