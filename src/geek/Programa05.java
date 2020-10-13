package geek;
// Operador Ternário

//Se você precisar criar a função main() // Programa JAVA
// digite main e no teclado pressionar CTRL + Barra de espaço
//digite sysout CTRL+Barra de espaço
public class Programa05 {
	public static void main(String[] args) {
		int valor = 3, num;
		
		/*
		if(valor > 0) {
			num = valor;
		}else {
			num = 7;
		}
		*/
		
		//Operador ternário
		num = (valor > 0) ? valor : 7;
		
		System.out.println(num);
		
	}
}
