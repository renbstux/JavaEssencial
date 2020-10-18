package br.com.renbstux.secao14;

//Recomenda-se mas n�o obrigatorio utilizar I para saber que seja uma interface, facilita a visualiza��o!
/*
 * Uma interface pode conter:
 *  - Constantes;
 *  - M�todos abstratos;
 *  
 *  
 *  Interface para servir de contrato para produtos eletr�nicos. Todo
 *  produto eletr�nico que implementar esta interface OBRIGATORIAMENTE
 *  dever�o implementar os m�todos abstratos.
 */
public interface IEletronico {
	
	public String MARCA = "Geek"; // Constante
	
	public void ligar();
	
	public void desligar();

}
