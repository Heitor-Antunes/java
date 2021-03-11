package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestandoListas {

	public static void main(String[] args) {

		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		List<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
		aulas.remove(0);
		
		System.out.println(aulas);

		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}
		
		System.out.println(aulas.size());
		
		for(int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula: " + aulas.get(i));
		}
		
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é: " + primeiraAula);
		
		aulas.forEach(aula -> {
			System.out.println("Percorrendo: ");
			System.out.println("Aula: " + aula);
		});
		
		String aula4 = "Aumentando nosso conhecimendo";
		aulas.add(aula4);
		
		System.out.println(aulas);

		Collections.sort(aulas);
		System.out.println("Depois de ordenado");
		System.out.println(aulas);
		
		
		
		
		
	}

}
