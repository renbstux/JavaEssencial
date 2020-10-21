package br.com.renbstux.secao22;
//Stream
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Programa80 {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();

		cursos.add(new Curso("Programa��o para Leigos", 170)); // Classe Anonima
		cursos.add(new Curso("Algoritmos e L�gica de Programa��o: Essencial", 280));
		cursos.add(new Curso("Programa��o em C: Essencial", 125));
		cursos.add(new Curso("Programa��o em JAVA: Essencial", 0));
		cursos.add(new Curso("Programa��o em Python: Essencial", 0));
		cursos.add(new Curso("Banco de Dados: Essencial", 0));
		
//		List<Curso> resultado = cursos.stream()
//				.filter(c -> c.getAlunos() >= 100)
//				.collect(Collectors.toList());
//		
//		resultado.forEach(System.out::println);
		
		cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.collect(Collectors.toMap(
				c -> c.getNome(),
				c -> c.getAlunos()))
		.forEach((nome,alunos) -> System.out.println(nome + " tem " + alunos + " Alunos"));
			

	}

}