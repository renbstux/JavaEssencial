package br.com.renbstux.secao22;
//Lambdas

/*
  Express�es lambdas s�o fun�oes an�nimas, ou seja, fun�oes sem nome.
  
  J� sabemos que podemos utilizar express�es lambdas com interfaces funcionais.
  
  Devemos ent�o criar uma fun��o lambda compat�vel com a fun��o da interface que
  estivermos utilizando.
  
  Por Exemplo:
  
  - A interface consumer, possui um m�todo que recebe uma string e n�o retorna nada. Por isso
  foi possivel utilizar a express�o lambda que passa uma string como par�metro e n�o retorna nada.
  
  - A fun��o sort(), espera receber dois parametros do tipo string como entrada e retorna um inteiro.
  Por isso foi poss�vel passar a express�o lambda informando as duas strings, s1 e s2 
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
