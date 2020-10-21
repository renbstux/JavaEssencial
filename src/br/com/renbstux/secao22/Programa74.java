package br.com.renbstux.secao22;
//Method References 

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/*
 Podem ser consideradas simplificações das expressoes lambdas;
 */



public class Programa74 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		

		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Java");
		palavras.add("Melissa");
		palavras.add("Renato");
		palavras.add("Priscila");
		palavras.add("Game");
		palavras.add("Run");
		palavras.add("Mel");
		
//		//Forma 1
//		Function<String, Integer> tamanho = new Function<String, Integer>() {
//
//			@Override
//			public Integer apply(String s) {
//				return s.length();
//			}
//	   };
//	   
//	   Comparator<String> comparador = Comparator.comparing(tamanho);
//	   palavras.sort(comparador);
		   
		//Forma 2 - Lambda
//		palavras.sort(Comparator.comparing(s -> s.length()));
//		System.out.println(palavras);
		
		//Forma3 - Method References - Forma 1
		palavras.sort(Comparator.comparing(String::length));
		System.out.println(palavras);
		
		//Forma4 - Method References - Forma 2
		Function<String, Integer> tamanho = String::length;//Usando Method References
		//Function<String, Integer> tamanho = s -> s.length(); //Usando expressão lambda
		Comparator<String> comparador = Comparator.comparing(tamanho);
		palavras.sort(comparador);
		System.out.println(palavras);
		
		palavras.forEach(s -> System.out.println(s)); //Lambda
		palavras.forEach(System.out::println); // Method references

	}
}
