package br.com.alura.java;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Data {
	
	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		
		System.out.println(hoje);
		
		LocalDate olimpiadasRio = LocalDate.of(2023, Month.JANUARY, 10);
		
		Period periodo = Period.between(hoje, olimpiadasRio);
		
		System.out.println("Faltam apenas " + periodo.getDays() +  " dias " + periodo.getMonths()+ " meses " +
		periodo.getYears() + " anos para as Olimpiadas no Rio de Janeiro");
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String dataFormatado = olimpiadasRio.format(formatador);
		System.out.println(dataFormatado);
	}

}
