package br.com.renbstux.secao22;

import java.util.ArrayList;
import java.util.List;

//Lambdas

/*
  //Method Compare
  public static int compare(int x, int y) {
        return (x < y) ? -1 : ((x == y) ? 0 : 1);
    }
  
 */
public class Programa72 {

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

		// Forma 1
//		palavras.sort((s1, s2) -> {
//			if (s1.length() < s2.length()) {
//				return -1;
//			}
//			if (s1.length() > s2.length()) {
//				return 1;
//			}
//			return 0;
//		});

		// Forma 2
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		palavras.forEach(s -> System.out.println(s));

	}

}
