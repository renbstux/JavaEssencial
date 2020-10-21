package br.com.renbstux.secao22;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Programa68 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		
		Consumer<String> consumidor = new ImprimeNaLinha();
		
		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Java");
		palavras.add("Melissa");
		palavras.add("Renato");
		palavras.add("Priscila");
		palavras.add("Game");
		palavras.add("Run");
		palavras.add("Mel");
		
//		for(int i=0; i < palavras.size(); i++) {
//			System.out.println(palavras.get(i));
//		}
		
//		for (String p : palavras) {
//			System.out.println(p);
//			
//		}
		
		palavras.forEach(consumidor); //For Each -> para cada
		
		System.out.println(palavras);

	}

}
