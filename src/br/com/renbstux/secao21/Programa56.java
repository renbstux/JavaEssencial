package br.com.renbstux.secao21;

public class Programa56 {

	public static void main(String[] args) {
		Vetor lista = new Vetor();
		
		for(int i = 0; i < 400; i++) {
			Aluno a = new Aluno("Maria " + i);
			lista.adiciona(a);
		}
		System.out.println(lista);
		System.out.println(lista.tamanho());
	}

}
