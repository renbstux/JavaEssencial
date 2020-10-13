package geek;
//If, Else, if else
public class Programa04 {

	public static void main(String[] args) {
		int num = 7;
		
		/*
		 * se  num > 5 entao {
		 * escreva (" Sim, o numero " + num + " é maior que 5");
		 * }senão se (num == 5) então {
		 * 	escreva("O número " + num + " é igual a 5");
		 * }senao{
		 * 	escreva("Não, o numero " + num + " é menor que 5");
		 * }
		 */
		if(num > 5) {
			System.out.println("Sim, o numero " + num + " é maior que 5");
		}else if(num == 5){
			System.out.println("O número " + num + " é igual a 5");	
			// verificando se o numero é par
		}else if(num % 2 == 0) {
			System.out.println("O número " + num + " é par.");
		}else{
				System.out.println("Não, o numero " + num + " é menor que 5");
			}
		}
}