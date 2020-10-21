package br.com.renbstux.secao22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Default Methods -> São métodos concretos implementados em Interfaces.
//Estes métodos, como são concretos, ou seja, já possuem implementação,
//não precisam ser implementados nas classes que implementarem esta 
//interface.

/*
 
 Novidade implementada a partir da versão 8 do Java
 
  Atualmente, estamos na versão 11 do Java
 */
public class Programa66 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		
		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Java");
		palavras.add("Melissa");
		palavras.add("Renato");
		palavras.add("Priscila");
		palavras.add("Game");
		palavras.add("Run");
		palavras.add("Mel");
		
		//Collections.sort(palavras, comparador); //Ordena de forma alfabetica
		
		palavras.sort(comparador);
		
		System.out.println(palavras);
		

	}

}
