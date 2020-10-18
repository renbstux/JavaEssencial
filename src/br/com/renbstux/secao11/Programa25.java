package br.com.renbstux.secao11;
//Encapsulamento
//Capsula
public class Programa25 {

	public static void main(String[] args) {
		Cliente joao = new Cliente("João da Silva", "Rua da Paz, 45");
		Cliente maria = new Cliente("Maria da Silva", "Rua da Paz, 45");
		
		Conta conta_joao = new Conta(1, 100.0f, 200.0f, joao);
		Conta conta_maria = new Conta(2, 300.0f, 500.0f, maria);
		
		System.out.println("Saldo do João (Antes do saque): " + conta_joao.getSaldo());
		System.out.println("Saldo da Maria: " + conta_maria.getSaldo());
		
		conta_joao.sacar(150);				
		System.out.println("Saldo do João (Depois do saque): " + conta_joao.getSaldo());
		
		}

}
