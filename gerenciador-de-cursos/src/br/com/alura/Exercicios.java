package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicios {

	public static void main(String[] args) {
		
		String aula1 = "Aula Spring"; 
		String aula2 = "Aula Java"; 
		String aula3 = "Aula Angular"; 
		
		List<String> aulas = new ArrayList<>();
		
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		for (String aula : aulas) {
			System.out.println(aula);
		}
		
		aulas.remove(2);
		
		System.out.println(aulas);
		
		System.out.println("O primeiro elemento da lista é: " + aulas.get(0));
		System.out.println("O último elemento da lista é: " + aulas.get(1));
		
		Collections.sort(aulas);
		
		System.out.println("Depois de ordenado: " + aulas);
		
	}
}
