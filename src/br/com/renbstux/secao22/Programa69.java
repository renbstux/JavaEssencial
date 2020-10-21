package br.com.renbstux.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
/*
   Classes An�nimas
   
   Classes An�nimas s�o classes sem nome
   
   Quando utilizar?
   
   - Utilizamos classes an�nimas quando temos interfaces com um ou poucos m�todos 
   e n�o precisamos reaproveitar o c�digo da classe.
   
   Ou seja, se n�o iremos precisar reaproveitar a classe em outro lugar do nosso
   sistema e esta classe que eu deveria criar iria apenas implementar uma interface
   com um ou poucos m�todos, podemos utilizar o conceito de classe an�nima.
   
   Exemplo: Classe ImprimeNaLinha e foi feito modelo de classe an�nima nesse programa e no Programa70 diretamente no forEach!
 */


public class Programa69 {

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
		
		Consumer<String> consumidor = new Consumer<String>() {

			@Override
			public void accept(String s) {
				System.out.println(s);				
			}
		};
				
		palavras.forEach(consumidor); //For Each -> para cada
		
	}
}
