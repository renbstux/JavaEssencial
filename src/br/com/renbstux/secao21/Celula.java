package br.com.renbstux.secao21;
/**
 * Classe que represneta uma célula (container) onde
 * teremos o objeto (valor) e uma celula que será a 
 * ligação para o proximo.
 * 
 * @author Renato de Souza
 *
 */
public class Celula {
	private Object elemento; // utilizando o Object pode ser inserido qualquer tipo de dados armazenado
	private Celula proximo;
	
	public Celula(Object elemento, Celula proximo) {
		this.elemento = elemento;
		this.proximo = proximo;
	}
	
	public Celula getProximo() {
		return this.proximo;
	}
	
	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	
	public Object getElemento() {
		return this.elemento;
	}
	
}
