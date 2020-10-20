package br.com.renbstux.secao21;

import br.com.renbstux.secao11.Cliente;

//LinkedList / Lista Ligada

/*
 * Em um vetor, os elementos estão um do lado do outro, enquanto em uma lista ligada,
 * eles estão em lugares diferentes, porém uma aposta para o outro indicando o
 * proximo elemento.
 * 
 *[0][3][1][2][5][4][null]
 */
public class Programa57 {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		System.out.println(lista);
		
		lista.adiciona("Angelina");
		System.out.println(lista);
		lista.adiciona("Maria");
		lista.adiciona("Melissa");
		System.out.println(lista);
		
		lista.removeDoComeco();
		System.out.println(lista);
		System.out.println("Tamanho da lista no momento: " + lista.tamanho());
	}

}
