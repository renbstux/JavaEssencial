package br.com.renbstux.secao22;
//Stream
import java.util.ArrayList;
import java.util.List;

public class Programa79 {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();

		cursos.add(new Curso("Programação para Leigos", 170)); // Classe Anonima
		cursos.add(new Curso("Algoritmos e Lógica de Programação: Essencial", 280));
		cursos.add(new Curso("Programação em C: Essencial", 125));
		cursos.add(new Curso("Programação em JAVA: Essencial", 0));
		cursos.add(new Curso("Programação em Python: Essencial", 0));
		cursos.add(new Curso("Banco de Dados: Essencial", 0));
		
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			//.findAny() //pega todos de acordo com o filtro
			.findFirst() //pega o primeiro
			.ifPresent(System.out::println); // se encontrar algum curso, imprime

	}

}
