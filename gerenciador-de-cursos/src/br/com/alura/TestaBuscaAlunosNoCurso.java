package br.com.alura;

public class TestaBuscaAlunosNoCurso {
	
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
	
	System.out.println("Quem é o aluno com matrícula 12443? ");
	Aluno aluno = java.buscaMatriculado(12443);
	System.out.println(aluno);
	

	}
}
