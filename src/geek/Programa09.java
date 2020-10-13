package geek;

//For

import java.util.Scanner;

public class Programa09 {

	public static void main(String[] args) {

		int idade;
		String nome;
		//Para receber dados do usuário via teclado
		Scanner teclado = new Scanner(System.in);
		
		//variavel de controle; condição de parada; forma de incremento
		//i++ -> i = i + 1
		for(int i = 0; i < 5; i++) {
			System.out.println("Informe Seu nome: ");	
			nome = teclado.nextLine();
			
			System.out.println("Informe sua idade: ");
			//idade = teclado.nextInt(); //BUG
			idade = Integer.parseInt(teclado.nextLine());
			//nextLine recebe o dado como uma string e o Integer.parseInt converte para uma numero Inteiro
			
			if(idade > 0) {
				System.out.println(nome + " tem " + idade + " Anos!");
			}
		}
		
		teclado.close();
	}

}
