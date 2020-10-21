package br.com.renbstux.secao22;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

//Datas

public class Programa82 {

	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje); //Formato ISO (internacional)
		
		LocalDate ano_novo = LocalDate.of(2021, Month.JANUARY, 1);
		System.out.println(ano_novo); //Formato ISO (internacional)
		
		int ano = ano_novo.getYear();
		Month mes = ano_novo.getMonth();
		int dia = ano_novo.getDayOfMonth();
		
		System.out.println("O Ano novo ser� em " + dia + " de " + mes + " de " + ano);
		
		Period periodo = Period.between(hoje, ano_novo);
		System.out.println(periodo);
		
		System.out.println("Faltam " + periodo.getYears() + " anos " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias para o ano novo.");
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/YYY");
		System.out.println(hoje.format(formatador)); //Formato padr�o PT-BR
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora);
		
		DateTimeFormatter formatador_horas = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss"); //hh formato de 12horas 
		System.out.println(agora.format(formatador_horas));
		
		LocalTime intervalo = LocalTime.of(9, 30);
		System.out.println(intervalo);
	}

}
