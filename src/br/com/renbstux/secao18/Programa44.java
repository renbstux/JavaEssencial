package br.com.renbstux.secao18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
//Escrita em arquvos 2
public class Programa44 {

	public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
		
		try {		
			PrintStream escrever = new PrintStream(new FileOutputStream("saida.txt", true));
		
			for(int i = 0; i < 5; i++) {
				System.out.println("Escreva algo: ");
				String msg = teclado.nextLine();
				escrever.println(msg);
			}
			escrever.close();
		
		}catch(FileNotFoundException e) {
			System.out.println("Não foi possivel criar o arquivo!");
		}		
		teclado.close();
	}

}
