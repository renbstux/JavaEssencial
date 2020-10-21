package br.com.renbstux.secao22;

/*
  Lambdas
  
  Expressões lambdas, são funções anônimas
  
  Atalho do Eclipse para identação do código(organização do código) -> CTRL+SHIFT + F
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Programa71 {

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

		palavras.sort(comparador);

		// Expressão Lambda - forma 1
//		palavras.forEach((String s) -> {
//			System.out.println(s);
//		});
		// Expressão Lambda - forma 2 - só é possivel tirar o ; e a { } pois são uma
		// unica linha de execução!
		palavras.forEach(s -> System.out.println(s));

	}

}
