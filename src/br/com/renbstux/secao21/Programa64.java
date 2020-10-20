package br.com.renbstux.secao21;

import java.util.LinkedList;

//Conjuntos

/*
  - Uma das caracteristicas dos conjuntos é a não aceitar elementos
  repetido.
  
  - Gera Perfomance.
  
  A = ["Angelina", "Angela", "Adriano" ...];
  B =
  C =
  D =
  E =
  F =
  G =
  H =
  .
  .
  .
  Z = ["Zuleica", "Zagalo", "Zamael"...];
  
 */
public class Programa64 {

	public static void main(String[] args) {
		Conjunto conjunto = new Conjunto();
		
			
		conjunto.adiciona("Angelina");
		conjunto.adiciona("Angelica");
		conjunto.adiciona("Albertina");
		conjunto.adiciona("Adriano");
		conjunto.adiciona("Melissa");
		conjunto.adiciona("Melina");
		conjunto.adiciona("Renato");
		conjunto.adiciona("Rodrigo");
		conjunto.adiciona("Albertina");
		conjunto.adiciona("Felicity");
		conjunto.adiciona("Fabiano");
		conjunto.adiciona("Fabiana");
		System.out.println(conjunto);
		
		conjunto.remove("Melina");
				
		System.out.println(conjunto);
	

	}
}
