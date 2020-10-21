package br.com.renbstux.secao22;
//Stream

import java.util.ArrayList;
import java.util.List;

/*
  - Stream s�o fluxos de dados/objetos utilizados para que possamos
  trabalhar com esses dados de forma criteriosa.
  
  - Quando trabalhamos com Stream, os m�todos aplicados a este stream n�o afeta a cole��o original.
 */
public class Programa76 {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		
		cursos.add(new Curso("Programa��o para Leigos", 170)); // Classe Anonima
		cursos.add(new Curso("Algoritmos e L�gica de Programa��o: Essencial", 280));
		cursos.add(new Curso("Programa��o em C: Essencial", 125));
		cursos.add(new Curso("Programa��o em JAVA: Essencial", 0));
		cursos.add(new Curso("Programa��o em Python: Essencial", 0));
		cursos.add(new Curso("Banco de Dados: Essencial", 0));
		
		//Como fazer para imprimir somente os cursos com mais de 100 Alunos?
		//cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(c -> System.out.println(c.getNome())); //Lambda
		//1 - Transformando a cole��o de cursos em Stream
		cursos.stream()
			//2 - Aplicamos o filtro onde os cursos com 100 ou mais alunos - Lambda, n�o tem como fazer com Method References
			.filter(c -> c.getAlunos() >= 100)
			//3 - Imprimimos o resultado com o Method References
			.forEach(System.out::println); 
		

	}

}
