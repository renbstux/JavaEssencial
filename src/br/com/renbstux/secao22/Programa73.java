package br.com.renbstux.secao22;
//Lambdas

/*
  Expressões lambdas são funçoes anônimas, ou seja, funçoes sem nome.
  
  Já sabemos que podemos utilizar expressões lambdas com interfaces funcionais.
  
  Devemos então criar uma função lambda compatível com a função da interface que
  estivermos utilizando.
  
  Por Exemplo:
  
  - A interface consumer, possui um método que recebe uma string e não retorna nada. Por isso
  foi possivel utilizar a expressão lambda que passa uma string como parâmetro e não retorna nada.
  
  - A função sort(), espera receber dois parametros do tipo string como entrada e retorna um inteiro.
  Por isso foi possível passar a expressão lambda informando as duas strings, s1 e s2 
  e utilizando a classe Integer.compare que retorna um inteiro.
  
 */
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Programa73 {

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
		
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		palavras.forEach(s -> System.out.println(s));
		
		Consumer<String> consumer = s -> System.out.println(s);
		palavras.forEach(consumer);

	}

}
