package br.com.renbstux.secao05;

import java.util.Scanner;

/*
 * Receba dados do usuario enquanto a idade for > que 0
 */

//while 
public class Programa07 {
	public static void main(String[] args) {
		
		int idade = 1;
		String nome;
	
		//Para receber dados do usuário via teclado
		Scanner teclado = new Scanner(System.in);
		
		//Sempre checa o valor antes executar o bloco
		while(idade > 0) {				
			System.out.println("Informe Seu nome: ");	
			nome = teclado.nextLine();
			
			System.out.println("Informe sua idade: ");
			//idade = teclado.nextInt(); //BUG
			idade = Integer.parseInt(teclado.nextLine());
			//nextLine recebe o dado como uma string e o Integer.parseInt converte para uma numero Inteiro
			
			System.out.println(nome + " tem " + idade + " Anos!");
			
		}
				
		teclado.close();
				;
	}

}
