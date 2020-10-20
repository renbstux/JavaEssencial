package br.com.renbstux.secao21;
//Filas

/*
 * Todo elemento entra no final da fila.
 * 
 * - O primeiro elemento a entrar é também o primeiro a sair. FIFO - First in/First out
 */
public class Programa62 {

	public static void main(String[] args) {
		Fila fila = new Fila();
		
		System.out.println(fila);
		
		fila.adiciona("Angelina");
		fila.adiciona("Felicity");
		fila.adiciona("Melissa");
		
		System.out.println(fila);
		
		String ret = fila.remove();
		System.out.println(ret);
		
		System.out.println(fila);
		
		fila.remove();
		fila.remove();
		fila.remove();
		System.out.println(fila.vazia());

	}

}
