package br.com.renbstux.secao19;

import java.util.ArrayList;
import java.util.Collections;

//Listas
/*
 Arrays (Vetores/Matrizes)
 
 - Um Array tem tamanho fixo. Ou seja se criarmos um array com 5 elementos
 ele ter� sempre no maximo 5 elementos.
 
 - Um Array tem tipo de dado fixo. Ou seja, se criarmos uma array de inteiros 
 ele s� poder� ter inteiros.
 
 - � dificil encontrar um determinado elemento em um array. Precisamos para
 isso varrer todo o array atrav�s do seu indice, caso n�o fa�amos busca pelo indice.
 
 */
/*
 Collections (Cole��es)
 
 Java possui diversas classes/interfaces que facilitam muito o trabalho quando se
 trata de cole��es de dados. Essas classes/interfaces s�o chamadas de Collections (Cole��es)
 
 */
/*
 Listas
 
 - Aceitam repeti��o de valores;
 - Possuem tamanho "infinito" (Depende da mem�ria);
 - Podemos adicionar valores de qualquer tipo, desde que n�o especificamos um tipo na declara��o;
 */


public class Programa45 {

	public static void main(String[] args) {
		//ArrayList nomes = new ArrayList(); //Sem definir tipo de dado, podemos colocar qualquer tipo
		ArrayList<String> nomes = new ArrayList<String>(); //Definimos o tipo String
		
		nomes.add("Maria");
		nomes.add("Felicity");
		nomes.add("Angelina");
		nomes.add("Melissa");
		nomes.add("Maria");
		nomes.add("Angelina");
		
//		nomes.add(44); //Agora teremos um erro, pois especificamos o tipo da variavel que estar� dentro do ArrayList
//		nomes.add(true);
//		nomes.add(12.4);
//		nomes.add('e');
		
		//System.out.println(nomes.get(0));
		//System.out.println(nomes.get(3));
		
		System.out.println(nomes.size());
		
//		for(int i = 0; i < nomes.size(); i++) {
//			System.out.println(nomes.get(i));
//		}
		
		Collections.sort(nomes); // Ordena na ordem alfabetica
		
		for(String nome : nomes) { //Pode ser utilizado Object se n�o for definido o tipo de dados
			System.out.println(nome);
			
		}
	}
}
