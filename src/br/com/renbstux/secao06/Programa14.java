package br.com.renbstux.secao06;
//Tipos booleanos
public class Programa14 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//Tipos Primitivos
		boolean verdadeiro= true;
		boolean falso = false;
		
		boolean ativo = true;
		
		//Tipos n�o primitivos
		Boolean v = true;
		Boolean f = false;
		
		System.out.println("Verdadeiro " + verdadeiro);
		System.out.println("Falso " + falso);
		System.out.println("V " + v);
		System.out.println("F " + f);
		
		System.out.println();
		
		if(verdadeiro) {
			System.out.println("Verdadeiro");
		}else {
			System.out.println("� Falso!");
		}
		if(1 == 3) {
			System.out.println("1 == 1 � Verdadeiro");
		}else {
			System.out.println("� Falso");
		}
		
		if(ativo) {
			System.out.println("Pode acessar o sistema.");
		}else {
			System.out.println("Acesso Negado!");
		}
	}
}

/*
if(realiza uma verifica��o que no final retorna ou true ou false)
*/