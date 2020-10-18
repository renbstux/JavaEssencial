package br.com.renbstux.secao13;
// Template Method

/*
 * - Final � um modificador de acesso que faz com que
 * o elemento que esteja utilizando, n�o possa ser extendindo/reescrito.
 */
public abstract class Treinamento {
	
	//Template Method
	public final void treinoDiario() {
		preparoFisico();
		jogoTreino();
		treinoTatico();
	}
	
	public abstract void preparoFisico();
	
	public abstract void jogoTreino();
	
	public final void treinoTatico() {
		System.out.println("treino t�tico...");
	}
}
