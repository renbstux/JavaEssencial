package br.com.renbstux.secao21;
//Pilhas

/*
 * S�o estruturas de dados onde o elemento que est� visivel/disponivel � o que 
 * esta sempre no topo.
 * 
 * Os elementos, ao serem adicionados em uma pilha, s�o adicionados sempre no topo.
 * 
 * Para remover elementos da pilha, s� podemos remover o topo.
 
 [4] -> Tem visibilidade
 [3]
 [2]
 [1]
 [0]
 */
public class Programa60 {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		
		System.out.println(pilha);
		
		pilha.insere("Melissa");
		pilha.insere("Felicity");
		System.out.println(pilha);
		
		String ret = pilha.pegaTopo();
		System.out.println(ret);
		
		String r1 = pilha.remove();
		System.out.println(r1);
		
		System.out.println(pilha);
		
		System.out.println(pilha.vazia());
		
		

	}

}
