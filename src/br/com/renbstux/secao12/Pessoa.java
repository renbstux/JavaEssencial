package br.com.renbstux.secao12;
/*
 * - Classe base
 * - Classe m�e
 * - Classe pai
 * - Super Classe
 * - Classe gen�rica
 */
public class Pessoa {
	private String nome;
	private int ano_nascimento;
	private String email;
	
	public Pessoa() {}
	
	public Pessoa(String nome, int ano_nascimento, String email) {
		this.nome = nome;
		this.ano_nascimento = ano_nascimento;
		this.email = email;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoNascimento() {
		return this.ano_nascimento;
	}
	public void setAnoNascimento(int ano_nascimento) {
		this.ano_nascimento = ano_nascimento;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String Email) {
		this.email = email;
	}
	
	//Overriding / Sobreescrita de m�todo
	public String toString() {
		return "Nome: " + this.nome + "\nAno Nascimento: " + this.ano_nascimento + " E-mail:" + this.email;
	}
	//Overloading / Sobrecarga de m�todo
	public void mensagem() {
		System.out.println("Esta � a minha mensagem...");
	}
	//Overloading / Sobrecarga de m�todo
	public void mensagem(String msg) {
		System.out.println(msg);
	}
	//Overloading / Sobrecarga de m�todo
	public void mensagem(String msg, int num) {
		System.out.println(msg + num);
	}
}
