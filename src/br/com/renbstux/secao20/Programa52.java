package br.com.renbstux.secao20;
//Simula��o da gera��o de relatorio + barra de tarefa 
//Com a utiliza��o de threads
public class Programa52 {

	public static void main(String[] args) {
		BarraDeProgresso barra = new BarraDeProgresso();
		Thread t1 = new Thread(barra);
		t1.start();
		
		GeraRelatorio relatorio = new GeraRelatorio();
		Thread t2 = new Thread(relatorio);
		t2.start();

	}

}
