package br.com.renbstux.secao11;
//Protected (protegido)

//É o modificador de acesso default

/*
 * - O Modificado de acesso Protected faz com que o elemento
 * sejá visivel somente dentro do mesmo pacote onde o elemento 
 * foi declarado.
 */
public class Cliente implements Comparable {
	private int idade;
	private String nome;
	private String endereco;
	
	public Cliente(int idade, String nome, String endereco) {
		this.idade = idade;
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
	
	@Override
	public String toString() {
		return this.nome;
	}

	@Override
	public int compareTo(Object outro) {
		Cliente aux = (Cliente)outro;
		if(this.idade < aux.idade) {
			return -1;
		}else if(this.idade > aux.idade) {
			return 1;
		}else {
			return 0;
		}
	}
}
