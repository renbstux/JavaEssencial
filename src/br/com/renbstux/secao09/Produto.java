package br.com.renbstux.secao09;
//Classes
/*
 * O Nome das Classes inicia com letra maiuscula;
 * o Nome não deve conter acentuação, carecteres especiais ou espaço;
 * Nas Classes JAVA, não existe a implementação da função main();
 * Toda classe JAVA possui a seguinte forma:
 * O Nome da classe JAVA DEVE ser o mesmo nome do arquivo.java!
 * Tudo que estiver dentro das "chaves" {} faz parte da Classe
 * 
 * public class NomeDaClasse {
 * 
 * }
 */
//Atributos
/*
 * - São as caracteristicas da Classe/Molde/Modelo de dados;
 * - Podemos entender atributos como variaveis da classe;
 * - Uma outra forma de nomenclatura para os atributos são estados;
 * - Atributos são nomeados em letras minusculas, sem espaço, sem 
 *   caracteres especiais, sem acentuação.
 */

//Métodos

/*
 * - Podemos entender os métodos como a ação que é realizada por um objeto da classe;
 * - Podemos entender também que os métodos são comportamentos dos objetos da classe;
 * 
 * - Mesmos requisitos para funções:
 * - Uma função deve ter o seguinte:
 * a) Tipo de retorno(Tipo de dado que a função vai retornar);
 * b) Nome - Corresponde a ação que a função realiza;
 * c) Parametros/Argumentos de entrada (opcional)
 * d) Retorno (Opcional - depende do tipo de retorno)
 */

//Objetos
public class Produto {
	String nome;
	float preco, desconto;
	
	//Método para aumentar o preço do produto em 10
	void aumentar_preco(float valor) {
		this.preco = this.preco + valor;
	}
		
}
