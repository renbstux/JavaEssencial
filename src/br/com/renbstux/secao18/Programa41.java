package br.com.renbstux.secao18;
//Trabalhando com Strings

/*
 Em Java, String são imutáveis, ou seja, não mudam.
 */
public class Programa41 {

	public static void main(String[] args) {
		String curso = "Programação em Java: Essencial";
		
		//curso = curso.replace("a", "o"); //Altera, se encontrar, a primeira palavra pela segunda
		
		//curso = curso.toLowerCase(); //Converte as letras maiusculas para minusculas
		
//		curso = curso.toUpperCase();
//		
//		System.out.println(curso);
//		
//		System.out.println(curso.charAt(12));
//		
//		System.out.println(curso.length());
		
//		for(int i = 0; i < curso.length(); i++) {
//			System.out.print(curso.charAt(i));
//		}
		
		for (int i = (curso.length() -1); i >= 0; i--) {
			System.out.println(curso.charAt(i));
		}
		

	}

}
