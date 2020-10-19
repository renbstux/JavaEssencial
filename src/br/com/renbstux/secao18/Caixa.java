package br.com.renbstux.secao18;
//Caixa de objetos genericos
public class Caixa {
	private Object[] objetos;
	private int posicaoLivre;
	
	public Caixa() {
		objetos = new Object[100]; //at� 100 objetos, 0..99
		posicaoLivre = 0;
	}
	
	public void adicionar(Object nova) {
		this.objetos[this.posicaoLivre] = nova;
		this.posicaoLivre++;		
	}
	
	public Object pegar(int posicao) {
		return this.objetos[posicao];		
	}

}
