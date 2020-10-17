package br.com.renbstux.secao11;
//Private

/*
 * Privado a propria classe
 * 
 * Ou seja, só temos acesso ao atributo ou método privado dentro da propria
 * classe onde ele foi declarado.
 */
public class Programa27 {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente("Felicity Jones","Rua da Barra, 255");
		
		System.out.println("Nome: " + cli1.getNome());
		System.out.println("Endereço: " + cli1.getEndereco());
		System.out.println("");
		Cliente cli2 = new Cliente("Angelina Jolie","Rua das Ostras, 1221");
		
		System.out.println("Nome: " + cli2.getNome());
		System.out.println("Endereço: " + cli2.getEndereco());
	}

}
