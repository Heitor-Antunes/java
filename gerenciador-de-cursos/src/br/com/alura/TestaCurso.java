package br.com.alura;

public class TestaCurso {
	
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Heitor Antunes");
		
//		javaColecoes.getAulas().add(new Aula("Trabalhando com Arrays", 10));
		javaColecoes.adiciona(new Aula("Trabalhando com Arrays", 18));
		javaColecoes.adiciona(new Aula("Criando uma aula", 10));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		System.out.println(javaColecoes.getAulas());
		
		
		
	}

}
