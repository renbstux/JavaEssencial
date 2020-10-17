package br.com.renbstux.secao04;
// Instrução Switch - Tomar cuidado para não esquecer o break;
public class Programa06 {
	public static void main(String[] args) {
		int num = 33;
		
		switch (num) {
			case 1:
				System.out.println("o Numero é 1");
				break;
			case 3:
				System.out.println("O Número é 3");
				break;
			case 5:
				System.out.println("O número é 5");
				break;
			default:
				System.out.println("[Default] O número é " + num);
				break;
		}
		
	}

}
