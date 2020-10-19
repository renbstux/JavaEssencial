package br.com.renbstux.secao20;
//Thread N�o Sincronizada (N�o � estavel)
import br.com.renbstux.secao11.Cliente;
import br.com.renbstux.secao11.Conta;
/*
 Por Padr�o as Threads n�o s�o sincronizadas. Pode ocorrer problemas
 de uma thread acessar o valor de um objeto que ainda n�o foi atualizado
 ou ainda as threads executarem depois do valor j� estar impresso.
 */
public class Programa53 {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente(37, "Melissa da Luz", "Rua 1");
		Conta c1 = new Conta(1, 200, 300, cli1); //Saldo 500
		
		FazDeposito acao = new FazDeposito(c1);
		Thread t1 = new Thread(acao);
		Thread t2 = new Thread(acao);
		
		t1.start(); //500 + 100 -> 600?
		t2.start(); //600 + 100 -> 700?
		
		System.out.println(c1);
		
	}

}
