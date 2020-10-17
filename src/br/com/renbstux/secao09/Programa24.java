package br.com.renbstux.secao09;
//Construtor

/*
 * - O construtor de uma classe SEMPRE tem o mesmo nome da classe;
 * - Por padrão, a JVM - Java Virtual Machine, cria em tempo de execução, 
 *   um construtor padrão;
 * - Podemos ter mais de um construtor na classe
 * 
 */
public class Programa24 {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa(); // (Método) Construtor vazio
		
		pessoa1.nome = "Felicity Jones";
		pessoa1.email = "felicity@gmail.com";
		pessoa1.ano_nascimento = 1986;
		
		pessoa1.imprime_informacoes(); // via metodo 
		
		Pessoa pessoa2 = new Pessoa("Angelina Jolie", "jolie@gmail.com", 1976); //construtor recebendo parametros
		
		pessoa2.imprime_informacoes();
	}

}
