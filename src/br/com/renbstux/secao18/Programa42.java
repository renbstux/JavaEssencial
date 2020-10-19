package br.com.renbstux.secao18;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

//Escrevendo em arquivos
public class Programa42 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		try {
		/**
		 * Desta forma, toda vez que o programa for executado,
		 * o arquivo ser� receriado e toda a informa��o, se pr�-existente,
		 * ser� excluida, recome�andp um arquivo zerado.
		 */
		PrintStream escrever = new PrintStream("saida.txt");
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Escreva algo: ");
			String msg = teclado.nextLine();
			escrever.println(msg);
		}
		escrever.close();
		
		}catch(FileNotFoundException e) {
			System.out.println("N�o foi possivel criar o arquivo!");
		}		
		teclado.close();

	}

}
