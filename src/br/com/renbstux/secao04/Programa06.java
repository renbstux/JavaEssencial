package br.com.renbstux.secao04;
// Instru��o Switch - Tomar cuidado para n�o esquecer o break;
public class Programa06 {
	public static void main(String[] args) {
		int num = 33;
		
		switch (num) {
			case 1:
				System.out.println("o Numero � 1");
				break;
			case 3:
				System.out.println("O N�mero � 3");
				break;
			case 5:
				System.out.println("O n�mero � 5");
				break;
			default:
				System.out.println("[Default] O n�mero � " + num);
				break;
		}
		
	}

}
