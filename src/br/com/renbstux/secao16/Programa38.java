package br.com.renbstux.secao16;

import java.io.IOException;
import java.util.Scanner;

public class Programa38 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o N1: ");
		int n1 = teclado.nextInt();
		
		System.out.println("Informe o N2: ");
		int n2 = teclado.nextInt();
		
		try {
		System.out.println(divisao(n1, n2));
		}catch(Exception e) {
			System.out.println("Ocorreu uma outra exce��o!");
		}
		teclado.close();

	}
	//Estou criando uma fun��o, que avisa que tem possibilidade 
	// de lan�ar uma exce��o do tipo Exception
	public static int divisao(int n1, int n2) throws Exception{
		return n1 / n2;
	}

}
