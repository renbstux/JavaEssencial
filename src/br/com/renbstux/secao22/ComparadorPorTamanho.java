package br.com.renbstux.secao22;

/*
 Estou criando o proprio comparador de objetos (Strings)
 para que sej� poss�vel, desta forma, ordenar a string pelo
 seu tamanho ao inv�s de ordem alfab�tica.
 
 1 - A string1 � menor que a string2 -> retorna -1
 2 - A String1 � maior que a String2 -> retorna 1
 3 - A String1 tem o mesmo tamanho da String2 -> retorna 0
 */
import java.util.Comparator;

public class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		//1 - A string1 � menor que a string2 -> retorna -1
		if(s1.length() < s2.length()) {
			return -1;
		}
		//2 - A String1 � maior que a String2 -> retorna 1
		if(s1.length() > s2.length()) {
			return 1;
		}
		//3 - A String1 tem o mesmo tamanho da String2 -> retorna 0
		return 0;
	}

}
