package br.com.renbstux.secao21;

import java.util.LinkedList;
import java.util.List;

//LinkedList
public class Programa58 {

	public static void main(String[] args) {
		List<String> lista = new LinkedList<String>();
		
		System.out.println(lista.size());
		lista.add("Felicity");
		lista.add("Angelina");
		
		lista.add(0, "Melissa");
		System.out.println(lista);
		

	}

}
