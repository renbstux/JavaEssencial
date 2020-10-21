package br.com.renbstux.secao22;

/*
  Lambdas
  
  Express�es lambdas, s�o fun��es an�nimas
  
  Atalho do Eclipse para identa��o do c�digo(organiza��o do c�digo) -> CTRL+SHIFT + F
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

		// Express�o Lambda - forma 1
//		palavras.forEach((String s) -> {
//			System.out.println(s);
//		});
		// Express�o Lambda - forma 2 - s� � possivel tirar o ; e a { } pois s�o uma
		// unica linha de execu��o!
		palavras.forEach(s -> System.out.println(s));

	}

}
