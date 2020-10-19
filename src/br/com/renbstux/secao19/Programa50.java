package br.com.renbstux.secao19;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// Mapas / Map

/*
 * Os mapas são representados em Java pela interface Map
 * e mapeia seus elementos utilizando o conceito de chave/valor
 * 
  - Mapas são conhecido como se fossem/representassem 3 coleções
  		- Coleção de chaves;
  		- Coleção de Valores;
  		- Coleção de associações;
 */
public class Programa50 {

	public static void main(String[] args) {
		Map<Integer, String> pessoas = new HashMap<Integer, String>();
		
		pessoas.put(21, "Felicity Jones");
		pessoas.put(31, "Maria Antonieta");
		pessoas.put(41, "Angelina Jolie");
		
		//Coleção de chaves
		System.out.println("Chaves: " + pessoas.keySet()); // devolve uma lista com as idades [21, 41, 31]
		
		//Coleção de Valores
		System.out.println("Valores: " + pessoas.values()); // [Felicity Jones, Angelina Jolie, Maria Antonieta]
		
		//Coleção de Associaçoes
		System.out.println("Associação: " + pessoas.entrySet());//[21=Felicity Jones, 41=Angelina Jolie, 31=Maria Antonieta]
		
		//Iterar na coleção de chaves
		//Forma 1
		Set<Integer> chaves = pessoas.keySet();
		for(Integer idade: chaves) {
			System.out.println(pessoas.get(idade));
		}
		
		//Forma 2
		//Disponibilizado a partir do Java 8
		pessoas.keySet().forEach(idade -> {
			System.out.println(pessoas.get(idade));
		});
		
		//Forma 1		
		//Iterar na coleção de valores
		Collection<String> valores = pessoas.values();
		for(String nome : valores) {
			System.out.println(nome);
		}
		
		//Forma2
		//Iterar na coleção de valores
		pessoas.values().forEach(nome -> {
			System.out.println(nome);
		});
		
		//Forma 1
		//Iterar a coleção de associações
		Set<Entry<Integer, String>> associacoes = pessoas.entrySet();
		for(Entry<Integer, String> associacao: associacoes) {
			System.out.println(associacao.getKey() + " - " + associacao.getValue());
		}
		
		//Forma 2
		//Iterar a coleção de associações
		pessoas.entrySet().forEach(associacao -> {
			System.out.println(associacao.getKey() + " - " + associacao.getValue());
		});
	}
}
