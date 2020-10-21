package br.com.renbstux.secao22;
//Stream

import java.util.ArrayList;
import java.util.List;

/*
  - Stream são fluxos de dados/objetos utilizados para que possamos
  trabalhar com esses dados de forma criteriosa.
  
  - Quando trabalhamos com Stream, os métodos aplicados a este stream não afeta a coleção original.
 */
public class Programa76 {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		
		cursos.add(new Curso("Programação para Leigos", 170)); // Classe Anonima
		cursos.add(new Curso("Algoritmos e Lógica de Programação: Essencial", 280));
		cursos.add(new Curso("Programação em C: Essencial", 125));
		cursos.add(new Curso("Programação em JAVA: Essencial", 0));
		cursos.add(new Curso("Programação em Python: Essencial", 0));
		cursos.add(new Curso("Banco de Dados: Essencial", 0));
		
		//Como fazer para imprimir somente os cursos com mais de 100 Alunos?
		//cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(c -> System.out.println(c.getNome())); //Lambda
		//1 - Transformando a coleção de cursos em Stream
		cursos.stream()
			//2 - Aplicamos o filtro onde os cursos com 100 ou mais alunos - Lambda, não tem como fazer com Method References
			.filter(c -> c.getAlunos() >= 100)
			//3 - Imprimimos o resultado com o Method References
			.forEach(System.out::println); 
		

	}

}
