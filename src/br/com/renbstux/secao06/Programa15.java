package br.com.renbstux.secao06;
//Operações Matematicas
public class Programa15 {
	public static void main(String[] args) {
		int num1 = 5, num2 = 9, res;
		float res2;
		
		//Soma
		res = num1 + num2;
		System.out.println("A Soma de " + num1 + " + " + num2 + " é " + res);
		
		//Subtração
		res = num2 - num1;
		System.out.println("A Subtração de " + num2 + " - " + num1 + " é " + res);
		
		//Mutiplicação
		res = num1 * num2;
		System.out.println("A Multiplicação de " + num1 + " * " + num2 + " é " + res);
		
		//Divisão (Inteira)
		res = num2 / num1;
		System.out.println("A Divisão de " + num2 + " / " + num1 + " é " + res);
		
		//Divisão (Real)
		res2 = (float) num2 / (float) num1;//cast
		System.out.println("A Divisão de " + num2 + " / " + num1 + " é " + res2);
		
		//Módulo
		/*
		 * Se o resto do módulo da variavel por 2 for 0, a variavel 
		 * é par. Se o resto for 1, a variavel é impar
		 */
		res = num1 % 2;
		System.out.println("O resto da divisão de  " + num1 + " por 2 é " + res);
		
		res = num2 % 3;
		System.out.println(num2 + " é divisível por 3? " + res);
	}

}
