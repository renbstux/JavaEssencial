package br.com.renbstux.secao19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.renbstux.secao11.Cliente;

public class Programa47 {

	public static void main(String[] args) {
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		Cliente cli1 = new Cliente(46, "Maria da Silva", "Rua 1");
		Cliente cli2 = new Cliente(34, "Felicity Jones", "Rua 2");
		Cliente cli3 = new Cliente(45, "Angelina Jolie", "Rua 3");
		
		clientes.add(cli1);
		clientes.add(cli2);
		clientes.add(cli3);
		
		Collections.sort(clientes);
		
		for(Cliente cliente : clientes) {
			System.out.println(cliente);
		}
	}
}
