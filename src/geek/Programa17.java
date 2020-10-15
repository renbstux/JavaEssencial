package geek;

import jdk.nashorn.api.tree.ForInLoopTree;

//Vetor parte 2
public class Programa17 {
	public static void main(String[] args) {
		int numeros[] = new int[100];
		
		System.out.println("Tamanho do vetor: " + numeros.length);
		
		for(int i = 0; i < numeros.length; i++) {
			// numeros[0] = i + 3;
			numeros[i] = i + 3;
			// numeros[9] = i + 3;
		}
		
		System.out.println(numeros[0]); //primeiro elemento
		System.out.println(numeros[9]); //ultimo elemento
		
		// 0..9
		//numeros[10] = 42;
		//System.out.println(numeros[10]);
		//ERROR - java.lang.ArrayIndexOutOfBoundsException
		/*
		 * Os vetores/arrays possuem tamanho fixo e não podem
		 * ser aumentados ou diminuidos
		 */
		
		numeros[0] = 7;
		System.out.println(numeros[0]); //primeiro elemento
		
		/*
		 * numeros[0] = 23.4f;
		 * 
		 * Os vetores/array possuem tipos de dados fixos
		 * e não aceitam tipos variados.
		 */
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)Math.round(Math.random() * 10);
		}
			
		System.out.println(numeros[0]); //primeiro elemento
		System.out.println(numeros[9]); //ultimo elemento
		
		//0...1 double
		System.out.println(Math.random());
		
		System.out.println(Math.random() + 10);
		
		System.out.println(Math.round(Math.random() + 10));
		
		//foreach ctrl + barra de espaço
		for (int i : numeros) {
			System.out.println(i);
		}
	}
}
