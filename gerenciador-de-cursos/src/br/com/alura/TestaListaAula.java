package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestaListaAula {

	public static void main(String[] args) {

		Aula a1 = new Aula("Revisitando ArrayLists", 20);
		Aula a2 = new Aula("Lista de objetos", 15);
		Aula a3 = new Aula("Relacionamento de Lists e Objetos", 10);
		
		List<Aula> aulas = new ArrayList<>();
		
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		for (Aula aula : aulas) {
			System.out.println(aula);
		}
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
		
		
		
	}

}
