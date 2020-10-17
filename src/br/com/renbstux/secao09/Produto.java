package br.com.renbstux.secao09;
//Classes
/*
 * O Nome das Classes inicia com letra maiuscula;
 * o Nome n�o deve conter acentua��o, carecteres especiais ou espa�o;
 * Nas Classes JAVA, n�o existe a implementa��o da fun��o main();
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
 * - S�o as caracteristicas da Classe/Molde/Modelo de dados;
 * - Podemos entender atributos como variaveis da classe;
 * - Uma outra forma de nomenclatura para os atributos s�o estados;
 * - Atributos s�o nomeados em letras minusculas, sem espa�o, sem 
 *   caracteres especiais, sem acentua��o.
 */

//M�todos

/*
 * - Podemos entender os m�todos como a a��o que � realizada por um objeto da classe;
 * - Podemos entender tamb�m que os m�todos s�o comportamentos dos objetos da classe;
 * 
 * - Mesmos requisitos para fun��es:
 * - Uma fun��o deve ter o seguinte:
 * a) Tipo de retorno(Tipo de dado que a fun��o vai retornar);
 * b) Nome - Corresponde a a��o que a fun��o realiza;
 * c) Parametros/Argumentos de entrada (opcional)
 * d) Retorno (Opcional - depende do tipo de retorno)
 */

//Objetos
public class Produto {
	String nome;
	float preco, desconto;
	
	//M�todo para aumentar o pre�o do produto em 10
	void aumentar_preco(float valor) {
		this.preco = this.preco + valor;
	}
		
}
