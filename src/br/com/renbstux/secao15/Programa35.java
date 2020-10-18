package br.com.renbstux.secao15;
//M�todos Est�ticos

/*
 * Um M�todo est�tico, n�o depende se uma instancia da classe
 * para ser utilizado.
 * 
 * Pode-se utilizar conforme:
 * 
 * NomeDaClasse.metodo();
 * 
 */
public class Programa35 {

	public static void main(String[] args) {
		
		Conta c1 = new Conta("Angelina Jolie");
		
		System.out.println("Numero da Conta: " + c1.getNumero());
		System.out.println("Nome do Cliente: " + c1.getCliente());
		
		System.out.println("A Proxima conta ser�: " + Conta.proximaConta());

	}

}
