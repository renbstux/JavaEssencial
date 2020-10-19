package br.com.renbstux.secao19;

import java.util.HashMap;
import java.util.Map;

import br.com.renbstux.secao11.Cliente;
import br.com.renbstux.secao11.Conta;

//HashMap

/*
  - Não aceita chaves duplicados, mas valores sim;
*/ 
/*
  A Classe HashMap implementa a interface Map e trabalha com chave/valor
 */
public class Programa49 {

	public static void main(String[] args) {
		Map<String, Conta> contas = new HashMap<String, Conta>();
		//Classe HashMap implementa a Map
		Cliente cli1 = new Cliente(45, "Angelina Jolie","Rua 1");
		Cliente cli2 = new Cliente(24, "Felicity Jones","Rua 2");
		
		Conta c1 = new Conta(1, 200, 300, cli1);
		Conta c2 = new Conta(2, 400, 700, cli2);
		
		contas.put("Pessoa Física", c1);
		contas.put("Pessoa Jurídica", c2);
		//             Chave          valor - definido no Map
		System.out.println(contas.size());
		
		System.out.println(contas.get("Pessoa Física"));
				
		

	}

}
