package br.com.renbstux.secao01;

//Public
/*
 * Publico - Pode ser utilizado em todo o projeto;
 */
import br.com.renbstux.secao11.Cliente;

public class Programa26 {

	public static void main(String[] args) {
		Cliente cli = new Cliente("Angelina Jolie","Rua da Barra, 255");
		
		//System.out.println("Nome: " + cli.nome); //estão como private
		//System.out.println("Endereço: " + cli.endereco); // private
				
		//cli.dizer_oi(); //Protected 
		
		cli.hashCode();
	}

}
