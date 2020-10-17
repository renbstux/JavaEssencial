package br.com.renbstux.secao06;
//Tipos de dados alfanumericos
//Caracteres e Strings
public class Programa13 {
	public static void main(String[] args) {
		//Tipos Primitivos
		char letra1 = 'a'; //Aspas Simples
		char letra2 = 97; //97 em decimal == 'a'
		letra2 = (char) (letra2 + 1); //cast
		//string ; Não existe o tipo primitivo string em JAVA
		
		System.out.println("Letra1 " + letra1);
		System.out.println("Letra2 " + letra2);
		
		//Tipos não primitivos
		Character letra3 = 'A';
		String nome = "Geek University";
		
		System.out.println("Letra3 " + letra3);
		
		System.out.println("char/Character " + Character.SIZE + " bits");
		
		System.out.println("Nome " + nome);
		
		System.out.println("Tamanho da String: " + nome.length());
		
		System.out.println("String " + (Character.SIZE * nome.length()) + " bits");
		
	}

}
