package br.com.renbstux.secao19;

import java.util.ArrayList;
import java.util.Collections;

//Listas
/*
 Arrays (Vetores/Matrizes)
 
 - Um Array tem tamanho fixo. Ou seja se criarmos um array com 5 elementos
 ele terá sempre no maximo 5 elementos.
 
 - Um Array tem tipo de dado fixo. Ou seja, se criarmos uma array de inteiros 
 ele só poderá ter inteiros.
 
 - É dificil encontrar um determinado elemento em um array. Precisamos para
 isso varrer todo o array através do seu indice, caso não façamos busca pelo indice.
 
 */
/*
 Collections (Coleções)
 
 Java possui diversas classes/interfaces que facilitam muito o trabalho quando se
 trata de coleções de dados. Essas classes/interfaces são chamadas de Collections (Coleções)
 
 */
/*
 Listas
 
 - Aceitam repetição de valores;
 - Possuem tamanho "infinito" (Depende da memória);
 - Podemos adicionar valores de qualquer tipo, desde que não especificamos um tipo na declaração;
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
		
//		nomes.add(44); //Agora teremos um erro, pois especificamos o tipo da variavel que estará dentro do ArrayList
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
		
		for(String nome : nomes) { //Pode ser utilizado Object se não for definido o tipo de dados
			System.out.println(nome);
			
		}
	}
}
