package br.com.renbstux.secao20;
//Thread Sincronizada

/*
 O sincronismo ocorre pois durante a execução do método a thread
 executa um 'lock' (bloqueio) da função para que outra thread
 só possa executa-la pós a finalização da thread inicial
 */
import br.com.renbstux.secao11.Cliente;
import br.com.renbstux.secao11.Conta;

public class Programa54 {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente(37, "Melissa da Luz", "Rua 1");
		Conta c1 = new Conta(1, 200, 300, cli1); //Saldo 500
		
		FazDeposito acao = new FazDeposito(c1);
		Thread t1 = new Thread(acao);
		Thread t2 = new Thread(acao);
		
		t1.start(); //500 + 100 -> 600?
		t2.start(); //600 + 100 -> 700?
		
		try {
			t1.join(); //Avisando que a Thread t1 deve 'se juntar' a um sincronizador
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		try {
			t2.join(); //Avisando que a Thread t2 deve 'se juntar' a um sincronizador
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
		System.out.println(c1);
		
	}

}
