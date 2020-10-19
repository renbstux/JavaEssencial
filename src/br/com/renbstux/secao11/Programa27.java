package br.com.renbstux.secao11;
//Private

/*
 * Privado a propria classe
 * 
 * Ou seja, s� temos acesso ao atributo ou m�todo privado dentro da propria
 * classe onde ele foi declarado.
 */
public class Programa27 {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente(18, "Felicity Jones","Rua da Barra, 255");
		
		System.out.println("Nome: " + cli1.getNome());
		System.out.println("Endere�o: " + cli1.getEndereco());
		cli1.dizer_oi();
		System.out.println("");
		Cliente cli2 = new Cliente(45, "Angelina Jolie","Rua das Ostras, 1221");
		
		System.out.println("Nome: " + cli2.getNome());
		System.out.println("Endere�o: " + cli2.getEndereco());
		cli2.dizer_oi();
	}

}
