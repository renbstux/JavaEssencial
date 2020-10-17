package br.com.renbstux.secao11;
//Protected (protegido)

//É o modificador de acesso default

/*
 * - O Modificado de acesso Protected faz com que o elemento
 * sejá visivel somente dentro do mesmo pacote onde o elemento 
 * foi declarado.
 */
public class Cliente {
	private String nome;
	private String endereco;
	
	public Cliente(String nome, String endereco) {
		this.nome =  nome;
		this.endereco = endereco;	
		
	}
	
	protected void dizer_oi() { //protected ou sem nada, pois ele é o default ex.: void dizer_oi() 
		System.out.println(this.nome + " esta dizendo Oi...");
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getEndereco() {
		return this.endereco;
	}

}
