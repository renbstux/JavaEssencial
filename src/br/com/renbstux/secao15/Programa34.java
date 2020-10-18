package br.com.renbstux.secao15;
//Atributos Estáticos


/*
 * Atributos estáticos são atributos, onde os valores são compartilhados 
 * entre as instancias de classes
 * 
 * Para utlizar um atributos estático, colocamos o nome da classe
 * junto ao atributo.
 * 
 * Exemplo:
 * 
 * NomeDaClasse.atributo;
 */
public class Programa34 {

	public static void main(String[] args) {
		Conta c1 = new Conta("Angelina Jolie");
		
		System.out.println(c1.getNumero());
		System.out.println(c1.getCliente());
		
		Conta c2 = new Conta("Felicity Jones");
		
		System.out.println(c2.getNumero());
		System.out.println(c2.getCliente());
		
		Conta c3 = new Conta("Melissa de Souza");
		
		System.out.println(c3.getNumero());
		System.out.println(c3.getCliente());
		
		System.out.println(Conta.contador);
		
		Conta.contador = 42;
		
		System.out.println(Conta.contador);
		
		Conta c4 = new Conta("Outro Cliente");
		
		System.out.println(c4.getNumero());
		System.out.println(c4.getCliente());

	}

}
