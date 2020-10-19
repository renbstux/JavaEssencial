package br.com.renbstux.secao20;
/*
 Para executar métodos em paralel, nossa classe 
 deve implementar a interface Runnable, e o método
 que precisa ser executado em paralelo deve ser 
 executado dentro do método run()
 */
public class BarraDeProgresso implements Runnable {
	
	public void executa() {
		//For 0 até 1000
		for(int i=0; i < 1000; i++) {
			System.out.println(i + " - Barra de Progresso...aguarde");
		}
	}
	@Override
	public void run() {
		//For 0 até 1000
		for(int i=0; i < 1000; i++) {
			System.out.println(i + " - Barra de Progresso...aguarde");
		}
		
	}

}
