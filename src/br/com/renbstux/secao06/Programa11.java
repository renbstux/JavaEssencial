package br.com.renbstux.secao06;
//Tipos de dados
//Numericos (inteiros e Reais)
public class Programa11 {
	
	public static void main(String[] args) {
		//Tipos prim�rios // primitivos
		long num0 = 99; // Inteiro
		int num1 = 4; //Inteiro
		short num2 = 4; // Inteiro (Curto/menor/baixo)
		byte num3 = 4; // Inteiro
		char num8 = 34;
		
		//Tipos n�o primarios/primitivos
		Long num7 = (long) 999999; //Cast;
		Integer num4 = 98;
		Short num5 = 7;
		Byte num6 = 9; 
		Character num9 = 35;
		
		System.out.println("long -> Num0 = " + num0);
		System.out.println("int -> Num1 = " + num1);
		System.out.println("short -> Num2 = " + num2);
		System.out.println("byte -> num3 = " + num3);
		System.out.println("char -> num8 = " + num8);
		System.out.println("Integer -> Num4 = " + num4);
		System.out.println("Short -> Num5 = " + num5);
		System.out.println("Byte -> num6 = " + num6);
		System.out.println("Long -> num7 = " + num7);
		System.out.println("Character -> num9 = " + num9);
		
		System.out.println("long/Long " + Long.SIZE + " bits");
		System.out.println("int/Integer " + Integer.SIZE + " bits");
		System.out.println("short/Short " + Short.SIZE + " bits");
		System.out.println("byte/Byte " + Byte.SIZE + " bits");
		System.out.println("char/Character " + Character.SIZE + " bits");
		
		System.out.println("Valor Min int/Integer " + Integer.MIN_VALUE);
		System.out.println("Valor Max int/Integer " + Integer.MAX_VALUE);
		
		System.out.println("Valor Min short/Short " + Short.MIN_VALUE);
		System.out.println("Valor Max short/Short " + Short.MAX_VALUE);
		
		System.out.println("Valor Min byte/Byte " + Byte.MIN_VALUE);
		System.out.println("Valor Max byte/Byte " + Byte.MAX_VALUE);
		
		System.out.println("Valor Min long/Long " + Long.MIN_VALUE);
		System.out.println("Valor Max long/Long " + Long.MAX_VALUE);
		
		System.out.println("Valor Min char/Character " + Character.MIN_VALUE); //0
		System.out.println("Valor Max char/Character " + Character.MAX_VALUE); //65535
	}

}
