package br.com.renbstux.secao21;
//Lista duplamente ligadas
public class Programa59 {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		System.out.println(lista);
		
		lista.adiciona("Angelina");
		System.out.println(lista);
		lista.adiciona("Maria");
		lista.adiciona("Melissa");
		System.out.println(lista);
		
		//lista.remove(1);
		System.out.println(lista);
		System.out.println("Tamanho da lista no momento: " + lista.tamanho());
		
		System.out.println(lista.contem("Melissa"));
	}

}
