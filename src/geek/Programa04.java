package geek;
//If, Else, if else
public class Programa04 {

	public static void main(String[] args) {
		int num = 7;
		
		/*
		 * se  num > 5 entao {
		 * escreva (" Sim, o numero " + num + " � maior que 5");
		 * }sen�o se (num == 5) ent�o {
		 * 	escreva("O n�mero " + num + " � igual a 5");
		 * }senao{
		 * 	escreva("N�o, o numero " + num + " � menor que 5");
		 * }
		 */
		if(num > 5) {
			System.out.println("Sim, o numero " + num + " � maior que 5");
		}else if(num == 5){
			System.out.println("O n�mero " + num + " � igual a 5");	
			// verificando se o numero � par
		}else if(num % 2 == 0) {
			System.out.println("O n�mero " + num + " � par.");
		}else{
				System.out.println("N�o, o numero " + num + " � menor que 5");
			}
		}
}