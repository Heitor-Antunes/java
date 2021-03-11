package br.com.alura;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TestaCursoComAluno {
	
	public static void main(String[] args) {
		
		Curso java = new Curso("Java Básico", "Heitor Antunes");
		java.adiciona(new Aula("Pacote java.util", 12));
		java.adiciona(new Aula("Collections", 21));
		java.adiciona(new Aula("Pacote java.io", 15));
		
		System.out.println(java);
		
		Aluno aluno1 = new Aluno("Heitor Antunes", 55354);
		Aluno aluno2 = new Aluno("Juliana Antunes", 12443);
		Aluno aluno3 = new Aluno("Pedro Antunes", 87545);

		java.adiciona(aluno1);
		java.adiciona(aluno2);
		java.adiciona(aluno3);
		
//		java.getAlunos().forEach(aluno -> System.out.println(aluno));
		
		Set<Aluno> alunos = java.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		
		while(iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}
		
		System.out.println("O aluno " + aluno1.getNome() + " está matriculado?");
		System.out.println(java.estaMatriculadoAluno(aluno1));
		
		Aluno heitor = new Aluno("Heitor Antunes", 55354);
		System.out.println("E esse aluno Heitor, está matriculado?");
		System.out.println(java.estaMatriculadoAluno(heitor));
		
		System.out.println("heitor é equals aluno1?");
		System.out.println(heitor.equals(aluno1));
		
		//Obrigatoriamente o seguinte é true
		
		System.out.println(heitor.hashCode() == aluno1.hashCode());
		
		
		List<String> letras = new LinkedList<>();
		letras.add("A");
		letras.add("B");
		letras.add("C");

//		letras.forEach(letra -> {
//		    System.out.println(letra);
//		});
		
		Iterator<String> iterador2 = letras.iterator();
		while(iterador2.hasNext()) {
			System.out.println(iterador2.next());
		}
		
	}

}
