package geek;
// Operador Tern�rio

//Se voc� precisar criar a fun��o main() // Programa JAVA
// digite main e no teclado pressionar CTRL + Barra de espa�o
//digite sysout CTRL+Barra de espa�o
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
		
		//Operador tern�rio
		num = (valor > 0) ? valor : 7;
		
		System.out.println(num);
		
	}
}
