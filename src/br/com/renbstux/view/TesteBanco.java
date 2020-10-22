package br.com.renbstux.view;

import br.com.renbstux.model.Cliente;

public class TesteBanco {

	public static void main(String[] args) {
		Cliente felicity = new Cliente(
				"Felicity Jones",
				"felicity@gmail.com",
				"123.456.789-00",
				br.com.renbstux.helper.Utils.stringParaData("17/05/1981")
				);
		
		Cliente angelina = new Cliente(
				"Angelina Jones",
				"angelina@gmail.com",
				"987.456.789-00",
				br.com.renbstux.helper.Utils.stringParaData("23/02/1978")
				);
		
		System.out.println(felicity);
		System.out.println();
		System.out.println(angelina);

	}

}
