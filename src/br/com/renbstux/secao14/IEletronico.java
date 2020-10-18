package br.com.renbstux.secao14;

//Recomenda-se mas não obrigatorio utilizar I para saber que seja uma interface, facilita a visualização!
/*
 * Uma interface pode conter:
 *  - Constantes;
 *  - Métodos abstratos;
 *  
 *  
 *  Interface para servir de contrato para produtos eletrônicos. Todo
 *  produto eletrônico que implementar esta interface OBRIGATORIAMENTE
 *  deverão implementar os métodos abstratos.
 */
public interface IEletronico {
	
	public String MARCA = "Geek"; // Constante
	
	public void ligar();
	
	public void desligar();

}
