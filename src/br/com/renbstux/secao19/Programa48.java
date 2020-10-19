package br.com.renbstux.secao19;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Conjuntos

/*
 Os conjuntos s�o implementados com a interface Set, � uma das classes 
 que implementam estas interface � a HashSet
 
 A Maioria das cole��es possuem os mesmos m�todos j� conhecidos e utilizados com as listas,
 mas o comportamento desses objetos � um pouco diferente.
 
 A Perfomance tamb�m � melhor em conjuntos do que em listas.
 
 Caracteristicas dos conjuntos:
  - N�o aceitam valores repetidas;
  - A ordem de inser��o dos valores n�o � respeitada (Realiza uma semi-ordena��o);
  - N�o aceita ordena��o;
  - N�o possui indice;
 */
public class Programa48 {

	public static void main(String[] args) {
		Set<String> nomes = new HashSet<String>();
		Scanner teclado = new Scanner(System.in);
		boolean res;
		
		for(int i=0; i < 5; i++) {
			System.out.println("Informe o " + (i+1) + "/5 nome: ");
			String nome = teclado.nextLine();
			res = nomes.add(nome);
			if(!res) {
				System.out.println("O nome n�o pode ser repetido. ");
				i--;
			}
		}
		
		System.out.println("No conjunto nomes temos " + nomes.size() + " elementos");
					
		for(String nome : nomes) {
			System.out.println(nome);
		}
		teclado.close();
	}
}
