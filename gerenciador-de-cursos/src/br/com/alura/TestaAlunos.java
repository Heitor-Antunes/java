package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {
	
	public static void main(String[] args) {
		
		Collection<String> alunos = new HashSet<>();
		
		alunos.add("Heitor Antunes");
		alunos.add("Juliana Antunes");
		alunos.add("Ana Claudia Antunes");
		alunos.add("Alvaro Antunes");		
		alunos.add("Heloisa Fetters");		
		alunos.add("Chad Fetters");
		alunos.add("Heitor Antunes");
		alunos.add("Juliana Antunes");
		
		boolean heitorEstaMatriculado = alunos.contains("Heitor Antunes");
		System.out.println(heitorEstaMatriculado);
		
		System.out.println(alunos.size());
		
		System.out.println("Foreach do Java");
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println("Método foreach");
		alunos.forEach(aluno -> System.out.println(aluno));
		
		System.out.println(alunos);
		
		List<String> listAlunos = new ArrayList<>(alunos);
		System.out.println(listAlunos.get(0));
		Collections.sort(listAlunos);
		System.out.println(listAlunos);
		System.out.println(listAlunos.get(0));
	}

}
