package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
	
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Heitor Antunes");
		
		javaColecoes.adiciona(new Aula("Trabalhando com Arrays", 18));
		javaColecoes.adiciona(new Aula("Criando uma aula", 10));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
				
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulas);

		System.out.println(aulas);
		
		System.out.println("O tempo total das aulas do curso é: " + javaColecoes.getTempoTotal());
		
		System.out.println(javaColecoes);
	}

}
