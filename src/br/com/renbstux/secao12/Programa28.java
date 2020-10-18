package br.com.renbstux.secao12;
//Herança
public class Programa28 {
	
	public static void main(String[] args) {
		
		//Pessoa p1 = new Pessoa("Augusto da Silva", 1987, "augusto@gmail.com");
		
		//System.out.println(p1);
		//System.out.println(p1.getNome());
		//System.out.println("\n");
		
		Aluno a1 = new Aluno("Melissa de Souza", 2016, "melsouza@gmail.com", "123456");
		
		System.out.println(a1);
		System.out.println(a1.getNome());
		System.out.println("\n");
		
		Professor prof1 = new Professor("Pedro da Silva", 1976, "profpedro@escola.edu.br", "ABC987");
		
		System.out.println(prof1);		
		//System.out.println("Matricula: " + prof1.getMatricula() + " - " + prof1.getNome() + " Nascido em: " + prof1.getAnoNascimento() + 
		//		" E-mail: " + prof1.getEmail());
		System.out.println(prof1.getNome());
	}

}
