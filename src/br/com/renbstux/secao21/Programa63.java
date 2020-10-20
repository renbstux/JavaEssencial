package br.com.renbstux.secao21;

import java.util.LinkedList;
import java.util.Queue;

public class Programa63 {

	//Fila/Queue - Implementação do Java
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Melissa");
		fila.add("Angelina");
		fila.add("Maria");
		
		System.out.println(fila);
		
		String ret = fila.poll(); //Remover
		System.out.println(ret);
		
		System.out.println(fila);
		
		System.out.println(fila.size());

	}

}
