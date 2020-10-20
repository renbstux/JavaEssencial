package br.com.renbstux.secao21;
// Armazenamento Sequencial

/*
 * int numeros[] = new int[5];
 * 
 * numeros[0] = 1;
 * numeros[1] = 3;
 * numeros[2] = 5;
 * numeros[3] = 7;
 * numeros[4] = 9;
 */
public class Programa55 {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Angelina");
		Aluno a2 = new Aluno("Melissa");
		
		Vetor lista = new Vetor();
		
		System.out.println("Total de alunos: " + lista.tamanho());
		
		lista.adiciona(a1);
		System.out.println("Total de alunos: " + lista.tamanho());
		lista.adiciona(a2);
		System.out.println("Total de alunos: " + lista.tamanho());
		
		System.out.println(lista);
		
		//System.out.println(lista.contem(a1));
		
		try {
		System.out.println(lista.pega(1));
		}catch(IllegalArgumentException e) {
			System.out.println("O Aluno da posição solicitada não existe!");
			System.out.println(e.getMessage());
		}
		
		Aluno a3 = new Aluno("Maria");
		try {
			lista.adiciona(1, a3);
		}catch(IllegalArgumentException e) {
			System.out.println("Essa posição é Inválida!");
		}
		
		//lista.remove(0);
		System.out.println(lista);

	}

}
