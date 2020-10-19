package br.com.renbstux.secao20;
//Simulação da geração de relatorio + barra de tarefa 
//sem a utilização de threads

public class Programa51 {

	public static void main(String[] args) {
		BarraDeProgresso barra = new BarraDeProgresso();
		barra.executa();
		
		GeraRelatorio relatorio = new GeraRelatorio();
		relatorio.executa();

	}

}
